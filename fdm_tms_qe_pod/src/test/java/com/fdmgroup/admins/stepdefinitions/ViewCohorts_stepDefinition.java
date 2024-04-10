package com.fdmgroup.admins.stepdefinitions;

import com.fdmgroup.admins.pages.AdminHomePage;
import com.fdmgroup.admins.pages.ViewCohortsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewCohorts_stepDefinition {

	HomePage homePage = new HomePage();
	AdminHomePage adminHomePage = new AdminHomePage();
	ViewCohortsPage viewCohortsPage = new ViewCohortsPage();

	@Given("User logged in using valid admin credentials")
	public void user_logged_in_using_valid_admin_credentials() throws InterruptedException {
		viewCohortsPage.driverGet(ConfigurationReader.getProperty("admins", "calendarViewpageURL"));
		viewCohortsPage.sendUsername();
		viewCohortsPage.sendPassword();
		viewCohortsPage.clickOnLoginButton();
	}

	@When("I click on admin view link")
	public void i_click_on_admin_view_link() throws InterruptedException {
		viewCohortsPage.clickOnAdminButton();
	}

	@Then("I click on view cohorts link")
	public void i_click_on_view_cohorts_link() {
		viewCohortsPage.clickViewCohortsLink();
	}

	@Then("click on sorting button for cohort id")
	public void click_on_sorting_button_for_cohort_id() {
		viewCohortsPage.clickSortCohortId();
	}

	@Then("its should sort the id's")
	public void its_should_sort_the_id_s() {
		viewCohortsPage.clickSortCohortId();
	}

	@Then("click on sorting button for start date")
	public void click_on_sorting_button_for_start_date() {
		viewCohortsPage.clickSortStartDate();
	}

	@Then("click on sorting button for duration")
	public void click_on_sorting_button_for_duration() {
		viewCohortsPage.clickSortDuration();
	}

	@Then("it should sort the duration")
	public void it_should_sort_the_duration() {
		viewCohortsPage.clickSortDuration();
	}

	@Then("click on filter for duration")
	public void click_on_filter_for_duration() {
		viewCohortsPage.clickFilterDuration();
	}

	@Then("click on days")
	public void click_on_days() {
		viewCohortsPage.clickFilterDayDuration();
	}

	@Then("click on sorting button for region country")
	public void click_on_sorting_button_for_region_country() {
		viewCohortsPage.clickSortRegion();
	}

	

	@Then("click on filter for region country")
	public void click_on_filter_for_region_country() {
		viewCohortsPage.clickFilterRegion();
	}

	@Then("click on NA")
	public void click_on_na() {
		viewCohortsPage.clickFilterNARegion();
	}

	@Then("click on sorting button for city")
	public void click_on_sorting_button_for_city() {
		viewCohortsPage.clickSortCity();
	}

	@Then("it should sort the city")
	public void it_should_sort_the_city() {
		viewCohortsPage.clickSortCity();
	}

	@Then("click on filter for city")
	public void click_on_filter_for_city() {
		viewCohortsPage.clickFilterCity();
	}

	@Then("click on toronto city")
	public void click_on_toronto_city() {
		viewCohortsPage.clickFilterTorontoCity();
	}

	@Then("click on search bar on that page")
	public void click_on_search_bar_on_that_page() throws InterruptedException {
		viewCohortsPage.searchPathwayss();
		Thread.sleep(10);
	}

	@Then("search for the pathway BAPM")
	public void search_for_the_pathway_bapm() {
		viewCohortsPage.sendPathways();
	}

}
