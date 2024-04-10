package com.fdmgroup.academyusers.stepdefinitions;

import com.fdmgroup.academyusers.pages.LogOutFormPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogOutForm_stepdefinitions {
	LogOutFormPage logOutFormPage = new LogOutFormPage();

	@Given("Admin is on calendar view to check log out button")
	public void admin_is_on_calendar_view_to_check_log_out_button() throws InterruptedException {
		logOutFormPage.navigateToUrl(ConfigurationReader.getProperty("config", "indexPageURL"));
		logOutFormPage.setUsername(ConfigurationReader.getProperty("config", "courseOwnerUserName"));
		logOutFormPage.setPassword(ConfigurationReader.getProperty("config", "courseOwnerPassword"));
		// Thread.sleep(4000);
		logOutFormPage.clickOnLoginButton();
	}

	@When("Click on sign out option")
	public void click_on_sign_out_option() throws InterruptedException {
		Thread.sleep(4000);
		logOutFormPage.clickOnProfile();
	}

	@Then("it should be clicked the sign out")
	public void it_should_be_clicked_the_sign_out() {
		logOutFormPage.clickLogOut();
	}

	/*@Then("Test that clicking on sign out button will redirect to sign in page")
	public void test_that_clicking_on_sign_out_button_will_redirect_to_sign_in_page() {

	}*/

}
