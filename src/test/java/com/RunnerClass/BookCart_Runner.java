package com.RunnerClass;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FeaturePackage\\Book_Cart.feature", glue = "com.stepDefinitionFile", monochrome = true, dryRun = !true, plugin = {
		"pretty"})

public class BookCart_Runner {

}
// "html:Reports/Flip_Kart.html", "json:Reports/Flip_Kart.json",