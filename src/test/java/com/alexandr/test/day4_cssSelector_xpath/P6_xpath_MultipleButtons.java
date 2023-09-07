package com.alexandr.test.day4_cssSelector_xpath;

import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P6_xpath_MultipleButtons {

    public static void main(String[] args) {

        //TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //3. Click on Button 1
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”

    }
}
