package com.alexandr.test.day4_cssSelector_xpath;

import com.alexandr.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class P3_cssSelector_AmazonTask {

    //TC #3: Amazon link number verification
    //1. Open Chrome browser
    WebDriver driver = WebDriverFactory.getDriver("chrome");

    //2. Go to https://www.amazon.com
    //3. Enter search term (use cssSelector to locate search box)
    //4. Verify title contains search term
}
