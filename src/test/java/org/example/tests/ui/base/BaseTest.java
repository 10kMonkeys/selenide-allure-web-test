package org.example.tests.ui.base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.example.common.driver.config.TestConfig;
import org.example.tests.TrueBaseTest;
import org.example.ui.PageProvider;
import org.example.ui.web.steps.base.UserSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;


public abstract class BaseTest extends TrueBaseTest {

    protected UserSteps user;

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = TestConfig.BASE_URL;
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


