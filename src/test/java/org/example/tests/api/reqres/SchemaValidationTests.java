package org.example.tests.api.reqres;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.module.jsv.JsonSchemaValidator;
import lombok.SneakyThrows;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.example.api.dto.user.UserDto;
import org.example.api.fixtures.UserFixtures;
import org.example.tests.api.base.BaseTestApi;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.hamcrest.MatcherAssert.assertThat;

public class SchemaValidationTests extends BaseTestApi {

    private final ObjectMapper mapper = new ObjectMapper();

    @Test
    @SneakyThrows
    public void getUserByIdResponseSchemaTest() {
        var getUserListResponse = userClient.getUserList();
        String json = mapper.writeValueAsString(getUserListResponse);

        assertThat(
                json,
                JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/getUsersResponse.schema.json")
        );
    }

    @Test
    @SneakyThrows
    public void putUserRequestSchemaTestOne() { // JsonSchemaValidator
        UserDto user = UserFixtures.randomUser();
        String json = mapper.writeValueAsString(user);

        assertThat(
                json,
                JsonSchemaValidator.matchesJsonSchemaInClasspath("schemas/putUserRequest.schema.json")
        );
    }

    @Test
    public void putUserRequestSchemaTestTwo() throws IOException { // Everit
        UserDto user = UserFixtures.randomUser();

        String json = mapper.writeValueAsString(user);

        try (InputStream is = getClass().getResourceAsStream("/schemas/putUserRequest.schema.json")) {
            JSONObject rawSchema = new JSONObject(new String(is.readAllBytes()));
            Schema schema = SchemaLoader.load(rawSchema);

            // валидируем — если не валид, то исключение с деталями
            schema.validate(new JSONObject(json));
        }
    }

}
