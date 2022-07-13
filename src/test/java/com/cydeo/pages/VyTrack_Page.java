package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrack_Page {

    public VyTrack_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Vehicles']")
    public WebElement vehicles;

    @FindBy (xpath = "//a[@title='Filters']")
    public WebElement filters;

    @FindBy (xpath = "//a[@title='Refresh']")
    public WebElement refresh;

    @FindBy (xpath = "//a[@title='Reset']")
    public WebElement reset;

    @FindBy (xpath = "//a[@title='Reset']//following-sibling::div//a[@title='Grid Settings']")
    public WebElement gridSettings;

}
