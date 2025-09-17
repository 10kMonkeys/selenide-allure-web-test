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

public class VerifyContactUsMessageIsSentTest extends BaseTest {

    ContactUsMessage message = new ContactUsMessage();

    @Tags({
            @Tag("one"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Contact Us")
    @Story("Automation Demonstration")
    @DisplayName("Verify Contact Us Message Is Sent")
    public void verifyContactUsMessageIsSent() {
        user.atContactUsPage.openContactUsPage();
        user.atContactUsPage.fillInFirstNameField(message.getFirstName());
        user.atContactUsPage.fillInLastNameField(message.getLastName());
        user.atContactUsPage.fillInEmailAddressField(message.getEmailAddress());
        user.atContactUsPage.fillInCommentsField(message.getComment());
        user.atContactUsPage.pressSubmitButton();
        user.atContactUsThanksPage.verifyContactUsThanksPageIsOpened();
    }
}
