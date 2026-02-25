package com.yahya.day03_css_selector_x_path;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ValidateCRM {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.navigate().to("https://login1.nextbasecrm.com/");
        driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberText = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedText = "Remember me on this computer";
        String actualText = rememberText.getText();

        if (actualText.equals(expectedText)){
            System.out.println("Remember me validation passed");
        } else {
            System.out.println("Remember me validation failed");
        }

        WebElement forgotLink = driver.findElement(By.linkText("FORGOT YOUR PASSWORD?"));
        String expectedForgotAtt = "forgot_password=yes";
        String actualForgotLinkAtt = forgotLink.getAttribute("href");

        if (actualForgotLinkAtt.contains(expectedForgotAtt)){
            System.out.println("Forgot password link text validation passed");
        } else {
            System.out.println("Forgot password link text validation failed");
        }

        Thread.sleep(1000);
        driver.quit();

    }
}
