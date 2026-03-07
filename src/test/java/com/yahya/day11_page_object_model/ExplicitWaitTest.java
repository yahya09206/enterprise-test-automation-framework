package com.yahya.day11_page_object_model;

import com.yahya.pages.DynamicLoadPage;
import com.yahya.util.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ExplicitWaitTest {

    @Test
    public void verifyTitleIsDisplayed(){

        Driver.getDriver().get("https://practice.cydeo.com/");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        DynamicLoadPage dynamicLoadPage = new DynamicLoadPage();
        Assert.assertTrue(dynamicLoadPage.doneMsg.isDisplayed());
    }
}
