package com.alexandr.test.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EtsySearch_TitleVerification {

    public static void main(String[] args) {

        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        driver.findElement(By.xpath("(//button[@class='wt-btn wt-btn--filled wt-mb-xs-0'])")).click();

        //3. Search for "wooden spoon"
        //4. Verify title:
        //Expected: "Wooden spoon | Etsy"
    }
}
