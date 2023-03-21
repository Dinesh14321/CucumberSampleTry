package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\FeaturePackage\\Login.feature", glue = "com.stepDefinitionFile", monochrome = true)
public class InstaRunner {

}
