package org.example.data.model;

import com.github.javafaker.Faker;

public class ContactUsMessage {

    private final String firstName;
    private final String lastName;
    private final String emailAddress;
    private final String comment;

    public String getFirstName() {
        return firstName;
    }

    public String getLastname() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getComment() {
        return comment;
    }

    public ContactUsMessage() {
        Faker faker = new Faker();

        firstName = faker.name().firstName();
        lastName = faker.name().lastName();
        emailAddress = faker.regexify("[a-z1-9]{10}") + "@meme.com";
        comment = faker.lebowski().quote();
    }
}
