package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.data.page.PageURLs;
import org.example.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private SelenideElement homePageTitle = $(byId("nav-title"));

    public void openHomePage() {
        openPage(PageURLs.HOME_PAGE_URL);
    }

    public SelenideElement getHomePageTitle() {
        return homePageTitle;
    }
}
