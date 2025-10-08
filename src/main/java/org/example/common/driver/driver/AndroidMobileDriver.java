package org.example.common.driver.driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidMobileDriver implements WebDriverProvider  {

    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options()
                .merge(capabilities)
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2");
        options.setCapability("unicodeKeyboard", true);
        options.setCapability("resetKeyboard", true);
        options.setCapability("autoGrantPermissions", true);

        try {
            return new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
