package com.yahya.day03_css_selector_x_path;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NextBaseCRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://login1.nextbasecrm.com/");

        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("incorrect");

        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect");

        driver.findElement(By.className("login-btn")).click();

        WebElement errorMsg = driver.findElement(By.className("errortext"));

        String expectedErrMsg = "Incorrect login or password";
        String actualErrMsg = errorMsg.getText();

        Thread.sleep(1000);

        if (actualErrMsg.contains(expectedErrMsg)){
            System.out.println("Error message validation passed");
        } else {
            System.out.println("Error message validation failed");
        }

        driver.quit();

    }
}
