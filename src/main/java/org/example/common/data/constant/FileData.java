package org.example.common.data.constant;

public class FileData {

    public static final String HAPPY_DOG_PNG = "HappyDog.png";
    public static final String HAPPY_DOG_PNG_PATH = System.getProperty("env").equals("desktopWeb") ?
            "//src/test/resources/HappyDog.png" :
            "D:\\Automation\\selenide-allure-web-test\\src\\test\\resources\\HappyDog.png"; // only windows path, no need for macos
}
