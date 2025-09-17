package org.example.ui.steps;

import io.qameta.allure.Step;
import org.example.common.data.constant.PageTitle;
import org.example.common.data.constant.PageURL;
import org.example.ui.pages.HomePage;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.url;

public class HomePageSteps {

    HomePage atPage;

    public HomePageSteps(HomePage page) {
        atPage = page;
    }

    @Step("Open Home Page")
    public void openHomePage() {
        atPage.openHomePage();
    }

    @Step("Verify Home Page Is Opened")
    public void verifyHomePageIsOpened() {
        verifyHomePageUrl();
        verifyHomePageTitle();
    }

    private void verifyHomePageUrl() {
        webdriver().shouldHave(url(PageURL.BASE_URL + PageURL.HOME_PAGE_URL));
    }

    private void verifyHomePageTitle() {
        atPage.getHomePageTitle().shouldBe(visible).shouldHave(exactText(PageTitle.HOME_PAGE_TITLE));
    }

    @Step("Click on iFrame title")
    public void clickOnIFrameTitle() {
        atPage.clickOnIFrameTitle();
    }

    @Step("Click on Hidden Elements title")
    public void clickOnHiddenElementsTitle() {
        atPage.clickOnHiddenElementsTitle();
    }

    @Step("Click on Pop-Ups and Alerts title")
    public void clickOnPopUpsAndAlertsTitle() {
        atPage.clickOnPopUpsAndAlertsTitle();
    }

    @Step("Click on Actions title")
    public void clickOnActionsTitle() {
        atPage.clickOnActionsTitle();
    }

    @Step("Click on ToDo List title")
    public void clickOnToDoListTitle() {
        atPage.clickOnToDoListTitle();
    }

    @Step("Click on DatePicker title")
    public void clickOnDatePickerTitle() {
        atPage.clickOnDatePickerTitle();
    }

    @Step("Click on Upload FIle title")
    public void clickOnUploadFileTitle() {
        atPage.clickOnUploadFileTitle();
    }

    @Step("Click on Dropdowns, Checkboxes, Radio Buttons title")
    public void clickOnDropCheckRadioButtonsTitle() {
        atPage.clickOnDropCheckRadioButtonsTitle();
    }

    @Step("Click on Scrolling Around title")
    public void clickOnScrollingAroundTitle() {
        atPage.clickOnScrollingAroundTitle();
    }

    @Step("Click on Data Tables And Button States title")
    public void clickOnDataTablesAndButtonStatesTitle() {
        atPage.clickOnDataTablesAndButtonStatesTitle();
    }
}
