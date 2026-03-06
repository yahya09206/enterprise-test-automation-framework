package com.yahya.day09_java_faker_driver_util;

import com.yahya.util.ConfigReader;
import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BingSearch {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = WebDriverFactory.getDriver(ConfigReader.getProperty("browser"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void verifyBingSearch(){

        driver.get(ConfigReader.getProperty("url2"));
        WebElement searchWord = driver.findElement(By.xpath("//div/textarea[@id='sb_form_q']"));
        searchWord.sendKeys(ConfigReader.getProperty("search_keyword"), Keys.ENTER);

        String actualTitle = driver.getTitle();
        String expectedTitle = ConfigReader.getProperty("search_keyword")+ " - Search";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }

}
