package com.fdmgroup.global.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/", 
		glue = "com.fdmgroup",
		tags = "@IntegrationTesting",
		plugin = {
				"pretty", 
				"junit:src/test/resources/Reports/Sprint_8/Global/Global_Sprint8.junit",
				"json:src/test/resources/Reports/Sprint_8/Global/Global_Sprint8.json",
				"html:src/test/resources/Reports/Sprint_8/Global/Global_Sprint8.html" 
		}, 
		monochrome = true, 
		dryRun = false, 
		publish = true
)
public class Runner_Sprint8 {

}
