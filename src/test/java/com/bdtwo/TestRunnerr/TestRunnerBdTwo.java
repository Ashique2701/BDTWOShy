package com.bdtwo.TestRunnerr;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.bdtwo.utill.TestBaseTwo;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Features" }, plugin = {
		"json:target/cucumber.json" }, glue = "StepDefiniTwo", tags = { "@Test" })

public class TestRunnerBdTwo extends AbstractTestNGCucumberTests {

	@BeforeTest
	public void LaunchApplicationURL() {
		TestBaseTwo Launch = new TestBaseTwo();
		Launch.initialize();
	}

	@AfterTest
	public void CloseApplicationURL() {
		TestBaseTwo Launch = new TestBaseTwo();
		Launch.driver.quit();
	}

}
