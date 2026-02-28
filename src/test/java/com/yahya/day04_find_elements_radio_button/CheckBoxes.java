package com.yahya.day04_find_elements_radio_button;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // Navigate to site
        driver.get("https://practice.cydeo.com/checkboxes");

        WebElement checkboxOne = driver.findElement(By.xpath("//form/input[@name='checkbox1']"));
        System.out.println(checkboxOne.isSelected());

        WebElement checkboxTwo = driver.findElement(By.xpath("//form/input[@name='checkbox2']"));
        System.out.println(checkboxTwo.isSelected());

        Thread.sleep(1000);

        checkboxOne.click();
        System.out.println(checkboxOne.isSelected());

        checkboxTwo.click();
        System.out.println(checkboxTwo.isSelected());

        Thread.sleep(1000);
        driver.quit();
    }
}
