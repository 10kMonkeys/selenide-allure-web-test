package org.example.ui.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byValue;
import static com.codeborne.selenide.Selenide.$;

public class DropCheckRadioButtonsPage extends BasePage {

    private final SelenideElement languageDropdown = $(byId("dropdowm-menu-1"));
    private final SelenideElement checkBoxOne = $(byValue("option-1"));
    private final SelenideElement fruitDropdown = $(byId("fruit-selects"));

    public void selectLanguageDropOption(String value) {
        languageDropdown.selectOptionByValue(value);
    }

    public SelenideElement getLanguageDropdown() {
        return languageDropdown;
    }

    public void clickOnCheckboxOne() {
        checkBoxOne.setSelected(!checkBoxOne.isSelected());
    }

    public SelenideElement getCheckboxOne() {
        return checkBoxOne;
    }

    public SelenideElement getVegetableRadioButton(String value) {
        return $(byValue(value));
    }

    public void clickOnVegetableRadioButton(String value) {
        $(byValue(value)).click();
    }

    public SelenideElement getFruitDropdownOption(String value) {
        return fruitDropdown.find(byValue(value));
    }
}
