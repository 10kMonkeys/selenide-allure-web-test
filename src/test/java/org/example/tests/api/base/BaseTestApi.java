package org.example.tests.api.base;

import io.restassured.RestAssured;
import org.example.api.client.UserClient;
import org.junit.jupiter.api.BeforeAll;

public abstract class BaseTestApi {

    protected static UserClient userClient;

    @BeforeAll
    static void setUp() {
        RestAssured.baseURI = "https://reqres.in"; // TODO use TestConfig BaseURL in real project


        userClient = new UserClient();
    }
}
