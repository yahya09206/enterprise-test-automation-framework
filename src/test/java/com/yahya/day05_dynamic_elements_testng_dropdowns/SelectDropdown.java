package com.yahya.day05_dynamic_elements_testng_dropdowns;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectDropdown {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void verifySimpleDropdown(){

        driver.get("https://practice.cydeo.com/dropdown");

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String expectedOption = "Please select an option";
        String actualOption = simpleDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption, expectedOption);
    }


}
