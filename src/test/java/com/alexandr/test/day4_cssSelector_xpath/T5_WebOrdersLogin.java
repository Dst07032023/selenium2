package com.alexandr.test.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {

    public static void main(String[] args) {

        //TC #5:	Basic	login	authentication
        //1- Open	a	chrome	browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go	to:
        //http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("//http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx\n");

        //3- Verify	title	equals:
        //Expected:	Web	Orders	Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {

        }
        //4- Enter	username:	Tester
        //5- Enter	password:	test
        //6- Click	“Sign	In”	button
        //7- Verify	title equals:
        //Expected:	Web	Orders
    }
}
