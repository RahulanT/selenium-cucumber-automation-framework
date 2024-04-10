package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckSearchFunctionality_stepdefinitions {
	CalendarPage calendarPage = new CalendarPage();

	@Given("Admin is navigated to calendar page")
	public void admin_is_navigated_to_calendar_page() {

		// checkSearchFunctionalityPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
		calendarPage.clickCalendarButton();
	}

	@When("I click on search box")
	public void i_click_on_search_box() {
		calendarPage.clickSearchButton();
	}

	@Then("it should be clicked")
	public void it_should_be_clicked() {
		assertTrue(calendarPage.clickSearchButtonIsEnable());
	}

	@Then("I enter text into search bar.")
	public void i_enter_text_into_search_bar() {
		calendarPage.sendSearchField();
	}

	@Then("text should be entered")
	public void text_should_be_entered() {
		assertTrue(calendarPage.sendSearchField());
	}

	@Then("I enter the first two letters of a name of a trainer in the search box - {string}")
	public void i_enter_the_first_two_letters_of_a_name_of_a_trainer_in_the_search_box(String string) {
		calendarPage.sendSearchTrainer();
	}

	@Then("Multiple results should populate in the search box with names starting with {string}")
	public void multiple_results_should_populate_in_the_search_box_with_names_starting_with(String string) {
		assertEquals(ConfigurationReader.getProperty("admins", "result"), calendarPage.getResult());
	}

	@Then("verify scroll bar should appear next to search box, which allows scrolling of results, when at least {int} results populate.")
	public void verify_scroll_bar_should_appear_next_to_search_box_which_allows_scrolling_of_results_when_at_least_results_populate(
			Integer int1) {
		// throw new PendingException("Step is pending");
	}

	@Then("I enter letter {string}")
	public void i_enter_letter(String string) {
		calendarPage.sendSearchRandomChar();
	}

	@Then("verify {string} is displayed above the search box.")
	public void verify_is_displayed_above_the_search_box(String string) {
		assertEquals(ConfigurationReader.getProperty("admins", "result0"), calendarPage.getResult());

	}

	@Then("I click on the name {string} from the results dropdown that should be clickable") // added
	public void i_click_on_the_name_from_the_results_dropdown(String string) {
		calendarPage.clickDropDownButton();
	}

	@Then("I enter the first letters of a name of a trainer in the search box - {string}")
	public void i_enter_the_first_letters_of_a_name_of_a_trainer_in_the_search_box(String string) {
		calendarPage.sendFirstLetter();
	}

	@Then("Only trainers whose first names start with the letter {string} should display on calendar view")
	public void only_trainers_whose_first_names_start_with_the_letter_should_display_on_calendar_view(String string) {
		assertEquals(
				ConfigurationReader.getProperty("admins", "tName"),
				calendarPage.getTrainer()
		);
	}

	@When("I send a Get request to {string}")
	public void i_send_a_get_request_to(String uri) {

		Hooks.restAssuredUtilities.setUrl(uri);
		Hooks.restAssuredUtilities.setMethod("GET");
		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("Status code {int} should be return with data")
	public void status_code_should_be_return_with_data(Integer int1) {
		int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(int1, equalTo(actualStatusCode));

	}
}
