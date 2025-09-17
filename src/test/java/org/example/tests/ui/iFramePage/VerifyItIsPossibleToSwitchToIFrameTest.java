package org.example.tests.ui.iFramePage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyItIsPossibleToSwitchToIFrameTest extends BaseTest {

    @Tags({
            @Tag("two"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("iFrame")
    @Story("Automation Demonstration")
    @DisplayName("Verify It Is Possible To Switch To IFrame")
    @Description("This test shows working with browser tabs and iFrames in DOM")
    public void verifyItIsPossibleToSwitchToIFrame() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnIFrameTitle();
        user.atIFramePage.verifyIFramePageIsOpened();
        user.atIFramePage.clickOnOurProductTab();
        user.atIFramePage.verifyOurProductTabIsOpened();
    }
}
