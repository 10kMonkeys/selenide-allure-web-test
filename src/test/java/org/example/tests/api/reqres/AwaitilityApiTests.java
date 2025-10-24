package org.example.tests.api.reqres;

import org.awaitility.Awaitility;
import org.example.api.dto.user.UserDto;
import org.example.api.dto.user.UserUpdate;
import org.example.api.fixtures.UserFixtures;
import org.example.common.utils.AsyncHelper;
import org.example.tests.api.base.BaseTestApi;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AwaitilityApiTests extends BaseTestApi {

    /*
    * Scenario:
    * - Send Request1
    * - Send another Request2 with awaitility to get result of Request1
    * */
    @Test
    public void awaitilityGetUserListTest() {

        UserDto user = UserFixtures.randomUser();
        userClient.putUserById(user, 1);

        Awaitility.await()
                .atMost(Duration.ofSeconds(10))
                .pollInterval(Duration.ofMillis(500))
                .untilAsserted(() -> {
                    var getUserListResponse = userClient.getUserList();

                    assertThat(getUserListResponse).isNotNull();
                    assertEquals(12, getUserListResponse.getTotal());
                    assertEquals(2, getUserListResponse.getTotalPages());

                    UserDto newUser = getUserListResponse.getData().getFirst();
                    assertEquals(1, newUser.getId());
                    assertEquals("george.bluth@reqres.in", newUser.getEmail());
                    assertEquals("George", newUser.getFirstName());
                    assertEquals("Bluth", newUser.getLastName());
                    assertEquals("https://reqres.in/img/faces/1-image.jpg", newUser.getAvatar());
                });
    }

    /*
     * Scenario:
     * - Send Request1 async(waiters starts working immediately!!!)
     * - Send Request2
     * - Check result of Request1 and wait if necessary the rest of awaitility waiters
     * - Send Request3
     * */
    @Test
    public void awaitilityDelayCreateUserWithoutResponseTest() {
        UserDto user = UserFixtures.randomUser();

        CompletableFuture<UserUpdate> reportFuture = AsyncHelper.runAsyncWithAwaitility(
                () -> userClient.putUserById(user, 1)
        );

        var getUserListResponse = userClient.getUserList();

        reportFuture.join();

        var getUserListResponse2 = userClient.getUserList();
    }

    /*
     * Scenario:
     * - Send Request1 async(waiters starts working immediately!!!)
     * - Send Request2
     * - Check result of Request1 and wait if necessary the rest of awaitility waiters + get result of Request1
     * - Send Request3
     * - Verify Request1 response
     * */
    @Test
    public void awaitilityDelayCreateUserWithResponseTest() {
        UserDto user = UserFixtures.randomUser();

        CompletableFuture<UserUpdate> reportFuture = AsyncHelper.runAsyncWithAwaitility(
                () -> userClient.putUserById(user, 1), // действие, возвращающее объект
                Duration.ofSeconds(10), // таймаут
                Duration.ofMillis(500)  // интервал опроса
        );

        var getUserListResponse = userClient.getUserList();

        UserUpdate newUser = reportFuture.join();

        var getUserListResponse2 = userClient.getUserList();

        assertThat(user.getId()).isEqualTo(newUser.getId());
        assertThat(user.getEmail()).isEqualTo(newUser.getEmail());
        assertThat(user.getFirstName()).isEqualTo(newUser.getFirstName());
        assertThat(user.getLastName()).isEqualTo(newUser.getLastName());
        assertThat(user.getAvatar()).isEqualTo(newUser.getAvatar());
        assertThat(newUser.getUpdatedAt()).isNotNull();
    }
}
