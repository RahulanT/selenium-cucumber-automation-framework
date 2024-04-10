package com.fdmgroup.academyusers.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.academyusers.pages.ForgotPasswordPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPassword_stepdefinitions {
	ForgotPasswordPage forgotPasswordFeaturePage = new ForgotPasswordPage();

	@Given("User is naviated to login page")
	public void user_is_naviated_to_login_page() {
		forgotPasswordFeaturePage.driverGet(ConfigurationReader.getProperty("academyusers", "loginPageURL"));

	}

	@When("I click on forgot password link")
	public void i_click_on_forgot_password_link() {
		forgotPasswordFeaturePage.clickLinkForgotPasswordPage();
	}

	@Then("It should redirect to forgot password page")
	public void it_should_redirect_to_forgot_password_page() {
		assertEquals(ConfigurationReader.getProperty("academyusers", "forgotPasswordHomePageTMS"),
				forgotPasswordFeaturePage.getTxtForgotPasswordHomePage());

	}

	@Then("I click on Enter FDM Email address")
	public void i_click_on_enter_fdm_email_address1() {
		assertTrue(forgotPasswordFeaturePage.clickFieldEmailAddress());

	}

	@Then("it should be clickable and viewable")
	public void it_should_be_clickable_and_viewable() {
		assertTrue(forgotPasswordFeaturePage.clickFieldEmailAddressIsEnable());

	}

	@Then("it should accept text")
	public void it_should_accept_text() throws InterruptedException {
		assertTrue(forgotPasswordFeaturePage.sendFieldEmailAddress());

	}

	@Then("I click on Confirm FDM Email address")
	public void i_click_on_confirm_fdm_email_address1() {
		assertTrue(forgotPasswordFeaturePage.clickFieldConfirmEmailAddress());

	}

	@Then("I click on request new password button")
	public void i_click_on_request_new_password_button1() {
		assertTrue(forgotPasswordFeaturePage.clickBtnReqNewPassword());

	}

	@Then("it should be clickable")
	public void it_should_be_clickable() {
		assertTrue(forgotPasswordFeaturePage.clickBtnReqNewPasswordIsEnable());
	}

	@Then("I click on back to login button")
	public void i_click_on_back_to_login_button() {
		assertTrue(forgotPasswordFeaturePage.clickBtnBackToLogin());

	}

	@Then("it should redirect to login page")
	public void it_should_redirect_to_login_page() {
		assertEquals(ConfigurationReader.getProperty("academyusers", "titleHomePageTMS"),
				forgotPasswordFeaturePage.getTxtTitleHomePage());
	}

	@Then("I click on Enter FDM email address")
	public void i_click_on_enter_fdm_email_address() {
		assertTrue(forgotPasswordFeaturePage.clickFieldEmailAddress());
	}

	@Then("I write the email address that's not end with @fdmgroup.com")
	public void i_write_the_email_address_that_s_not_end_with_fdmgroup_com() throws InterruptedException {

		forgotPasswordFeaturePage.sendFieldEmailAddress();
		forgotPasswordFeaturePage.clickFieldConfirmEmailAddress();

	}

	@Then("it should give the error")
	public void it_should_give_the_error() {
		assertEquals(ConfigurationReader.getProperty("academyusers", "errorMessage"),
				forgotPasswordFeaturePage.getTxtErrorMessage());
	}

	@Then("I enter FDM email address")
	public void i_enter_fdm_email_address() throws InterruptedException, Exception {
		assertTrue(forgotPasswordFeaturePage.sendValidConfirmEmailAddress());
	}

	@Then("I enter Confirm FDM email address")
	public void i_enter_confirm_fdm_email_address() throws InterruptedException, Exception {
		assertTrue(forgotPasswordFeaturePage.sendValidFieldEmailAddress());
	}

	@Then("both fields should match")
	public void both_fields_should_match() {
		assertEquals(forgotPasswordFeaturePage.getFieldEmailInput(),
				forgotPasswordFeaturePage.getConfirmFieldEmailInput());
	}

	@Then("I write the email address")
	public void i_write_the_email_address() {
		assertTrue(forgotPasswordFeaturePage.sendValidFieldEmailAddress());
	}

	@Then("I click on Confirm FDM email address")
	public void i_click_on_confirm_fdm_email_address() {
		assertTrue(forgotPasswordFeaturePage.clickFieldConfirmEmailAddress());

	}

	@Then("I write the email address different than first field")
	public void i_write_the_email_address_different_than_first_field() {
		assertTrue(forgotPasswordFeaturePage.sendFieldEmailAddress());
	}

	@Then("It should give the error ‘The entered email does not match’")
	public void it_should_give_the_error_the_entered_email_does_not_match() {
		assertTrue(forgotPasswordFeaturePage.sendFieldEmailAddress());
	}

	@Then("I enter valid Confirm FDM email address")
	public void i_enter_valid_confirm_fdm_email_address() throws Exception {
		assertTrue(forgotPasswordFeaturePage.sendValidConfirmEmailAddress());
	}

	@Then("I enter valid FDM email address")
	public void i_enter_valid_fdm_email_address() throws Exception {
		assertTrue(forgotPasswordFeaturePage.sendValidFieldEmailAddress());

	}

	@Then("I click on Request new password button")
	public void i_click_on_request_new_password_button() {
		assertTrue(forgotPasswordFeaturePage.clickBtnReqNewPassword());
	}

	@Then("it should be clickable and should display confirmation message Password reset request submited")
	public void it_should_be_clickable_and_should_display_confirmation_message_password_reset_request_submited() {
		assertTrue(forgotPasswordFeaturePage.isClickableBtnReqNewPassword());
	}

}
