package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFunctionality_stepdefinitions {
	CalendarPage calendarPage = new CalendarPage();

	@Then("enter the first letters of trainer name in the search box - {string}")
	public void enter_the_first_letters_of_trainer_name_in_the_search_box(String string) {
		calendarPage.sendFirstLetter();
	}

	@Then("It should display each and every trainers whose first name and last name starts with {string}")
	public void it_should_display_each_and_every__trainers_whose_first_name_and_last_name_starts_with(String string) {
		assertEquals(ConfigurationReader.getProperty("admins", "tName"), calendarPage.getTrainer());
	}

	@Then("Status code {int} should return")
	public void status_code_should_be_return_with_data(Integer int1) {
		int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(int1, equalTo(actualStatusCode));
	}

}
