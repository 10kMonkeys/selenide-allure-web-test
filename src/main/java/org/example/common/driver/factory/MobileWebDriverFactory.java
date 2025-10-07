package org.example.common.driver.factory;

import com.google.common.collect.ImmutableMap;
import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.OsType;
import org.example.common.driver.factory.base.BaseMobileFactory;

public class MobileWebDriverFactory extends BaseMobileFactory {

    BaseOptions<?> options = new BaseOptions<>();

    public MobileWebDriverFactory() {
        options.setCapability("appium:newCommandTimeout", 120); // common
        options.setCapability("appium:noReset", false); // common
        options.setCapability("appium:fullReset", false); // common
        options.setCapability("autoAcceptAlerts", true); // common

        setupMobileBrowser();
    }

    public void setup() {
        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL: new MobileOsFactory().setup(options); break;
            case DOCKER: // TODO implement if it will be needed
            case BROWSERSTACK: // TODO implement if it will be needed
            default:
                throw new IllegalArgumentException("Unsupported mobile web environment: " + env);
        }
    }

    private void setupMobileBrowser() {
        if (TestConfig.OS == OsType.ANDROID) {
            options.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));
            options.setCapability("appium:browserName", "Chrome");
        } else {
            options.setCapability("appium:browserName", "Safari");
        }
    }
}
