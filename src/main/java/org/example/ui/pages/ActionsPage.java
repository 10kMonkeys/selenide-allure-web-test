package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;

import org.example.ui.pages.base.BasePage;
import org.example.common.utils.ActionHelper;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.dismiss;

public class ActionsPage extends BasePage {

    private final SelenideElement sourceDragBox = $(byId("draggable"));
    private final SelenideElement targetDropBox = $(byId("droppable"));
    private final SelenideElement doubleClickMeBox = $(byId("double-click"));
    private final SelenideElement hoverOverMeFirstBox = $(byXpath("//button[text()='Hover Over Me First!']"));
    private final SelenideElement hoverOverMeFirstLinkOne = $(byCssSelector("div.hover a"));
    private final SelenideElement hoverOverMeThirdBox = $(byXpath("//button[text()='Hover Over Me Third!']"));
    private final SelenideElement hoverOverMeThirdLinkTwo = $(byXpath("//button[text()='Hover Over Me Third!']/parent::div//a[2]"));
    private final SelenideElement clickAndHoldBox = $(byCssSelector("div#click-box"));

    public void dragAndDropSquareToDropBox() {
        ActionHelper.dragAndDropElementMoveToElement(sourceDragBox, targetDropBox);
    }

    public SelenideElement getDropBox() {
        return targetDropBox;
    }

    public void clickDoubleOnDoubleClickBox() {
        doubleClickMeBox.doubleClick();
    }

    public SelenideElement getDoubleClickBox() {
        return doubleClickMeBox;
    }

    public void hoverOverMeFirstBox() {
        hoverOverMeFirstBox.hover();
    }

    public void clickOnHoverOverMeFirstLinkOne() {
        hoverOverMeFirstLinkOne.click();

    }

    public void clickOnHoverOverMeFirstLinkOneButton() {
        dismiss();
    }

    public void hoverOverMeThirdBox() {
        hoverOverMeThirdBox.hover();
    }

    public void clickOnHoverOverMeThirdLinkTwo() {
        hoverOverMeThirdLinkTwo.click();
    }

    public void clickOnHoverOverMeThirdLinkTwoButton() {
        dismiss();
    }

    public void pressOnClickAndHoldBox() {
        ActionHelper.clickAndHoldWithoutRelease(clickAndHoldBox);
    }

    public SelenideElement getClickAndHoldBox() {
        return clickAndHoldBox;
    }
}
