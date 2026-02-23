package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        // Setup browser driver
        WebDriverManager.chromedriver().setup();
        // Create new instance of Chrome browser
        WebDriver driver = new ChromeDriver();

        // navigate to website
        driver.get("https://www.tesla.com");

        // Use navigate to go back() one page
        driver.navigate().back();

        // stop execution for 2 seconds
        Thread.sleep(2000);

        // Navigate forward to tesla site
        driver.navigate().forward();

        // Refresh the page using navigate.refresh()
        driver.navigate().refresh();

        Thread.sleep(2000);
        driver.quit();
    }
}
