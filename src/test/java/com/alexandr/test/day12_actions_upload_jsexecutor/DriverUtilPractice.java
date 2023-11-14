package com.alexandr.test.day12_actions_upload_jsexecutor;

import com.alexandr.utilities.ConfigurationReader;
import com.alexandr.utilities.Driver;
import org.testng.annotations.Test;

public class DriverUtilPractice {

    @Test
    public void simple_google_search_test() {

        //1- Go to google.com
        //Driver.getDriver() = driver ---> creates driver instance and ready to use.
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
        //2- Search for a value
        //3- Verify value is contained in the title
    }
}
