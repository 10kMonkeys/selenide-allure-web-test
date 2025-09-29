package org.example.ui.web.common.steps;

import io.qameta.allure.Step;
import org.example.ui.web.common.pages.ActionsPage;
import org.example.ui.utils.ColorHelper;

import static com.codeborne.selenide.Condition.*;

public class ActionsSteps {

    private final String DROPPED = "Dropped!";
    private final String DOUBLE = "double";
    private final String BACKGROUND_COLOR = "background-color";
    private final String GREEN_HEX = "#93CB5A";
    private final String WELL_DONE_KEEP_HOLDING = "Well done! keep holding that click now.....";

    ActionsPage atPage;

    public ActionsSteps(ActionsPage page) {
        atPage = page;
    }

    @Step
    public void dragAndDropDragBoxToDropBox() {
        atPage.dragAndDropSquareToDropBox();
    }

    @Step
    public void verifyDragBoxIsDroppedToDropBox() {
        atPage.getDropBox()
                .shouldBe(visible)
                .shouldHave(exactText(DROPPED));
    }

    @Step
    public void clickDoubleOnDoubleClickBox() {
        atPage.clickDoubleOnDoubleClickBox();
    }

    @Step
    public void verifyDoubleClickIsPerformed() {
        var element = atPage.getDoubleClickBox();
        var actualColorHex = ColorHelper.convertColorToHexInUpperCase(element, BACKGROUND_COLOR);

        element.shouldHave(cssClass(DOUBLE))
                .should(match("Actual color " + actualColorHex + " does not match expected color " + GREEN_HEX,
                        color -> actualColorHex.equals(GREEN_HEX))
                );
    }

    @Step
    public void hoverOverMeFirstBox() {
        atPage.hoverOverMeFirstBox();
    }

    @Step
    public void clickOnHoverOverMeFirstLinkOne() {
        atPage.clickOnHoverOverMeFirstLinkOne();
    }

    @Step
    public void closeHoverOverMeFirstLinkOneAlert() {
        atPage.clickOnHoverOverMeFirstLinkOneButton();
    }

    @Step
    public void hoverOverMeThirdBox() {
        atPage.hoverOverMeThirdBox();
    }

    @Step
    public void clickOnHoverOverMeThirdLinkTwo() {
        atPage.clickOnHoverOverMeThirdLinkTwo();
    }

    @Step
    public void closeHoverOverMeThirdLinkTwoAlert() {
        atPage.clickOnHoverOverMeThirdLinkTwoButton();
    }

    @Step
    public void pressOnClickAndHoldBox() {
        atPage.pressOnClickAndHoldBox();
    }

    @Step
    public void verifyClickAndHoldBoxIsPressed() {
        atPage.getClickAndHoldBox()
                .shouldBe(visible)
                .shouldHave(exactText(WELL_DONE_KEEP_HOLDING));
    }
}