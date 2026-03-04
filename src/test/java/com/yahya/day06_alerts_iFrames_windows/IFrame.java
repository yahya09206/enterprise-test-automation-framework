package com.yahya.day06_alerts_iFrames_windows;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class IFrame {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void verify_iFrame() throws InterruptedException {

        driver.get("https://practice.cydeo.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement paragraphText = driver.findElement(By.xpath("//p[.='Your content goes here.']"));
        Assert.assertTrue(paragraphText.isDisplayed());
        Thread.sleep(2000);

        driver.switchTo().defaultContent();
        WebElement detailText = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(detailText.isDisplayed());
        Thread.sleep(2000);

    }


}
