package org.example.tests.ui.contactUsPage;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.common.data.model.ContactUsMessage;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyContactUsMessageResetButtonTest extends BaseTest {

    ContactUsMessage message = new ContactUsMessage();

    @Tags({
            @Tag("one"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Contact Us")
    @Story("Automation Demonstration")
    @DisplayName("Verify Contact Us Message Reset Button")
    public void verifyContactUsMessageResetButton() {
        user.atContactUsPage.openContactUsPage();
        user.atContactUsPage.prepareContactUsMessage(message);
        user.atContactUsPage.verifyFirstNameFieldValue(message.getFirstName());
        user.atContactUsPage.verifyLastNameFieldValue(message.getLastName());
        user.atContactUsPage.verifyEmailAddressFieldValue(message.getEmailAddress());
        user.atContactUsPage.verifyCommentFieldValue(message.getComment());
        user.atContactUsPage.pressResetButton();
        user.atContactUsPage.verifyFirstNameFieldValue("");
        user.atContactUsPage.verifyLastNameFieldValue("");
        user.atContactUsPage.verifyEmailAddressFieldValue("");
        user.atContactUsPage.verifyCommentFieldValue("");
    }
}
