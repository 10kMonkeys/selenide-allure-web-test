package org.example.common.driver.factory.base;

import io.appium.java_client.remote.options.BaseOptions;

public abstract class BaseMobilePlatformFactory {

    protected BaseOptions<?> options;

    public BaseMobilePlatformFactory() {
        options = new BaseOptions<>();
        setCommonCapabilities();
    }

    public abstract void setupMobilePlatform();

    private void setCommonCapabilities() {
        options.setCapability("appium:newCommandTimeout", 120);
        options.setCapability("appium:noReset", false);
        options.setCapability("appium:fullReset", false);
        options.setCapability("autoAcceptAlerts", true);
    }
}
