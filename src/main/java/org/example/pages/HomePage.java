package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.data.page.PageURLs;
import org.example.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class HomePage extends BasePage {

    private final SelenideElement homePageTitle = $(byId("nav-title"));
    private final SelenideElement iFrameTitle = $(byId("iframe"));

    public void openHomePage() {
        openPage(PageURLs.HOME_PAGE_URL);
    }

    public SelenideElement getHomePageTitle() {
        return homePageTitle;
    }

    public void clickOnIFrameTitle() {
        iFrameTitle.click();
    }
}
