package com.alexandr.practice.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeaderVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//*[.='Allow all cookies']")).click();

        WebElement header = driver.findElement(By.className("_8eso"));

        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();

        if (actualHeader.equals(expectedHeader)) {
            System.out.println("P");
        }else{
            System.out.println("F");
        }
    }
}
