package com.NB_CRM.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-report.html",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/NB_CRM/step_definitions",
        dryRun =true,
        tags = "@wip"
toghrulj

)

public class CukesRunner {

}
