package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.PathwayHomePage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PathwayHomePage_stepdefinitions {

	PathwayHomePage pathwayHomePage = new PathwayHomePage();

	@Given("User is logged in as an Admin and navigate to Pathway Home page")
	public void user_is_logged_in_as_an_admin_and_navigate_to_pathway_home_page() {
		pathwayHomePage.driverGet(ConfigurationReader.getProperty("admins", "pathwayHomePageURL"));
	}

	@When("Admin confirm that {string} is in the list of Pathways")
	public void admin_confirm_that_is_in_the_list_of_pathways(String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
	}

	@Then("{string} should be displayed in the list of Pathways")
	public void should_be_displayed_in_the_list_of_pathways(String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
	}

	@When("Admin verify that Red color is displayed as a Color for {string} Pathway")
	public void admin_verify_that_is_displayed_as_a_color_for_pathway(String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.checkPathwayColorCode());
	}

	@Then("Red color should be displayed as a Color for {string} Pathway")
	public void should_be_displayed_as_a_color_for_pathway(String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.checkPathwayColorCode());
	}

	@When("Admin verify that {string} is displayed as a Pathway Owner for {string} Pathway")
	public void admin_verify_that_is_displayed_as_a_pathway_owner_for_pathway(String pathwayOwnerName, String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.isDataExist(pathwayOwnerName));
	}

	@Then("{string} should be displayed as a Pathway Owner for {string} Pathway")
	public void should_be_displayed_as_a_pathway_owner_for_pathway(String pathwayOwnerName, String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.isDataExist(pathwayOwnerName));
	}

	@When("Admin verify that Null Value is displayed as a Description for {string} Pathway")
	public void admin_verify_that_null_value_is_displayed_as_a_description_for_pathway(String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
	}

	@Then("Null Value should be displayed as a Description for {string} Pathway")
	public void null_value_should_be_displayed_as_a_description_for_pathway(String description) {
		assertTrue(pathwayHomePage.isDataExist(ConfigurationReader.getProperty("admins", "emptyValue")));
	}

	@When("Admin verify that {string} is displayed as a Pathway Length\\(w) for {string} Pathway")
	public void admin_verify_that_is_displayed_as_a_pathway_length_w_for_pathway(String weeks, String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.isDataExist(weeks));
	}

	@Then("{string} should be displayed as a Pathway Length\\(w) for {string} Pathway")
	public void should_be_displayed_as_a_pathway_length_w_for_pathway(String weeks, String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.isDataExist(weeks));
	}

	@When("Admin verify that {string} is displayed as a Region\\/Country for {string} Pathway")
	public void admin_verify_that_is_displayed_as_a_region_country_for_pathway(String region, String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.isDataExist(region));
	}

	@Then("{string} should be displayed as a Region\\/Country for {string} Pathway")
	public void should_be_displayed_as_a_region_country_for_pathway(String region, String pathwayName) {
		assertTrue(pathwayHomePage.isDataExist(pathwayName));
		assertTrue(pathwayHomePage.isDataExist(region));
	}

	@When("Admin verify that sorting button is displayed besides Pathway Owner")
	public void admin_verify_that_sorting_button_is_displayed_besides_pathway_owner() {
		
		assertTrue(pathwayHomePage.isPathwayOwnerSortingButtonExist());
	}

	@Then("Sorting button should be displayed besides Pathway Owner")
	public void sorting_button_should_be_displayed_besides_pathway_owner() {

		assertTrue(pathwayHomePage.isPathwayOwnerSortingButtonExist());
	}

	@When("Admin click on sorting button besides Pathway Owner")
	public void admin_click_on_sorting_button_besides_pathway_owner() {
		pathwayHomePage.clickPathwayOwnerSortingButton();
	}

	@Then("Pathway Owner list should be sorted in ascending order")
	public void pathway_owner_list_should_be_sorted_in_ascending_order() {
		assertTrue(pathwayHomePage.sortPathwayOwners());
	}

	@When("Admin verify that sorting button is displayed besides Pathway Length")
	public void admin_verify_that_sorting_button_is_displayed_besides_pathway_length() {
		
		assertTrue(pathwayHomePage.isPathwayLengthSortingButtonExist());
	}

	@Then("Sorting button should be displayed besides Pathway Length")
	public void sorting_button_should_be_displayed_besides_pathway_length() {

		assertTrue(pathwayHomePage.isPathwayLengthSortingButtonExist());
	}

	@When("Admin click on sorting button besides Pathway Length")
	public void admin_click_on_sorting_button_besides_pathway_length() {
		pathwayHomePage.clickPathwayLengthSortingButton();
	}

	@Then("Pathway Length list should be sorted in ascending order")
	public void pathway_length_list_should_be_sorted_in_ascending_order() {
		assertTrue(pathwayHomePage.sortPathwayLength());
	}

	@When("Admin verify that sorting button is displayed besides Region\\/Country")
	public void admin_verify_that_sorting_button_is_displayed_besides_region_country() {
		
		assertTrue(pathwayHomePage.isRegionSortingButtonExist());
	}

	@Then("Sorting button should be displayed besides Region\\/Country")
	public void sorting_button_should_be_displayed_besides_region_country() {

		assertTrue(pathwayHomePage.isRegionSortingButtonExist());
	}

	@When("Admin click on sorting button besides Region\\/Country")
	public void admin_click_on_sorting_button_besides_region_country() {
		pathwayHomePage.clickRegionSortingButton();
	}

	@Then("Region\\/Country list should be sorted in ascending order")
	public void region_country_list_should_be_sorted_in_ascending_order() {
		assertTrue(pathwayHomePage.sortRegions());
	}

	@When("Admin verify that filter button is displayed besides Region\\/Country")
	public void admin_verify_that_filter_button_is_displayed_besides_region_country() {
		

		assertTrue(pathwayHomePage.isRegionFilterButtonExist());
	}

	@Then("Filter button should be displayed besides Region\\/Country")
	public void filter_button_should_be_displayed_besides_region_country() {

		assertTrue(pathwayHomePage.isRegionFilterButtonExist());
	}

	@When("Admin click on filter button besides Region\\/Country")
	public void admin_click_on_filter_button_besides_region_country() {
		pathwayHomePage.clickRegionFilterButton();
	}

	@Then("Filter pop-up should be displayed")
	public void filter_pop_up_should_be_displayed() {
		assertTrue(pathwayHomePage.isRegionFilterPopupExist());
	}

	@When("Admin click on NA option from filter pop-up")
	public void admin_click_on_na_option_from_filter_pop_up() {
		pathwayHomePage.clickFilterOption();
	}

	@Then("Pathway list should be filtered with only NA region")
	public void pathway_list_should_be_filtered_with_only_na_region() {
		pathwayHomePage.clickRegionFilterButton();
		assertTrue(pathwayHomePage.filterRegions());
	}

	@When("Admin verify that searchbar is displayed with hint text {string}")
	public void admin_verify_that_searchbar_is_displayed_with_hint_text(String searchHintText) {
		assertEquals(pathwayHomePage.getSearchNameHintText(), searchHintText);
		
	}

	@Then("Searchbar should be displayed with hint text {string}")
	public void searchbar_should_be_displayed_with_hint_text(String searchHintText) {
		assertEquals(pathwayHomePage.getSearchNameHintText(), searchHintText);
	}

	@When("Admin search for {string} Pathway Name")
	public void admin_search_for_pathway_name(String searchName) {
		pathwayHomePage.setSearchPathwayName(searchName);
	}

	@When("Admin verify that Create Pathway button should be displayed as enabled")
	public void admin_verify_that_create_pathway_button_should_be_displayed_as_enabled() {
		assertTrue(pathwayHomePage.isCreatePathwayButtonExist());
	}

	@Then("Create Pathway button should be displayed as enabled")
	public void create_pathway_button_should_be_displayed_as_enabled() {
		assertTrue(pathwayHomePage.isCreatePathwayButtonExist());
	}

	@When("Admin click on Create Pathway button on Pathway Home page")
	public void admin_click_on_create_pathway_button_on_pathway_home_page() {
		pathwayHomePage.clickCreatePathwayButton();
	}

	@Then("Admin should be redirect to Create Pathway page from Pathway Home page")
	public void admin_should_be_redirect_to_create_pathway_page_from_pathway_home_page() {
		assertTrue(pathwayHomePage.isCreatePathwayPageExist());
	}
	
	@When("I perform GET operation for {string}")
	public void i_perform_get_operation_for(String url) {
		Hooks.restAssuredUtilities.setUrl(url);

		Hooks.restAssuredUtilities.setMethod("GET");

		Hooks.response = Hooks.restAssuredUtilities.executeAPI();

	}

	@Then("Status code {int} should be return with requested data")
	public void status_code_should_be_return_with_requested_data(Integer statusCode) {
		int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(statusCode, equalTo(actualStatusCode));
	}


}
