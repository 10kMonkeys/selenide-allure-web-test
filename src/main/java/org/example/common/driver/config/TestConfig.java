package org.example.common.driver.config;

import org.example.common.driver.enums.BackendEnvType;
import org.example.common.driver.enums.EnvironmentType;
import org.example.common.driver.enums.PlatformType;

public class TestConfig {

    public static final PlatformType PLATFORM = System.getProperty("platform") == null ?
                PlatformType.valueOf(System.getProperty("platform", "MOBILE_WEB").toUpperCase()) :
                PlatformType.valueOf(System.getProperty("platform").toUpperCase());

    public static final EnvironmentType ENVIRONMENT = System.getProperty("env") == null ?
            EnvironmentType.valueOf(System.getProperty("env", "LOCAL").toUpperCase()) :
            EnvironmentType.valueOf(System.getProperty("env").toUpperCase());

    public static final BackendEnvType BACKEND_ENV = System.getProperty("backendEnv") == null ?
            BackendEnvType.valueOf(System.getProperty("backendEnv", "DEV").toUpperCase()) :
            BackendEnvType.valueOf(System.getProperty("backendEnv").toUpperCase());

    public static final String DEVICE = System.getProperty("device", ""); // TODO add enum?

    public static final String BASE_URL = getBaseUrl();

    private static String getBaseUrl() {
        switch (BACKEND_ENV) {
            case DEV:
                return "https://webdriveruniversity.com/";
            case STAGE:
                return "https://webdriveruniversity2.com/";
            case PROD:
                return "https://webdriveruniversity3.com/";
            default:
                throw new IllegalArgumentException("Unknown env: " + BACKEND_ENV);
        }
    }
}
