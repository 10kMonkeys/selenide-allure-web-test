package org.example.api.specs;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specs {

    public static final RequestSpecification BASE_REQ_SPEC = new RequestSpecBuilder()
            .addQueryParam("api_key", "reqres-free-v1")
            .addFilter(new AllureRestAssured())
            .addFilter(new RequestLoggingFilter()) // comment for CI
            .addFilter(new ResponseLoggingFilter()) // comment for CI
            .setContentType(ContentType.JSON)
            .setAccept(ContentType.JSON)
            .build();

    public static final ResponseSpecification BASE_RESP_SPEC = new ResponseSpecBuilder()
//            .expectContentType(ContentType.JSON)
            .build();
}
