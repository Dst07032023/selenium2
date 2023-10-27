package com.alexandr.test.day9_properties_browser_utils;

import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

        //3. Enter username: ""
        //4. Enter password: ""
        //5. Click to Login button
        //6. Print out count of all the links on landing page
        //7. Print out each link text on this page

    }
}
