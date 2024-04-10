package com.fdmgroup.global.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/Sprint_12/Admins","src/test/resources/Features/Sprint_11/AcademyUsers"}, 
		glue = "com.fdmgroup",
		tags = "@IntegrationTesting",
		plugin = {
				"pretty", 
				"junit:src/test/resources/Reports/Sprint_12/Global/Regression_Sprint12.junit",
				"json:src/test/resources/Reports/Sprint_12/Global/Regression_Sprint12.json",
				"html:src/test/resources/Reports/Sprint_12/Global/Regression_Sprint12.html" 
		}, 
		monochrome = true, 
		dryRun = false, 
		publish = true
)
public class Runner_Integration_Sprint12 {

}
