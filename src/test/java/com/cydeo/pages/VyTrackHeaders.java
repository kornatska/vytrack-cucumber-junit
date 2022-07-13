package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackHeaders {

    public VyTrackHeaders(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement dashboards;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleet;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement customers;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement sales;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement activities;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[6]")
    public WebElement marketing;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[7]")
    public WebElement reports;

    @FindBy(xpath = "(//span[@class='title title-level-1'])[8]")
    public WebElement system;

}
