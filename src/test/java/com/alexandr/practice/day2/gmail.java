package com.alexandr.practice.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https:/www.google.com");

        driver.findElement(By.xpath("//*[.='Alles accepteren']")).click();

        driver.findElement(By.partialLinkText("mail")).click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if(actualTitle.contains(expectedTitle)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }


    }
}
