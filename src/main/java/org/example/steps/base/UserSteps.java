package org.example.steps.base;

import org.example.common.PageProvider;
import org.example.pages.ContactUsPage;
import org.example.pages.ContactUsThanksPage;
import org.example.pages.HomePage;
import org.example.pages.IFramePage;
import org.example.steps.ContactUsSteps;
import org.example.steps.ContactUsThanksSteps;
import org.example.steps.HomePageSteps;
import org.example.steps.IFrameSteps;

public class UserSteps {

    public PageProvider pageProvider;

    public HomePageSteps atHomePage;
    public ContactUsSteps atContactUsPage;
    public ContactUsThanksSteps atContactUsThanksPage;
    public IFrameSteps atIFramePage;

    public UserSteps(PageProvider pageProvider) {
        this.pageProvider = pageProvider;

        atHomePage = new HomePageSteps(pageProvider.initPage(HomePage.class));
        atContactUsPage = new ContactUsSteps(pageProvider.initPage(ContactUsPage.class));
        atContactUsThanksPage = new ContactUsThanksSteps(pageProvider.initPage(ContactUsThanksPage.class));
        atIFramePage = new IFrameSteps(pageProvider.initPage(IFramePage.class));
    }
}
