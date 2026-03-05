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

            // close the file in memory
            file.close();
        } catch (IOException e ){
            System.out.println("FILE NOT FOUND WITH GIVEN PATH!!!!");
            e.printStackTrace();
        }
    }

    public static String getProperty(String keyword){

        return properties.getProperty(keyword);
    }
}
