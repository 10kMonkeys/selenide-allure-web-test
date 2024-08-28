package org.example.steps;

import io.qameta.allure.Step;
import org.example.data.page.PageTitles;
import org.example.data.page.PageURLs;
import org.example.pages.ContactUsThanksPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class ContactUsThanksPageSteps {

    ContactUsThanksPage atPage;

    public ContactUsThanksPageSteps(ContactUsThanksPage page) {
        atPage = page;
    }

    @Step("Verify Contact Us Thanks Page Is Opened")
    public void verifyContactUsThanksPageIsOpened() {
        verifyContactUsThanksPageUrl();
        verifyThankYouMessage();
    }

    private void verifyContactUsThanksPageUrl() {
        webdriver().shouldHave(urlContaining(PageURLs.CONTACT_US_THANKS_PAGE_URL));
    }


    private void verifyThankYouMessage() {
        atPage.getThankYouMessage()
                .shouldBe(visible)
                .shouldHave(exactText(PageTitles.CONTACT_US_THANKS_MSG));
    }
}
