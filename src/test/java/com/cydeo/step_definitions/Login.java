package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackBasePage;
import com.cydeo.pages.VyTrackHeaders;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;

public class Login {

    VyTrackBasePage basePage = new VyTrackBasePage();
    VyTrackHeaders headers = new VyTrackHeaders();

    @Given("When user is on Vytrack login page")
    public void when_user_is_on_vytrack_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url.login.page"));
    }
    @When("user enters driver username")
    public void user_enters_driver_username() {
        basePage.usernameBox.sendKeys(ConfigurationReader.getProperty("driver.username"));
    }
    @When("user enters driver password")
    public void user_enters_driver_password() {
        basePage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("driver clicks login button")
    public void driver_clicks_login_button() {
        basePage.loginBut.click();
    }

    @Then("driver should see home page")
    public void driver_should_see_home_page() {
        Assert.assertTrue(headers.fleetManagement.isDisplayed());
    }

//    @Given("When store manager is on Vytrack login page")
//    public void when_store_manager_is_on_vytrack_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url.login.page"));
//    }
    @When("user enters store manager username")
    public void user_enters_store_manager_username() {
        basePage.usernameBox.sendKeys(ConfigurationReader.getProperty("store.manager.username"));
    }
    @When("user enters store manager password")
    public void user_enters_store_manager_password() {
        basePage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("store manager clicks login button")
    public void store_manager_clicks_login_button() {
        basePage.loginBut.click();
    }
    @Then("store manager should see home page")
    public void store_manager_should_see_home_page() {
        Assert.assertTrue(headers.fleetManagement.isDisplayed());
    }

//    @Given("When sales manager is on Vytrack login page")
//    public void when_sales_manager_is_on_vytrack_login_page() {
//        Driver.getDriver().get(ConfigurationReader.getProperty("url.login.page"));
//    }
    @When("user enters sales manager username")
    public void user_enters_sales_manager_username() {
        basePage.usernameBox.sendKeys(ConfigurationReader.getProperty("sales.manager.username"));
    }
    @When("user enters sales manager password")
    public void user_enters_sales_manager_password() {
        basePage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("sales manager clicks login button")
    public void sales_manager_clicks_login_button() {
        basePage.loginBut.click();
    }
    @Then("sales manager should see home page")
    public void sales_manager_should_see_home_page() {
        Assert.assertTrue(headers.fleetManagement.isDisplayed());
    }

}
