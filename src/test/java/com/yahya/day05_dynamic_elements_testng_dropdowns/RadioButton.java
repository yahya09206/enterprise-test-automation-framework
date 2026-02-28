package com.yahya.day05_dynamic_elements_testng_dropdowns;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class RadioButton {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement hockeyBtn = driver.findElement(By.xpath("//div/input[@id='hockey']"));
        hockeyBtn.click();

        System.out.println(hockeyBtn.isSelected());

        driver.quit();


    }
}
