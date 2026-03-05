package com.yahya.day08_properties_configreader;

import com.yahya.util.ConfigReader;
import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadFromConfig {

    WebDriver driver;

    @BeforeClass
    public void setup(){
        driver = WebDriverFactory.getDriver(ConfigReader.getProperty("chrome"));
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }

    @Test
    public void getFromConfig(){

        driver.get(ConfigReader.getProperty("url"));

    }
}
