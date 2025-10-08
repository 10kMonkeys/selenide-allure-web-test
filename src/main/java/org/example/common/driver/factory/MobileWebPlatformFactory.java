package org.example.common.driver.factory;

import com.google.common.collect.ImmutableMap;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.OsType;
import org.example.common.driver.factory.base.BaseMobilePlatformFactory;

public class MobileWebPlatformFactory extends BaseMobilePlatformFactory {

    public MobileWebPlatformFactory() {
        setupMobileBrowser();
    }

    public void setupMobilePlatform() {
        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL -> new MobileOsFactory().setupMobileOs(options);
            // TODO BROWSERSTACK implement if it will be needed
            // TODO DOCKER implement if it will be needed only Android
            default -> throw new IllegalArgumentException("Unsupported mobile web environment: " + env);
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
