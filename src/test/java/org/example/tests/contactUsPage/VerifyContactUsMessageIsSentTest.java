package org.example.tests.contactUsPage;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.data.model.ContactUsMessage;
import org.example.tests.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VerifyContactUsMessageIsSentTest extends BaseTest {

    ContactUsMessage message = new ContactUsMessage();

    @Test
    @Epic("Webdriver University")
    @Feature("Contact Us Page")
    @Story("Automation Demonstration")
    @DisplayName("Verify Contact Us Message Is Sent")
    public void VerifyContactUsMessageIsSent() {
        user.atContactUsPage.openContactUsPage();
        user.atContactUsPage.fillInFirstNameField(message.getFirstName());
        user.atContactUsPage.fillInLastNameField(message.getLastname());
        user.atContactUsPage.fillInEmailAddressField(message.getEmailAddress());
        user.atContactUsPage.fillInCommentsField(message.getComment());
        user.atContactUsPage.pressSubmitButton();
        user.atContactUsThanksPage.verifyContactUsThanksPageIsOpened();
    }
}
