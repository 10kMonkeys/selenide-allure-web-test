package org.example.api.fixtures;

import com.github.javafaker.Faker;
import org.example.api.dto.user.UserDto;

public class UserFixtures {
    private static final Faker faker = new Faker();

    public static UserDto randomUser() {
        return UserDto.builder()
                .id(faker.number().randomDigit())
                .email(faker.internet().emailAddress())
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .avatar(faker.internet().avatar())
                .build();
    }
}
