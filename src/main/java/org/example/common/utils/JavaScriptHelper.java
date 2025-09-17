package org.example.common.utils;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class JavaScriptHelper {

    public static void clickOnElement(SelenideElement element) {
        executeJavaScript("arguments[0].click();", element);
    }

    public static void clickOnElementById(String value) {
        executeJavaScript("document.getElementById('" + value +"').click();");
    }
}
