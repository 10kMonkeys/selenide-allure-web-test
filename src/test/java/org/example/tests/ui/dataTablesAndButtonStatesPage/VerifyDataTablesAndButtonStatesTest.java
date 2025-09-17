package org.example.tests.ui.dataTablesAndButtonStatesPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyDataTablesAndButtonStatesTest extends BaseTest {

    private final String BROCCOLI = "Broccoli";
    private final String POTATO = "Potato";

    @Tags({
            @Tag("one"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Data Tables And Button States")
    @Story("Automation Demonstration")
    @DisplayName("Verify Data Tables And Button States")
    @Description("This test shows working with Data Tables And Button States")
    public void verifyDataTablesAndButtonStates() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnDataTablesAndButtonStatesTitle();
        user.atDataTablesAndButtonStatesPage.verifyFoodListContains(BROCCOLI);
        user.atDataTablesAndButtonStatesPage.verifyFoodListNotContains(POTATO);
    }
}
