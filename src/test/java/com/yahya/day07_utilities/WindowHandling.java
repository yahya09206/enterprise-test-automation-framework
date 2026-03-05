package com.yahya.day07_utilities;

import com.yahya.util.BrowserUtil;
import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static java.awt.SystemColor.window;

public class WindowHandling {
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
    public void window_handling_test(){

        //((JavascriptExecutor) driver).executeScript(window.open('https://google.com', '_blank'););

        BrowserUtil.switchWindowAndVerify(driver, "etsy", "Etsy");
    }

}
