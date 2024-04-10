package com.fdmgroup.admins.stepdefinitions;

import org.junit.Assert;

import com.fdmgroup.admins.pages.OutOfOfficePage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OutOfOfficeBar {
	OutOfOfficePage outOfOfficePage = new OutOfOfficePage();

	@Given("Admin selected the calendar view page")
	public void admin_selected_the_calendar_view_page() {
		outOfOfficePage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
	}

	@When("Click on bar")
	public void click_on_bar() {
		outOfOfficePage.clickBar();
	}

	@Then("it should be in red color")
	public void it_should_be_in_red_color() {
		String barColor = outOfOfficePage.getOutOfOfficeBarColor();
		String expectedColor = "rgb(255, 255, 1)";
        Assert.assertEquals(expectedColor, barColor.replaceAll("\\[|\\]", ""));
	}

}
