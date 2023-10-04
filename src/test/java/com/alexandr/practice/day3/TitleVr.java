package com.alexandr.practice.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVr {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//*[.='Allow all cookies']")).click();

        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();

        if(actualTitle.equals(expectedTitle)) {
            System.out.println("P");
        }else{
            System.out.println("F");
        }
    }
}
