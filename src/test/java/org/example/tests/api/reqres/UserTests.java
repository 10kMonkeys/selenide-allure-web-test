package org.example.tests.api.reqres;
import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.junit.jupiter.SoftAssertionsExtension;
import org.example.api.dto.user.UserDto;
import org.example.api.fixtures.UserFixtures;
import org.example.tests.api.base.BaseTestApi;
import org.instancio.Instancio;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("apiTest")
@ExtendWith(SoftAssertionsExtension.class)
public class UserTests extends BaseTestApi { // TODO @JsonIgnoreProperties(ignoreUnknown = true) --- ignore fields

//    @Test
    @Order(1)
//    @RetryingTest(3) // TODO JUnit Pioneer
    @RepeatedTest(value = 3, name = "Repetition {currentRepetition} of {totalRepetitions}")
    public void verifyGetUserListTest() {

        var getUserListResponse = userClient.getUserList();
        
        assertThat(getUserListResponse).isNotNull();
        assertEquals(12, getUserListResponse.getTotal());
        assertEquals(2, getUserListResponse.getTotalPages());

        UserDto user = getUserListResponse.getData().getFirst();
        assertEquals(1, user.getId());
        assertEquals("george.bluth@reqres.in", user.getEmail());
        assertEquals("George", user.getFirstName());
        assertEquals("Bluth", user.getLastName());
        assertEquals("https://reqres.in/img/faces/1-image.jpg", user.getAvatar());
    }

    @Test
    @Order(3)
    public void verifyGetUserByIdTest() {
        var getUserByIdResponse = userClient.getUserById(1);

        assertThat(getUserByIdResponse).isNotNull();
        assertEquals(1, getUserByIdResponse.getId());
        assertEquals("george.bluth@reqres.in", getUserByIdResponse.getEmail());
        assertEquals("George", getUserByIdResponse.getFirstName());
        assertEquals("Bluth", getUserByIdResponse.getLastName());
        assertEquals("https://reqres.in/img/faces/1-image.jpg", getUserByIdResponse.getAvatar());
    }

    @Order(2)
    @ParameterizedTest
    @MethodSource("provideUserData")
    public void verifyPutUserByIdTest(UserDto user5, SoftAssertions assertions) {
        UserDto user = new UserDto(20); // constructor

        UserDto user2 = UserDto.builder() // lombok builder
                .id(20)
                .email("george.bluth@reqres.in")
                .firstName("George")
                .lastName("Bluth")
                .avatar("https://reqres.in/img/faces/1-image.jpg")
                .build();

        UserDto user3 = UserFixtures.randomUser(); // lombok builder + faker

        UserDto user4 = Instancio.create(UserDto.class); // instancio for random generation
//
        var putUserByIdResponse = userClient.putUserById(user5, 1);

//        SoftAssertions assertions = new SoftAssertions(); // no needed

        assertions.assertThat(user5.getId()).isEqualTo(putUserByIdResponse.getId());
        assertions.assertThat(user5.getEmail()).isEqualTo(putUserByIdResponse.getEmail());
        assertions.assertThat(user5.getFirstName()).isEqualTo(putUserByIdResponse.getFirstName());
        assertions.assertThat(user5.getLastName()).isEqualTo(putUserByIdResponse.getLastName());
        assertions.assertThat(user5.getAvatar()).isEqualTo(putUserByIdResponse.getAvatar());
        assertions.assertThat(putUserByIdResponse.getUpdatedAt()).isNotNull();

//        assertions.assertAll();  // no needed
    }

    private static Stream<Arguments> provideUserData() {
        return Stream.of(
                Arguments.of(UserFixtures.randomUser()),
                Arguments.of(UserFixtures.randomUser()),
                Arguments.of(UserFixtures.randomUser())
        );
    }

    @Test
    @Order(4)
    public void verifyPatchUserByIdTest() {
        UserDto user = new UserDto(1);

        var patchUserByIdResponse = userClient.patchUserById(user, 1);

        assertEquals(1, patchUserByIdResponse.getId());
        assertEquals(user.getEmail(), patchUserByIdResponse.getEmail());
        assertEquals(user.getFirstName(), patchUserByIdResponse.getFirstName());
        assertEquals(user.getLastName(), patchUserByIdResponse.getLastName());
        assertEquals(user.getAvatar(), patchUserByIdResponse.getAvatar());
        assertThat(patchUserByIdResponse.getUpdatedAt()).isNotNull();
    }

    @Test
    @Order(5)
    public void verifyDeleteUserByIdTest() {
        var deleteUserByIdResponse = userClient.deleteUserById(1);

        assertThat(deleteUserByIdResponse).isNotNull();
    }
}
