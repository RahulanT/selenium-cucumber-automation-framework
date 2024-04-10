package com.fdmgroup.academyusers.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features/Sprint_7/Admins/",
		glue = "com.fdmgroup",
		tags = "@TC_TMS1269",
		plugin = { "pretty",
				"junit:src/test/resources/Reports/Sprint_7/Admins/Admins_Sprint7.junit",
				"json:src/test/resources/Reports/Sprint_7/Admins/Admins_Sprint7.json",
				"html:src/test/resources/Reports/Sprint_7/Admins/Admins_Sprint7.html" },
		monochrome = true,
		dryRun = false,
		publish = true)

public class Runner_Sprint7 {

}
