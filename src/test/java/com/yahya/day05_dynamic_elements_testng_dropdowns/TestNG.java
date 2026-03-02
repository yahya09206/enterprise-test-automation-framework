package com.yahya.day05_dynamic_elements_testng_dropdowns;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

    @BeforeClass
    public void setupClass(){

        System.out.println("---> Before class is running");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("--> Before method is running");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("--> After method is running");
    }

    @Test (priority = 1)
    public void test1(){
        System.out.println("Test 1 is running");
    }

    @Test (priority = 2)
    public void test2(){
        System.out.println("Test 2 is running");
    }
}
