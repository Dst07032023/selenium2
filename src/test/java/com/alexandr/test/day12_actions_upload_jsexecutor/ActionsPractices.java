package com.alexandr.test.day12_actions_upload_jsexecutor;

import com.alexandr.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void tc15_actions_hover() {

        //1. Go	to	http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");

        //Locating all of the images here:
        WebElement img1 = Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3 = Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        //Locating all the "user" texts
        WebElement user1 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3 = Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        //We must create object of Actions class to be able to use methods coming from there
        Actions actions = new Actions(Driver.getDriver());


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
