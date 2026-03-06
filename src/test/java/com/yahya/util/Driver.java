package com.yahya.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

    // Private constructor to remove access to object

    private Driver(){
    }

    /**
     * Driver is private so no access from outside of class
     * Made it static so it can be used in a static method
     */

    private static WebDriver driver;


    public static WebDriver getDriver(){

        // check if driver is null
        if (driver == null){

            /**
             * read browser type from config file so it doesn't get affected from any changes
             */
            String browserType = ConfigReader.getProperty("browser");

            switch (browserType){

                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new ChromeDriver();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                    break;
                default:
                    System.out.println("NO DRIVER FOUND");

            }

        }

        // return existing driver if it is not null
        return driver;
    }

    public void tearDown(){

        Driver.getDriver().quit();
        driver = null;
    }
}
