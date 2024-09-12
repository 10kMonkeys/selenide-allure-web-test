package org.example.steps;

import io.qameta.allure.Step;
import org.example.data.model.ContactUsMessage;
import org.example.pages.ContactUsPage;

import static com.codeborne.selenide.Condition.exactValue;

public class ContactUsSteps {

    ContactUsPage atPage;

    public ContactUsSteps(ContactUsPage page) {
        atPage = page;
    }

    @Step("Open Contact Us Page")
    public void openContactUsPage() {
        atPage.openContactUsPage();
    }

    @Step("Fill In First Name Field")
    public void fillInFirstNameField(String firstName) {
        atPage.fillInFirstNameField(firstName);
    }

    @Step("Fill In Last Name Field")
    public void fillInLastNameField(String lastname) {
        atPage.fillInLastNameField(lastname);
    }

    @Step("Fill In Email Address Name Field")
    public void fillInEmailAddressField(String emailAddress) {
        atPage.fillInEmailAddressField(emailAddress);
    }

    @Step("Fill In Comments Field")
    public void fillInCommentsField(String comment) {
        atPage.fillInCommentsField(comment);
    }

    @Step("Press Submit Button")
    public void pressSubmitButton() {
        atPage.pressSubmitButton();
    }

    @Step("Press Reset Button")
    public void pressResetButton() {
        atPage.pressResetButton();
    }

    @Step("Prepare Contact Us Message")
    public void prepareContactUsMessage(ContactUsMessage message) {
        fillInFirstNameField(message.getFirstName());
        fillInLastNameField(message.getLastname());
        fillInEmailAddressField(message.getEmailAddress());
        fillInCommentsField(message.getComment());
    }

    @Step("Verify First Name Field Value")
    public void verifyFirstNameFieldValue(String firstName) {
        atPage.getFirstNameField().shouldHave(exactValue(firstName));
    }

    @Step("Verify Last Name Field Value")
    public void verifyLastNameFieldValue(String lastname) {
        atPage.getLastNameField().shouldHave(exactValue(lastname));
    }

    @Step("Verify Email Address Field Value")
    public void verifyEmailAddressFieldValue(String emailAddress) {
        atPage.getEmailAddressField().shouldHave(exactValue(emailAddress));
    }

    @Step("Verify Comment Field Value")
    public void verifyCommentFieldValue(String comment) {
        atPage.getCommentField().shouldHave(exactValue(comment));
    }
}
