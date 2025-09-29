package org.example.ui.web.common.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.common.data.constant.PageURL;
import org.example.ui.web.common.pages.base.BasePage;
import org.example.ui.utils.BrowserHelper;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage {

    private final SelenideElement homePageTitle = $(byId("nav-title"));
    private final SelenideElement iFrameTitle = $(byXpath("//a[@id='iframe']//h1"));
    private final SelenideElement hiddenElementsTitle = $(byXpath("//a[@id='hidden-elements']//h1"));
    private final SelenideElement popUpsAndAlertsTitle = $(byXpath("//a[@id='popup-alerts']//h1"));
    private final SelenideElement actionsTitle = $(byXpath("//a[@id='actions']//h1"));
    private final SelenideElement toDoListTitle = $(byXpath("//a[@id='to-do-list']//h1"));
    private final SelenideElement datePickerTitle = $(byXpath("//a[@id='datepicker']//h1"));
    private final SelenideElement uploadFileTitle = $(byXpath("//a[@id='file-upload']//h1"));
    private final SelenideElement dopCheckRadioButtonsTitle = $(byXpath("//a[@id='dropdown-checkboxes-radiobuttons']//h1"));
    private final SelenideElement scrollingAroundTitle = $(byXpath("//a[@id='scrolling-around']//h1"));
    private final SelenideElement dataTablesAndButtonStatesTitle = $(byXpath("//a[@id='data-table']//h1"));

    public void openHomePage() {
        openPage(PageURL.HOME_PAGE_URL);
    }

    public SelenideElement getHomePageTitle() {
        return homePageTitle;
    }

    public void clickOnIFrameTitle() {
        iFrameTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnHiddenElementsTitle() {
        hiddenElementsTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnPopUpsAndAlertsTitle() {
        popUpsAndAlertsTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnActionsTitle() {
        actionsTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnToDoListTitle() {
        toDoListTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnDatePickerTitle() {
        datePickerTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnUploadFileTitle() {
        uploadFileTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnDropCheckRadioButtonsTitle() {
        dopCheckRadioButtonsTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnScrollingAroundTitle() {
        scrollingAroundTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }

    public void clickOnDataTablesAndButtonStatesTitle() {
        dataTablesAndButtonStatesTitle.click();
        BrowserHelper.switchToNewBrowserTab();
    }
}
