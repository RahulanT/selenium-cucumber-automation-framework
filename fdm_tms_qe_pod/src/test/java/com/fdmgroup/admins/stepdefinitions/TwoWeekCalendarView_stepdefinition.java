package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TwoWeekCalendarView_stepdefinition {
	CalendarPage calendarPage = new CalendarPage();

	@When("As an Admin, click on drop down arrow of week button")
	public void as_an_admin_click_on_drop_down_arrow_of_week_button() {
		calendarPage.clickWeekDropDownArrow();
	}

	@Then("Admin should be able to see drop down list with options {string}, {string}")
	public void admin_should_be_able_to_see_drop_down_list_with_options(String one, String two) {
		String actualOneWeekText = calendarPage.getOneWeekText();
		String actualTwoWeekText = calendarPage.getTwoWeeksText();
		assertEquals(one, actualOneWeekText);
		assertEquals(two, actualTwoWeekText);
	}

	@When("As an Admin,click on one week option from the drop down list")
	public void as_an_admin_click_on_one_week_option_from_the_drop_down_list() {
		calendarPage.clickOneWeekText();
	}

	@Then("Trainers schedule for one week should be displayed")
	public void trainers_schedule_for_one_week_should_be_displayed() {
		String actualMondayText = calendarPage.getMondayText();
		String expectedMondayText = ConfigurationReader.getProperty("admins", "currentMondayText");
		assertEquals(expectedMondayText, actualMondayText);
	}

	@When("As an Admin,click on two weeks option from the drop down list")
	public void as_an_admin_click_on_two_weeks_option_from_the_drop_down_list() {
		calendarPage.clickTwoWeeksText();
	}

	@Then("Trainers schedule for two weeks should be displayed")
	public void trainers_schedule_for_two_weeks_should_be_displayed() {
		String actualMondayText = calendarPage.getMondayText();
		String expectedMondayText = ConfigurationReader.getProperty("admins", "currentMondayText");
		assertEquals(expectedMondayText, actualMondayText);

		String actualMondayText1 = calendarPage.getMonday1Text();
		String expectedMondayText1 = ConfigurationReader.getProperty("admins", "currentMondayText1");
		assertEquals(expectedMondayText1, actualMondayText1);

	}
}
