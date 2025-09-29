package org.example.common.driver.factory;

import com.codeborne.selenide.Configuration;
import org.example.common.driver.config.TestConfig;

public class WebDriverFactory {

    public void setup() {
        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL: // selenide works automatically
            case DOCKER: Configuration.remote = "http://selenoid:4444/wd/hub"; break;
            case BROWSERSTACK: // TODO implement if will be needed
            default:
                throw new IllegalArgumentException("Unsupported web environment: " + env);
        }
    }
}
