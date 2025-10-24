package org.example.ui.web.steps;

import io.qameta.allure.Step;
import org.example.common.data.constant.PageTitle;
import org.example.common.data.constant.PageURL;
import org.example.common.driver.config.TestConfig;
import org.example.ui.web.pages.ContactUsThanksPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ContactUsThanksSteps {

    ContactUsThanksPage atPage;

    public ContactUsThanksSteps(ContactUsThanksPage page) {
        atPage = page;
    }

    @Step("Verify Contact Us Thanks Page Is Opened")
    public void verifyContactUsThanksPageIsOpened() {
        verifyContactUsThanksPageUrl();
        verifyThankYouMessage();
    }

    private void verifyContactUsThanksPageUrl() {
        webdriver().shouldHave(url(TestConfig.BASE_URL + PageURL.CONTACT_US_THANKS_PAGE_URL));
    }


    private void verifyThankYouMessage() {
        atPage.getThankYouMessage()
                .shouldBe(visible)
                .shouldHave(exactText(PageTitle.CONTACT_US_THANKS_MSG));
    }
}
