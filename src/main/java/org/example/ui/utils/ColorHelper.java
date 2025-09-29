package org.example.ui.utils;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.Color;

public class ColorHelper {

    public static String convertColorToHexInUpperCase(SelenideElement element, String propertyName) {
        var color = element.getCssValue(propertyName);

        return Color.fromString(color).asHex().toUpperCase();
    }
}
