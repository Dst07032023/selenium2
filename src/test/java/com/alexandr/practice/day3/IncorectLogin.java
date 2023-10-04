package com.alexandr.practice.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncorectLogin {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//*[.='Allow all cookies']")).click();

        WebElement inputUser = driver.findElement(By.name("email"));
         inputUser.sendKeys("something43@gmail.com");

         WebElement inputPassW = driver.findElement(By.name("pass"));
         inputPassW.sendKeys("any wrong password" + Keys.ENTER);



        String expectedTitle = "Facebook - log in or sign up";
         String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
             System.out.println("P");
         }else{
             System.out.println("F");
         }
    }
}
