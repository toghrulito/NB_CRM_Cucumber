package com.NB_CRM.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "json:target/cucumber-report.json"},
        features = "src/test/resources/features",
        glue = "com/NB_CRM/step_definitions",
        dryRun = false,
        tags = "@wip",
        publish = true

)
public class CukesRunner {}