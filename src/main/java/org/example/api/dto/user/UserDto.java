package org.example.api.dto.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String avatar;

    public UserDto(int id) {
        Faker faker = new Faker();

        this.id = id;
        email = faker.regexify("[a-z1-9]{10}") + "@meme.com";
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        avatar = faker.regexify("[a-z1-9]{10}");
    }
}
