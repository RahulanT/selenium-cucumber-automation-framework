package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CreateCoursePage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCourse_stepdefinitions {
	
	
	CreateCoursePage createCoursePage = new CreateCoursePage();
	
	

@Given("User is logged in as an Admin and navigate to Create Course page")
public void user_is_logged_in_as_an_admin_and_navigate_to_create_course_page() {
	createCoursePage.driverGet(ConfigurationReader.getProperty("admins","createCoursePageURL"));
}

@When("Admin confirm that {string} is displayed as a title of the page")
public void admin_confirm_that_is_displayed_as_a_title_of_the_page(String pageTitle) {
    assertTrue(createCoursePage.isPageTitleDisplayed());
}

@Then("{string} should be displayed as a page title")
public void should_be_displayed_as_a_page_title(String pageTitle) {
	assertEquals(createCoursePage.getPageTitle(), pageTitle);
}

@When("Admin verify that {string} is displayed as hint text for Name input field")
public void admin_verify_that_is_displayed_as_hint_text_for_name_input_field(String hintTextCourseName) {
	 assertTrue(createCoursePage.isCourseNameHintTextDisplayed());
}

@Then("{string} should be displayed as hint text for Name input field")
public void should_be_displayed_as_hint_text_for_name_input_field(String hintTextCourseName) {
	assertEquals(createCoursePage.getCourseNameHintText(), hintTextCourseName);
}

@When("Admin verify that {string} is displayed as hint text for Course Owner dropdown list")
public void admin_verify_that_is_displayed_as_hint_text_for_course_owner_dropdown_list(String hintTextCourseOwner) {
	assertTrue(createCoursePage.isCourseOwnerHintTextDisplayed());
}

@Then("{string} should be displayed as hint text for Course Owner dropdown list")
public void should_be_displayed_as_hint_text_for_course_owner_dropdown_list(String hintTextCourseOwner) {
	assertEquals(createCoursePage.getCourseOwnerHintText(), hintTextCourseOwner);
}

@When("Admin verify that {string} is displayed as hint text for Duration input field")
public void admin_verify_that_is_displayed_as_hint_text_for_duration_input_field(String hintTextDuration) {
	assertTrue(createCoursePage.isDurationHintTextDisplayed());
}

@Then("{string} should be displayed as hint text for Duration input field")
public void should_be_displayed_as_hint_text_for_duration_input_field(String hintTextDuration) {
	assertEquals(createCoursePage.getDurationHintText(), hintTextDuration);
}

@When("Admin verify that {string} is displayed as hint text for Assessments dropdown list")
public void admin_verify_that_is_displayed_as_hint_text_for_assessments_dropdown_list(String hintTextAssessments) {
	assertTrue(createCoursePage.isAssessmentsHintTextDisplayed());
}

@Then("{string} should be displayed as hint text for Assessments dropdown list")
public void should_be_displayed_as_hint_text_for_assessments_dropdown_list(String hintTextAssessments) {
	assertEquals(createCoursePage.getAssessmentsHintText(), hintTextAssessments);
}

@When("Admin verify that {string} is displayed as hint text for Region dropdown list")
public void admin_verify_that_is_displayed_as_hint_text_for_region_dropdown_list(String hintTextRegions) {
	assertTrue(createCoursePage.isRegionsHintTextDisplayed());
}

@Then("{string} should be displayed as hint text for Region dropdown list")
public void should_be_displayed_as_hint_text_for_region_dropdown_list(String hintTextRegions) {
	assertEquals(createCoursePage.getRegionsHintText(), hintTextRegions);
}

@When("Admin verify that {string} is displayed as hint text for Country dropdown list")
public void admin_verify_that_is_displayed_as_hint_text_for_country_dropdown_list(String hintTextCountry) {
	assertTrue(createCoursePage.isCountryHintTextDisplayed());
}

@Then("{string} should be displayed as hint text for Country dropdown list")
public void should_be_displayed_as_hint_text_for_country_dropdown_list(String hintTextCountry) {
	assertEquals(createCoursePage.getCountryHintText(), hintTextCountry);
}

@When("Admin verify that {string} is displayed as hint text for Course Description input field")
public void admin_verify_that_is_displayed_as_hint_text_for_course_description_input_field(String hintTextCourseDescription) {
	assertTrue(createCoursePage.isCourseDescriptionHintTextDisplayed());
}

@Then("{string} should be displayed as hint text for Course Description input field")
public void should_be_displayed_as_hint_text_for_course_description_input_field(String hintTextCourseDescription) {
	assertEquals(createCoursePage.getCourseDescriptionHintText(), hintTextCourseDescription);
}

@When("Admin confirm that Create Course button is disabled")
public void admin_confirm_that_create_course_button_is_disabled() {
	assertFalse(createCoursePage.isCreateCourseButtonEnabled());
}

@Then("Create Course button should be disabled")
public void create_course_button_should_be_disabled() {
	assertFalse(createCoursePage.isCreateCourseButtonEnabled());
}

@When("Admin click on Name input field")
public void admin_click_on_name_input_field() {
    createCoursePage.clickCourseNameInputField();
}

@Then("The Name input field should be editable")
public void the_name_input_field_should_be_editable() {
	assertTrue(createCoursePage.isCourseNameInputFieldEnable());
}

@When("Admin enter {string} in Name input field")
public void admin_enter_in_name_input_field(String txtCourseName) {
    createCoursePage.setCourseNameInputField(txtCourseName);
}

@Then("The {string} should be entered into Name input field")
public void the_should_be_entered_into_name_input_field(String txtCourseName) {
	assertEquals(createCoursePage.getCourseNameInputFieldText(), txtCourseName);
}

@When("Admin click on Course Owner dropdown list")
public void admin_click_on_course_owner_dropdown_list() {
    createCoursePage.clickCourseOwnerDropdownList();
}

@Then("Course Owner dropdown list should be displayed")
public void course_owner_dropdown_list_should_be_displayed() {
    assertTrue(createCoursePage.isCourseOwnerDropdownListDisplayed());
}

@When("Admin select {string} option from Course Owner dropdown list")
public void admin_select_option_from_course_owner_dropdown_list(String selectCourseOwner) {
    createCoursePage.selectCourseOwner(selectCourseOwner);
}

@Then("{string} option should be selected from Course Owner dropdown list")
public void option_should_be_selected_from_course_owner_dropdown_list(String getCourseOwner) {
    assertEquals(createCoursePage.getCourseOwner(), getCourseOwner);
}

@When("Admin click on Duration input field")
public void admin_click_on_duration_input_field() {
	createCoursePage.clickDurationInputField();
}

@Then("The Duration input field should be editable")
public void the_duration_input_field_should_be_editable() {
	assertTrue(createCoursePage.isDurationInputFieldEnable());
}

@When("Admin enter {string} in Duration input field")
public void admin_enter_in_duration_input_field(String txtDuration) {
	createCoursePage.setDurationInputField(txtDuration);
}

@Then("The {string} should be entered into Duration input field")
public void the_should_be_entered_into_duration_input_field(String txtDuration) {
	assertEquals(createCoursePage.getDurationInputFieldText(), txtDuration);
}

@When("Admin click on Assessments dropdown list")
public void admin_click_on_assessments_dropdown_list() {
    createCoursePage.clickAssessmentsDropdownList();
}

@Then("Assessments dropdown list should be displayed")
public void assessments_dropdown_list_should_be_displayed() {
	assertTrue(createCoursePage.isAssessmentsDropdownListDisplayed());
}

@When("Admin select {string} option from Assessments dropdown list")
public void admin_select_option_from_assessments_dropdown_list(String selectAssessments) {
	createCoursePage.selectAssessments(selectAssessments);
}

@Then("{string} option should be selected from Assessments dropdown list")
public void option_should_be_selected_from_assessments_dropdown_list(String getAssessments) {
	assertEquals(createCoursePage.getAssessments(), getAssessments);
}

@When("Admin click on Region dropdown list")
public void admin_click_on_region_dropdown_list() {
	createCoursePage.clickRegionsDropdownList();
}

@Then("Region dropdown list should be displayed")
public void region_dropdown_list_should_be_displayed() {
	assertTrue(createCoursePage.isRegionsDropdownListDisplayed());
}

@When("Admin select {string} option from Region dropdown list")
public void admin_select_option_from_region_dropdown_list(String selectRegions) {
	createCoursePage.selectRegions(selectRegions);
}

@Then("{string} option should be selected from Region dropdown list")
public void option_should_be_selected_from_region_dropdown_list(String getRegions) {
	assertEquals(createCoursePage.getRegions(), getRegions);
}

@When("Admin select {string} option from Country dropdown list")
public void admin_select_option_from_country_dropdown_list(String selectCountry) {
	createCoursePage.selectCountry(selectCountry);
}

@Then("{string} option should be selected from Country dropdown list")
public void option_should_be_selected_from_country_dropdown_list(String getCountry) {
	assertEquals(createCoursePage.getCountry(), getCountry);
}

@When("Admin click on Course Description input field")
public void admin_click_on_course_description_input_field() {
    createCoursePage.clickCourseDescriptionInputField();
}

@Then("The Course Description input field should be editable")
public void the_course_description_input_field_should_be_editable() {
    assertTrue(createCoursePage.isCourseDescriptionInputFieldEnable());
}

@When("Admin enter {string} in Course Description input field")
public void admin_enter_in_course_description_input_field(String txtCourseDescription) {
	createCoursePage.setCourseDescriptionInputField(txtCourseDescription);
}

@Then("The {string} should be entered into Course Description input field")
public void the_should_be_entered_into_course_description_input_field(String txtCourseDescription) {
	assertEquals(createCoursePage.getCourseDescriptionInputFieldText(), txtCourseDescription);
}

@Then("{string} error message should be displayed below Name input field")
public void error_message_should_be_displayed_below_name_input_field(String errorTextCourseName) {
	
    assertTrue(createCoursePage.isCourseNameErrorTextDisplayed());
    assertEquals(createCoursePage.getCourseNameErrorText(), errorTextCourseName);
}

@Then("{string} error message should be displayed below Course Owner dropdown list")
public void error_message_should_be_displayed_below_course_owner_dropdown_list(String errorTextCourseOwner) {

	assertTrue(createCoursePage.isCourseOwnerErrorTextDisplayed());
    assertEquals(createCoursePage.getCourseOwnerErrorText(), errorTextCourseOwner);
}

@Then("{string} error message should be displayed below Duration input field")
public void error_message_should_be_displayed_below_duration_input_field(String errorTextDuration) {
	
	assertTrue(createCoursePage.isDurationErrorTextDisplayed());
    assertEquals(createCoursePage.getDurationErrorText(), errorTextDuration);
}

@Then("{string} error message should be displayed below Assessments dropdown list")
public void error_message_should_be_displayed_below_assessments_dropdown_list(String errorTextAssessments) {
	
	assertTrue(createCoursePage.isAssessmentsErrorTextDisplayed());
    assertEquals(createCoursePage.getAssessmentsErrorText(), errorTextAssessments);
}

@When("Admin click on Country dropdown list")
public void admin_click_on_country_dropdown_list() {
    createCoursePage.clickCountryDropdownList();
}

@Then("{string} error message should be displayed below Region dropdown list")
public void error_message_should_be_displayed_below_region_dropdown_list(String errorTextRegion) {
	
	assertTrue(createCoursePage.isRegionsErrorTextDisplayed());
    assertEquals(createCoursePage.getRegionsErrorText(), errorTextRegion);
}

@Then("{string} error message should be displayed below Country dropdown list")
public void error_message_should_be_displayed_below_country_dropdown_list(String errorTextCountry) {
	
	assertTrue(createCoursePage.isCountryErrorTextDisplayed());
    assertEquals(createCoursePage.getCountryErrorText(), errorTextCountry);
}

@When("Admin verify that \\(+) Add Assessment button is displayed besides Assessments dropdown list")
public void admin_verify_that_add_assessment_button_is_displayed_besides_assessments_dropdown_list() {
    assertTrue(createCoursePage.isAddAssessmentsButtonDisplayed());
}

@Then("\\(+) Add Assessment button should be displayed besides Assessments dropdown list")
public void add_assessment_button_should_be_displayed_besides_assessments_dropdown_list() {
	assertTrue(createCoursePage.isAddAssessmentsButtonDisplayed());
}

@When("Admin click on \\(+) Add Assessment button")
public void admin_click_on_add_assessment_button() {
    createCoursePage.clickAddAssessmentsButton();
}

@Then("{string} option should be added below in Assessments list")
public void option_should_be_added_below_in_assessments_list(String assessmentList) {
    assertEquals(createCoursePage.getAssessmentList(), assessmentList);
}

@When("Admin verify that \\(-) Remove Assessment button is displayed besides {string} Assessment")
public void admin_verify_that_remove_assessment_button_is_displayed_besides_assessment(String assessmentList) {
	assertTrue(createCoursePage.isRemoveAssessmentsButtonDisplayed());
	assertEquals(createCoursePage.getAssessmentList(), assessmentList);
}

@Then("\\(-) Remove Assessment button should be displayed besides {string} Assessment")
public void remove_assessment_button_should_be_displayed_besides_assessment(String assessmentList) {
	assertTrue(createCoursePage.isRemoveAssessmentsButtonDisplayed());
	assertEquals(createCoursePage.getAssessmentList(), assessmentList);
}

@When("Admin click on \\(-) Remove Assessment button")
public void admin_click_on_remove_assessment_button() {
    createCoursePage.clickRemoveAssessmentsButton();
}

@Then("{string} Assessment should be removed from Assessments list")
public void assessment_should_be_removed_from_assessments_list(String string) {
	assertFalse(createCoursePage.isRemoveAssessmentsButtonDisplayed());
}

@When("Admin confirm that Create Course button is enabled")
public void admin_confirm_that_create_course_button_is_enabled() {
	assertTrue(createCoursePage.isCreateCourseButtonEnabled());
}

@Then("Create Course button should be enabled")
public void create_course_button_should_be_enabled() {
	assertTrue(createCoursePage.isCreateCourseButtonEnabled());
}

@When("Admin click on Create Course button")
public void admin_click_on_create_course_button() {
    createCoursePage.clickCreateCourseButton();
}

@Then("Pop-up window should be displayed with text {string}")
public void pop_up_window_should_be_displayed_with_text(String successText) {
    assertEquals(createCoursePage.getPopupSuccessText(), successText);
}

@When("Admin confirm that Course name is displayed as {string}")
public void admin_confirm_that_course_name_is_displayed_as(String popupCourseName) {
	assertTrue(createCoursePage.isPopupCourseNameTextDisplayed());
}

@Then("Course name should be displayed as {string}")
public void course_name_should_be_displayed_as(String popupCourseName) {
	assertEquals(createCoursePage.getPopupCourseNameText(), popupCourseName);
}

@When("Admin confirm that Course Owner is displayed as {string}")
public void admin_confirm_that_course_owner_is_displayed_as(String popupCourseOwner) {
	assertTrue(createCoursePage.isPopupCourseOwnerTextDisplayed());
}

@Then("Course Owner should be displayed as {string}")
public void course_owner_should_be_displayed_as(String popupCourseOwner) {
	assertEquals(createCoursePage.getPopupCourseOwnerText(), popupCourseOwner);
}

@When("Admin confirm that Duration is displayed as {string}")
public void admin_confirm_that_duration_is_displayed_as(String popupDuration) {
	assertTrue(createCoursePage.isPopupDurationTextDisplayed());
}

@Then("Duration should be displayed as {string}")
public void duration_should_be_displayed_as(String popupDuration) {
	assertEquals(createCoursePage.getPopupDurationText(), popupDuration);
}

@When("Aadmin confirm that Assessments is displayed as {string}")
public void aadmin_confirm_that_assessments_is_displayed_as(String popupAssessments) {
	assertTrue(createCoursePage.isPopupAssessmentsTextDisplayed());
}

@Then("Assessments should be displayed as {string}")
public void assessments_should_be_displayed_as(String popupAssessments) {
	assertEquals(createCoursePage.getPopupAssessmentsText(), popupAssessments);
}

@When("Admin confirm that Region is displayed as {string}")
public void admin_confirm_that_region_is_displayed_as(String popupRegions) {
	assertTrue(createCoursePage.isPopupRegionTextDisplayed());
}

@Then("Region should be displayed as {string}")
public void region_should_be_displayed_as(String popupRegions) {
	assertEquals(createCoursePage.getPopupRegionText(), popupRegions);
}

@When("Admin confirm that Course Description is displayed as {string}")
public void admin_confirm_that_course_description_is_displayed_as(String popupCourseDescription) {
	assertTrue(createCoursePage.isPopupCourseDescriptionTextDisplayed());
}

@Then("Course Description should be displayed as {string}")
public void course_description_should_be_displayed_as(String popupCourseDescription) {
	assertEquals(createCoursePage.getPopupCourseDescriptionText(), popupCourseDescription);
}

@When("Admin click on \\(x) close button")
public void admin_click_on_x_close_button() {
    createCoursePage.clickClosePopupButton();
}

@Then("Pop-up window should be closed")
public void pop_up_window_should_be_closed() {
    assertFalse(createCoursePage.isClosePopupButtonDisplayed());
}

@When("Admin confirm that Ok button is inside the pop-up window as enabled")
public void admin_confirm_that_ok_button_is_inside_the_pop_up_window_as_enabled() {
    assertTrue(createCoursePage.isOkButtonDisplayed());
}

@Then("Ok button should be inside the pop-up window as enabled")
public void ok_button_should_be_inside_the_pop_up_window_as_enabled() {
	 assertTrue(createCoursePage.isOkButtonEnabled());
}

@When("Admin click on Create another course button")
public void admin_click_on_create_another_course_button() {
    createCoursePage.clickCreateAnotherCourseButton();
}

@Then("Admin should be redirect to Create Course page")
public void admin_should_be_redirect_to_create_course_page() {
	assertFalse(createCoursePage.isCreateAnotherCourseButtonDisplayed());
	assertTrue(createCoursePage.isPageTitleDisplayed());
}

}
