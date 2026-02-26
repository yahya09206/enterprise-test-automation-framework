package com.yahya.day04_find_elements_radio_button;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement goHome = driver.findElement(By.xpath("//li/a[@class='nav-link']"));
        System.out.println(goHome.isDisplayed());

        Thread.sleep(1000);
        driver.quit();
    }
}
