package com.yahya.day07_utilities;

import com.yahya.util.BrowserUtil;
import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CRMLogin {

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
    public void verifyCRMTitle(){

        driver.get("http://login1.nextbasecrm.com/");

        WebElement username = driver.findElement(By.xpath("//div/input[@name='USER_LOGIN']"));
        WebElement password = driver.findElement(By.xpath("//div/input[@name='USER_PASSWORD']"));
        username.sendKeys("helpdesk1@cydeo.com");
        password.sendKeys("UserUser");

        BrowserUtil.sleep(2);

        driver.findElement(By.xpath("//div/input[@class='login-btn']")).click();

        BrowserUtil.sleep(2);

        BrowserUtil.verifyTitle(driver, "(1) Portal");


    }
}
