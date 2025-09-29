package org.example.ui.web.common.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.common.pages.base.BasePage;
import org.example.ui.utils.JavaScriptHelper;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class HiddenElementsPage extends BasePage {

    private final SelenideElement hiddenElementsTitle = $(byId("main-header"));
    private final SelenideElement notDisplayedButton = $(byId("button1"));
    private final SelenideElement visibilityHiddenButton = $(byId("button2"));
    private final SelenideElement zeroOpacityButton = $(byId("button3"));
    private final SelenideElement congratulationsNotDisplayedCloseButton = $(byCssSelector("button.close"));
    private final SelenideElement thatEasyCloseButton = $(byCssSelector("div#myModalJSClick button.close"));
    private final SelenideElement wellDoneCloseButton = $(byCssSelector("div#myModalMoveClick button.close"));

    public SelenideElement getHiddenElementsTitle() {
        return hiddenElementsTitle;
    }

    public void clickOnNotDisplayedButton() {
        JavaScriptHelper.clickOnElement(notDisplayedButton);
    }

    public void clickOnVisibilityHiddenButton() {
        JavaScriptHelper.clickOnElement(visibilityHiddenButton);
    }

    public void clickOnZeroOpacityButton() {
        JavaScriptHelper.clickOnElement(zeroOpacityButton);
    }

    public void clickOnCongratulationsNotDisplayedCloseButton() {
        congratulationsNotDisplayedCloseButton.click();
    }

    public void clickOnThatEasyCloseButton() {
        thatEasyCloseButton.click();
    }

    public void clickOnWellDoneCloseButton() {
        wellDoneCloseButton.click();
    }
}
