package org.stepdefinition1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources",glue="org.stepdefinition1",monochrome=true ,
dryRun = false, plugin = "json:Reports/cucumber1/report.json")
public class Testrunner {

}
