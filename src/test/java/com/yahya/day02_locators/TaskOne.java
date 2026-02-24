package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskOne {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        // verify url is Cydeo
        String expected = "cydeo";
        String actual = driver.getCurrentUrl();

        if (actual.contains(expected)){
            System.out.println("URL Verification Passed!");
        } else {
            System.out.println("URL Verification Failed!");
        }

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }
    }
}
