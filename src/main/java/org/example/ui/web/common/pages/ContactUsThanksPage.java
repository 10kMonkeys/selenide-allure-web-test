package org.example.ui.web.common.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.common.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class ContactUsThanksPage extends BasePage {

    private final SelenideElement thankYouMessage = $(byXpath("//div[@id='contact_reply']/h1"));

    public SelenideElement getThankYouMessage() {
        return thankYouMessage;
    }
}
