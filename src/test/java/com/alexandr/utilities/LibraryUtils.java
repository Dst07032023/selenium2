package com.alexandr.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {


    public static void loginToLibrary(WebDriver driver) {
        //3. Enter username: ""
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUsername.sendKeys("student11@library");

        //4. Enter password: ""
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");

        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[.='Sign in']"));
        loginButton.click();
    }
}
