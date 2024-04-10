package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Then;

public class SingleWeekCalendarView_stepdefinitions {
	
	CalendarPage calendarPage = new CalendarPage();
	
	@Then("As a Admin, I should see One Week View by default in the left top corner button.")
	public void as_a_admin_i_should_see_one_week_view_by_default_in_the_left_top_corner_button() {
		//calendarPage.driverGet(ConfigurationReader.getProperty("admins","calendarViewpageURL"));
		int size = calendarPage.numbersOfDaysDisplayed();
		assertEquals(6, size);	
	    
	}

	@Then("As a Admin, I should see that the date displayed on center top is aligned to current date.")
	public void as_a_admin_i_should_see_that_the_date_displayed_on_center_top_is_aligned_to_current_date() {
		String day = calendarPage.calendarbutton();
		String expectedDay = ConfigurationReader.getProperty("admins","currentDate");
	    assertEquals(expectedDay, day);
	}

	@Then("Verify that as a admin, I should see that all the trainers are listed in the first column in the table")
	public void verify_that_as_a_admin_i_should_see_that_all_the_trainers_are_listed_in_the_first_column_in_the_table() {
	   String trainersname = calendarPage.trainersListVerification();
	   String expectedTrainer = ConfigurationReader.getProperty("admins","trainersName");
	   assertEquals(expectedTrainer, trainersname);
	}

	@Then("As a Admin, I should see that each date is divided further in two sections AM and PM.")
	public void as_a_admin_i_should_see_that_each_date_is_divided_further_in_two_sections_am_and_pm() {
		String AMtext = calendarPage.AMColumnVerification();
		String PMtext = calendarPage.PMColumnVerification();
	    assertEquals("AM", AMtext);
	    assertEquals("PM", PMtext);
		
	}

	@Then("As a Admin, admin clicks on One week button on right top corner")
	public void as_a_admin_admin_clicks_on_one_week_button_on_right_top_corner() {
		calendarPage.clickWeekButton();
		
	}

}
