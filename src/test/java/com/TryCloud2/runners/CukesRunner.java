package com.TryCloud2.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //makes connection between junit and cucumber
@CucumberOptions(

        //plugin = "html:target/cucumber-report.html",
        plugin = {"html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/TryCloud/step_definitions",
        dryRun = false

)
public class CukesRunner {
}
