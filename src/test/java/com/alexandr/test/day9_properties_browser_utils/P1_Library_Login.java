package com.alexandr.test.day9_properties_browser_utils;

import com.alexandr.utilities.BrowserUtils;
import com.alexandr.utilities.LibraryUtils;
import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_Login {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        //1. Open browser
        //2. Go to website: http://library2.cybertekschool.com/login.html
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library2.cybertekschool.com/login.html");

    }
    @Test
    public void login_link_count_test(){
        //Task #1: Library software link verification
        //loginMethod calling to login Library app
        LibraryUtils.loginToLibrary(driver);

        //6. Print out count of all the links on landing page

        BrowserUtils.sleep(2);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("allLinks.size() = " + allLinks.size());
        
        // 7. Print out each link text on this page

        for (WebElement each : allLinks) {
            System.out.println(each.getText());
            
        }


    }
}
