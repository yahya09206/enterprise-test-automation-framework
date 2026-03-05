package com.yahya.day08_properties_configreader;

import org.testng.annotations.Test;

public class Properties {

    @Test
    public void read_from_properties(){

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.name"));
    }
}
