package org.example.tests.ui.hiddenElementsPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyHandlingHiddenElementsTest extends BaseTest {

    @Tags({
            @Tag("two"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Hidden Elements")
    @Story("Automation Demonstration")
    @DisplayName("Verify It Is Possible To Handle Hidden Elements")
    @Description("This test shows working with hidden elements")
    public void verifyHandlingHiddenElements() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnHiddenElementsTitle();
        user.atHiddenElementPage.verifyHiddenElementsPageIsOpened();
        user.atHiddenElementPage.clickOnNotDisplayedButton();
        user.atHiddenElementPage.closeCongratulationsNotDisplayedPopUp();
        user.atHiddenElementPage.clickOnVisibilityHiddenButton();
        user.atHiddenElementPage.closeThatEasyPopUp();
        user.atHiddenElementPage.clickOnZeroOpacityButton();
        user.atHiddenElementPage.closeWellDonePopUp();
    }
}
