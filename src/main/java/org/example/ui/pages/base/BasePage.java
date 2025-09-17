package org.example.ui.pages.base;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.WebElementCondition;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
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

    protected void waitUntilElementListVisible(ElementsCollection list, long timeout) {
        list.get(0).shouldBe(visible, Duration.ofSeconds(timeout));
    }
}
