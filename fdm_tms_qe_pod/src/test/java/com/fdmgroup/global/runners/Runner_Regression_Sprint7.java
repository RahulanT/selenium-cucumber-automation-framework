package com.fdmgroup.global.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/", 
		glue = "com.fdmgroup",
		tags = "@Regression_Testing",
		plugin = {
				"pretty", 
				"junit:src/test/resources/Reports/Sprint_7/Global/Regression_Sprint7.junit",
				"json:src/test/resources/Reports/Sprint_7/Global/Regression_Sprint7.json",
				"html:src/test/resources/Reports/Sprint_7/Global/Regression_Sprint7.html" 
		}, 
		monochrome = true, 
		dryRun = false, 
		publish = true
)
public class Runner_Regression_Sprint7 {

}
