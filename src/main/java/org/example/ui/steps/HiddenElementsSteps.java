package org.example.ui.steps;

import io.qameta.allure.Step;
import org.example.common.data.constant.PageTitle;
import org.example.common.data.constant.PageURL;
import org.example.ui.pages.HiddenElementsPage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HiddenElementsSteps {

    HiddenElementsPage atPage;

    public HiddenElementsSteps(HiddenElementsPage page) {
        atPage = page;
    }

    @Step
    public void verifyHiddenElementsPageIsOpened() {
        verifyHiddenElementsPageUrl();
        verifyHiddenElementsTitle();
    }

    private void verifyHiddenElementsTitle() {
        atPage.getHiddenElementsTitle()
                .shouldBe(visible)
                .shouldHave(exactText(PageTitle.HIDDEN_ELEMENTS_TITLE));
    }

    private void verifyHiddenElementsPageUrl() {
        webdriver().shouldHave(url(PageURL.BASE_URL + PageURL.HIDDEN_ELEMENTS_PAGE_URL));
    }

    @Step
    public void clickOnNotDisplayedButton() {
        atPage.clickOnNotDisplayedButton();
    }

    @Step
    public void clickOnVisibilityHiddenButton() {
        atPage.clickOnVisibilityHiddenButton();
    }

    @Step
    public void clickOnZeroOpacityButton() {
        atPage.clickOnZeroOpacityButton();
    }

    @Step
    public void closeCongratulationsNotDisplayedPopUp() {
        atPage.clickOnCongratulationsNotDisplayedCloseButton();
    }

    @Step
    public void closeThatEasyPopUp() {
        atPage.clickOnThatEasyCloseButton();
    }

    @Step
    public void closeWellDonePopUp() {
        atPage.clickOnWellDoneCloseButton();
    }
}
