package com.fdmgroup.admins.stepdefinitions;

import com.fdmgroup.admins.pages.PreviewAssessmentPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreviewAssessments {

	PreviewAssessmentPage previewAssessmentPage = new PreviewAssessmentPage();

	@Given("User logged in using valid credentials")
	public void user_logged_in_using_valid_credentials() throws InterruptedException {
		previewAssessmentPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
		previewAssessmentPage.sendUsername();
		previewAssessmentPage.sendPassword();
		previewAssessmentPage.clickOnLoginButton();

	}

	@When("I click on admin link")
	public void i_click_on_admin_link() throws InterruptedException {
		previewAssessmentPage.clickOnAdminButton();
	}

	@Then("I click on view assessment link")
	public void i_click_on_view_assessment_link() {
		previewAssessmentPage.clickViewAssessmentLink();
	}

	@Then("I click on create assessment button")
	public void i_click_on_create_assessment_button() {
		previewAssessmentPage.clickCreateAssessmentLink();
	}

	@Then("check that preview button is available")
	public void check_that_preview_button_is_available() {
		previewAssessmentPage.clickPreview();
	}

	@Then("check that close button is working")
	public void check_that_close_button_is_working() {
		previewAssessmentPage.clickCancelPreview();
	}

}
