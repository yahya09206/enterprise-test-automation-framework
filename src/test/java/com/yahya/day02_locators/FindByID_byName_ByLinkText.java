package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindByID_byName_ByLinkText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");

        /** TODO
         * Find email box by ID and enter something
         * Find password box by name and enter password
         * Login
         *
         * Wait for 3 seconds
         *
         * Click on forgot password
         */

    }
}
