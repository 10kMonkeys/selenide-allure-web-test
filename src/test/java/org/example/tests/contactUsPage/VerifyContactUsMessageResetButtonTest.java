package org.example.tests.contactUsPage;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.data.model.ContactUsMessage;
import org.example.tests.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VerifyContactUsMessageResetButtonTest extends BaseTest {

    ContactUsMessage message = new ContactUsMessage();

    @Test
    @Epic("Webdriver University")
    @Feature("Contact Us Page")
    @Story("Automation Demonstration")
    @DisplayName("Verify Contact Us Message Reset Button")
    public void VerifyContactUsMessageResetButton() {
        user.atContactUsPage.openContactUsPage();
        user.atContactUsPage.prepareContactUsMessage(message);
        user.atContactUsPage.verifyFirstNameFieldValue(message.getFirstName());
        user.atContactUsPage.verifyLastNameFieldValue(message.getLastname());
        user.atContactUsPage.verifyEmailAddressFieldValue(message.getEmailAddress());
        user.atContactUsPage.verifyCommentFieldValue(message.getComment());
        user.atContactUsPage.pressResetButton();
        user.atContactUsPage.verifyFirstNameFieldValue("");
        user.atContactUsPage.verifyLastNameFieldValue("");
        user.atContactUsPage.verifyEmailAddressFieldValue("");
        user.atContactUsPage.verifyCommentFieldValue("");
    }
}
