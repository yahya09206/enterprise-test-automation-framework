package com.yahya.day08_properties_configreader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {

    @Test
    public void readFromProperties() throws IOException {

        Properties properties = new Properties();

        FileInputStream file = new FileInputStream("config.properties");

        properties.load(file);

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));


    }
}
