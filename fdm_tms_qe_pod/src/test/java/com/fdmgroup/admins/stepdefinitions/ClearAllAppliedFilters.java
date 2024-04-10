package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.ClearAllAppliedFilterPage;
import com.fdmgroup.admins.pages.ClearEachFilterPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClearAllAppliedFilters {

	ClearAllAppliedFilterPage clearAllFilterPage = new ClearAllAppliedFilterPage();

	@Given("Admin redirected to calendar page to check filter functions")
	public void admin_redirected_to_calendar_page_to_check_filter_functions() throws InterruptedException {

		clearAllFilterPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
		clearAllFilterPage.setUsername(ConfigurationReader.getProperty("config", "adminName"));
		clearAllFilterPage.setPassword(ConfigurationReader.getProperty("config", "courseOwnerPassword"));
		clearAllFilterPage.clickOnLoginButton();
		clearAllFilterPage.clickCalLink();
	}

	@When("click on {string} button")
	public void click_on_button(String string) {
		clearAllFilterPage.clickOnClearButton();

	}

	@Then("it should clicked clear all")
	public void it_should_clicked_clear_all() {
		assertTrue(clearAllFilterPage.clickRegionIsEnable());

	}

}
