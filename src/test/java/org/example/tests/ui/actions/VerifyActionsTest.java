package org.example.tests.ui.actions;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyActionsTest extends BaseTest {

    @Tags({
            @Tag("one"),
            @Tag("three"),
            @Tag("docker")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Actions")
    @Story("Automation Demonstration")
    @DisplayName("Verify Actions")
    @Description("This test shows working with actions")
    public void VerifyActions() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnActionsTitle();
        user.atActionsPage.dragAndDropDragBoxToDropBox();
        user.atActionsPage.verifyDragBoxIsDroppedToDropBox();
        user.atActionsPage.clickDoubleOnDoubleClickBox();
        user.atActionsPage.verifyDoubleClickIsPerformed();
        user.atActionsPage.hoverOverMeFirstBox();
        user.atActionsPage.clickOnHoverOverMeFirstLinkOne();
        user.atActionsPage.closeHoverOverMeFirstLinkOneAlert();
        user.atActionsPage.hoverOverMeThirdBox();
        user.atActionsPage.clickOnHoverOverMeThirdLinkTwo();
        user.atActionsPage.closeHoverOverMeThirdLinkTwoAlert();
        user.atActionsPage.pressOnClickAndHoldBox();
        user.atActionsPage.verifyClickAndHoldBoxIsPressed();
    }
}
