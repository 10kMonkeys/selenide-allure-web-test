package org.example.tests.homePage;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class VerifyHomePageIsOpenedTest extends BaseTest {

    @Test
    @Epic("Webdriver University")
    @Feature("Home Page")
    @Story("Automation Demonstration")
    @DisplayName("Verify Home Page Is Opened Test")
    public void VerifyHomePageIsOpened() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
    }
}
