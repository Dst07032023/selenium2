package com.alexandr.practice.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankMIB {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.micb.md/");

        String expectedHeader = "search-form";

        WebElement actualHeader = driver.findElement(By.id("search-form"));

        String actualTitleText = actualHeader.getText();

        if (actualTitleText.contains(expectedHeader)) {
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!!!");
        }
    }
}
