package com.yahya.day04_find_elements_radio_button;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement goHome = driver.findElement(By.xpath("//li/a[@class='nav-link']"));
        System.out.println(goHome.isDisplayed());

        WebElement forgotHeader = driver.findElement(By.xpath("//div/h2[.='Forgot Password']"));
        System.out.println(forgotHeader.isDisplayed());

        WebElement emailTxt = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(emailTxt.isDisplayed());

        WebElement emailInputBox = driver.findElement(By.xpath("//div/input[@name='email']"));
        System.out.println(emailInputBox.isDisplayed());

        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']"));
        System.out.println(retrievePassword.isDisplayed());


        Thread.sleep(1000);
        driver.quit();
    }
}
