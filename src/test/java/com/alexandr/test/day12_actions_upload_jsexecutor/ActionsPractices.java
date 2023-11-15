package com.alexandr.test.day12_actions_upload_jsexecutor;

import com.alexandr.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover() {

        //1. Go	to	http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //Locating all of the images here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));

        //2. Hover	over	to	first	image
        //3. Assert:
        //a. “name:	user1”	is	displayed
        //4. Hover	over	to	second	image
        //5. Assert:
        //a. “name:	user2”	is	displayed
        //6. Hover	over	to	third	image
        //7. Confirm:
        //a. “name:	user3”	is	displayed
    }
}
