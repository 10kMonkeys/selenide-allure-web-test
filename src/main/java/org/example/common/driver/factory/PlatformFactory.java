package org.example.common.driver.factory;

import org.example.common.driver.config.TestConfig;

public class PlatformFactory {

    public void setupPlatform() {

        var platform = TestConfig.PLATFORM;

        switch (platform) {
            case WEB -> new WebPlatformFactory().setup();
            case MOBILE_WEB -> new MobileWebPlatformFactory().setupMobilePlatform();
            case MOBILE_NATIVE -> new MobileNativePlatformFactory().setupMobilePlatform();
            default -> throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}

