package org.example.common.driver.factory;

import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.managers.AndroidManager;
import org.example.common.driver.managers.IosManager;

public class MobileOsFactory {

    public void setupMobileOs(BaseOptions<?> options) {
        var os = TestConfig.OS;

        switch (os) {
            case ANDROID -> new AndroidManager(options);
            case IOS -> new IosManager(options);
            default -> throw new IllegalArgumentException("Unsupported mobile os: " + os);
        }
    }
}
