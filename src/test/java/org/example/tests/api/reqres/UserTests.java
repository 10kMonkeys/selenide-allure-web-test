package org.example.tests.api.reqres;

import org.example.api.model.user.User;
import org.example.api.steps.UserSteps;
import org.example.tests.api.base.BaseTestApi;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("apiTest")
public class UserTests extends BaseTestApi { // TODO @JsonIgnoreProperties(ignoreUnknown = true) --- ignore fields

    private final UserSteps steps = new UserSteps(requestSpec);

    @Test
//    @RetryingTest(3) // TODO JUnit Pioneer
    public void verifyGetUserListTest() {

        var getUserListResponse = steps.getUserList();
        
        assertThat(getUserListResponse).isNotNull();
        assertEquals(12, getUserListResponse.getTotal());
        assertEquals(2, getUserListResponse.getTotalPages());

        User user = getUserListResponse.getData().getFirst();
        assertEquals(1, user.getId());
        assertEquals("george.bluth@reqres.in", user.getEmail());
        assertEquals("George", user.getFirstName());
        assertEquals("Bluth", user.getLastName());
        assertEquals("https://reqres.in/img/faces/1-image.jpg", user.getAvatar());
    }

    @Test
    public void verifyGetUserByIdTest() {
        var getUserByIdResponse = steps.getUserById(1);

        assertThat(getUserByIdResponse).isNotNull();
        assertEquals(1, getUserByIdResponse.getId());
        assertEquals("george.bluth@reqres.in", getUserByIdResponse.getEmail());
        assertEquals("George", getUserByIdResponse.getFirstName());
        assertEquals("Bluth", getUserByIdResponse.getLastName());
        assertEquals("https://reqres.in/img/faces/1-image.jpg", getUserByIdResponse.getAvatar());
    }

    @Test
    public void verifyPutUserByIdTest() {
        User user = new User(20);

        var putUserByIdResponse = steps.putUserById(user, 1);

        assertEquals(20, putUserByIdResponse.getId());
        assertEquals(user.getEmail(), putUserByIdResponse.getEmail());
        assertEquals(user.getFirstName(), putUserByIdResponse.getFirstName());
        assertEquals(user.getLastName(), putUserByIdResponse.getLastName());
        assertEquals(user.getAvatar(), putUserByIdResponse.getAvatar());
        assertThat(putUserByIdResponse.getUpdatedAt()).isNotNull();
    }

    @Test
    public void verifyPatchUserByIdTest() {
        User user = new User(1);

        var patchUserByIdResponse = steps.patchUserById(user, 1);

        assertEquals(1, patchUserByIdResponse.getId());
        assertEquals(user.getEmail(), patchUserByIdResponse.getEmail());
        assertEquals(user.getFirstName(), patchUserByIdResponse.getFirstName());
        assertEquals(user.getLastName(), patchUserByIdResponse.getLastName());
        assertEquals(user.getAvatar(), patchUserByIdResponse.getAvatar());
        assertThat(patchUserByIdResponse.getUpdatedAt()).isNotNull();
    }

    @Test
    public void verifyDeleteUserByIdTest() {
        var deleteUserByIdResponse = steps.deleteUserById(1);

        assertThat(deleteUserByIdResponse).isNotNull();
    }
}
