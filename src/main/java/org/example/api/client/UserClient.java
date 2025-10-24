package org.example.api.client;

import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.example.api.client.base.RestClient;
import org.example.api.data.EndPointData;
import org.example.api.dto.user.UserByIdDto;
import org.example.api.dto.user.UserDto;
import org.example.api.dto.user.UserListDto;
import org.example.api.dto.user.UserUpdate;

public class UserClient {

    private RestClient client;

    public UserClient() {
        client = new RestClient();
    }

    @Step("Get all products list")
    public UserListDto getUserList() {
        return client
                .get(EndPointData.GET_USERS)
                .as(UserListDto.class);
    }

    @Step("Get user by id {id}")
    public UserDto getUserById(int id) {
        return client
                .get(EndPointData.getUserById(id))
                .as(UserByIdDto.class)
                .getData();
    }

    @Step("Put user by id {id}")
    public UserUpdate putUserById(UserDto user, int id) {
        return client.put(
                EndPointData.getUserById(id),
                user,
                UserUpdate.class);
    }

    @Step("Delete user by id {id}")
    public Response deleteUserById(int id) {
        return client.delete(
                EndPointData.getUserById(id));
    }

    @Step("Patch user by id {id}")
    public UserUpdate patchUserById(UserDto user, int id) {
        return client.patch(
                EndPointData.getUserById(id),
                user,
                UserUpdate.class
        );
    }
}
