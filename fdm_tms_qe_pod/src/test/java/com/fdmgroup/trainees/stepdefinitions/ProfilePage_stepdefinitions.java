package com.fdmgroup.trainees.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.global.utilities.ConfigurationReader;
import com.fdmgroup.trainees.pages.ProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfilePage_stepdefinitions {
	private ProfilePage profilePage = new ProfilePage();

	@Given("User clicks the profile tab to navigate to the profile page")
	public void user_clicks_the_profile_tab_to_navigate_to_the_profile_page() {
		profilePage.navigateToUrl(ConfigurationReader.getProperty("config", "project_url"));
	}

	@Given("The user observes navigation bar")
	public void the_user_observes_navigation_bar() {
		assertTrue(profilePage.isNavbarDisplayed());
	}

	@Then("The user should see the profile tab with a downward chevron key")
	public void the_user_should_see_the_profile_tab_with_a_downward_chevron_key() {
		assertTrue(profilePage.isProfileTabDisplayed());
	}
	
	@Given("The user is on the profile page")
	public void the_user_is_on_the_profile_page() {
	    String currentUrl = ConfigurationReader.getProperty("config", "project_url");
	    String expectedUrl = "http://localhost:4200/profile";
	    
	    assertEquals(expectedUrl, currentUrl);
	}

	@Given("The user clicks the dropdown arrow")
	public void the_use_clicks_the_dropdown_arrow() throws InterruptedException {
	    profilePage.clickDropdownArrow();
	}

	@Then("The first option displayed at the top is {string} and chevron key is pointing upwards")
	public void the_first_option_displayed_at_the_top_is_and_chevron_key_is_pointing_upwards(String string) {
		assertTrue(profilePage.isViewResultsAndFeedbackDisplayed());
	}
	
	@When("The user hovers over {string} option")
	public void the_user_hovers_over_option(String string) throws InterruptedException {
	    profilePage.hoverOverViewResultsAndFeedback();
	}

	@Then("The first option displayed at the top is {string}")
	public void the_first_option_displayed_at_the_top_is(String string) {
		profilePage.verifyFirstOption();
	}

	@Then("The option {string} is highlighted in light blue on hover")
	public void the_option_is_highlighted_in_light_blue_on_hover(String string) throws InterruptedException {
		profilePage.verifyHighlightColor();
	}
	
	@When("The user selects {string} option")
	public void the_user_selects_option(String string) throws InterruptedException {
		profilePage.clickViewResultsAndFeedback();
	}

	@Then("the text turns into bold and the highlight is dark blue")
	public void the_text_turns_into_bold_and_the_highlight_is_dark_blue() throws InterruptedException {
	    profilePage.verifyBoldAndBlueHighlightText();
	}
}
