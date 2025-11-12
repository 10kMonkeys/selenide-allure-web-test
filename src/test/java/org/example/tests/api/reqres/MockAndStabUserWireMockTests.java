package org.example.tests.api.reqres;

import com.fasterxml.jackson.databind.ObjectMapper;

import com.github.tomakehurst.wiremock.junit5.WireMockExtension;
import io.restassured.RestAssured;
import lombok.SneakyThrows;
import org.example.api.dto.user.UserUpdate;
import org.example.api.specs.Specs;
import org.example.tests.api.base.BaseTestApi;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import java.util.UUID;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("mockTest")
//@WireMockTest // @WireMockTest(httpPort = 8089)
public class MockAndStabUserWireMockTests extends BaseTestApi {

    @RegisterExtension
    static WireMockExtension wireMockExtension = WireMockExtension.newInstance()
            .options(wireMockConfig().dynamicPort())
            .build();

    @Test
    @SneakyThrows
    void testStubOnly1() {
        ObjectMapper mapper = new ObjectMapper();
//        User newUser = new User(20);
        var id = UUID.randomUUID(); // TODO
        UserUpdate newUser = new UserUpdate(20);
        var userJSon = mapper.writeValueAsString(newUser);

        // СТАБ — верни всегда один и тот же ответ
        wireMockExtension.stubFor(patch(urlPathEqualTo("/user/20"))
                        .withQueryParam("api_key", equalTo("reqres-free-v1"))
//                .withQueryParam("user", matching(".*")) any string
//                .withHeader("Content-Type", equalTo("application/json"))
//                .withRequestBody(containing("\"testing-library\": \"WireMock\""))
//                .withRequestBody(containing("\"creator\": \"Tom Akehurst\""))
//                .withRequestBody(containing("\"website\": \"wiremock.org\""))
                        .willReturn(aResponse()
                                .withStatus(200)
                                .withHeader("Content-Type", "application/json")
                                .withBody(userJSon))
        );

        // Дёргаем стаб напрямую
        UserUpdate userResponse = RestAssured.given()
                .spec(Specs.BASE_REQ_SPEC)
                .baseUri("http://localhost:" + wireMockExtension.getPort())
                .when()
                .patch("/user/20")
                .then()
                .statusCode(200)
                .extract().as(UserUpdate.class);

        assertEquals(20, userResponse.getId());
        assertEquals(newUser.getEmail(), userResponse.getEmail());
        assertEquals(newUser.getFirstName(), userResponse.getFirstName());
        assertEquals(newUser.getLastName(), userResponse.getLastName());
        assertEquals(newUser.getAvatar(), userResponse.getAvatar());
        assertThat(userResponse.getUpdatedAt()).isNotNull();
    }

    @Test
    @SneakyThrows
    void testStubOnly2() {
        ObjectMapper mapper = new ObjectMapper();
//        User newUser = new User(20);
        var id = UUID.randomUUID();
        UserUpdate newUser = new UserUpdate(20);
        var userJSon = mapper.writeValueAsString(newUser);

        // СТАБ — верни всегда один и тот же ответ
        wireMockExtension.stubFor(patch(urlPathEqualTo("/user/20"))
                .withQueryParam("api_key", equalTo("reqres-free-v1"))
//                .withQueryParam("user", matching(".*")) any string
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(userJSon))
        );

        // Дёргаем стаб напрямую
        UserUpdate userResponse = RestAssured.given()
                .spec(Specs.BASE_REQ_SPEC)
                .baseUri("http://localhost:" + wireMockExtension.getPort())
                .when()
                .patch("/user/20")
                .then()
                .statusCode(200)
                .extract().as(UserUpdate.class);

        assertEquals(20, userResponse.getId());
        assertEquals(newUser.getEmail(), userResponse.getEmail());
        assertEquals(newUser.getFirstName(), userResponse.getFirstName());
        assertEquals(newUser.getLastName(), userResponse.getLastName());
        assertEquals(newUser.getAvatar(), userResponse.getAvatar());
        assertThat(userResponse.getUpdatedAt()).isNotNull();
    }
}
