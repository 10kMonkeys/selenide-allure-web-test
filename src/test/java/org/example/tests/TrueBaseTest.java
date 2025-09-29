package org.example.tests;

import org.example.common.driver.factory.PlatformFactory;

public class TrueBaseTest {

//    @BeforeAll
//    static void beforeAll() {
//
//    }

    public TrueBaseTest() {
        new PlatformFactory().setupPlatform();
    }
}
