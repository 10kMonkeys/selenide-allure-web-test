package org.example.tests.ui.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.example.ui.common.PageProvider;
import org.example.common.data.constant.PageURL;
import org.example.ui.steps.base.UserSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected UserSteps user;

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = PageURL.BASE_URL;
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true)
                .savePageSource(false)
        );
    }

    @BeforeEach
    public void beforeEach() {
        user = new UserSteps(new PageProvider());
    }

    @AfterEach
    public void afterEach() {
        Selenide.closeWebDriver();
    }
}
