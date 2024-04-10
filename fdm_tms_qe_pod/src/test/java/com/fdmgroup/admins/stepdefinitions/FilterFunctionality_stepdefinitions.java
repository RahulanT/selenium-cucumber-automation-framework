package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Assert;

import com.fdmgroup.admins.pages.FilterFunctionalityPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

public class FilterFunctionality_stepdefinitions {
	private Response response;
	FilterFunctionalityPage filterFunctionalityPage = new FilterFunctionalityPage();

	@Given("Admin selected calendar page")
	public void admin_selected_calendar_page() {
		filterFunctionalityPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
	}

	@When("I click on region, pathway and course")
	public void i_click_on_region_pathway_and_course() {
		filterFunctionalityPage.clickAllFilter();
	}

	@Then("Filter options should be selected.")
	public void filter_options_should_be_selected() {
		assertTrue(filterFunctionalityPage.clickRegionIsEnable());
	}

	@When("I click on the Region filter button on the top left of the screen.")
	public void i_click_on_the_region_filter_button_on_the_top_left_of_the_screen() {
		filterFunctionalityPage.clickRegion();
	}

	@Then("Region filter button clicked.")
	public void region_filter_button_clicked() {
		assertTrue(filterFunctionalityPage.clickRegionIsEnable());
	}

	@Then("Verify {int} options are available to be selected in the Region multi-select list.")
	public void verify_options_are_available_to_be_selected_in_the_region_multi_select_list(Integer int1) {
		filterFunctionalityPage.clickRegionDropdown();
	}

	@Then("{int} options are available to be selected in the Region multi-select list.")
	public void options_are_available_to_be_selected_in_the_region_multi_select_list(Integer int1) {
		assertTrue(filterFunctionalityPage.clickFirstRegionIsEnable());
	}

	@Then("Select {string} for the Region filter.")
	public void select_for_the_region_filter1(String string) {
		filterFunctionalityPage.clickRegionThirdOpt();
		filterFunctionalityPage.clickRegionThirdOpt();
	}

	@Then("North America selected for Region filter.")
	public void north_america_selected_for_region_filter() {
		assertTrue(filterFunctionalityPage.clickThirdRegionIsEnable());
	}

	@When("I click on the Pathway filter button on the top left of the screen.")
	public void i_click_on_the_pathway_filter_button_on_the_top_left_of_the_screen() {
		filterFunctionalityPage.clickPathway();
	}

	@Then("Pathway filter button should be clicked.")
	public void pathway_filter_button_should_be_clicked() {
		// filterFunctionalityPage.clickPathway();
		assertTrue(filterFunctionalityPage.clickPathwayIsEnable());
	}

	@Then("Verify the {int} options are available to be selected in the Pathway multi-select list.")
	public void verify_the_options_are_available_to_be_selected_in_the_pathway_multi_select_list(Integer int1) {
		filterFunctionalityPage.clickPathwayDropdown();
		// assertTrue(filterFunctionalityPage.clickPathwayIsEnable());
	}

	@Then("Java Development, Cloud Computing and BAPM options are available to be selected in the Pathway multi-select list.")
	public void java_development_cloud_computing_and_bapm_options_are_available_to_be_selected_in_the_pathway_multi_select_list() {
		assertTrue(filterFunctionalityPage.clickFirstPathwayIsEnable());
	}

	@Then("Select {string} for the Pathway filter.")
	public void select_for_the_pathway_filter1(String string) {
		filterFunctionalityPage.clickPathwayThirdOpt();
		filterFunctionalityPage.clickPathwayThirdOpt();
	}

	@Then("Verify calendar filtered only Java pathway trainers for view.")
	public void verify_calendar_filtered_only_java_pathway_trainers_for_view() {
		assertTrue(filterFunctionalityPage.clickThirdPathwayIsSelected());
	}

	@When("I click on the Course filter button on the top left of the screen.")
	public void i_click_on_the_course_filter_button_on_the_top_left_of_the_screen() {
		filterFunctionalityPage.clickCourse();
	}

	@Then("select {string} for the Course filter.")
	public void select_for_the_course_filter(String string) {
		filterFunctionalityPage.clickCourseFirstOpt();
	}

	@Then("verify only AEM course trainers are shown on calendar.")
	public void verify_only_excel_course_trainers_are_shown_on_calendar() {
		assertTrue(filterFunctionalityPage.clickFirstCourseIsSelected());
	}

	@Then("select {string} for the Region filter.")
	public void select_for_the_region_filter(String string) {
		filterFunctionalityPage.clickRegionThirdOpt();
	}

	@Then("Calendar filtered only North American trainers for view.")
	public void calendar_filtered_only_north_american_trainers_for_view() {
		assertTrue(filterFunctionalityPage.clickThirdRegionIsEnable());
	}

	@Then("click on the Pathway filter button on the top left of the screen.")
	public void click_on_the_pathway_filter_button_on_the_top_left_of_the_screen() {
		filterFunctionalityPage.clickPathway();
	}

	@Then("select {string} for the Pathway filter.")
	public void select_for_the_pathway_filter(String string) {
		filterFunctionalityPage.clickPathwayThirdOpt();
	}

	@Then("Calendar filtered only Java pathway trainers in North America for view.")
	public void calendar_filtered_only_java_pathway_trainers_in_north_america_for_view() {
		assertTrue(filterFunctionalityPage.clickThirdRegionIsEnable());
	}

	@When("I send a Get request to {string} using Postman")
	public void i_send_a_get_request_to_using_postman(String string) {
		Hooks.restAssuredUtilities.setUrl(string);

		Hooks.restAssuredUtilities.setMethod("GET");

		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("I should see the name of trainers")
	public void i_should_see_the_name_of_trainers(io.cucumber.datatable.DataTable dataTable) {

		List<String> expectedTrainerNames = dataTable.asList(String.class);

		String responseBody = Hooks.response.getBody().asString();

		for (String trainerName : expectedTrainerNames) {
			assertTrue("Trainer name '" + trainerName + "' should be in the response",
					responseBody.contains(trainerName));
		}
	}

	@When("send a Get request to {string}")
	public void send_a_get_request_to(String string) {
		Hooks.restAssuredUtilities.setUrl(string);

		Hooks.restAssuredUtilities.setMethod("GET");

		Hooks.response = Hooks.restAssuredUtilities.executeAPI();

	}

	@Then("it should return <null>")
	public void it_should_return_null() {
		String responseBody = Hooks.response.getBody().asString();
		assertEquals("null", responseBody);
	}

}
