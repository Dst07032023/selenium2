package com.alexandr.test.base;

import com.alexandr.utilities.ConfigurationReader;
import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public abstract class TestBase {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser and go to: http://practice.cybertekschool.com/tables#edit

        String browser = ConfigurationReader.getProperty("browser");
        //This line returns String : chrome
        //This line returns String : http://practice.cybertekschool.com/tables#edit
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
}
