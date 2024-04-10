package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SortFunctionality_StepDefinition {
	CalendarPage calendarPage = new CalendarPage();

	@Given("Admin is on Calendar page")
	public void admin_is_on_calendar_page() {
		calendarPage.driverGet(ConfigurationReader.getProperty("admins", "calendarsortURL"));
	}

	@When("Click on sort icon")
	public void click_on_sort_icon() {
		calendarPage.sortButtonClick();
	}

	@Then("It should be clickable")
	public void it_should_be_clickable() throws InterruptedException {
		Boolean isSortButtonDisplayed = calendarPage.sortButtonDisplay();
		Thread.sleep(1000);
		assertTrue(isSortButtonDisplayed);
	}

	@Then("Sort icon should be highlighted and trainer list should be sort in descending order")
	public void sort_icon_should_be_highlighted_and_trainer_list_should_be_sort_in_descending_order() {
		String actualTrainerNameByDes = calendarPage.trainerNameByDesGetText();
		String expectedTrainerNameByDes = ConfigurationReader.getProperty("admins", "currentTrainerNameByDes");
		assertEquals(actualTrainerNameByDes, expectedTrainerNameByDes);
	}

	@When("Check that clicking on sort icon once its applied, it should not be highlighted and trainer list should be sorted in ascending order")
	public void check_that_clicking_on_sort_icon_once_its_applied_it_should_not_be_highlighted_and_trainer_list_should_be_sorted_in_ascending_order()
			throws InterruptedException {
		calendarPage.sortButtonClick();
		Thread.sleep(1000);
	}

	@Then("Sort icon shouldn't be highlighted and trainer list should be sort in ascending order")
	public void sort_icon_shouldn_t_be_highlighted_and_trainer_list_should_be_sort_in_ascending_order() {
		String actualTrainerNameByAsc = calendarPage.trainerNameByAscGetText();
		String expectedTrainerNameByAsc = ConfigurationReader.getProperty("admins", "currentTrainerNameByAsc");
		assertEquals(actualTrainerNameByAsc, expectedTrainerNameByAsc);
	}

	@When("In Postman ,send a Get request to  {string}")
	public void in_postman_send_a_get_request_to(String uri) {
		Hooks.restAssuredUtilities.setUrl(uri);
		Hooks.restAssuredUtilities.setMethod("GET");
		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("I should see the name of trainers.")
	public void i_should_see_the_name_of_trainers(io.cucumber.datatable.DataTable table) {
		var data = table.asMaps();
		ArrayList<String> trainersFirstName = new ArrayList<>();
		ArrayList<String> trainersLastName = new ArrayList<>();

		for (Map<String, String> items : data) {
			trainersFirstName.add(items.get("firstName"));
			trainersLastName.add(items.get("lastName"));
		}
		assertThat(Hooks.response.getBody().jsonPath().get("firstName"), equalTo(trainersFirstName));
		assertThat(Hooks.response.getBody().jsonPath().get("lastName"), equalTo(trainersLastName));
	}

	@Then("Status code {int} should be returned with data of particular id")
	public void status_code_should_be_returned_with_data_of_particular_id(Integer int1) {
		assertThat(Hooks.response.getStatusCode(), equalTo(int1));
	}

	@When("send a Get request with path parameter to  {string}")
	public void send_a_get_requestwith_path_parameter_to(String uri, io.cucumber.datatable.DataTable table) {

		var data = table.asMaps();
		HashMap<String, String> pathParams = new HashMap<>();
		for (Map<String, String> items : data) {
			pathParams.put("userId", items.get("userId"));
		}
		Hooks.restAssuredUtilities.setUrl(uri);
		Hooks.restAssuredUtilities.setMethod("GET");
		Hooks.restAssuredUtilities.addPathParams(pathParams);
		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("I should see the trainer firstname name as {string}")
	public void i_should_see_the_trainer_firstname_name_as(String firstName) {
		assertThat(Hooks.response.getBody().jsonPath().get("firstName"), equalTo(firstName));
	}

	@Then("it should  have return <null>")
	public void it_should_have_return_null() {
		String responseBody = Hooks.response.getBody().asString();
		assertEquals("null", responseBody);
	}
}
