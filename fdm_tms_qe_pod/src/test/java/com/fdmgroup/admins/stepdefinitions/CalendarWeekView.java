package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.WeekViewPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarWeekView {
	WeekViewPage weekViewPage = new WeekViewPage();

	@Given("Admin selected the calendar page view	for checking week view")
	public void admin_selected_the_calendar_page_view_for_checking_week_view() {
		weekViewPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));

	}

	@When("Click on {int} week button")
	public void click_on_week_button(Integer int1) {
		weekViewPage.clickDropDown();
		weekViewPage.clickthreeWeek();
	}

	@Then("{int} week should be clicked")
	public void week_should_be_clicked(Integer int1) {
		assertEquals(ConfigurationReader.getProperty("admins", "tabName"), weekViewPage.getThreeWeek());

	}

	@When("Click on {int} week view button")
	public void click_on_week_view_button(Integer int1) {
		weekViewPage.clickDropDown();
		weekViewPage.clickfourWeek();
	}

	@Then("{int} week view should be clicked")
	public void week_view_should_be_clicked(Integer int1) {
		assertEquals(ConfigurationReader.getProperty("admins", "taName"), weekViewPage.getFourWeek());

	}

	@Then("Check that calendar view changes to {int} week view")
	public void check_that_calendar_view_changes_to_week_view(Integer int1) {

	}

}
