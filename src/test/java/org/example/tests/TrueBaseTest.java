package org.example.tests;

import org.example.common.driver.factory.PlatformFactory;

public abstract class TrueBaseTest {

    public TrueBaseTest() {
        new PlatformFactory().setupPlatform();
    }
}
