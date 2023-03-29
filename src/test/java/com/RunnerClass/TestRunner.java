package com.RunnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FeaturePackage\\Start.feature", glue = "com.stepDefinitionFile",monochrome = true, plugin = {
		"html:Reports/google_feature.html","json:Reports/json_Report.json","pretty"})
public class TestRunner {

}

//"com.cucumber.listener.ExtentCucumberFormatter:Reports/Extent_Report.html"