package com.alexandr.practice.day4;

import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelectorPr {

    public static void main(String[] args) {

    WebDriver driver = WebDriverFactory.getDriver("chrome");

    driver.manage().window().maximize();

    driver.get("https://nl-nl.facebook.com/");

        WebElement homeLink = driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));

        WebElement forgotPasswor = driver.findElement(By.tagName("h2"));

        WebElement emailLabel = driver.findElement(By.cssSelector(""));
    }



}
