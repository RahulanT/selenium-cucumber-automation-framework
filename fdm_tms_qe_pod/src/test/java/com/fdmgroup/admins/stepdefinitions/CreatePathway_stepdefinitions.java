package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CreatePathwayPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePathway_stepdefinitions {

	CreatePathwayPage createPathwayPage = new CreatePathwayPage();

	@When("Admin verify that {string} is displayed as hint text for Pathway Name input field")
	public void admin_verify_that_is_displayed_as_hint_text_for_pathway_name_input_field(String pathwayNameHinttext) {
		assertTrue(createPathwayPage.isPathwayNameHintTextDisplayed());
	}

	@Then("{string} should be displayed as hint text for Pathway Name input field")
	public void should_be_displayed_as_hint_text_for_pathway_name_input_field(String pathwayNameHinttext) {
		assertEquals(createPathwayPage.getPathwayNameHintText(), pathwayNameHinttext);
	}

	@When("Admin click on Pathway Name input field")
	public void admin_click_on_pathway_name_input_field() {
		createPathwayPage.clickPathwayNameInputField();
	}

	@Then("The Pathway Name input field should be editable")
	public void the_pathway_name_input_field_should_be_editable() {
		assertTrue(createPathwayPage.isPathwayNameInputFieldEnable());
	}

	@When("Admin enter {string} in Pathway Name input field")
	public void admin_enter_in_pathway_name_input_field(String pathwayName) {
		createPathwayPage.setPathwayNameInputField(pathwayName);
	}

	@Then("The {string} should be entered into Pathway Name input field")
	public void the_should_be_entered_into_pathway_name_input_field(String pathwayName) {
		assertEquals(createPathwayPage.getPathwayNameInputFieldText(), pathwayName);
	}

	@When("Admin select {string} option from Pathway Owner dropdown list")
	public void admin_select_option_from_pathway_owner_dropdown_list(String pathwayOwnerName) {
		createPathwayPage.selectPathwayOwner(pathwayOwnerName);
	}

	@Then("{string} option should be selected from Pathway Owner dropdown list")
	public void option_should_be_selected_from_pathway_owner_dropdown_list(String pathwayOwnerName) {
		assertEquals(createPathwayPage.getPathwayOwner(), pathwayOwnerName);
	}

	@When("Admin verify {string} no. of weeks in Duration in Weeks field")
	public void admin_verify_no_of_weeks_in_duration_in_weeks_field(String weeks) {
		assertEquals(createPathwayPage.getWeeksInDuration(), weeks);
	}

	@Then("{string} should be displayed in Duration in Weeks field")
	public void should_be_displayed_in_duration_in_weeks_field(String weeks) {
		assertEquals(createPathwayPage.getWeeksInDuration(), weeks);
	}

	@When("Admin verify that Pathway Name input field is empty")
	public void admin_verify_that_pathway_name_input_field_is_empty() {
		assertEquals(createPathwayPage.getPathwayNameInputFieldText(),
				ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@Then("Pathway Name input field should be empty")
	public void pathway_name_input_field_should_be_empty() {
		assertEquals(createPathwayPage.getPathwayNameInputFieldText(),
				ConfigurationReader.getProperty("admins", "emptyValue"));
	}

	@When("Admin verify that Pathway Owner dropdown list not selected any option")
	public void admin_verify_that_pathway_owner_dropdown_list_not_selected_any_option() {
		assertEquals(createPathwayPage.getPathwayOwner(),
				ConfigurationReader.getProperty("admins", "defaultPathwayOwner"));
	}

	@Then("Pathway Owner dropdown list should not be selected an option")
	public void pathway_owner_dropdown_list_should_not_be_selected_an_option() {
		assertEquals(createPathwayPage.getPathwayOwner(),
				ConfigurationReader.getProperty("admins", "defaultPathwayOwner"));
	}

	@When("Admin verify that Create a Pathway button is disabled")
	public void admin_verify_that_create_a_pathway_button_is_disabled() {
		assertFalse(createPathwayPage.isCreatePathwayButtonEnabled());
	}

	@Then("Create a Pathway button should be disabled")
	public void create_a_pathway_button_should_be_disabled() {
		assertFalse(createPathwayPage.isCreatePathwayButtonEnabled());
	}

	@When("Admin click on Create Pathway button")
	public void admin_click_on_create_pathway_button() {
		createPathwayPage.clickCreatePathwayButton();
	}

	@When("Admin select {string} option from Focus dropdown list")
	public void admin_select_option_from_focus_dropdown_list(String focus) {
		createPathwayPage.selectPathwayFocus(focus);
	}

	@Then("{string} option should be selected from Focus dropdown list")
	public void option_should_be_selected_from_focus_dropdown_list(String focus) {
		assertEquals(createPathwayPage.getPathwayFocus(), focus);
	}

	@When("Admin select {string} color from Color dropdown list")
	public void admin_select_color_from_color_dropdown_list(String color) {
		createPathwayPage.selectPathwayColor(color);
	}

	@Then("{string} color should be selected from Color dropdown list")
	public void color_should_be_selected_from_color_dropdown_list(String color) {
		assertEquals(createPathwayPage.getPathwayColor(color), color);
	}

}
