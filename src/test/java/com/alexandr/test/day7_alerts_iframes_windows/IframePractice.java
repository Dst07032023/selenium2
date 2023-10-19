package com.alexandr.test.day7_alerts_iframes_windows;

import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekshool.com/iframe");
    }

    @Test
    public  void iframe_test(){

        //#1 - changing to iframe by index: we pass index number
//        driver.switchTo().frame(0);

        //#2 - Locate as a Web Element to switch
        //We find and locate <iframe> web element from the page.
        WebElement iframe = driver.findElement(By.xpath("//iframe[@class='tox-edit-area__iframe']"));


        //locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        //4.Assert: "Your content goes here. "Text is displayed.
        //5.Assert: "An iFrame containing the TinyMCE WYSIWYG Editor
    }
}
