package com.alexandr.test.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {

    public static void main(String[] args) {

        //TC #3: Facebook header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //3. Verify header text is as expected:
        //Expected: “Connect with friends and the world around you on Facebook.”
    }
}
