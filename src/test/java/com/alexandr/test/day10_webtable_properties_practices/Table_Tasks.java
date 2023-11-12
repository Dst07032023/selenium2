package com.alexandr.test.day10_webtable_properties_practices;

import com.alexandr.utilities.ConfigurationReader;
import com.alexandr.utilities.TableUtils;
import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {

    @Test
    public void task3_return_tims_due_amount() {

        //below code is same as above
        //driver.get(ConfigurationReader.getProperty("dataTablesUrl"));
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver.get(url);

        //table[@id='table']//td[.='Tim'] --> this locator Tim's cell regardless
        //of which row he is in

        //2. Locate first table and verify Tim has due amount of "$50"

        //1st way: //table[@id='table1']//td[.='Tim']/../td[4]
        //2nd way: //table[@id='table1']//td[.='Tim']/following-sibling::td[2]

        WebElement timsDueAmountCell = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));

        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());

        String actualTimeResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimeResult, expectedTimResult, "Tim's cell is not returning as expected.");

        //Note:Create locator for Tim that will be dynamic and doesn't care in which row Tim is.
    }

    @Test
    public void task4_verify_order_method(){
        TableUtils.verifyOrder(driver, "Tim");
    }

}