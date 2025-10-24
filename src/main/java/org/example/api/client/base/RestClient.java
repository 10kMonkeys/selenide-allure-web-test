package org.example.api.client.base;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.api.enums.HttpStatus;
import org.example.api.specs.Specs;

import static io.restassured.RestAssured.given;

public class RestClient {

    private final RequestSpecification BASE_REQ_SPEC;
    private final ResponseSpecification BASE_RESP_SPEC;

    static {
        // base url?
    }

    public RestClient() {
        this.BASE_REQ_SPEC = Specs.BASE_REQ_SPEC;
        this.BASE_RESP_SPEC = Specs.BASE_RESP_SPEC;
    }

    private RequestSpecification buildReqSpec() {
        return given().spec(BASE_REQ_SPEC).when();
    }

    private ResponseSpecification buildRespSpec() {
        return BASE_RESP_SPEC;
    }

    // Базовый GET
    public Response get(String path) {
        return buildReqSpec()
                .get(path)
                .then()
                .spec(buildRespSpec())
                .statusCode(HttpStatus.OK.getCode())
                .extract()
                .response();
    }

    // Базовый POST
    public <T> T post(String path, Object body, Class<T> responseType) {
        return buildReqSpec()
                .body(body)
                .post(path)
                .then()
                .spec(buildRespSpec())
                .statusCode(HttpStatus.OK.getCode())
                .extract()
                .as(responseType);
    }

    // Базовый PUT
    public <T> T put(String path, Object body, Class<T> responseType) {
        return buildReqSpec()
                .body(body)
                .put(path)
                .then()
                .spec(buildRespSpec())
                .statusCode(HttpStatus.OK.getCode())
                .extract()
                .as(responseType);
    }

    // Базовый PATCH
    public <T> T patch(String path, Object body, Class<T> responseType) {
        return buildReqSpec()
                .body(body)
                .patch(path)
                .then()
                .spec(buildRespSpec())
                .statusCode(HttpStatus.OK.getCode())
                .extract()
                .as(responseType);
    }


    // Базовый DELETE
    public Response delete(String path) {
        return buildReqSpec().delete(path)
                .then()
                .spec(buildRespSpec())
                .statusCode(HttpStatus.NO_CONTENT.getCode())
                .extract()
                .response();
    }


}
