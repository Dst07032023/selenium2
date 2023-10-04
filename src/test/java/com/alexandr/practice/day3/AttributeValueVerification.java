package com.alexandr.practice.day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValueVerification {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//*[.='Allow all cookies']")).click();

        WebElement createPageLink = driver.findElement(By.linkText("Create a Page"));

        String expectedInHref = "registration_form";
        String actualHrefValue = createPageLink.getAttribute("href");

        if(actualHrefValue.contains(expectedInHref)) {
            System.out.println("P");
        }else{
            System.out.println("F");
        }
    }
}
