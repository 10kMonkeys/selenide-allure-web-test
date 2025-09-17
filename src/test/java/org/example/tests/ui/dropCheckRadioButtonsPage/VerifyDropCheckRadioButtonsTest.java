package org.example.tests.ui.dropCheckRadioButtonsPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

public class VerifyDropCheckRadioButtonsTest extends BaseTest {

    private final String SQL = "sql";
    private final String PUMPKIN = "pumpkin";
    private final String LETTUCE = "lettuce";
    private final String CABBAGE = "cabbage";
    private final String ORANGE = "orange";

    @Tags({
            @Tag("one"),
            @Tag("three")
    })
    @Test
    @Epic("Webdriver University")
    @Feature("Dropdowns, Checkboxes, Radio Buttons")
    @Story("Automation Demonstration")
    @DisplayName("Verify Dropdowns, Checkboxes and Radio Buttons")
    @Description("This test shows working with Dropdowns, Checkboxes and Radio Buttons")
    public void verifyDropCheckRadioButtons() {
        user.atHomePage.openHomePage();
        user.atHomePage.verifyHomePageIsOpened();
        user.atHomePage.clickOnDropCheckRadioButtonsTitle();
        user.atDropCheckRadioButtonsPage.selectLanguageDropOption(SQL);
        user.atDropCheckRadioButtonsPage.verifyLanguageDropSelectedOption(SQL);
        user.atDropCheckRadioButtonsPage.clickOnCheckboxOne();
        user.atDropCheckRadioButtonsPage.verifyCheckboxOneIsSelected();
        user.atDropCheckRadioButtonsPage.clickOnCheckboxOne();
        user.atDropCheckRadioButtonsPage.verifyCheckboxOneIsDeselected();
        user.atDropCheckRadioButtonsPage.verifyVegetableRadioButtonIsSelected(PUMPKIN);
        user.atDropCheckRadioButtonsPage.selectVegetableRadioButton(LETTUCE);
        user.atDropCheckRadioButtonsPage.verifyVegetableRadioButtonIsSelected(LETTUCE);
        user.atDropCheckRadioButtonsPage.verifyVegetableRadioButtonIsDeselected(PUMPKIN);
        user.atDropCheckRadioButtonsPage.verifyVegetableRadioButtonIsDisabled(CABBAGE);
        user.atDropCheckRadioButtonsPage.verifyFruitDropdownOptionIsDisabled(ORANGE);
    }
}
