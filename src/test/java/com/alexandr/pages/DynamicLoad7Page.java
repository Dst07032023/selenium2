package com.alexandr.pages;

import com.alexandr.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoad7Page {

    public DynamicLoad7Page(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
