package com.alexandr.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertecUrlVerification {

    public static void main(String[] args) {

        //TC #2: Cybertek practice tool verifications
        //SETUP THE BROWSER DRIVER
        WebDriverManager.chromedriver().setup();

        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Go to https://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com/");

        //3. Verify URL contains
        //Expected: cybertekschool
        //4. Verify title:
        // Expected: Practice
    }
}
