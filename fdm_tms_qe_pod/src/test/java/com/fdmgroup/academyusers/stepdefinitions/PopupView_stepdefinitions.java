package com.fdmgroup.academyusers.stepdefinitions;

import static org.junit.Assert.assertTrue;

import com.fdmgroup.academyusers.pages.ForgotPasswordPage;
import com.fdmgroup.academyusers.pages.PopupCalendarPage;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PopupView_stepdefinitions {
	PopupCalendarPage popupPage = new PopupCalendarPage();

	@Given("User is redirected to tms calendar page")
	public void user_is_redirected_to_tms_calendar_page() throws InterruptedException {
		popupPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
		popupPage.setUsername(ConfigurationReader.getProperty("config", "adminName"));
		popupPage.setPassword(ConfigurationReader.getProperty("config", "courseOwnerPassword"));
		popupPage.clickOnLoginButton();
		popupPage.clickCalLink();
	}

	@When("I click on popup calendar button")
	public void i_click_on_popup_calendar_button() {
		popupPage.clickPopupLink();
	}

	@Then("popup calendar should appear")
	public void popup_calendar_should_appear() {
		assertTrue(popupPage.clickPopupIsEnable());
	}

	@Then("I can move forward backward in calendar")
	public void i_can_move_forward_backward_in_calendar() throws InterruptedException {
		popupPage.clickLeftIndicator();
		Thread.sleep(1000);
	}

}
