package org.example.steps.base;

import org.example.common.PageProvider;
import org.example.pages.HomePage;
import org.example.steps.HomePageSteps;

public class UserSteps {

    public PageProvider pageProvider;

    public HomePageSteps atHomePage;

    public UserSteps(PageProvider pageProvider) {
        this.pageProvider = pageProvider;

        atHomePage = new HomePageSteps(pageProvider.initPage(HomePage.class));
    }

}
