package com.alexandr.test.day7_alerts_iframes_windows;

import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    /*
    1.Open Chrome browser
    2.Go to http://practice.cybertekschool.com/dropdown
     */

    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekshool.com/dropdown");
    }


    @Test
    public void tc1_simple_dropdown_test(){

        //3.Verify "Simple dropdown" default selected value is correct
        //Expected: "Please selected an option"
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        //4.Verify "State selection" default selected value is corrected
        //Expected: "Select a State"

    }
}
