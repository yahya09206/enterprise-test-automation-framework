package com.yahya.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {

        try {
            //2 - Open file using FileInputStream (open file)
            FileInputStream file = new FileInputStream("config.properties");
            //3 - Load the "properties" object with "file" (load properties)
            properties.load(file);
        } catch (IOException e ){
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!!");
            e.printStackTrace();
        }
    }
}
