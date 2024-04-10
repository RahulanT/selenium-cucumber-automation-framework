package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;

import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.admins.pages.DisplaySkillsPage;
import com.fdmgroup.admins.pages.ImportTraineePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DisplaySkills_stepdefinitions {

	DisplaySkillsPage displaySkillsPage = new DisplaySkillsPage();

	@When("user clicks the login btn")
	public void user_clicks_the_login_btn() throws InterruptedException {
		displaySkillsPage.clickLogin();
	}

	@Given("The user is logged in as an Academy admin in the TMS")
	public void the_user_is_logged_in_as_an_academy_admin_in_the_tms() {
		displaySkillsPage.clickAdminLink();
		displaySkillsPage.clickImportTraineesLink();
		displaySkillsPage.clickJJhonnyTrainee();
	}

	@When("As an admin, test that sorting skills is working properly")
	public void as_an_admin_test_that_sorting_skills_is_working_properly() throws InterruptedException {
		displaySkillsPage.scrollToSkills();
		displaySkillsPage.skillsLinkClick();
	}

	@Then("It should work")
	public void it_should_work() {
		assertEquals(displaySkillsPage.agileSkillText(), "Agile");
	}
}
