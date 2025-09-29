package org.example.common.driver.factory;

import org.example.common.driver.config.TestConfig;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileNativeDriverFactory {

    public void setup() {

        var env = TestConfig.ENVIRONMENT;

        DesiredCapabilities caps = new DesiredCapabilities();

        switch (env) {
            case LOCAL:
//                caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
//                caps.setCapability("appium:browserName", "Chrome");
//
//                Configuration.browserCapabilities = caps;
//
//                Configuration.browser = AndroidMobileWebDriver.class.getName();
                break;
            case DOCKER: // TODO implement if will be needed
            case BROWSERSTACK: // TODO implement if will be needed
            default:
                throw new IllegalArgumentException("Unsupported mobile native environment: " + env);
        }
    }
}
