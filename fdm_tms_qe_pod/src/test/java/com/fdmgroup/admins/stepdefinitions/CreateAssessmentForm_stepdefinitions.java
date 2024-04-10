package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CreateAssessmentFormPage;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAssessmentForm_stepdefinitions {
	
	
	CreateAssessmentFormPage createAssessmentFormPage = new CreateAssessmentFormPage();
	

	
	
	@Given("User is logged in as an Admin and navigate to Create Assessment Form page")
	public void user_is_logged_in_as_an_admin_and_navigate_to_create_assessment_form_page() {
		createAssessmentFormPage.driverGet(ConfigurationReader.getProperty("admins","assessmentPageURL"));
		BrowserUtilities.implicitWait(2000);
	}

	@When("Admin click on Assessment Name input field")
	public void admin_click_on_assessment_name_input_field() {
		createAssessmentFormPage.clickAssessmentNameInputField();
		BrowserUtilities.implicitWait(2000);
	}

	@Then("The input field should be editable")
	public void the_input_field_should_be_editable() {
		assertTrue(createAssessmentFormPage.isAssessmentNameInputFieldEnable());
	}

	@When("Admin enter {string} in Assessment Name input field")
	public void admin_enter_in_assessment_name_input_field(String arg0) {
		createAssessmentFormPage.setAssessmentNameInputField(arg0);
		BrowserUtilities.implicitWait(2000);
	}

	@Then("The {string} should be entered into input field")
	public void the_should_be_entered_into_input_field(String arg0) {
		assertEquals(arg0, createAssessmentFormPage.getAssessmentNameInputFieldText());

	}

	@When("Admin click on Status dropdown list")
	public void admin_click_on_status_dropdown_list() {
		createAssessmentFormPage.clickSelectStatusDropdownList();
	    
	}

	@Then("Status dropdown list should be displayed")
	public void status_dropdown_list_should_be_displayed() {
		createAssessmentFormPage.isSelectStatusDropdownListVisible();
		
	}

	@When("Admin select {string} status from Status dropdown list")
	public void admin_select_active_status_from_status_dropdown_list(String arg0) {
		createAssessmentFormPage.selectStatus(arg0);
		
	}

	@Then("{string} status should be selected")
	public void active_status_should_be_selected(String arg0) {
		assertEquals(arg0,createAssessmentFormPage.getStatus());
		
	}
	

	@When("Admin click on Grade Scale dropdown list")
	public void admin_click_on_grade_scale_dropdown_list() {
		createAssessmentFormPage.clickGradeScaleDropdownList();
	   
	}

	@Then("Grade Scale dropdown list should be displayed")
	public void grade_scale_dropdown_list_should_be_displayed() {
		createAssessmentFormPage.isGradeScaleDropdownListVisible();
		
	}

	@When("Admin select {string} option from Grade Scale dropdown list")
	public void admin_select_option_from_grade_scale_dropdown_list(String arg0) {
		createAssessmentFormPage.selectGradeScale(arg0);
		
	}

	@Then("{string} option should be selected")
	public void option_should_be_selected(String arg0) {
		assertEquals(arg0,createAssessmentFormPage.getGradeScale());
		
	}

	@When("Admin click on Description input field")
	public void admin_click_on_description_input_field() {
		createAssessmentFormPage.clickDescriptionInputField();
		
	}

	@Then("The Description input field should be editable")
	public void the_description_input_field_should_be_editable() {
	   assertTrue(createAssessmentFormPage.isDescriptionInputFieldEnable());
	}

	@When("Admin enter {string} in Description input field")
	public void admin_enter_in_description_input_field(String arg0) {
		createAssessmentFormPage.setDescriptionInputField(arg0);
	}

	@Then("The {string} should be entered into Description input field")
	public void the_should_be_entered_into_description_input_field(String arg0) {
		assertEquals(arg0, createAssessmentFormPage.getDescriptionInputFieldText());

	}

	@When("Admin click on Instructions input field")
	public void admin_click_on_instructions_input_field() {
		createAssessmentFormPage.clickInstructionsInputField();
	}

	@Then("The Instructions input field should be editable")
	public void the_instructions_input_field_should_be_editable() {
		assertTrue(createAssessmentFormPage.isInstructionsInputFieldEnable());
	}

	@When("Admin enter {string} in Instructions input field")
	public void admin_enter_in_instructions_input_field(String arg0) {
		createAssessmentFormPage.setInstructionsInputField(arg0);
	}

	@Then("The {string} should be entered into Instructions input field")
	public void the_should_be_entered_into_instructions_input_field(String arg0) {
		assertEquals(arg0, createAssessmentFormPage.getInstructionsInputFieldText());

	}

	@When("Admin check that mandatory field Assessment Name is empty")
	public void admin_check_that_mandatory_field_assessment_name_is_empty() {
	     assertEquals("", createAssessmentFormPage.getAssessmentNameInputFieldText());
	}

	@Then("Assessment Name input field should be empty")
	public void assessment_name_input_field_should_be_empty() {
		 assertEquals(ConfigurationReader.getProperty("admins","emptyValue"), createAssessmentFormPage.getAssessmentNameInputFieldText());
	}

	@When("Admin check that mandatory field Status is selected as {string} option")
	public void admin_check_that_mandatory_field_status_is_selected_as_option(String arg0) {
	    createAssessmentFormPage.selectStatus(arg0);
	}

	@Then("Status dropdown list should be selected as {string} option")
	public void status_dropdown_list_should_be_selected_as_option(String arg0) {
	    assertEquals(arg0, createAssessmentFormPage.getStatus());
	}

	@When("Admin check that mandatory field Grade Scale is selected as {string} option")
	public void admin_check_that_mandatory_field_grade_scale_is_selected_as_option(String arg0) {
	    createAssessmentFormPage.selectGradeScale(arg0);
	}

	@Then("Grade Scale dropdown list should be selected as {string} option")
	public void grade_scale_dropdown_list_should_be_selected_as_option(String arg0) {
	    assertEquals(arg0, createAssessmentFormPage.getGradeScale());
	}

	@When("Admin confirm that Create button is disabled")
	public void admin_confirm_that_create_button_is_disabled() {
	    assertFalse(createAssessmentFormPage.isCreateButtonEnabled());
	}

	@Then("Create button should be disabled")
	public void create_button_should_be_disabled() {
		 assertFalse(createAssessmentFormPage.isCreateButtonEnabled());
	}

	@Then("{string} should be displayed in Assessment Name input field")
	public void should_be_displayed_in_assessment_name_input_field(String arg0) {
		assertEquals(arg0, createAssessmentFormPage.getAssessmentNameInputFieldText());
	}

	@When("Admin confirm that Create button is enabled")
	public void admin_confirm_that_create_button_is_enabled() {
		assertTrue(createAssessmentFormPage.isCreateButtonEnabled());
	}

	@Then("Create button should be enabled")
	public void create_button_should_be_enabled() {
		assertTrue(createAssessmentFormPage.isCreateButtonEnabled());
	}

	@When("Admin click on Cancel button")
	public void admin_click_on_cancel_button() {
	    createAssessmentFormPage.clickCancelButton();
	}

	@Then("Data from all the fields should be cleared")
	public void data_from_all_the_fields_should_be_cleared() {
		 assertEquals(ConfigurationReader.getProperty("admins","emptyValue"), createAssessmentFormPage.getAssessmentNameInputFieldText());
		 assertEquals(ConfigurationReader.getProperty("admins","selectDefaultStatus"), createAssessmentFormPage.getStatus());
		 assertEquals(ConfigurationReader.getProperty("admins","selectDefaultGrdeScale"), createAssessmentFormPage.getGradeScale());
		 
	}

	@When("Admin confirm that {string} is displayed as a heading of the page")
	public void admin_confirm_that_is_displayed_as_a_heading_of_the_page(String arg0) {
	    assertEquals(arg0, createAssessmentFormPage.getPageHeading());
	}

	@Then("{string} should be displayed as a page heading")
	public void should_be_displayed_as_a_page_heading(String arg0) {
		assertEquals(arg0, createAssessmentFormPage.getPageHeading());
	}

	@When("Admin click on Create button")
	public void admin_click_on_create_button() {
	    createAssessmentFormPage.clickCreateButton();
	}

	@Then("Pop-up should be displayed with text {string}")
	public void pop_up_should_be_displayed_with_text(String arg0) {
	    assertEquals(arg0, createAssessmentFormPage.getPopUpText());
	}

	@Then("Pop-up should be displayed with the x close button on top-right corner")
	public void pop_up_should_be_displayed_with_the_x_close_button_on_top_right_corner() {
	    assertTrue(createAssessmentFormPage.isCloseButtonEnabled());
	}

	@When("Admin click on x close button")
	public void admin_click_on_x_close_button() {
	    createAssessmentFormPage.clickCloseButton();
	}

	@Then("Pop-up should be closed")
	public void pop_up_should_be_closed() {
		assertTrue(createAssessmentFormPage.isCreateAssessmentFormTitleTextEnabled());
	}

	@Then("Pop-up should be displayed with Customize Form button")
	public void pop_up_should_be_displayed_with_customize_form_button() {
		assertTrue(createAssessmentFormPage.isCustomizeFormButtonEnabled());
	}

	@When("Admin click on Customize Form button")
	public void admin_click_on_customize_form_button() {
	    createAssessmentFormPage.clickCustomizeFormButton();
	}

	@Then("Customize Form page should be displayed")
	public void customize_form_page_should_be_displayed() {
		assertTrue(createAssessmentFormPage.isCustomizeFormTitleTextEnabled());
	}

}
