package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackBasePage;
import com.cydeo.pages.VyTrackHeaders;
import com.cydeo.pages.VyTrack_Page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VytrackStepDef {

    VyTrackBasePage base = new VyTrackBasePage();
    VyTrack_Page vytrack = new VyTrack_Page();
    VyTrackHeaders headers = new VyTrackHeaders();

    @Given("user logged in")
    public void user_logged_in() {
        base.login();
//        Driver.getDriver().get(ConfigurationReader.getProperty("url.login.page"));
//        base.usernameBox.sendKeys(ConfigurationReader.getProperty("driver.username"));
//        base.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
//        base.loginBut.click();
    }

    @When("user navigates to Fleet module")
    public void userNavigatesToFleetModule() {
        headers.fleet.click();
    }

    @When("user clicks Vehicles")
    public void userClicksVehicles() {
        vytrack.vehicles.click();
    }

    @When("user see the reset button")
    public void user_see_the_reset_button() {
        Assert.assertTrue(vytrack.reset.isDisplayed());
    }

    @Then("user see the Grid setting on the right side of reset button")
    public void user_see_the_grid_setting_on_the_right_side_of_reset_button() {
        Assert.assertTrue(vytrack.gridSettings.isDisplayed());
    }

}
