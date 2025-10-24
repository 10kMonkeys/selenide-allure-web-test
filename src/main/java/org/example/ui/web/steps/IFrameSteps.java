package org.example.ui.web.steps;

import io.qameta.allure.Step;
import org.example.common.data.constant.PageTitle;
import org.example.common.data.constant.PageURL;
import org.example.common.driver.config.TestConfig;
import org.example.ui.web.pages.IFramePage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

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
        atPage.getIFramePageTitle()
                .shouldBe(visible)
                .shouldHave(exactText(PageTitle.IFRAME_PAGE_TITLE));
    }

    private void verifyIFramePageUrl() {
        webdriver().shouldHave(url(
                TestConfig.BASE_URL + PageURL.IFRAME_PAGE_URL));
    }

    @Step
    public void clickOnOurProductTab() {
        atPage.clickOnOurProductTab();
    }

    @Step
    public void verifyOurProductTabIsOpened() {
       atPage.getSpecialOffersTitle()
               .shouldBe(visible)
               .shouldHave(exactText(PageTitle.SPECIAL_OFFERS_TITLE));
    }
}
