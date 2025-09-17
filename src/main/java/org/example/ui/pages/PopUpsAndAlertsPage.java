package org.example.ui.pages;

import com.codeborne.selenide.SelenideElement;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.*;

public class PopUpsAndAlertsPage {

    private final String AJAX_LOADER_CSS = "div#loader";

    private final SelenideElement popUpsAndAlertsTitle = $(byId("main-header"));
    private final SelenideElement jsAlertClickMeButton = $(byId("button1"));
    private final SelenideElement modalPopUpClickMeButton = $(byId("button2"));
    private final SelenideElement modalPopUpCloseButton = $(byCssSelector("button.close"));
    private final SelenideElement jsConfirmBoxClickMeButton = $(byId("button4"));
    private final SelenideElement jsConfirmBoxAcceptMessage = $(byId("confirm-alert-text"));
    private final SelenideElement ajaxLoaderClickMeButton = $(byId("button3"));
    private final SelenideElement afterAjaxLoadingClickMeButton  = $(byId("button1"));;
    private final SelenideElement ajaxLoaderWellDonePopUpCloseButton = $(byCssSelector("button.close"));

    public SelenideElement getPopUpsAndAlertsTitle() {
        return popUpsAndAlertsTitle;
    }

    public void clickOnJSAlertClickMeButton() {
        jsAlertClickMeButton.click();
    }

    public void clickJSAlertCloseButton() {
        dismiss();
    }

    public void clickOnModalPopUpClickMeButton() {
        modalPopUpClickMeButton.click();
    }

    public void clickOnModalPopUpCloseButton() {
        modalPopUpCloseButton.click();
    }

    public void clickOnJSConfirmBoxClickMeButton() {
        jsConfirmBoxClickMeButton.click();

    }

    public void clickOnJSConfirmBoxOkButton() {
        confirm();
    }

    public SelenideElement getJSConfirmBoxAcceptMessage() {
        return jsConfirmBoxAcceptMessage;
    }

    public void clickOnAjaxLoaderClickMeButton() {
        ajaxLoaderClickMeButton.click();
        $(AJAX_LOADER_CSS).should(disappear, Duration.ofSeconds(10));
    }

    public void clickOnAfterAjaxLoadingClickMeButton() {
        afterAjaxLoadingClickMeButton.click();
    }


    public void clickAjaxLoaderWellDonePopUpCloseButton() {
        ajaxLoaderWellDonePopUpCloseButton.click();
    }
}
