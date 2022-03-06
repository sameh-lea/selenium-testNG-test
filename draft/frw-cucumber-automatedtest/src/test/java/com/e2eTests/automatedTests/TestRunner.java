package com.e2eTests.automatedTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
 
@CucumberOptions(features = {
        "src/test/resources/features/HRMLoginPage.feature" }, glue = "com.cucumber.pageobjectmodel")
public class TestRunner {

}