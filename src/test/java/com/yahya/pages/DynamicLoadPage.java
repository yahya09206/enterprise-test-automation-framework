package com.yahya.pages;

import com.yahya.util.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadPage {

    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMsg;

    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement spongeBobImg;

    public DynamicLoadPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
}
