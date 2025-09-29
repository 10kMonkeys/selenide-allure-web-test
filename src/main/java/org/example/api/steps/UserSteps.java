package org.example.api.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.api.client.UserClient;
import org.example.api.dto.user.UserDto;
import org.example.api.dto.user.UserListDto;
import org.example.api.dto.user.UserUpdate;

public class UserSteps {

    private final UserClient client;

    public UserSteps(RequestSpecification requestSpec) {
        client = new UserClient(requestSpec);
    }

    @Step("Get all products list")
    public UserListDto getUserList() {
        return client.getUsersApi();
    }

    @Step("Get user by id {id}")
    public UserDto getUserById(int id) {
        return client.getUserApi(id).getData();
    }

    @Step("Put user by id {id}")
    public UserUpdate putUserById(UserDto user, int id) {
        return client.putUserApi(user, id);
    }

    @Step("Delete user by id {id}")
    public Response deleteUserById(int id) {
        return client.deleteUserApi(id);
    }

    @Step("Patch user by id {id}")
    public UserUpdate patchUserById(UserDto user, int id) {
        return client.patchUserApi(user, id);
    }
}
