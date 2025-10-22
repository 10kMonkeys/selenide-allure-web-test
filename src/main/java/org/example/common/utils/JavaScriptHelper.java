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

    public static String getElementValue(SelenideElement element) {
        return executeJavaScript(
                "return arguments[0].value",
                element
        );
    }
}
