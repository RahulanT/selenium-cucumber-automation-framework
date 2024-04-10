package com.fdmgroup.academyusers.stepdefinitions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.academyusers.pages.AcademyDirectoryPage;
import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.academyusers.pages.ProfileCardPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BreadCrumbs_Stepdefinitions {

	HomePage homepage = new HomePage();
	ProfileCardPage profileCardPage = new ProfileCardPage();
	AcademyDirectoryPage academyDirectoryPage = new AcademyDirectoryPage();
	
	@When("Navigate to the Home Page using url")
	public void navigate_to_the_home_page() {
		homepage.driverGet(ConfigurationReader.getProperty("academyusers", "homeURL"));
	}

	@Then("User should be able to see the breadcrumbs home")
	public void user_should_be_able_to_see_the_breadcrumbs_home() {
		assertTrue(homepage.getBreadCrumbsHome());
	}
	
	@When("User clicks on breadcrumb home")
	public void user_clicks_on_home() {
		homepage.breadCrumbsHomeClick();
	}
	
	@When("User should be taken to home page")
	public void user_should_be_taken_to_home_page() {
		assertEquals(homepage.getCurrentURL(),ConfigurationReader.getProperty("academyusers", "homeURLBasic"));
	}
	
	@When("Navigate to the Profile Card from navbar")
	public void navigate_to_the_profilecard_from_navbar() throws InterruptedException {
		homepage.navbarProfilecardClick();
	}
	
	@When("Navigate to the Profile Card using URL")
	public void navigate_to_the_profilecard() throws InterruptedException {
		homepage.driverGet(ConfigurationReader.getProperty("academyusers", "profilecardURL"));
	}	
	
	@When("User should be able to see the breadcrumbs profile card")
	public void user_should_be_able_to_see_the_breadcrumbs_profilecard() {
		assertTrue(profileCardPage.getBreadCrumbsProfilecard());
	}
		
	@When("Navigate to the Academy Directory page using url")
	public void navigate_to_the_academydirectory() throws InterruptedException {
		homepage.driverGet(ConfigurationReader.getProperty("academyusers", "academyDirectoryURL"));
	}
	
	@When("Navigate to the Academy Directory page using navbar")
	public void navigate_to_the_academydirectory_using_navbar() throws InterruptedException {
		homepage.academyDirectoryClick();
	}
	
	@When("User clicks on bread crumb academy directory")
	public void user_clicks_on_academydirectory() {
		AcademyDirectoryPage.clickOnAcademyDirectoryBreadcrumb();
	}
	
	@When("User should be taken to academy directory page")
	public void user_should_be_taken_to_academydirectory() {
		assertEquals(homepage.getCurrentURL(),ConfigurationReader.getProperty("academyusers", "academyDirectoryURL"));
	}
	
}
