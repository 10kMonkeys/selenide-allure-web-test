package org.example.common.driver.managers;

import com.codeborne.selenide.Configuration;
import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.driver.AndroidMobileDriver;

public class AndroidManager {

    BaseOptions<?> options;

    public AndroidManager(BaseOptions<?> options) {
        this.options = options;
        Configuration.browserCapabilities = options;
        Configuration.browser = AndroidMobileDriver.class.getName();
    }
}
