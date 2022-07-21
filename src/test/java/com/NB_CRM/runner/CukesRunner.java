package com.NB_CRM.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src/test/resources/features",
        glue = "com/NB_CRM/step_definitions",
        dryRun =true,
        tags = "@usZM"

)

public class CukesRunner {
}
