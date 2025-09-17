package org.example.ui.steps;

import io.qameta.allure.Step;
import org.example.ui.pages.DropCheckRadioButtonsPage;

import static com.codeborne.selenide.Condition.*;

public class DropCheckRadioButtonsSteps {

    DropCheckRadioButtonsPage atPage;

    public DropCheckRadioButtonsSteps(DropCheckRadioButtonsPage page)
    {
        atPage = page;
    }

    @Step
    public void selectLanguageDropOption(String value) {
        atPage.selectLanguageDropOption(value);
    }

    @Step
    public void verifyLanguageDropSelectedOption(String value) {
        atPage.getLanguageDropdown().shouldBe(visible).shouldHave(exactValue(value));
    }

    @Step
    public void clickOnCheckboxOne() {
        atPage.clickOnCheckboxOne();
    }

    @Step
    public void verifyCheckboxOneIsSelected() {
        atPage.getCheckboxOne().shouldBe(visible).shouldBe(selected);
    }

    @Step
    public void verifyCheckboxOneIsDeselected() {
        atPage.getCheckboxOne().shouldBe(visible).shouldNotBe(selected);
    }

    @Step
    public void verifyVegetableRadioButtonIsSelected(String value) {
        atPage.getVegetableRadioButton(value).shouldBe(selected).shouldHave(exactValue(value));
    }

    @Step
    public void verifyVegetableRadioButtonIsDisabled(String value) {
        atPage.getVegetableRadioButton(value).shouldBe(disabled).shouldHave(exactValue(value));
    }

    @Step
    public void verifyVegetableRadioButtonIsDeselected(String value) {
        atPage.getVegetableRadioButton(value).shouldNotBe(selected).shouldHave(exactValue(value));

    }

    @Step
    public void selectVegetableRadioButton(String value) {
        atPage.clickOnVegetableRadioButton(value);
    }

    @Step
    public void verifyFruitDropdownOptionIsDisabled(String value) {
        atPage.getFruitDropdownOption(value).shouldBe(disabled);
    }
}
