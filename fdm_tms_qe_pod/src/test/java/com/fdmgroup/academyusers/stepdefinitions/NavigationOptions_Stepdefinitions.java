package com.fdmgroup.academyusers.stepdefinitions;

import static org.junit.Assert.assertTrue;

import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.When;

public class NavigationOptions_Stepdefinitions {
	HomePage homepage = new HomePage();
	
	@When("Navigate to the profile card page")
	public void navigate_to_the_profile_card_page() {
		homepage.driverGet(ConfigurationReader.getProperty("academyusers", "profilecardURL"));
	}

	@When("User should see the navigation options for trainee")
	public void user_should_see_the_navigation_options_for_trainee() {
		assertTrue(homepage.getProfileDisplayedOnNavigationBar());
	}

	@When("User should see the navigation options for trainer")
	public void user_should_see_the_navigation_options_for_trainer() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User should see the navigation options for Academy Admin")
	public void user_should_see_the_navigation_options_for_academy_admin() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User should see the navigation options for Academy Manager")
	public void user_should_see_the_navigation_options_for_academy_manager() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



}
