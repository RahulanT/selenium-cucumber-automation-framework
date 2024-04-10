package com.fdmgroup.global.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Sprint_5/", 
		glue = "com.fdmgroup",
		tags = "",
		plugin = {
				"pretty", 
				"junit:src/test/resources/Reports/Sprint_5/Global/Global_Sprint5.junit",
				"json:src/test/resources/Reports/Sprint_5/Global/Global_Sprint5.json",
				"html:src/test/resources/Reports/Sprint_5/Global/Global_Sprint5.html" 
		}, 
		monochrome = true, 
		dryRun = true, 
		publish = true
)
public class Runner_Sprint5 {

}
