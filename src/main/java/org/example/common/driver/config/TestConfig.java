package org.example.common.driver.config;

import org.example.common.driver.enums.*;

public class TestConfig { // TODO variables, constructor and only method to resolve config

    public static final PlatformType PLATFORM = System.getProperty("platform") == null ?
            PlatformType.valueOf(System.getProperty("platform", "MOBILE_NATIVE").toUpperCase()) :
            PlatformType.valueOf(System.getProperty("platform").toUpperCase());

    public static final EnvironmentType ENVIRONMENT = System.getProperty("env") == null ?
            EnvironmentType.valueOf(System.getProperty("env", "LOCAL").toUpperCase()) :
            EnvironmentType.valueOf(System.getProperty("env").toUpperCase());

    public static final BackendEnvType BACKEND_ENV = System.getProperty("backendEnv") == null ?
            BackendEnvType.valueOf(System.getProperty("backendEnv", "PUPA").toUpperCase()) :
            BackendEnvType.valueOf(System.getProperty("backendEnv").toUpperCase());

    public static final OsType OS = System.getProperty("os") == null ?
            OsType.valueOf(System.getProperty("os", "ANDROID").toUpperCase()) :
            OsType.valueOf(System.getProperty("os").toUpperCase());

    public static final MobileDeviceType DEVICE = System.getProperty("device") == null ?
            MobileDeviceType.valueOf(System.getProperty("device", "PIXEL_9_PRO").toUpperCase()) :
            MobileDeviceType.valueOf(System.getProperty("device").toUpperCase());

    public static final String BASE_URL = getBaseUrl();

    private static String getBaseUrl() {
        return switch (BACKEND_ENV) {
            case DEV -> "https://webdriveruniversity.com";
            case STAGE -> "https://webdriveruniversity2.com";
            case PROD -> "https://webdriveruniversity3.com";
        };
    }

    public static String getAndroidAppPath() {
        return System.getProperty("user.dir") + "\\ColorNote Notepad Notes_4.7.1_APKPure.apk";
    }

    public static String getIosAppPath() {
        return System.getProperty("user.dir") + "\\ColorNote Notepad Notes_4.7.1_APKPure.app";
    }
}
