package com.fdmgroup.courseowners.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Sprint_2/CourseOwners/", 
			glue = "com.fdmgroup", 
			tags = "", 
			plugin = {
					"pretty", 
					"junit:src/test/resources/Reports/Sprint_2/CourseOwners/CourseOwners_Sprint2.junit",
					"json:src/test/resources/Reports/Sprint_2/CourseOwners/CourseOwners_Sprint2.json",
					"html:src/test/resources/Reports/Sprint_2/CourseOwners/CourseOwners_Sprint2.html" }, 
			monochrome = true, 
			dryRun = false, 
			publish = true
)
public class Runner_Sprint2 {

}
