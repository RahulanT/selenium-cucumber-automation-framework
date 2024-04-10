package com.fdmgroup.global.stepdefinitions;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.RestAssuredUtilities;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class Hooks extends BrowserUtilities {
	public static RestAssuredUtilities restAssuredUtilities;
	public static ResponseOptions<Response> response;
	
	@Before
	public void setup() {
		driverUtilities = getInstance();
		driver = driverUtilities.getDriver();
		BrowserUtilities.maximizeWindow();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		restAssuredUtilities = RestAssuredUtilities.getInstance();
	}
	
	@After
	public void tearDown() {
		driverUtilities.resetDriver();
		restAssuredUtilities.resetUtilities();
	}

	
	@Given("I perform authentication operation for {string} with body")
	public void i_perform_authentication_operation_for_with_body(String uri, DataTable table) {
		var data = table.asMaps();
		
		HashMap<String, String> body = new HashMap<>();
		for (Map<String, String> items : data) {
			body.put("username", items.get("username"));
			body.put("password", items.get("password"));
		}
		
		Hooks.restAssuredUtilities.setMethod("POST");
		Hooks.restAssuredUtilities.setUrl(uri);
		
		String token = Hooks.restAssuredUtilities.authenticate(body);
		Hooks.restAssuredUtilities.setToken(token);
	}
	
	@Then("Take a screenshot and saving it in {string} as {string}")
	public void take_a_screenshot_and_saving_it_in_as(String fileLocation, String fileName) throws IOException {
		
		BrowserUtilities.screenShot(fileLocation, fileName);
	}
}
