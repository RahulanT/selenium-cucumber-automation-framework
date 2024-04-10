package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.ClearEachFilterPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClearEachFilter {
	ClearEachFilterPage clearEachFilterPage = new ClearEachFilterPage();

	@Given("Admin selected the calendar page view")
	public void admin_selected_the_calendar_page_view() {
		clearEachFilterPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));

	}

	@When("Click on region")
	public void click_on_region() {
		clearEachFilterPage.clickRegion();
	}

	@Then("check that clear all is available for region")
	public void check_that_clear_all_is_available_for_region() {
		clearEachFilterPage.clickEraser();
	}

	@When("Click on pathway")
	public void click_on_pathway() {
		clearEachFilterPage.clickPathway();
	}

	@Then("check that clear all is available for pathway")
	public void check_that_clear_all_is_available_for_pathway() {
		clearEachFilterPage.clickEraserPathway();

	}

	@When("Click on course")
	public void click_on_course1() {
		clearEachFilterPage.clickCourse();
	}

	@Then("check that clear all is available for course")
	public void check_that_clear_all_is_available_for_course() {
		clearEachFilterPage.clickCourse();

	}

	@Then("it should clicked region")
	public void it_should_clicked_region() {
		assertTrue(clearEachFilterPage.clickRegionIsEnable());

	}

	@Then("check that clear all button is available for region")
	public void check_that_clear_all_button_is_available_for_region() {
		clearEachFilterPage.clickEraser();
	}

	@Then("Click on BAPM")
	public void click_on_BAPM() {
		clearEachFilterPage.clickBAPM();
	}

	@Then("check that clicking on clear all button will reset the filter")
	public void check_that_clicking_on_clear_all_button_will_reset_the_filter() {
		clearEachFilterPage.clickEraserPathway();
	}

	@When("click on course")
	public void click_on_course() {
		clearEachFilterPage.clickCourse();
	}

	@Then("Click on AEM course")
	public void click_on_AEM_course() {
		clearEachFilterPage.clickAEM();
	}

	@Then("check that clear on filter for course doesn't affect others")
	public void check_that_clear_on_filter_for_course_doesn_t_affect_others() {
		clearEachFilterPage.clickEraserCourse();
	}

}
