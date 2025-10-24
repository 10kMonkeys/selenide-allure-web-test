package org.example.ui.web.steps.base;

import org.example.ui.PageProvider;

import org.example.ui.web.pages.*;
import org.example.ui.web.steps.*;


public class UserSteps {

    public PageProvider pageProvider;

    public HomePageSteps atHomePage;
    public ContactUsSteps atContactUsPage;
    public ContactUsThanksSteps atContactUsThanksPage;
    public IFrameSteps atIFramePage;
    public HiddenElementsSteps atHiddenElementPage;
    public PopUpsAndAlertsSteps atPopUpsAndAlertsPage;
    public ActionsSteps atActionsPage;
    public ToDoListSteps atToDoListPage;
    public DatePickerSteps atDatePickerPage;
    public UploadFileSteps atUploadFilePage;
    public DropCheckRadioButtonsSteps atDropCheckRadioButtonsPage;
    public ScrollingAroundSteps atScrollingAroundPage;
    public DataTablesAndButtonStatesSteps atDataTablesAndButtonStatesPage;

    public UserSteps(PageProvider pageProvider) {
        this.pageProvider = pageProvider;

        atHomePage = new HomePageSteps(pageProvider.initPage(HomePage.class));
        atContactUsPage = new ContactUsSteps(pageProvider.initPage(ContactUsPage.class));
        atContactUsThanksPage = new ContactUsThanksSteps(pageProvider.initPage(ContactUsThanksPage.class));
        atIFramePage = new IFrameSteps(pageProvider.initPage(IFramePage.class));
        atHiddenElementPage = new HiddenElementsSteps(pageProvider.initPage(HiddenElementsPage.class));
        atPopUpsAndAlertsPage = new PopUpsAndAlertsSteps(pageProvider.initPage(PopUpsAndAlertsPage.class));
        atActionsPage = new ActionsSteps(pageProvider.initPage(ActionsPage.class));
        atToDoListPage = new ToDoListSteps(pageProvider.initPage(ToDoListPage.class));
        atDatePickerPage = new DatePickerSteps(pageProvider.initPage(DatePickerPage.class));
        atUploadFilePage = new UploadFileSteps(pageProvider.initPage(FileUploadPage.class));
        atDropCheckRadioButtonsPage = new DropCheckRadioButtonsSteps(pageProvider.initPage(DropCheckRadioButtonsPage.class));
        atScrollingAroundPage = new ScrollingAroundSteps(pageProvider.initPage(ScrollingAroundPage.class));
        atDataTablesAndButtonStatesPage = new DataTablesAndButtonStatesSteps(pageProvider.initPage(DataTablesAndButtonStatesPage.class));
    }
}
