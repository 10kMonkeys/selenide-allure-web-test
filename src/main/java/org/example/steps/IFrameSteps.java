package org.example.steps;

import io.qameta.allure.Step;
import org.example.data.page.PageTitles;
import org.example.data.page.PageURLs;
import org.example.pages.IFramePage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class IFrameSteps {

    IFramePage atPage;

    public IFrameSteps(IFramePage page) {
        atPage = page;
    }

    @Step("Verify iFrame Page Is Opened")
    public void verifyIFramePageIsOpened() {
        verifyIFramePageUrl();
        verifyIFramePageTitle();
    }

    private void verifyIFramePageTitle() {
        atPage.getIFramePageTitle().shouldBe(visible).shouldHave(exactText(PageTitles.IFRAME_PAGE_TITLE));
    }

    private void verifyIFramePageUrl() {
        webdriver().shouldHave(urlContaining(PageURLs.IFRAME_PAGE_URL));
    }
}
