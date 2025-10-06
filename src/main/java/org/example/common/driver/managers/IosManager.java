package org.example.common.driver.managers;

import com.codeborne.selenide.Configuration;
import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.driver.IosMobileDriver;

public class IosManager {

    BaseOptions<?> options;

    public IosManager(BaseOptions<?> options) {
        this.options = options;
        Configuration.browserCapabilities = options;
        Configuration.browser = IosMobileDriver.class.getName();
    }
}
