package com.alexandr.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //1- set up the web driver
        WebDriverManager.chromedriver().setup();
        //System.setProperty("chrome, "path of where you saved the driver");

        //2- create the instance of the chrome driver
        //this is the line that is opening the browser
        WebDriver driver = new ChromeDriver();

        //3- test if driver is working
//        driver.get("https://www.facebook.com");
        driver.get("https://www.google.com");

//        driver.findElement(By.xpath("(//button[@value='1'])[2]")).click();
        driver.findElement(By.xpath("//*[.='Alles accepteren']")).click();

    }
}
