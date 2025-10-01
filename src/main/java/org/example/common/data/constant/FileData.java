package org.example.common.data.constant;

import org.example.common.driver.config.TestConfig;
import org.example.common.driver.enums.PlatformType;

public class FileData {

    public static final String HAPPY_DOG_PNG = "HappyDog.png";
    public static final String HAPPY_DOG_PNG_PATH = TestConfig.PLATFORM.equals(PlatformType.WEB) ?
            System.getProperty("user.dir") + "\\src\\test\\resources\\HappyDog.png" : // only windows path, no need for macos
            "//src/test/resources/HappyDog.png";
}
