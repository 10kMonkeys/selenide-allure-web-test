package org.example.common.driver.factory;

import com.codeborne.selenide.Configuration;
import org.example.common.driver.config.TestConfig;

public class MobilePlatformFactory {

    public void setup() {
        var os = "iOS";

        switch (os) {
            case "iOS": // selenide works automatically

                break;
            case "Android":

                break;
            default:
                throw new IllegalArgumentException("Unsupported os: " + os);
        }
    }
}
