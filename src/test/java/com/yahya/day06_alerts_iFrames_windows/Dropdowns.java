package com.yahya.day06_alerts_iFrames_windows;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdowns {

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
    public void verifyDate() throws InterruptedException {

        driver.get("https://practice.cydeo.com/dropdown");

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        Thread.sleep(2000);
        yearDropdown.selectByVisibleText("1933");
        Thread.sleep(2000);
        monthDropdown.selectByValue("11");
        Thread.sleep(2000);
        dayDropdown.selectByIndex(0);

        // Validate info
        String expectedYear = "1933";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertTrue(actualYear.equals(expectedYear));
        Assert.assertEquals(actualMonth, expectedMonth);
        Assert.assertEquals(actualDay, expectedDay);

    }

    @Test
    public void verifyState() throws InterruptedException {

        driver.get("https://practice.cydeo.com/dropdown");

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByIndex(14);
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Virginia");
        Thread.sleep(1000);
        stateDropdown.selectByValue("CA");

        String expectedState = "California";
        String actualState = stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualState, expectedState);
    }

    @Test
    public void verifyDropdownLink() throws InterruptedException {

        driver.get("https://practice.cydeo.com/dropdown");

        WebElement websiteDropdown = driver.findElement(By.cssSelector("a[role='button']"));
        websiteDropdown.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div/a[.='Facebook']")).click();
        Thread.sleep(2000);
        Thread.sleep(2000);
        String expectedTitle = "Facebook";
        String actualTitle = driver.getTitle();
        Thread.sleep(2000);
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    @Test
    public void verifyAlert() throws InterruptedException {

        WebElement infoAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        infoAlertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        Thread.sleep(2000);
        WebElement resultText = driver.findElement(By.xpath("//div/p[@id='result']"));

        Assert.assertTrue(resultText.isDisplayed());
    }
}
