package com.yahya.util;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

/**
 * This call will only be storing the utility methods that can be used across the project.
 */
public class BrowserUtil {

    // Sleep method
    public static void sleep(int seconds){
        seconds *= 1000;
        try{
            Thread.sleep(seconds);
        }catch (InterruptedException e){

        }
    }

    public static void switchWindowAndVerify(WebDriver driver, String expectedInUrl, String expectedTitle){


        // Return and store all window handles in a Set
        Set<String> allWindowHandles = driver.getWindowHandles();

        for (String each : allWindowHandles) {

            driver.switchTo().window(each);
            System.out.println(driver.getCurrentUrl());

            if (driver.getCurrentUrl().contains(expectedInUrl)){
                break;
            }
        }

        // Assert that title contains "Etsy"
        String actualTitle = driver.getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){

        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
}
