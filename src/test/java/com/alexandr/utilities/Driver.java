package com.alexandr.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    /*
    Creating the private constructor so this class object
    is not reachable from outside
     */
    private Driver() {}

    /*
    Making our 'driver' instance private so that it is not reachable from outside of the class.
    We make it static, because we want it to run before everything else, and also we will use it in a static method
     */

        private static WebDriver driver;

}
