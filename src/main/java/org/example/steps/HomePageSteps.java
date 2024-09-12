package org.example.steps;

import io.qameta.allure.Step;
import org.example.data.page.PageTitles;
import org.example.data.page.PageURLs;
import org.example.pages.HomePage;
import org.example.utils.BrowserHelper;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class HomePageSteps {

    HomePage atPage;

    public HomePageSteps(HomePage page) {
        atPage = page;
    }

    @Step("Open Home Page")
    public void openHomePage() {
        atPage.openHomePage();
    }

    @Step("Verify Home Page Is Opened")
    public void verifyHomePageIsOpened() {
        verifyHomePageUrl();
        verifyHomePageTitle();
    }

    private void verifyHomePageUrl() {
        webdriver().shouldHave(urlContaining(PageURLs.HOME_PAGE_URL));
    }

    private void verifyHomePageTitle() {
        atPage.getHomePageTitle().shouldBe(visible).shouldHave(exactText(PageTitles.HOME_PAGE_TITLE));
    }

    @Step("Click on iFrame title")
    public void clickOnIFrameTitle() {
        atPage.clickOnIFrameTitle();
        BrowserHelper.switchToNewBrowserTab();
    }
}
