package com.yahya.day11_page_object_model;

import com.yahya.pages.LibraryLoginPage;
import com.yahya.util.BrowserUtil;
import com.yahya.util.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    LibraryLoginPage loginPage;

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        loginPage = new LibraryLoginPage();
    }

    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void verifyRequiredFields(){

        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.fieldRequiredErrorMsg.isDisplayed());

    }

    @Test
    public void emailFormatErrorMsg(){

        // Test for validating email error message is displayed when you type an incorrect email
        loginPage.emailInput.sendKeys("username");
        loginPage.signInButton.click();

        // Asser that error message is displayed
        Assert.assertTrue(loginPage.enterValidEmailErrorMsg.isDisplayed());
    }

    @Test
    public void verifyWrongEmailOrPasswordMsg(){

        loginPage.emailInput.sendKeys("username@wrong.com");
        loginPage.passwordInput.sendKeys("blah");
        loginPage.signInButton.click();

        BrowserUtil.sleep(2);
        Assert.assertTrue(loginPage.wrongEmailOrPasswordMsg.isDisplayed());
    }
}
