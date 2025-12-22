package org.example.api.dto.user;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

@Builder
@Data
//@Accessors(fluent = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL) // Исключает null-поля при сериализации в JSON.
public class UserDto {

    private Integer id;
    private String email;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String avatar;

    public UserDto(int id) { // DO NOT USE! DTO SHOULD NOT KNOW ABOUT TEST DATA!
        Faker faker = new Faker();

        this.id = id;
        email = faker.regexify("[a-z1-9]{10}") + "@meme.com";
        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        avatar = faker.regexify("[a-z1-9]{10}");
    }
}
