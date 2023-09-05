package com.alexandr.test.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorectLoginTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        //TC #2: Facebook incorrect login title verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        driver.findElement(By.xpath("//*[.='Allow all cookies']")).click();

        //Locating the web using id locator and storing it in WebElement type
        WebElement inputUserName = driver.findElement(By.id("email"));

        //3. Enter incorrect username
        inputUserName.sendKeys("anything32478@gmail.com");

        //Locate the web element using

        WebElement inputPassword = driver.findElement(By.id("pass"));

        //4. Enter incorrect password
        inputPassword.sendKeys("any wrong password" + Keys.ENTER);

        //5. Verify title changed to:
        //Expected: “Log into Facebook”
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();

        //Freezing the code for 5 secs so that Chrome browser can catch up with loading the page
        Thread.sleep(4000);

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }
    }
}
