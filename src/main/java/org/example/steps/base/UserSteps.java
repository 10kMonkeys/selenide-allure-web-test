package org.example.steps.base;

import org.example.common.PageProvider;
import org.example.pages.ContactUsPage;
import org.example.pages.ContactUsThanksPage;
import org.example.pages.HomePage;
import org.example.steps.ContactUsPageSteps;
import org.example.steps.ContactUsThanksPageSteps;
import org.example.steps.HomePageSteps;

public class UserSteps {

    public PageProvider pageProvider;

    public HomePageSteps atHomePage;
    public ContactUsPageSteps atContactUsPage;
    public ContactUsThanksPageSteps atContactUsThanksPage;

    public UserSteps(PageProvider pageProvider) {
        this.pageProvider = pageProvider;

        atHomePage = new HomePageSteps(pageProvider.initPage(HomePage.class));
        atContactUsPage = new ContactUsPageSteps(pageProvider.initPage(ContactUsPage.class));
        atContactUsThanksPage = new ContactUsThanksPageSteps(pageProvider.initPage(ContactUsThanksPage.class));
    }

}
