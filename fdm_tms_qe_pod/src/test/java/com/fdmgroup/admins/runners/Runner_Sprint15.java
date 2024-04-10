package com.fdmgroup.admins.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features/Sprint_15/Admins/",
        glue = "com.fdmgroup",
        tags = "",
        plugin = {"pretty", 
        		"junit:src/test/resources/Reports/Sprint_15/Admins/Admins_Sprint15.junit",
        		"json:src/test/resources/Reports/Sprint_15/Admins/Admins_Sprint15.json",
        		"html:src/test/resources/Reports/Sprint_15/Admins/Admins_Sprint15.html"},
        monochrome = true,
        dryRun = false,
        publish = true)
public class Runner_Sprint15 {

}
