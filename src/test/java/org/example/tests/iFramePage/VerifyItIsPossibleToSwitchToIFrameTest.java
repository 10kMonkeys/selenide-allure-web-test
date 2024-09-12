package org.example.tests.iFramePage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VerifyItIsPossibleToSwitchToIFrameTest extends BaseTest {

    @Test
    @Epic("Webdriver University")
    @Feature("Home Page")
    @Story("Automation Demonstration")
    @DisplayName("") // TODO
    @Description("This test shows working with browser tabs and iFrames in DOM")
    public void VerifyItIsPossibleToSwitchToIFrame() { // TODO
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnIFrameTitle();
        user.atIFramePage.verifyIFramePageIsOpened();
//        user.atIFramePage.clickOn
    }
}
