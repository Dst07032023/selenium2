package com.alexandr.test.day6_testing_intro_dropdowns;

import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class P0_Checkbox_Practice {

    public static void main(String[] args) {

        //Practice: Cybertek Checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //1. Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");

        //2. Confirm checkbox #1 is NOT selected by default
        //3. Confirm checkbox #2 is SELECTED by default.
        //4. Click checkbox #1 to selected it.
        //5. Click checkbox #2 to deselected it.
        //6. Confirm checkbox #1 is SELECTED.
        //7. Confirm checkbox #2 is NOT selected.
    }
}
