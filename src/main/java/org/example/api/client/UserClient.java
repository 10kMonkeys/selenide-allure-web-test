package org.example.api.client;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.api.data.EndPont;
import org.example.api.model.user.User;
import org.example.api.model.user.UserById;
import org.example.api.model.user.UserList;
import org.example.api.model.user.UserUpdate;

import static io.restassured.RestAssured.given;


public class UserClient {

    private final RequestSpecification REQUEST_SPEC;

    public UserClient(RequestSpecification requestSpec) {
        REQUEST_SPEC = requestSpec;
    }

    public UserList getUsersApi() {
        return given()
                    .spec(REQUEST_SPEC)
//                    .log().all()
                .when()
                    .get(EndPont.GET_USERS)
                .then()
//                  .log().all()
                    .statusCode(200)
                    .extract()
                    .as(UserList.class);
    }

    public UserById getUserApi(int id) {
        return given()
                    .spec(REQUEST_SPEC)
//                    .log().all()
                .when()
                    .get(EndPont.userById(id))
                .then()
//                    .log().all()
                    .statusCode(200)
                    .extract()
                    .as(UserById.class);
    }

    public UserUpdate putUserApi(User user, int id) {
        return given()
                    .spec(REQUEST_SPEC)
                    .body(user)
//                    .log().all()
                .when()
                    .put(EndPont.userById(id))
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
                    .delete(EndPont.userById(id))
                .then()
//                    .log().all()
                    .statusCode(204)
                    .extract().response();
    }

    public UserUpdate patchUserApi(User user, int id) {
        return given()
                    .spec(REQUEST_SPEC)
                    .body(user)
//                    .log().all()
                .when()
                    .patch(EndPont.userById(id))
                .then()
//                    .log().all()
                    .statusCode(200)
                    .extract()
                    .as(UserUpdate.class);
    }
}
