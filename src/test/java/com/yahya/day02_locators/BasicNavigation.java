package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) {

        // Setup browser driver
        WebDriverManager.chromedriver().setup();
        // Create new instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        // navigate to website
        driver.get("https://www.tesla.com");

    }
}
