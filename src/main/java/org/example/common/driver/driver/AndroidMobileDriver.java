package org.example.common.driver.driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class AndroidMobileDriver implements WebDriverProvider  {

    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options()
                .merge(capabilities)
                .setPlatformName("Android")
//                .setDeviceName("Pixel_9_Pro")
                .setAutomationName("UiAutomator2")
                .withBrowserName("Chrome")
                .noReset();
        options.setCapability("unicodeKeyboard", true);
        options.setCapability("resetKeyboard", true);
        options.setCapability("autoGrantPermissions", true);
        options.setCapability("autoAcceptAlerts", true);
//        options.setCapability("appium:chromeOptions", ImmutableMap.of("w3c", false));

        try {
            return new RemoteWebDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
