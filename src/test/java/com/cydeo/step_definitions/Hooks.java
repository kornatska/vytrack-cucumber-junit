package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUpScenario(){
        System.out.println("@Before Hooks");
    }


    @After
    public void teardownScenario(Scenario scenario){
        System.out.println("@After Hooks");

        byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if(scenario.isFailed()){
            scenario.attach(screenshot,"img/png", scenario.getName());
        }


        Driver.closeDriver();
    }
}
