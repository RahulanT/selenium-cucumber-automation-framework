package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CalendarCohortPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ByCohortView_stepdefinitions {
	CalendarCohortPage calendarCohortPage = new CalendarCohortPage();

	@Given("Admin selected the calendar page")
	public void admin_selected_the_calendar_page() {
		calendarCohortPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
	}

	@When("I click on cohort view")
	public void i_click_on_cohort_view() {
		calendarCohortPage.clickDropDownMenu();
		calendarCohortPage.clickCohort();
	}

	@Then("it should clicked")
	public void it_should_clicked() {
		assertTrue(calendarCohortPage.clickCohortIsSelected());

	}

	@Then("check that cohort codes are available")
	public void check_that_cohort_codes_are_available() throws InterruptedException {
		Thread.sleep(3);
		assertEquals(ConfigurationReader.getProperty("admins", "cohortCode"), calendarCohortPage.getCodeText());

	}

	@Then("check that label name {string} is there")
	public void check_that_label_name_is_there(String string) {
		calendarCohortPage.clickDropDownMenu();
		calendarCohortPage.clickCohort();
		assertEquals(ConfigurationReader.getProperty("admins", "optName"), calendarCohortPage.getCohortText());

	}

	@When("I switch to trainer view")
	public void i_switch_to_trainer_view() {
		assertEquals(ConfigurationReader.getProperty("admins", "opttName"), calendarCohortPage.getTrainerText());

	}

	@Then("try selecting both view")
	public void try_selecting_both_view() {
		//throw new PendingException("Step implementation not feasible");
	}

	@Then("it should not possible")
	public void it_should_not_possible() {
		//throw new PendingException("Step implementation not feasible");
	}
	
	@When("I sent a Get request to {string}")
	public void i_send_a_get_request_to(String uri) {

		Hooks.restAssuredUtilities.setUrl(uri);

		Hooks.restAssuredUtilities.setMethod("GET");

		Hooks.response = Hooks.restAssuredUtilities.executeAPI();

	}

	@Then("Status code {int} should be return with data in postman")
	public void status_code_should_be_return_with_data(Integer int1) {
		int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(int1, equalTo(actualStatusCode));

	}

}
