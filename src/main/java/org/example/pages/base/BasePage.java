package org.example.pages.base;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class BasePage {

    protected void openPage(String url) {
        open(url);
        setUpBrowser();
    }

    private void setUpBrowser() {
        getWebDriver().manage().window().maximize();
    }

}
