package com.alexandr.test.day12_actions_upload_jsexecutor;

import com.alexandr.utilities.BrowserUtils;
import com.alexandr.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsExecutor_test1(){

        //Get the page: http://practice.cybertekschool.com.infinite_scroll

        Driver.getDriver().get("http://practice.cybertekschool.com.infinite_scroll");

//        ((JavascriptExecutor) Driver.getDriver()).executeScript("");
        BrowserUtils.sleep(3);
        //Down casting our driver type to JavascriptExecutor so we can reach methods in this interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //using js we reach executeScript method so we are allowed to pass JavaScript functions.
        //this method is capable of accepting JavaScript functions and apply that into our Java+Selenium code

        for (int i = 0; i < 10; i++) {

            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0, 750)");
        }

    }

    @Test
    public void scroll_using_jsExecutor_test2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //Locating the web elements so we can use in js.executeScript method
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));

        //use js.executor with different scrolling JavaScript function
        //scroll down to cybertekSchool Link
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);

        //scroll up to Home link
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

    }
}
