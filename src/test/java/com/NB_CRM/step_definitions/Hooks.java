package com.NB_CRM.step_definitions;

import com.NB_CRM.utils.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks  {

    // Import from io.cucumber .java not from junit

    @After
    public void tearDownScenario(Scenario scenario){

        if(scenario.isFailed()){
            byte[] screenShot= ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenShot,"image/png",scenario.getName());

        }
        Driver.closeDriver();
    }



}
