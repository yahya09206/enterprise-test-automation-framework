package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskFour {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.cydeo.com/registration_form");

        WebElement headerText = driver.findElement(By.tagName("h2"));

        String expectedHeaderText = "Registration form";
        String actualHeaderText = headerText.getText();

        if (actualHeaderText.contains(expectedHeaderText)){
            System.out.println("Header Validation Passed!");
        } else {
            System.out.println("Header Validation Failed!");
        }

        Thread.sleep(1000);
        driver.quit();
    }
}
