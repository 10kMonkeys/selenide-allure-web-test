package org.example.common.driver.factory;

import org.example.common.driver.config.TestConfig;

public class PlatformFactory {

    public void setupPlatform() {

        var platform = TestConfig.PLATFORM;

        switch (platform) {
            case WEB: new WebDriverFactory().setup(); break;
            case MOBILE_WEB: new MobileWebDriverFactory().setup(); break;
            case MOBILE_NATIVE: new MobileNativeDriverFactory().setup(); break;
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}

