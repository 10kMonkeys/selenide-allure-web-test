package org.example.common.driver.factory;

import com.codeborne.selenide.Configuration;
import com.google.common.collect.ImmutableMap;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.driver.AndroidMobileDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MobileWebDriverFactory {
    public void setup() {

        var env = TestConfig.ENVIRONMENT;

        DesiredCapabilities caps = new DesiredCapabilities();

        switch (env) {
            case LOCAL:
                caps.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
//                caps.setCapability("appium:browserName", "Chrome");

//                caps.setCapability("appium:app", "D:\\Automation\\selenide-allure-web-test\\ColorNote Notepad Notes_4.7.1_APKPure.apk");
//                caps.setCapability("appium:platformVersion", "16.0");

                Configuration.browserCapabilities = caps;

                Configuration.browser = AndroidMobileDriver.class.getName();
                break;
            case DOCKER: // TODO implement if will be needed
            case BROWSERSTACK: // TODO implement if will be needed
            default:
                throw new IllegalArgumentException("Unsupported mobile web environment: " + env);
        }



    }
}
