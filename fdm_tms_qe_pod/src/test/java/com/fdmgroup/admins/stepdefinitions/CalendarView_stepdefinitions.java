package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarView_stepdefinitions {
	
	CalendarPage calendar = new CalendarPage();
	
	
	@When("Admin clicks on calendar button on the Nav bar")
	public void admin_clicks_on_calendar_button_on_the_nav_bar() {
		//calendar.driverGet(ConfigurationReader.getProperty("admins","calendarViewpageURL"));
		String day = calendar.calendarbutton();
		String expectedDay = ConfigurationReader.getProperty("admins","currentDate");
	    assertEquals(expectedDay, day);
		
	}

	@Then("Admin clicks on filter button on the right top corner")
	public void admin_clicks_on_filter_button_on_the_right_top_corner() {
	    calendar.clickFilterButton();
	}

	@Then("Admin clicks on left navigator button on the center corner button")
	public void admin_clicks_on_left_navigator_button_on_the_center_corner_button() {
		String leftWeek = calendar.clickLeftNavigator();
		String expectedWeek = ConfigurationReader.getProperty("admins","lastWeek");
	    assertEquals(expectedWeek, leftWeek);
		
	    
	}

	@Then("Admin clicks on right navigator button on the center corner button")
	public void admin_clicks_on_right_navigator_button_on_the_center_corner_button() {
		String rightWeek = calendar.clickRightNavigator();
		String expectedWeek = ConfigurationReader.getProperty("admins","currentWeek");
	    assertEquals(expectedWeek, rightWeek);
		
	}

	@Then("Admin is on calendar page")
	public void admin_is_on_calendar_page() {
		String date = calendar.calendarVerification();
		String expectedDay = ConfigurationReader.getProperty("admins","currentDate");
	    assertEquals(expectedDay, date);
	    
	}

	@Then("Admin clicks on One week button on right top corner")
	public void admin_clicks_on_one_week_button_on_right_top_corner() {
	   calendar.clickWeekButton();
	}
}
