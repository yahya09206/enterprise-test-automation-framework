package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://library2.cydeo.com/login.html");

        WebElement username = driver.findElement(By.className("form-control valid"));
        username.sendKeys("incorrect@email.com");

        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password");

        Thread.sleep(1000);

        driver.quit();


    }
}
