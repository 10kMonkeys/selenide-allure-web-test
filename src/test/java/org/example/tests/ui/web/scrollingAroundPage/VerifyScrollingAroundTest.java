package org.example.tests.ui.web.scrollingAroundPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyScrollingAroundTest extends BaseTest {

    @Tags({
            @Tag("two"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Scrolling Around")
    @Story("Automation Demonstration")
    @DisplayName("Verify Scrolling Around")
    @Description("This test shows working with Scrolling Around")
    public void verifyScrollingAround() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnScrollingAroundTitle();
        user.atScrollingAroundPage.scrollAndHoverZoneOne();
        user.atScrollingAroundPage.scrollAndHoverZoneTwo();
        user.atScrollingAroundPage.scrollAndHoverZoneThree();
        user.atScrollingAroundPage.scrollAndHoverZoneFour();
    }
}
