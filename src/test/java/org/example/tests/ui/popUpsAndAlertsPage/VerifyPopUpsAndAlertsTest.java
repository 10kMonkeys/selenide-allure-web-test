package org.example.tests.ui.popUpsAndAlertsPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyPopUpsAndAlertsTest extends BaseTest {

    @Tags({
            @Tag("two"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Pop-Ups and Alerts")
    @Story("Automation Demonstration")
    @DisplayName("Verify Pop-Ups And Alerts")
    @Description("This test shows working with pop-ups and alerts")
    public void verifyPopUpsAndAlerts() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnPopUpsAndAlertsTitle();
        user.atPopUpsAndAlertsPage.verifyPopUpsAndAlertPageIsOpened();
        user.atPopUpsAndAlertsPage.clickOnJSAlertClickMeButton();
        user.atPopUpsAndAlertsPage.closeJSAlert();
        user.atPopUpsAndAlertsPage.clickOnModalPopUpClickMeButton();
        user.atPopUpsAndAlertsPage.closeModalPopUp();
        user.atPopUpsAndAlertsPage.clickOnJSConfirmBoxClickMeButton();
        user.atPopUpsAndAlertsPage.acceptJSConfirmBox();
        user.atPopUpsAndAlertsPage.verifyJSConfirmBoxIsAccepted();
        user.atPopUpsAndAlertsPage.clickOnAjaxLoaderClickMeButton();
        user.atPopUpsAndAlertsPage.clickOnAfterAjaxLoadingClickMeButton();
        user.atPopUpsAndAlertsPage.closeAjaxLoaderWellDonePopUp();
    }
}
