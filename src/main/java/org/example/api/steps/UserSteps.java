package org.example.api.steps;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.example.api.client.UserClient;
import org.example.api.model.user.User;
import org.example.api.model.user.UserList;
import org.example.api.model.user.UserUpdate;

public class UserSteps {

    private final UserClient client;

    public UserSteps(RequestSpecification requestSpec) {
        client = new UserClient(requestSpec);
    }

    @Step("Get all products list")
    public UserList getUserList() {
        return client.getUsersApi();
    }

    @Step("Get user by id {id}")
    public User getUserById(int id) {
        return client.getUserApi(id).getData();
    }

    @Step("Put user by id {id}")
    public UserUpdate putUserById(User user, int id) {
        return client.putUserApi(user, id);
    }

    @Step("Delete user by id {id}")
    public Response deleteUserById(int id) {
        return client.deleteUserApi(id);
    }

    @Step("Patch user by id {id}")
    public UserUpdate patchUserById(User user, int id) {
        return client.patchUserApi(user, id);
    }
}
