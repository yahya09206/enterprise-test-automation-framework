package com.yahya.day05_dynamic_elements_testng_dropdowns;

import com.yahya.util.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

public class RadioUtility {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        List<WebElement> radioBtns = driver.findElements(By.xpath("//input[@name='sport']"));

        for (WebElement radioBtn : radioBtns) {

            String actualID = radioBtn.getAttribute("id");
            System.out.println(actualID);

            if (actualID.equals("hockey")){
                radioBtn.click();
                System.out.println(radioBtn.isSelected());
                break;
            }
        }

    }
}
