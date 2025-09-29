package org.example.api.client;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.api.data.EndPointData;
import org.example.api.dto.user.UserDto;
import org.example.api.dto.user.UserByIdDto;
import org.example.api.dto.user.UserListDto;
import org.example.api.dto.user.UserUpdate;

import static io.restassured.RestAssured.given;


public class UserClient {

    private final RequestSpecification REQUEST_SPEC;

    public UserClient(RequestSpecification requestSpec) {
        REQUEST_SPEC = requestSpec;
    }

    public UserListDto getUsersApi() {
        return given()
                    .spec(REQUEST_SPEC)
//                    .log().all()
                .when()
                    .get(EndPointData.GET_USERS)
                .then()
//                    .log().all()
                    .statusCode(200)
                    .extract()
                    .as(UserListDto.class);
    }

    public UserByIdDto getUserApi(int id) {
        return given()
                    .spec(REQUEST_SPEC)
//                    .log().all()
                .when()
                    .get(EndPointData.userById(id))
                .then()
//                    .log().all()
                    .statusCode(200)
                    .extract()
                    .as(UserByIdDto.class);
    }

    public UserUpdate putUserApi(UserDto user, int id) {
        return given()
                    .spec(REQUEST_SPEC)
                    .body(user)
//                    .log().all()
                .when()
                    .put(EndPointData.userById(id))
                .then()
//                    .log().all()
                    .statusCode(200)
                    .extract()
                    .as(UserUpdate.class);
    }

    public Response deleteUserApi(int id) {
        return given()
                    .spec(REQUEST_SPEC)
//                    .log().all()
                .when()
                    .delete(EndPointData.userById(id))
                .then()
//                    .log().all()
                    .statusCode(204)
                    .extract().response();
    }

    public UserUpdate patchUserApi(UserDto user, int id) {
        return given()
                    .spec(REQUEST_SPEC)
                    .body(user)
//                    .log().all()
                .when()
                    .patch(EndPointData.userById(id))
                .then()
//                    .log().all()
                    .statusCode(200)
                    .extract()
                    .as(UserUpdate.class);
    }
}
