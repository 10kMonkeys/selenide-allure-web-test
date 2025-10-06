package org.example.tests.ui.mobileNative;

import io.appium.java_client.AppiumBy;
import org.example.tests.ui.base.BaseTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.appium.AppiumClickOptions.tap;
import static com.codeborne.selenide.appium.SelenideAppium.$;
import static com.codeborne.selenide.appium.SelenideAppium.launchApp;

public class MobileNativeTest extends BaseTest {

    @Tags({
            @Tag("native")
    })
    @Test
    public void nativeTest() {
        launchApp();
        $(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/step1_next")).shouldBe(visible).click();
        $(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/step3_next")).click(tap());
    }

    @Tags({
            @Tag("native")
    })
    @Test
    public void nativeTestTwo() {
        launchApp();
        $(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/step1_next")).shouldBe(visible).click();
        $(AppiumBy.id("com.socialnmobile.dictapps.notepad.color.note:id/step3_next")).click(tap());
    }
}
