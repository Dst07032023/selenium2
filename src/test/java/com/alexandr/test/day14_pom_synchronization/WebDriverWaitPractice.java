package com.alexandr.test.day14_pom_synchronization;

import com.alexandr.utilities.Driver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {

    @Test
    public void dynamic_loading_7_test() {

        //1.Go to http://practice.cybertekschool.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");

        //2.Wait until title is "Dynamic title"
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        //use the object
        //3.Assert: Message "Done" is displayed.
        //4.Assert: Image is displayed.
    }
}
