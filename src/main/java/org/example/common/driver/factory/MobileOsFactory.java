package org.example.common.driver.factory;

import com.codeborne.selenide.Configuration;
import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.OsType;
import org.example.common.driver.managers.AndroidManager;
import org.example.common.driver.managers.IosManager;

public class MobileOsFactory {

    BaseOptions<?> options;

    public MobileOsFactory(BaseOptions<?> options) {
        this.options = options;
    }


    public void setup() {
//        if (TestConfig.OS == OsType.ANDROID) {
//            options.setCapability("appium:app", "D:\\Automation\\selenide-allure-web-test\\ColorNote Notepad Notes_4.7.1_APKPure.apk");
//        } else {
//            options.setCapability("appium:app", "D:\\Automation\\selenide-allure-web-test\\ColorNote Notepad Notes_4.7.1_APKPure.app");
//        }

        var os = TestConfig.OS;

        switch (os) {
            case ANDROID:
                new AndroidManager(options);
                break;
            case IOS:
                new IosManager(options);
                break;
            default:
                throw new IllegalArgumentException("Unsupported mobile os: " + os);
        }

    }
}
