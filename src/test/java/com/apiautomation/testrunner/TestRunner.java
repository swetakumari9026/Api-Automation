package com.apiautomation.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
            features = "src/test/resources/feature/UserApi.feature",
        glue = "com.apiautomation.step",
        plugin ={ "html:target/cucumber-reports/Cucumber.html","json:target/cucumber-reports/Cucumber.json"}
    )
    public class TestRunner {
    }

