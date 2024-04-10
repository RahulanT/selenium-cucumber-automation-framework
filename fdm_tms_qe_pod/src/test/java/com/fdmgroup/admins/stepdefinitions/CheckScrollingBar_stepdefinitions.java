package com.fdmgroup.admins.stepdefinitions;

import com.fdmgroup.admins.pages.CalendarPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CheckScrollingBar_stepdefinitions {
	CalendarPage calendarPage = new CalendarPage();
	
	@Given("Admin is on the calendar page")
	public void admin_is_on_the_calendar_page() {
		calendarPage.driverGet(ConfigurationReader.getProperty("admins","calendarViewpageURL"));
	}

	@When("I move scroll bar from top to bottom")
	public void i_move_scroll_bar_from_top_to_bottom() {
		calendarPage.scrollScrollBar(5000);
		
	}

	@Then("It should be movable")
	public void it_should_be_movable() {
		 throw new PendingException("Step is pending");
	}

	@Then("It should be movable and header should be locked")
	public void it_should_be_movable_and_header_should_be_locked() {
		throw new PendingException("Step is pending");
	}




}
