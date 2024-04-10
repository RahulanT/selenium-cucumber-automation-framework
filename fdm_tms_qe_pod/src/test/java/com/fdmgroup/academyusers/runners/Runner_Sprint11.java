package com.fdmgroup.academyusers.runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features/Sprint_11/AcademyUsers/",

		glue = "com.fdmgroup",

		tags = "",

		plugin = { "pretty",

				"junit:src/test/resources/Reports/Sprint_11/AcademyUsers/AcademyUsers_Sprint11.junit",

				"json:src/test/resources/Reports/Sprint_11/AcademyUsers/AcademyUsers_Sprint11.json",

				"html:src/test/resources/Reports/Sprint_11/AcademyUsers/AcademyUsers_Sprint11.html" },

		monochrome = true,

		dryRun = false,

		publish = true)

public class Runner_Sprint11 {

}

