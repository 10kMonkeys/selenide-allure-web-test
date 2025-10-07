package org.example.common.driver.managers;

import com.codeborne.selenide.Configuration;
import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.driver.IosMobileDriver;

public class IosManager {

    public IosManager(BaseOptions<?> options) {
        Configuration.browserCapabilities = options;
        Configuration.browser = IosMobileDriver.class.getName();
    }
}
