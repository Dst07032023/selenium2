package com.alexandr.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    Creating the private constructor so this class object
    is not reachable from outside
     */
    private Driver() {}

    /*
    Making our 'driver' instance private so that it is not reachable from outside the class.
    We make it static, because we want it to run before everything else, and also we will use it in a static method.
     */

        private static WebDriver driver;

        /*
        Creating re-usable utility method that will return same 'driver' instance everytime we call it.
         */

        public static WebDriver getDriver() {

            if (driver == null) {

                /*
                We read our browser type from configuration.properties file using.getProperty method we're creating in ConfigurationReader clas.
                 */
                String browserType = ConfigurationReader.getProperty("browser");

                /*
                Depending on the browser type our switch statement will determine to open specific type of browser/driver
                 */
                switch (browserType){
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        driver.manage().window().maximize();
                        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                }
            }
        }
}
