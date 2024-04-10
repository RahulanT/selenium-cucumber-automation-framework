package com.fdmgroup.academyusers.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features/Sprint_4/AcademyUsers/",

		glue = "com.fdmgroup",

		tags = "",

		plugin = { "pretty",

				"junit:src/test/resources/Reports/Sprint_4/AcademyUsers/AcademyUsers_Sprint4.junit",

				"json:src/test/resources/Reports/Sprint_4/AcademyUsers/AcademyUsers_Sprint4.json",

				"html:src/test/resources/Reports/Sprint_4/AcademyUsers/AcademyUsers_Sprint4.html" },

		monochrome = true,

		dryRun = false,

		publish = true)

public class Runner_Sprint4 {

}
