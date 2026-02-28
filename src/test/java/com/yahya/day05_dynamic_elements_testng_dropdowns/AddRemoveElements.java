package com.yahya.day05_dynamic_elements_testng_dropdowns;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class AddRemoveElements {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement addElementBtn = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementBtn.click();

        Thread.sleep(1000);

        WebElement deleteBtn = driver.findElement(By.xpath("//button[.='delete']"));
        System.out.println(deleteBtn.isDisplayed());

        deleteBtn.click();
        System.out.println(deleteBtn.isDisplayed());

        Thread.sleep(1000);

        driver.quit();
    }
}
