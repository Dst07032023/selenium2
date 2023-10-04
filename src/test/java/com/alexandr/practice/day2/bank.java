package com.alexandr.practice.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bank {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement agroBankLink = driver.findElement(By.className("brand"));

        String expectedLinkText = "Zero Bank";
        String actualLinkText = agroBankLink.getText();

        if (actualLinkText.equals(expectedLinkText)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
         String expectedInHref = "index.html";

        String actualHrefValue = agroBankLink.getAttribute("href");

        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
    }
}
