package org.example.common.driver.factory;

import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.OsType;

public class MobileNativeDriverFactory extends BaseMobileFactory{

    BaseOptions<?> options = new BaseOptions<>();

    public MobileNativeDriverFactory() {
        options.setCapability("appium:newCommandTimeout", 120);
        options.setCapability("appium:noReset", false);
        options.setCapability("appium:fullReset", false);
        options.setCapability("appWaitActivity", "*");
        options.setCapability("appPackage", "com.socialnmobile.dictapps.notepad.color.note");
        options.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");

        if (TestConfig.OS == OsType.ANDROID) {
            options.setCapability("appium:app", "D:\\Automation\\selenide-allure-web-test\\ColorNote Notepad Notes_4.7.1_APKPure.apk");
        } else {
            options.setCapability("appium:app", "D:\\Automation\\selenide-allure-web-test\\ColorNote Notepad Notes_4.7.1_APKPure.app");
        }

        new MobileOsFactory(options).setup();
    }

    public void setup() {

        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL:



                break;
            case DOCKER: // TODO implement if will be needed
            case BROWSERSTACK: // TODO implement if will be needed like IosMobileDriver.class and AndroidMobileDriver.class
            default:
                throw new IllegalArgumentException("Unsupported mobile native environment: " + env);
        }
    }
}
