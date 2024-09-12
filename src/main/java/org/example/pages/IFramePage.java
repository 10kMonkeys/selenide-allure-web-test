package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class IFramePage extends BasePage {

    private final SelenideElement iFramePageTitle = $(byId("nav-title"));

    public SelenideElement getIFramePageTitle() {
        return iFramePageTitle;
    }
}
