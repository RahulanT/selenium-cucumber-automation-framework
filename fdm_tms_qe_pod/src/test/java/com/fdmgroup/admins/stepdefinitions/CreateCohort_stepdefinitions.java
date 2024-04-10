package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CreateCohortPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCohort_stepdefinitions {

	CreateCohortPage createCohortPage = new CreateCohortPage();

	@Given("User is logged in as an Admin and navigate to Create Cohort page")
	public void user_is_logged_in_as_an_admin_and_navigate_to_create_cohort_page() {

		createCohortPage.driverGet(ConfigurationReader.getProperty("admins", "createCohortURL"));
	}

	@When("As an Admin verify that {string} is displayed as hint text for City dropdown list")
	public void as_an_admin_verify_that_is_displayed_as_hint_text_for_city_dropdown_list(String cityHintText) {
		assertTrue(createCohortPage.isCityHintTextDisplayed());
	}

	@Then("{string} should be displayed as hint text for City dropdown list")
	public void should_be_displayed_as_hint_text_for_city_dropdown_list(String cityHintText) {
		assertEquals(createCohortPage.getCityHintText(), cityHintText);
	}

	@When("As an Admin verify that {string} is displayed as hint text for Pathway dropdown list")
	public void as_an_admin_verify_that_is_displayed_as_hint_text_for_pathway_dropdown_list(String pathwayHintText) {
		assertTrue(createCohortPage.isPathwayHintTextDisplayed());
	}

	@Then("{string} should be displayed as hint text for Pathway dropdown list")
	public void should_be_displayed_as_hint_text_for_pathway_dropdown_list(String pathwayHintText) {
		assertEquals(createCohortPage.getPathwayHintText(), pathwayHintText);
	}

	@When("Admin select {string} option from City dropdown list")
	public void admin_select_option_from_city_dropdown_list(String city) {
		createCohortPage.selectCity(city);
	}

	@Then("{string} option should be selected from City dropdown list")
	public void option_should_be_selected_from_city_dropdown_list(String city) {
		assertEquals(createCohortPage.getCity(), city);
	}

	@When("Admin select {string} option from Pathway dropdown list")
	public void admin_select_option_from_pathway_dropdown_list(String pathway) {
		createCohortPage.selectPathway(pathway);
	}

	@Then("{string} option should be selected from Pathway dropdown list")
	public void option_should_be_selected_from_pathway_dropdown_list(String pathway) {
		assertEquals(createCohortPage.getPathway(), pathway);
	}

	@When("Admin enter {string} date into Start Date input field")
	public void admin_enter_date_into_start_date_input_field(String date) {
		createCohortPage.setDate(date);
	}

	@Then("{string} date should be displayed in Start Date input field")
	public void date_should_be_displayed_in_start_date_input_field(String date) {
		assertEquals(createCohortPage.getStartDate(), date);
	}

	@When("Admin verify that City is not selected")
	public void admin_verify_that_city_is_not_selected() {
		assertEquals(createCohortPage.getEmptyCity(), ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@Then("City should not be selected")
	public void city_should_not_be_selected() {
		assertEquals(createCohortPage.getEmptyCity(), ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@When("Admin verify that Pathway is not selected")
	public void admin_verify_that_pathway_is_not_selected() {
		assertEquals(createCohortPage.getEmptyPathway(), ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@Then("Pathway should not be selected")
	public void pathway_should_not_be_selected() {
		assertEquals(createCohortPage.getEmptyPathway(), ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@When("Admin verify that Start Date input field should be empty")
	public void admin_verify_that_start_date_input_field_should_be_empty() {
		assertEquals(createCohortPage.getEmptyStartDate(), ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@Then("Start Date input field should be empty")
	public void start_date_input_field_should_be_empty() {
		assertEquals(createCohortPage.getEmptyStartDate(), ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@When("Admin verify that {string} should be displayed as Cohort Code")
	public void admin_verify_that_should_be_displayed_as_cohort_code(String cohortCode) {
		assertEquals(createCohortPage.getCohortCode(), cohortCode);
	}

	@Then("{string} should be displayed as Cohort Code")
	public void should_be_displayed_as_cohort_code(String cohortCode) {
		assertEquals(createCohortPage.getCohortCode(), cohortCode);
	}


	@When("Admin click on Edit button")
	public void admin_click_on_edit_button() {
		createCohortPage.clickEditButton();
	}

	@Then("Cohort Code field should be editable")
	public void cohort_code_field_should_be_editable() {
		assertTrue(createCohortPage.isCohortCodeInputFieldEnabled());
	}

	@When("Admin edit Cohort Code to {string}")
	public void admin_edit_cohort_code_to(String newCohortCode) {
		createCohortPage.setCohortCode(newCohortCode);
	}

	@When("Admin click on Create Cohort button")
	public void admin_click_on_create_cohort_button() {
		createCohortPage.clickCreateCohortButton();
	}
	
	@Then("Pop-up window should be displayed with {string} title text")
	public void pop_up_window_should_be_displayed_with_title_text(String popupTitle) {
	    assertEquals(createCohortPage.getPopUpTitle(), popupTitle);
	}

	@When("Admin verify that {string} should be displayed as Cohort Code in the pop-up")
	public void admin_verify_that_should_be_displayed_as_cohort_code_in_the_pop_up(String popUpCohortCode) {
		assertEquals(createCohortPage.getPopUpCohortCode(), popUpCohortCode);
	}

	@Then("{string} should be displayed as Cohort Code in the pop-up")
	public void should_be_displayed_as_cohort_code_in_the_pop_up(String popUpCohortCode) {
		assertEquals(createCohortPage.getPopUpCohortCode(), popUpCohortCode);
	}

	@When("Admin verify that {string} should be displayed as Region in the pop-up")
	public void admin_verify_that_should_be_displayed_as_region_in_the_pop_up(String popUpRegion) {
		assertEquals(createCohortPage.getPopUpRegion(), popUpRegion);
	}

	@Then("{string} should be displayed as Region in the pop-up")
	public void should_be_displayed_as_region_in_the_pop_up(String popUpRegion) {
		assertEquals(createCohortPage.getPopUpRegion(), popUpRegion);
	}

	@When("Admin verify that {string} should be displayed as City in the pop-up")
	public void admin_verify_that_should_be_displayed_as_city_in_the_pop_up(String popUpCity) {
		assertEquals(createCohortPage.getPopUpCity(), popUpCity);
	}

	@Then("{string} should be displayed as City in the pop-up")
	public void should_be_displayed_as_city_in_the_pop_up(String popUpCity) {
		assertEquals(createCohortPage.getPopUpCity(), popUpCity);
	}

	@When("Admin verify that {string} should be displayed as Pathway in the pop-up")
	public void admin_verify_that_should_be_displayed_as_pathway_in_the_pop_up(String popUpPathway) {
		assertEquals(createCohortPage.getPopUpPathway(), popUpPathway);
	}

	@Then("{string} should be displayed as Pathway in the pop-up")
	public void should_be_displayed_as_pathway_in_the_pop_up(String popUpPathway) {
		assertEquals(createCohortPage.getPopUpPathway(), popUpPathway);
	}

	@When("Admin verify that Start Date should be displayed as {string} in the pop-up")
	public void admin_verify_that_start_date_should_be_displayed_as_in_the_pop_up(String popUpStartDate) {
		assertEquals(createCohortPage.getPopUpStartDate(), popUpStartDate);
	}

	@Then("Start Date should be displayed as {string} in the pop-up")
	public void start_date_should_be_displayed_as_in_the_pop_up(String popUpStartDate) {
		assertEquals(createCohortPage.getPopUpStartDate(), popUpStartDate);
	}
	
	@When("Admin verify Ok button is displayed as enabled in pop-up")
	public void admin_verify_ok_button_is_displayed_as_enabled_in_pop_up() {
	    assertTrue(createCohortPage.isOkButtonEnabled());
	}

	@Then("Ok button should be displayed as enabled in pop-up")
	public void ok_button_should_be_displayed_as_enabled_in_pop_up() {
		assertTrue(createCohortPage.isOkButtonEnabled());
	}
	
}
