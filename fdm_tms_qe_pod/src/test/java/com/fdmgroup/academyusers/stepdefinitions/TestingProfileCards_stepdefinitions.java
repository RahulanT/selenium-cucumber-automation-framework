package com.fdmgroup.academyusers.stepdefinitions;

import static org.junit.Assert.assertTrue;
import com.fdmgroup.academyusers.pages.ProfilePage;
import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.global.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestingProfileCards_stepdefinitions {
	LoginPage loginPage = new LoginPage();
	ProfilePage profilePage = new ProfilePage();

	@Given("User successfully logs into FDM TMS")
	public void user_successfully_logs_into_fdm_tms() throws InterruptedException {
		// User chosen is admin
		loginPage.driverGet(ConfigurationReader.getProperty("academyusers", "loginPageURL"));
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "adminEmail"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "adminPassword"));
		loginPage.clickOnLoginButton();

	}

	@When("You are on the landing page")
	public void you_are_on_the_landing_page() {
		assertTrue(profilePage.isProfileCard());
	}

	@Then("View that the profile tab is displayed on the TMS nav bar")
	public void view_that_the_profile_tab_is_displayed_on_the_tms_nav_bar() {
		assertTrue(profilePage.isProfileNavBarDisplayed());
	}

	@Then("View that the profile page content is displayed under profile tab")
	public void view_that_the_profile_page_content_is_displayed_under_profile_tab() {
		assertTrue(profilePage.isProfileCard());
	}

	@Then("View that the profile image is displayed on a white tile")
	public void view_that_the_profile_image_is_displayed_on_a_white_tile() throws InterruptedException {
		assertTrue(profilePage.isProfileImageDisplayed());
	}

	@Then("View that the profile image and relative information are displayed on a white tile")
	public void view_that_the_profile_image_and_relative_information_are_displayed_on_a_white_tile() {
		assertTrue(profilePage.isProfileCard());
	}

	@Then("Select profile picture")
	public void select_profile_picture() {
		profilePage.select();
	}

	@Then("View that it is not clickable")
	public void view_that_it_is_not_clickable() {
		profilePage.select();
	}

	@Then("Select relative information")
	public void select_relative_information() {
		profilePage.select();
	}

	@Then("Default profile picture is displayed")
	public void default_profile_picture_is_displayed() {
		assertTrue(profilePage.isProfileImageDisplayed());
	}

	@Given("Trainee successfully logs into FDM TMS")
	public void trainee_successfully_logs_into_fdm_tms() throws InterruptedException {
		loginPage.driverGet(ConfigurationReader.getProperty("academyusers", "loginPageURL"));
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "traineeEmail"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "traineePassword"));
		loginPage.clickOnLoginButton();
	}

	@Then("View that the name is displayed")
	public void view_that_the_name_is_displayed() {
		assertTrue(profilePage.isUsernameDisplayed());
	}

	@Then("View that the role is displayed")
	public void view_that_the_role_is_displayed() {
		assertTrue(profilePage.isRoleFieldDisplayed());
	}

	@Then("View that the stream is displayed")
	public void view_that_the_stream_is_displayed() {
		assertTrue(profilePage.isStreamDisplayed());
	}

	@Then("View that the ex-military field is displayed")
	public void view_that_the_ex_military_field_is_displayed() {
		assertTrue(profilePage.isExMilitaryDisplayed());
	}

	@Then("View that the accademy status is displyed")
	public void view_that_the_accademy_status_is_displyed() {
		assertTrue(profilePage.isAcademyStatusDisplayed());
	}

	@Then("View that the FDM Start Date is displayed")
	public void view_that_the_fdm_start_date_is_displayed() {
		assertTrue(profilePage.isStartDateDisplayed());
	}

	@Then("View that the signed off date is diplayed")
	public void view_that_the_signed_off_date_is_diplayed() {
		assertTrue(profilePage.isSignedOffDateDisplayed());
	}

	@Then("View that the client start date is displayed")
	public void view_that_the_client_start_date_is_displayed() {
		assertTrue(profilePage.isClientStartDateDisplayed());
	}

	@Then("View that the certifications are displayed")
	public void view_that_the_certifications_are_displayed() {
		assertTrue(profilePage.isCertificationsDisplayed());
	}

	@Given("Trainer successfully logs into FDM TMS")
	public void trainer_successfully_logs_into_fdm_tms() throws InterruptedException {
		loginPage.driverGet(ConfigurationReader.getProperty("academyusers", "loginPageURL"));
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "trainerEmail"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "trainerPassword"));
		loginPage.clickOnLoginButton();
	}

	@Then("View that the location is displayed")
	public void view_that_the_location_is_displayed() {
		assertTrue(profilePage.isLocationDisplayed());
	}

	@Then("View that the team is displayed")
	public void view_that_the_team_is_displayed() {
		assertTrue(profilePage.isTeamDisplayed());
	}

	@Then("View that the teaching courses field is displayed")
	public void view_that_the_teaching_courses_field_is_displayed() {
		assertTrue(profilePage.isTeachingCoursesDisplayed());
	}

	@Then("View that the other skills field is displayed")
	public void view_that_the_other_skills_field_is_displayed() {
		assertTrue(profilePage.isOtherSkillsDisplayed());
	}

	@Given("Academy admin successfully logs into FDM TMS")
	public void academy_admin_successfully_logs_into_fdm_tms() throws InterruptedException {
		loginPage.driverGet(ConfigurationReader.getProperty("academyusers", "loginPageURL"));
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "adminEmail"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "adminPassword"));
		loginPage.clickOnLoginButton();
	}

	@Then("View that the username is displayed")
	public void view_that_the_username_is_displayed() {
		assertTrue(profilePage.isUsernameDisplayed());
	}

	@Then("View that the academy admin area of responsibility is displayed")
	public void view_that_the_academy_admin_area_of_responsibility_is_displayed() {
		assertTrue(profilePage.isAreaOfResponsibilityDisplayed());
	}

	@Given("As an academy manager, successfully logs into FDM TMS")
	public void as_an_academy_manager_successfully_logs_into_fdm_tms() throws InterruptedException {
		loginPage.driverGet(ConfigurationReader.getProperty("academyusers", "loginPageURL"));
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "managerEmail"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "managerPassword"));
		loginPage.clickOnLoginButton();
	}

	@Then("View that the bio is displayed")
	public void view_that_the_bio_is_displayed() {
		assertTrue(profilePage.isBioDisplayed());
	}

}
