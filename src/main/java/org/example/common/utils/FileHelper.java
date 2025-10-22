package org.example.common.utils;

import com.codeborne.selenide.WebDriverRunner;
import io.appium.java_client.AppiumDriver;

import java.util.HashMap;
import java.util.Map;

public class FileHelper {

    public static void moveFileIntoMobileDevice(String fileName) {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();

        Map<String, Object> args = new HashMap<>();
        args.put("remotePath", "/sdcard/Download/" + fileName);
        args.put("payload", "src/test/resources/" + fileName);

        driver.executeScript("mobile: pushFile", args);
    }
}
