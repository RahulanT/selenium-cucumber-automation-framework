package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CreateStreamPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateStream_stepdefinitions {

	CreateStreamPage createStreamPage = new CreateStreamPage();

	@Given("User is logged in as an Admin and navigate to Create Stream page")
	public void user_is_logged_in_as_an_admin_and_navigate_to_create_stream_page() {

		createStreamPage.driverGet(ConfigurationReader.getProperty("admins", "createStreamPageURL"));

	}

	@When("Admin verify that {string} is displayed as hint text for Stream Name input field")
	public void admin_verify_that_is_displayed_as_hint_text_for_stream_name_input_field(String hintText) {
		assertTrue(createStreamPage.isStreamNameHintTextDisplayed());
		assertEquals(createStreamPage.getStreamNameHintText(), hintText);
	}

	@Then("{string} should be displayed as hint text for Stream Name input field")
	public void should_be_displayed_as_hint_text_for_stream_name_input_field(String hintText) {
		assertEquals(createStreamPage.getStreamNameHintText(), hintText);
	}

	@When("Admin click on Stream Name input field")
	public void admin_click_on_stream_name_input_field() {
		createStreamPage.clickStreamNameInputField();
	}

	@Then("The Stream Name input field should be editable")
	public void the_stream_name_input_field_should_be_editable() {
		assertTrue(createStreamPage.isStreamNameInputFieldEnable());
	}

	@When("Admin enter {string} in Stream Name input field")
	public void admin_enter_in_stream_name_input_field(String streamName) {
		createStreamPage.setStreamNameInputField(streamName);
	}

	@Then("The {string} should be entered into Stream Name input field")
	public void the_should_be_entered_into_stream_name_input_field(String streamName) {
		assertEquals(createStreamPage.getStreamNameInputFieldText(), streamName);
	}

	@When("Admin click on Select Color field")
	public void admin_click_on_select_color_field() {
		createStreamPage.clickColorInputField();
	}

	@Then("The color picker window should be open")
	public void the_color_picker_window_should_be_open() {
		assertTrue(createStreamPage.isColorInputFieldEnable());
	}

	@When("Admin select Red color {string} from color picker window")
	public void admin_select_red_color_from_color_picker_window(String colorCode) {
		createStreamPage.setColorInputField(colorCode);
	}

	@Then("The Red color {string} should be selected for select color field")
	public void the_red_color_should_be_selected_for_select_color_field(String colorCode) {
		assertEquals(createStreamPage.getColorInputField(), colorCode);

	}

	@When("Admin click on {string} course from Available Courses list")
	public void admin_click_on_course_from_available_courses_list(String courseName) {
		createStreamPage.clickAvailableCourse(courseName);
	}

	@Then("{string} course should be selected from Available Courses")
	public void course_should_be_selected_from_available_courses(String courseName) {
		assertEquals(createStreamPage.getChoosenAvailableCourseName(), courseName);
	}

	@When("Admin click on Add button")
	public void admin_click_on_add_button() {
		createStreamPage.clickAddButton();
	}

	@Then("{string} course should be added into Selected Courses list")
	public void course_should_be_added_into_selected_courses_list(String courseName) {
		assertTrue(createStreamPage.getSelectedCourseList(courseName));
	}

	@When("Admin verify {string} no. of days in Duration in Days field")
	public void admin_verify_no_of_days_in_duration_in_days_field(String days) {
		assertEquals(createStreamPage.getDaysInDuration(), days);
	}

	@Then("{string} should be displayed in Duration in Days field")
	public void should_be_displayed_in_duration_in_days_field(String days) {
		assertEquals(createStreamPage.getDaysInDuration(), days);
	}

	@When("Admin verify that Stream Name input field is empty")
	public void admin_verify_that_stream_name_input_field_is_empty() {

		assertEquals(createStreamPage.getStreamNameInputFieldText(),
				ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@Then("Stream Name input field should be empty")
	public void stream_name_input_field_should_be_empty() {
		assertEquals(createStreamPage.getStreamNameInputFieldText(),
				ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@When("Admin verify that Select Color field is empty")
	public void admin_verify_that_select_color_field_is_empty() {
		assertEquals(createStreamPage.getColorInputField(),
				ConfigurationReader.getProperty("admins", "defaultColorCode"));
	}

	@Then("Select Color field should be empty")
	public void select_color_field_should_be_empty() {
		assertEquals(createStreamPage.getColorInputField(),
				ConfigurationReader.getProperty("admins", "defaultColorCode"));
	}

	@When("Admin verify that Region is not selected")
	public void admin_verify_that_region_is_not_selected() {
		assertEquals(createStreamPage.getRegions(), ConfigurationReader.getProperty("admins", "defaultRegion"));
	}

	@Then("Region should not be selected")
	public void region_should_not_be_selected() {
		assertEquals(createStreamPage.getRegions(), ConfigurationReader.getProperty("admins", "defaultRegion"));
	}

	@When("Admin verify that Country is not selected")
	public void admin_verify_that_country_is_not_selected() {
		assertEquals(createStreamPage.getCountry(), ConfigurationReader.getProperty("admins", "defaultCountry"));
	}

	@Then("Country should not be selected")
	public void country_should_not_be_selected() {
		assertEquals(createStreamPage.getCountry(), ConfigurationReader.getProperty("admins", "defaultCountry"));
	}

	@When("Admin verify that Duration in Days field is empty")
	public void admin_verify_that_duration_in_days_field_is_empty() {
		assertEquals(createStreamPage.getDaysInDuration(), ConfigurationReader.getProperty("admins", "defaultDays"));
	}

	@Then("Duration in Days field should be empty")
	public void duration_in_days_field_should_be_empty() {
		assertEquals(createStreamPage.getDaysInDuration(), ConfigurationReader.getProperty("admins", "defaultDays"));
	}

	@When("Admin verify that Create a Stream button is disabled")
	public void admin_verify_that_create_a_stream_button_is_disabled() {
		assertFalse(createStreamPage.isCreateStreamButtonDisabled());
	}

	@Then("Create a Stream button should be disabled")
	public void create_a_stream_button_should_be_disabled() {
		assertFalse(createStreamPage.isCreateStreamButtonDisabled());
	}

	@When("Admin click on {string} course from Selected Courses list")
	public void admin_click_on_course_from_selected_courses_list(String courseName) {
		createStreamPage.clickSelectedCourse(courseName);
	}

	@Then("{string} course should be selected from Selected Courses list")
	public void course_should_be_selected_from_selected_courses_list(String courseName) {
		assertEquals(createStreamPage.getChoosenSelectedCourseName(), courseName);
	}

	@When("Admin click on Remove button")
	public void admin_click_on_remove_button() {
		createStreamPage.clickRemoveButton();
	}

	@Then("{string} course should be removed from Selected Courses list")
	public void course_should_be_removed_from_selected_courses_list(String courseName) {
		assertFalse(createStreamPage.getSelectedCourseList(courseName));
	}

	@When("Admin verify that {string} course is added back into Available Courses list")
	public void admin_verify_that_course_is_added_back_into_available_courses_list(String courseName) {
		assertTrue(createStreamPage.getAvailableCourseList(courseName));
	}

	@Then("{string} course should be added into Available Courses list")
	public void course_should_be_added_into_available_courses_list(String courseName) {
		assertTrue(createStreamPage.getAvailableCourseList(courseName));
	}

	@When("Admin click on Create Stream button")
	public void admin_click_on_create_stream_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Pop-up window should be displayed with {string} text")
	public void pop_up_window_should_be_displayed_with_text(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin verify Stream Name as {string} in pop-up window")
	public void admin_verify_stream_name_as_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} should be displayed as Stream Name in pop-up window")
	public void should_be_displayed_as_stream_name_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin verify Stream Color code as {string} in pop-up window")
	public void admin_verify_stream_color_code_as_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} should be displayed as Stream Color code in pop-up window")
	public void should_be_displayed_as_stream_color_code_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin verify Course Selected as {string} in pop-up window")
	public void admin_verify_course_selected_as_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} should be displayed as Course Selected in pop-up window")
	public void should_be_displayed_as_course_selected_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin verify Duration of Stream as {string} in pop-up window")
	public void admin_verify_duration_of_stream_as_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("{string} should be displayed as Duration of Stream in pop-up window")
	public void should_be_displayed_as_duration_of_stream_in_pop_up_window(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin verify Ok button is displayed as enabled")
	public void admin_verify_ok_button_is_displayed_as_enabled() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Ok button should be displayed as enabled")
	public void ok_button_should_be_displayed_as_enabled() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("Admin click on Create Another Stream button")
	public void admin_click_on_create_another_stream_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("Admin should be redirect to Create Stream page")
	public void admin_should_be_redirect_to_create_stream_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
