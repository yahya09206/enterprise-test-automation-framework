package com.yahya.day11_page_object_model;

import com.yahya.pages.LibraryLoginPage;
import com.yahya.util.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    @Test
    public void verifyRequiredFields(){

        Driver.getDriver().get("https://library1.cydeo.com");

        LibraryLoginPage loginPage = new LibraryLoginPage();
        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.fieldRequiredErrorMsg.isDisplayed());
    }
}
