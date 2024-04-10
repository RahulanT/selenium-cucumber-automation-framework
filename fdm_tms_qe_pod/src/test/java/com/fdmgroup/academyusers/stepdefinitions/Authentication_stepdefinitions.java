package com.fdmgroup.academyusers.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.academyusers.pages.LogOutFormPage;
import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Authentication_stepdefinitions {
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	LogOutFormPage logOutFormPage = new LogOutFormPage();

	@Given("User is on tms page and checks the login button")
	public void user_is_on_tms_page_and_checks_the_login_button() {
		loginPage.navigateToUrl(ConfigurationReader.getProperty("config", "indexPageURL"));

	}

	@When("user enters correct credentials")
	public void user_enters_correct_credentials() {
		loginPage.setUsername(ConfigurationReader.getProperty("config", "courseOwnerUserName"));
		loginPage.setPassword(ConfigurationReader.getProperty("config", "courseOwnerPassword"));
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() throws InterruptedException {

		loginPage.clickOnLoginButton();
	}

	@Then("user checks logout button")
	public void user_checks_logout_button() {

		logOutFormPage.clickOnProfile();
		logOutFormPage.clickLogOut();
	}

	@When("user enters incorrect credentials")
	public void user_enters_incorrect_credentials() {
		loginPage.setUsername(ConfigurationReader.getProperty("config", "courseOwnerUserName"));
		loginPage.setPassword("5555");
	}

	@Then("authentication failed message should display")
	public void authentication_failed_message_should_display() {
		loginPage.isAuthenticationFailedMessageDisplayed();
	}
}
