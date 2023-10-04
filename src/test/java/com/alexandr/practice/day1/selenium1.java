package com.alexandr.practice.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

        driver.findElement(By.xpath("(//button[@type='submit'])")).click();
        //3. Verify title:
        //Expected: Yahoo
        String expectedTitle = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.out.println("Title is as expected. Verification FAILED!");
        }
    }
}
