package com.yahya.pages;

import com.yahya.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    /**
     * 1 - Initialize the object of the class and the driver instance inside the constructor
     * 2 - Use FindBy annotation instead of WebElement
     */

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }



}
