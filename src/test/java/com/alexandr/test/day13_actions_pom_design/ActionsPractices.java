package com.alexandr.test.day13_actions_pom_design;

import com.alexandr.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void p2_double_click_test() {
        //1. Go to https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");

        //2. Switch to iframe.
        //We are switching to iframe using id attribute value and switchTo method
        Driver.getDriver().switchTo().frame("iframeResult");

        //3. Double - click on the text "Double-click me to change my text color."
        WebElement textToDoubleClick = Driver.getDriver().findElement(By.id("demo"));

        //4. Assert: Text's "style" attribute value contains "red".
    }
}
