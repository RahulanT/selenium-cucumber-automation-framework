package com.fdmgroup.global.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Presentation/", 
		glue = "com.fdmgroup",
		tags = "",
		plugin = {
				"pretty", 
				"junit:src/test/resources/Reports/Presentation/Presentation.junit",
				"json:src/test/resources/Reports/Presentation/Presentation.json",
				"html:src/test/resources/Reports/Presentation/Presentation.html" 
		}, 
		monochrome = true, 
		dryRun = false, 
		publish = true
)
public class Runner_Presentation {

}
