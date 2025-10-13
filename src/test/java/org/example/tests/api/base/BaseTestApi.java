package org.example.tests.api.base;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestApi {

    protected static RequestSpecification requestSpec;

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://reqres.in"; // TODO use TestConfig BaseURL in real project

        requestSpec = new RequestSpecBuilder()
                .addQueryParam("api_key", "reqres-free-v1")
                .setContentType(ContentType.JSON)
                .setAccept(ContentType.JSON)
//                .log(LogDetail.ALL)
                .build();

//        RestAssured.requestSpecification = requestSpec;
    }
}
