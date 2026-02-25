package com.yahya.util;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory{
    /**
     * Create a new method called getDriver
     * static method
     * accepts string arg: browserType
     *  - This arg will determine what type of browser is opened
     *  - if "chrome" is passed --> it will open Chrome browser
     *  - if "firefox" is passed --> it will open firefox browser
     *  - Return Type --> WebDriver
     */

    public static WebDriver getDriver(String browserType){

        if (browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }else {
            System.out.println("Given string does not represent any browser");
            return null;
        }
    }
}
