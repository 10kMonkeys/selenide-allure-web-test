package org.example.common.driver.driver;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class IosMobileDriver implements WebDriverProvider {

    public WebDriver createDriver(Capabilities capabilities) {
        XCUITestOptions options = new XCUITestOptions()
                .merge(capabilities)
                .setPlatformName("iOS")
//                .setDeviceName("iPhone 15 Pro")
                .setAutomationName("XCUITest")
//                .withBrowserName("Safari")
                .noReset();

        options.setCapability("unicodeKeyboard", true);
        options.setCapability("resetKeyboard", true);
        options.setCapability("autoGrantPermissions", true);
        options.setCapability("autoAcceptAlerts", true);


        try {
            return new RemoteWebDriver(new URL("http://127.0.0.1:4723"), options);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
