package org.example.common.driver.factory;

import com.codeborne.selenide.Configuration;
import org.example.common.driver.config.TestConfig;

public class WebPlatformFactory {

    public void setup() {
        var env = TestConfig.ENVIRONMENT;

        switch (env) {
            case LOCAL -> {} // selenide works automatically
            case DOCKER -> {
                Configuration.remote = "http://selenoid:4444/wd/hub";
                Configuration.remoteConnectionTimeout = 120000;
            }
            case BROWSERSTACK -> Configuration.remote = "https://alexyarm_8vc6RF:gXVpV1dzsZjhr9mjBfpE@hub-cloud.browserstack.com/wd/hub";
            // TODO BROWSERSTACK implement if will be needed
            default -> throw new IllegalArgumentException("Unsupported web environment: " + env);
        }
    }
}
