package org.example.utils;


import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BrowserHelper {

    public static String getCurrentTabName() {
        return getWebDriver().getWindowHandle();
    }

    public static void switchToNewBrowserTab() {
        String currentBrowserTabName = getCurrentTabName();

        for (String windowHandle : getWebDriver().getWindowHandles()) {
            if (!windowHandle.equals(currentBrowserTabName)) {
                switchTo().window(windowHandle);
            }
        }
    }

    public static void switchToCertainBrowserTab(String browserTabName) {
        for (String windowHandle : getWebDriver().getWindowHandles()) {
            if (windowHandle.equals(browserTabName)) {
                switchTo().window(browserTabName);
            }
        }
    }

    public static void switchToCertainBrowserTab(int index) {
        switchTo().window(index);
    }
}
