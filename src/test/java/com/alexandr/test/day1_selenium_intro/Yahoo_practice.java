package com.alexandr.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_practice {

    public static void main(String[] args) {

        //TC #1: Yahoo Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");

//        driver.findElement(By.xpath("//*[.='Alles accepteren']")).click();
        driver.findElement(By.xpath("(//button[@type='submit'])")).click();


        //3. Verify title:
        //Expected: Yahoo
    }
}
