package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReader {

    private final static String SELENIDE_PROPERTY = "selenide.properties";

    /*
     * Load selenide.properties file in resources
     */
    public void readProperty() {                                    // по х
//        Properties props = new Properties();
//        InputStream inputStream = BaseTest.class
//                .getClassLoader()
//                .getResourceAsStream(SELENIDE_PROPERTY);
//        try {
//            props.load(inputStream);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        if (!props.isEmpty()) {
//            for (Object propObj : props.keySet()) {
//                String prop = String.valueOf(propObj);
//
//                if (!System.getProperties().containsKey(prop)) {
//                    System.setProperty(prop, props.getProperty(prop));
//                }
//            }
//        }
//
//        logger.info("Loading selenide properties as {}", selenideProperties);
//        super.setUpClass();
    }
}
