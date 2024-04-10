package com.fdmgroup.global.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Sprint_3/", 
		glue = "com.fdmgroup",
		tags = "",
		plugin = {
				"pretty", 
				"junit:src/test/resources/Reports/Sprint_3/Global/Global_Sprint3.junit",
				"json:src/test/resources/Reports/Sprint_3/Global/Global_Sprint3.json",
				"html:src/test/resources/Reports/Sprint_3/Global/Global_Sprint3.html" 
		}, 
		monochrome = true, 
		dryRun = true, 
		publish = true
)
public class Runner_Sprint3 {

}
