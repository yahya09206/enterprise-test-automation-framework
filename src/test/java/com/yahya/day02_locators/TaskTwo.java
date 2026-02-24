package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTwo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com");

        driver.findElement(By.linkText("A/B Testing")).click();

        String expectedTitle = "No A/B Test";
        String actualTitle = driver.getTitle();

        Thread.sleep(1000);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }

        driver.navigate().back();

        String expectedTitleTwo = "Practice";
        String actualTitleTwo = driver.getTitle();

        if (actualTitleTwo.contains(expectedTitleTwo)){
            System.out.println("Title Verification Passed!");
        } else {
            System.out.println("Title Verification Failed!");
        }

        driver.quit();
    }
}
