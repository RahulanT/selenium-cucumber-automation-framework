package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.DateFormatPage;
import com.fdmgroup.admins.pages.EditTraineesProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DateFormat_stepdefinitions {
	EditTraineesProfilePage editTraineesProfilePage = new EditTraineesProfilePage();
	DateFormatPage dateFormatPage=new DateFormatPage();
	@Given("The user is logged in as an Academy admin in the TMS and navigate to view trainees profile card page")
	public void the_user_is_logged_in_as_an_academy_admin_in_the_tms_and_navigate_to_view_trainees_profile_card_page() {
		editTraineesProfilePage.adminTabClick();
		editTraineesProfilePage.importTraineesClick();
	}

	@Then("Admin should be able to see date in the  format “Day-Mon-Year”")
	public void admin_should_be_able_to_see_date_in_the_format_day_mon_year() {
		String ActualDateText=dateFormatPage.getDateText();
		String expectedDateFormat = "\\b\\d{2}-[a-zA-Z]{3}-\\d{4}\\b";
	   assertTrue(ActualDateText.matches(expectedDateFormat));
	}
}
