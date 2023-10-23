package com.alexandr.utilities.etsy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SelectState {

    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void myTest() {
//        Assert a = new Assert();
        Assert.assertEquals(10,10); //assertEquals is static method
        System.out.println("hi"); //out is static variable
        System.out.println(Math.round(10.3));


    }
}
