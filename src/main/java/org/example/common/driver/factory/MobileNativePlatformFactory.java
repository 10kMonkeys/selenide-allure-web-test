package org.example.common.driver.factory;

import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.OsType;
import org.example.common.driver.factory.base.BaseMobilePlatformFactory;

public class MobileNativePlatformFactory extends BaseMobilePlatformFactory {

    public MobileNativePlatformFactory() {
        setupMobileApp();
    }

    public void setupMobilePlatform() {
        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL -> new MobileOsFactory().setupMobileOs(options);
            // TODO BROWSERSTACK implement if it will be needed
            // TODO DOCKER implement if it will be needed only Android
            default -> throw new IllegalArgumentException("Unsupported mobile native environment: " + env);
        }
    }


    public void setupMobileApp() {
        if (TestConfig.OS == OsType.ANDROID) {
            options.setCapability("appWaitActivity", "*");
            options.setCapability("appPackage", "com.socialnmobile.dictapps.notepad.color.note");
            options.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");
            options.setCapability("appium:app", TestConfig.getAndroidAppPath());
        } else {
            options.setCapability("appium:app", TestConfig.getIosAppPath());
        }
    }
}
