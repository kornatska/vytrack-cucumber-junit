package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackBasePage {

    public VyTrackBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy (id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy (id = "_submit")
    public WebElement loginBut;


    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url.login.page"));
        usernameBox.sendKeys(ConfigurationReader.getProperty("driver.username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginBut.click();

    }


}
