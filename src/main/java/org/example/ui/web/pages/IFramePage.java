package org.example.ui.web.pages;

import com.codeborne.selenide.SelenideElement;
import org.example.ui.web.pages.base.BasePage;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.switchTo;

public class IFramePage extends BasePage {

    private final SelenideElement iFramePageTitle = $(byId("nav-title"));
    private final SelenideElement ourProductTab = $(byXpath("//a[@href='products.html']"));
    private final SelenideElement iFrame = $(byId("frame"));
    private final SelenideElement specialOffersTitle = $(byId("container-special-offers"));

    public SelenideElement getIFramePageTitle() {
        return iFramePageTitle;
    }

    public void clickOnOurProductTab() {
        switchTo().frame(iFrame);
        ourProductTab.click();
    }

    public SelenideElement getSpecialOffersTitle() {
        return specialOffersTitle;
    }
}
