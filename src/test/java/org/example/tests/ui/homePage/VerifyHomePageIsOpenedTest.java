package org.example.tests.ui.homePage;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyHomePageIsOpenedTest extends BaseTest {

    @Tags({
            @Tag("two"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Home Page")
    @Story("Automation Demonstration")
    @DisplayName("Verify Home Page Is Opened Test")
    public void verifyHomePageIsOpened() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
    }
}
