package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarFunctionality_stepdefinitions {
	
	CalendarPage calendarPage =new CalendarPage();
	
	@Given("Admin can login with valid credentials and is on Training Management System Page.")
	public void admin_can_login_with_valid_credentials_and_is_on_training_management_system_page() {
		calendarPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
		
	}

	@When("Admin click on the calendar button on the navigation bar.")
	public void admin_click_on_the_calendar_button_on_the_navigation_bar() {
		calendarPage.calendarButtonClick();
	}

	@Then("TMS calendar view should be displayed.")
	public void tms_calendar_view_should_be_displayed() {

		String currentDay=calendarPage.calendarDay();
		String expectedDay=ConfigurationReader.getProperty("admins", "currentDateFun");
		assertEquals(expectedDay,currentDay);
		
	}

	@When("Admin click on the forward arrow button to the right of the calendar date range, under the navigation bar.")
	public void admin_click_on_the_forward_arrow_button_to_the_right_of_the_calendar_date_range_under_the_navigation_bar() {
		calendarPage.btnForwardClick();
	}

	@Then("Forward arrow button should be clicked.")
	public void forward_arrow_button_should_be_clicked() {
		String currentAMPMDateForMondayWhenForwardBtnClicked=calendarPage.txtforwardAmPmDateForMonday();
	    String expectedAMPMDateForMondayWhenForwardBtnClicked=ConfigurationReader.getProperty("admins", "forwardAmPmDateMonday");
	    assertEquals(expectedAMPMDateForMondayWhenForwardBtnClicked,currentAMPMDateForMondayWhenForwardBtnClicked);
	}

	@When("Admin verify the calendar view is shifted to next week")
	public void admin_verify_the_calendar_view_is_shifted_to_next_week() {
	    String currentWeekOfForwardButton=calendarPage.dateForwardButtonClickGetText();
	    String expectedWeekOfForwardButton=ConfigurationReader.getProperty("admins", "forwardWeek");
	    assertEquals(expectedWeekOfForwardButton,currentWeekOfForwardButton);
	}

	

	@Then("Calendar date range should display next week's dates.")
	public void calendar_date_range_should_display_next_week_s_dates() {
		String currentAMPMDateForMondayWhenForwardBtnClicked=calendarPage.txtforwardAmPmDateForMonday();
	    String expectedAMPMDateForMondayWhenForwardBtnClicked=ConfigurationReader.getProperty("admins", "forwardAmPmDateMonday");
	    assertEquals(expectedAMPMDateForMondayWhenForwardBtnClicked,currentAMPMDateForMondayWhenForwardBtnClicked);
	}

	@When("Admin click on the back arrow button to the left of the calendar date range, under the navigation bar.")
	public void admin_click_on_the_back_arrow_button_to_the_left_of_the_calendar_date_range_under_the_navigation_bar() {
		calendarPage.btnBackwardClick();
	}

	@Then("Back arrow button should be clicked.")
	public void back_arrow_button_should_be_clicked() {
		String currentAMPMDateForMondayWhenBackwardBtnClicked=calendarPage.txtbackwardAmPmDateForMonday();
	    String expectedAMPMDateForMondayWhenBackwardBtnClicked=ConfigurationReader.getProperty("admins", "backwardAmPmDateMonday");
	    assertEquals(expectedAMPMDateForMondayWhenBackwardBtnClicked,currentAMPMDateForMondayWhenBackwardBtnClicked);
	    
	}

	@When("Admin verify the calendar view is shifted to the previous week's")
	public void admin_verify_the_calendar_view_is_shifted_to_the_previous_week_s() {
		String currentWeekOfBackwardButon=calendarPage.dateBackwardButtonClickGetText();
	    String expectedWeekOfBackwardButton=ConfigurationReader.getProperty("admins", "backwardWeek");
	    assertEquals(expectedWeekOfBackwardButton,currentWeekOfBackwardButon);
	}


	@Then("Calendar date range should display the previous week's dates.")
	public void calendar_date_range_should_display_the_previous_week_s_dates() {
		String currentAMPMDateForMondayWhenBackwardBtnClicked=calendarPage.txtbackwardAmPmDateForMonday();
	    String expectedAMPMDateForMondayWhenBackwardBtnClicked=ConfigurationReader.getProperty("admins", "backwardAmPmDateMonday");
	    assertEquals(expectedAMPMDateForMondayWhenBackwardBtnClicked,currentAMPMDateForMondayWhenBackwardBtnClicked);
	}

	
	@Then("Dates below the days of the week and above the AM\\/PM sloths should display next week's dates.")
	public void dates_below_the_days_of_the_week_and_above_the_am_pm_sloths_should_display_next_week_s_dates() {
		String currentAMPMDateForMondayWhenForwardBtnClicked=calendarPage.txtforwardAmPmDateForMonday();
	    String expectedAMPMDateForMondayWhenForwardBtnClicked=ConfigurationReader.getProperty("admins", "forwardAmPmDateMonday");
	    assertEquals(expectedAMPMDateForMondayWhenForwardBtnClicked,currentAMPMDateForMondayWhenForwardBtnClicked);
	    
		String currentAMPMDateForFridayWhenForwardBtnClicked=calendarPage.txtforwardAmPmDateForFriday();
	    String expectedAMPMDateForFridayWhenForwardBtnClicked=ConfigurationReader.getProperty("admins", "forwardAmPmDateFriday");
	    assertEquals(expectedAMPMDateForFridayWhenForwardBtnClicked,currentAMPMDateForFridayWhenForwardBtnClicked);
	}

	

	@Then("Dates below the days of the week and above the AM\\/PM sloths should display the previous week's dates.")
	public void dates_below_the_days_of_the_week_and_above_the_am_pm_sloths_should_display_the_previous_week_s_dates() {
		String currentAMPMDateForMondayWhenBackwardBtnClicked=calendarPage.txtbackwardAmPmDateForMonday();
	    String expectedAMPMDateForMondayWhenBackwardBtnClicked=ConfigurationReader.getProperty("admins", "backwardAmPmDateMonday");
	    assertEquals(expectedAMPMDateForMondayWhenBackwardBtnClicked,currentAMPMDateForMondayWhenBackwardBtnClicked);
	    
		String currentAMPMDateForFridayWhenBackwardBtnClicked=calendarPage.txtbackwardAmPmDateForFriday();
	    String expectedAMPMDateForFridayWhenBackwardBtnClicked=ConfigurationReader.getProperty("admins", "backwardAmPmDateFriday");
	    assertEquals(expectedAMPMDateForFridayWhenBackwardBtnClicked,currentAMPMDateForFridayWhenBackwardBtnClicked);
	}
	

}
