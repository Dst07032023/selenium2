package com.alexandr.test.day10_webtable_properties_practices;

import com.alexandr.utilities.Driver;
import org.testng.annotations.Test;

public class DriverUsingExample {

//    @Test
//    public void how_to_use_driver() {
//
//        WebDriver driver;
//
//        @BeforeMethod
//        public void setupMethod() {
//
//            //1. Open browser
//            //2. Go to website: http://library2.cybertekschool.com/login.html
//            driver = WebDriverFactory.getDriver("chrome");
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//            driver.get("http://library2.cybertekschool.com/login.html");
//        }

    @Test
    public void how_to_use_driver(){
        //Driver.getDriver() ==> driver
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");

    }
}
