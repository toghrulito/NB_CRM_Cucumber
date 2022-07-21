package com.NB_CRM.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-report.html","json:target/cucumber-report.json"},
        features = "src/test/resources/features",
        glue = "com/NB_CRM/step_definitions",
        dryRun = false,
        tags = "@US07"

)

public class CukesRunner {
}
