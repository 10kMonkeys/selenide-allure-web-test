package org.example.ui.web.steps;

import io.qameta.allure.Step;
import org.example.common.data.constant.PageMessage;
import org.example.common.data.constant.PageTitle;
import org.example.common.data.constant.PageURL;
import org.example.common.driver.config.TestConfig;
import org.example.ui.web.pages.PopUpsAndAlertsPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class PopUpsAndAlertsSteps {

    PopUpsAndAlertsPage atPage;

    public PopUpsAndAlertsSteps(PopUpsAndAlertsPage page) {
        atPage = page;
    }

    @Step
    public void verifyPopUpsAndAlertPageIsOpened() {
        verifyPopUpsAndAlertsTitle();
        verifyPopUpsAndAlertsPageUrl();
    }

    private void verifyPopUpsAndAlertsTitle() {
        atPage.getPopUpsAndAlertsTitle()
                .shouldBe(visible)
                .shouldHave(exactText(PageTitle.POPUPS_AND_ALERTS_TITLE));
    }

    private void verifyPopUpsAndAlertsPageUrl() {
        webdriver().shouldHave(url(TestConfig.BASE_URL + PageURL.POPUPS_AND_ALERTS_PAGE_URL));
    }

    @Step
    public void clickOnJSAlertClickMeButton() {
        atPage.clickOnJSAlertClickMeButton();
    }

    @Step
    public void closeJSAlert() {
        atPage.clickJSAlertCloseButton();
    }

    @Step
    public void clickOnModalPopUpClickMeButton() {
        atPage.clickOnModalPopUpClickMeButton();
    }

    @Step
    public void closeModalPopUp() {
        atPage.clickOnModalPopUpCloseButton();
    }

    @Step
    public void clickOnJSConfirmBoxClickMeButton() {
        atPage.clickOnJSConfirmBoxClickMeButton();
    }

    @Step
    public void acceptJSConfirmBox() {
        atPage.clickOnJSConfirmBoxOkButton();
    }

    @Step
    public void verifyJSConfirmBoxIsAccepted() {
        atPage.getJSConfirmBoxAcceptMessage()
                .shouldBe(visible)
                .shouldHave(exactText(PageMessage.JS_CONFIRM_BOX_ACCEPT_MSG));
    }

    @Step
    public void clickOnAjaxLoaderClickMeButton() {
        atPage.clickOnAjaxLoaderClickMeButton();
    }

    @Step
    public void clickOnAfterAjaxLoadingClickMeButton() {
        atPage.clickOnAfterAjaxLoadingClickMeButton();
    }

    @Step
    public void closeAjaxLoaderWellDonePopUp() {
        atPage.clickAjaxLoaderWellDonePopUpCloseButton();
    }
}
