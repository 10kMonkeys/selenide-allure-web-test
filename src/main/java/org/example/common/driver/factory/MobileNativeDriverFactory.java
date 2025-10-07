package org.example.common.driver.factory;

import io.appium.java_client.remote.options.BaseOptions;
import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.OsType;
import org.example.common.driver.factory.base.BaseMobileFactory;

public class MobileNativeDriverFactory extends BaseMobileFactory {

    BaseOptions<?> options = new BaseOptions<>();

    public MobileNativeDriverFactory() {
        options.setCapability("appium:newCommandTimeout", 120); // common
        options.setCapability("appium:noReset", false); // common
        options.setCapability("appium:fullReset", false); // common
        options.setCapability("autoAcceptAlerts", true); // common
        options.setCapability("appWaitActivity", "*");
        options.setCapability("appPackage", "com.socialnmobile.dictapps.notepad.color.note");
        options.setCapability("appActivity", "com.socialnmobile.colornote.activity.Main");

        setupApp();
    }

    public void setup() {
        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL: new MobileOsFactory().setup(options); break;
            case DOCKER: // TODO implement if it will be needed
            case BROWSERSTACK: // TODO implement if it will be needed
            default:
                throw new IllegalArgumentException("Unsupported mobile native environment: " + env);
        }
    }


    private void setupApp() {
        if (TestConfig.OS == OsType.ANDROID) {
            options.setCapability("appium:app", "D:\\Automation\\selenide-allure-web-test\\ColorNote Notepad Notes_4.7.1_APKPure.apk");
        } else {
            options.setCapability("appium:app", "D:\\Automation\\selenide-allure-web-test\\ColorNote Notepad Notes_4.7.1_APKPure.app");
        }
    }
}
