package com.alexandr.test.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {

    public static void main(String[] args) {

        //TC #4: Facebook header verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//*[.='Allow all cookies']")).click();

        //3. Verify “Create a page” link href value contains text:
        WebElement createdPageLink = driver.findElement(By.linkText("Create a Page"));
        //Expected: “registration_form”
        String expectedInHref = "registration_form";
        String actualHrefValue = createdPageLink.getAttribute("href");

        System.out.println("actualHrefValue = " + actualHrefValue);

        if (actualHrefValue.contains(expectedInHref)) {
            System.out.println("HREF value verification PASSED!");
        }else{
            System.out.println("HREF value verification FAILED!!!");

        }
    }
}
