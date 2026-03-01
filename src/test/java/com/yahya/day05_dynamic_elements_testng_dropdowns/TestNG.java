package com.yahya.day05_dynamic_elements_testng_dropdowns;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

    @BeforeMethod
    public void setupMethod(){
        System.out.println("--> Before method is running");
    }
    @Test
    public void test1(){
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running");
    }
}
