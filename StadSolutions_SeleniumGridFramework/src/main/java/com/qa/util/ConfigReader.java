package com.qa.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    // static block executes only once
    static {

        try {
            prop = new Properties();

            FileInputStream fis = new FileInputStream(
                    System.getProperty("user.dir") +
                    "/src/test/resources/config/config.properties");

            prop.load(fis);

        }
        catch (IOException e) {

            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties");

        }

    }


    public static String getProperty(String key) {

        String value = prop.getProperty(key);

        if (value == null) {
            throw new RuntimeException("Property not found: " + key);
        }

        return value.trim();

    }

}
