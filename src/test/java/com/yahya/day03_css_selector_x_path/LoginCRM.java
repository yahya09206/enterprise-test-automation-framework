package com.yahya.day03_css_selector_x_path;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginCRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/");

        WebElement loginBtnText = driver.findElement(By.cssSelector("input[type='submit']"));

        String expectedText = "Log In";
        String actualText = loginBtnText.getAttribute("value");

        if (actualText.equals(expectedText)){
            System.out.println("Text validation passed");
        } else {
            System.out.println("Text validation failed");
        }

        Thread.sleep(1000);
        driver.quit();
    }
}
