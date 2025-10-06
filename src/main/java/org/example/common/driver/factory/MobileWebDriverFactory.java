package org.example.common.driver.factory;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.OsType;

public class MobileWebDriverFactory extends BaseMobileFactory {

    BaseOptions<?> options = new BaseOptions<>();

    public MobileWebDriverFactory() {
        options.setCapability("appium:newCommandTimeout", 120);
        options.setCapability("appium:noReset", false);
        options.setCapability("appium:fullReset", false);

        if (TestConfig.OS == OsType.ANDROID) {
            options.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
            options.setCapability("appium:browserName", "Chrome");
        } else {
            options.setCapability("appium:browserName", "Safari");
        }

        new MobileOsFactory(options).setup();
    }

    public void setup() {

        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL:

                break;
            case DOCKER: // TODO implement if will be needed
            case BROWSERSTACK: // TODO implement if will be needed like IosMobileDriver.class and AndroidMobileDriver.class
            default:
                throw new IllegalArgumentException("Unsupported mobile web environment: " + env);
        }



    }
}
