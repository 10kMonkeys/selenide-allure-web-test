package org.example.common.data.model;

import com.github.javafaker.Faker;
import lombok.Getter;

@Getter
public class ContactUsMessage {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String comment;

    public ContactUsMessage() {
        Faker faker = new Faker();

        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        emailAddress = faker.regexify("[a-z1-9]{10}") + "@meme.com";
        comment = faker.lebowski().quote();
    }
}
