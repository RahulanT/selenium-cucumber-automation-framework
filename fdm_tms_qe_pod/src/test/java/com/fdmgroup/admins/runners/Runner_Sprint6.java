package com.fdmgroup.admins.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src/test/resources/Features/Sprint_6/Admins/",
        glue = "com.fdmgroup",
        tags = "@TC_TMS_1279_AddTrainerGoBack",
        plugin = {"pretty", 
        		"junit:src/test/resources/Reports/Sprint_6/Admins/Admins_Sprint6.junit",
        		"json:src/test/resources/Reports/Sprint_6/Admins/Admins_Sprint6.json",
        		"html:src/test/resources/Reports/Sprint_6/Admins/Admins_Sprint6.html"},
        monochrome = true,
        dryRun = false,
        publish = true)
public class Runner_Sprint6 {

}


