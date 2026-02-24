package com.yahya.day02_locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskThree {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com");

        WebElement searchBox = driver.findElement(By.xpath("//div/textarea[@name='q']"));
        searchBox.sendKeys("apple", Keys.ENTER);

        String expectedTitle = "apple";
        String actualTitle = driver.getTitle();

        Thread.sleep(1000);

        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Title Verification Failed");
        }

        driver.quit();
    }
}
