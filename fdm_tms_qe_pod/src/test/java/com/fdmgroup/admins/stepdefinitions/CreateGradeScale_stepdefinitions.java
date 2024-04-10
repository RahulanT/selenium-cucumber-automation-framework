package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.academyusers.pages.ProfileCardPage;
import com.fdmgroup.admins.pages.AdminHomePage;
import com.fdmgroup.admins.pages.CreateGradeScalePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateGradeScale_stepdefinitions {
	
CreateGradeScalePage creategradescalepage = new CreateGradeScalePage();
ProfileCardPage profileCardPage = new ProfileCardPage();
AdminHomePage adminHomePage = new AdminHomePage();

@When("User is logged in as an Admin and navigate to Create Grade Scale Page")
public void user_is_logged_in_as_an_admin_and_navigate_to_create_grade_scale_page() {
	profileCardPage.clickOnAdminOnNavBar();
	adminHomePage.clickCreateGradeScale();
}

@When("Admin inputs the Grade Scale Name {string}")
public void admin_inputs_the_grade_scale_name(String string) {
   
	creategradescalepage.setGradeScaleName(string);
	
}

@When("Admin inputs the Max Points {string} for the Grade Scale")
public void admin_inputs_the_max_points_for_the_grade_scale(String string) {
	creategradescalepage.setMaxPointsValue(string);
}

@When("Admin inputs the Pass Mark {string} for the Grade Scale as a value")
public void admin_inputs_the_pass_mark_for_the_grade_scale_as_a_value(String string) {
	creategradescalepage.setPassMarkValue(string);
}

@When("Admin selects the Region {string} for the Grade Scale")
public void admin_selects_the_region_for_the_grade_scale(String string) {
	creategradescalepage.selectRegionDropdown(string);
}

@When("Admin selects the Status {string} for the Grade Scale")
public void admin_selects_the_status_for_the_grade_scale(String string) {
	creategradescalepage.selectStatusDropdown(string);
}

@Then("The create grade scale submit button should be clickable")
public void the_create_grade_scale_submit_button_should_be_clickable() {
	assertTrue(creategradescalepage.isEnabledGradeScaleSubmit());
}

@When("Admin clicks Create Grade Scale submit button")
public void admin_clicks_create_grade_scale_submit_button() {
	creategradescalepage.clickGradeScaleSubmit();
}

@Then("Grade Scale created popup window should appear")
public void grade_scale_created_popup_window_should_appear() {
	assertTrue(creategradescalepage.isDisplayedGradeScaleCreationPopup());
}

@Then("Grade Scale form fields Distinction and Merit should be autopopulated")
public void grade_scale_form_fields_distinction_and_merit_should_be_autopopulated() {
	
	assertFalse( creategradescalepage.meritFieldIsFilled() && creategradescalepage.distinctionFieldIsFilled());
}

@Then("Grade Scale form Distinction Pass and Merit Percentage fields should be autopopulated")
public void grade_scale_form_distinction_pass_and_merit_percentage_fields_should_be_autopopulated() {
	assertTrue( creategradescalepage.percentageFieldIsPopulated());

}

@When("Admin changes {string} numerical grade value to {string}")
public void admin_changes_numerical_grade_value_to(String fieldName, String fieldValue) {
	creategradescalepage.changeNumericalGradeValue(fieldName , fieldValue);
}

@Then("The percentage field {string} changes to {string}")
public void the_percentage_field_changes_to(String fieldName, String fieldValue) {
	System.out.println("Percentage field : " + creategradescalepage.getPercentageField(fieldName));
	assertEquals(creategradescalepage.getPercentageField(fieldName) , fieldValue);
}

@When("Admin changes {string} percentage grade value to {string}")
public void admin_changes_percentage_grade_value_to(String fieldName, String fieldValue) {
	creategradescalepage.changePercentageGradeValue(fieldName , fieldValue);

}

@Then("The grade field {string} changes to {string}")
public void the_grade_field_changes_to(String fieldName, String fieldValue) {
	System.out.println("Grade field : " + creategradescalepage.getGradeValueField(fieldName));
	assertEquals(creategradescalepage.getGradeValueField(fieldName) , fieldValue);
}


}
