package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.admins.pages.SearchResultPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchResults_stepdefinitions {
	LoginPage loginPage = new LoginPage();
	SearchResultPage searchResultPage=new SearchResultPage();
	@When("Enters valid id and password of Admin")
	public void enters_valid_id_and_password_of_admin() {
		loginPage.setUsername(ConfigurationReader.getProperty("admins", "adminName"));
		loginPage.setPassword(ConfigurationReader.getProperty("admins", "adminPassword"));  
	}

	@When("user clicks the login Btn")
	public void user_clicks_the_login_btn() {
		searchResultPage.loginClick();
	}
//	@Given("A user is logged in as an admin in the TMS and is on the view trainees profile card page")
//	public void a_user_is_logged_in_as_an_admin_in_the_tms_and_is_on_the_view_trainees_profile_card_page() {
//		searchResultPage.adminTabClick();
//	}

	@When("As an admin, search for a name not in the list and verify there is {int} matches")
	public void as_an_admin_search_for_a_name_not_in_the_list_and_verify_there_is_matches(Integer int1) throws InterruptedException {
		searchResultPage.adminTabClick();
		searchResultPage.importTraineesClick();
		//Thread.sleep(1000);
	}

	@Then("admin should be able to see the search option and {int} matches are found")
	public void admin_should_be_able_to_see_the_search_option_and_matches_are_found(Integer int1) throws InterruptedException {
		searchResultPage.sendTextToSearchBox();
		Thread.sleep(1000);
		assertEquals(searchResultPage.zeroResultTextGet(),"0 result");
	}
	@When("As an admin, add {int} searches and verify there is no scrollbar")
	public void as_an_admin_add_searches_and_verify_there_is_no_scrollbar(Integer int1) {
		searchResultPage.adminTabClick();
		searchResultPage.importTraineesClick();
		searchResultPage.sendTextToSearchBox1();
	}

	@Then("admin should be able to see the search option and no scrollbars are there")
	public void admin_should_be_able_to_see_the_search_option_and_no_scrollbars_are_there() {
		assertEquals(searchResultPage.zeroResultTextGet1(),"8 results");
	}
	@When("As an admin, add {int} searches and verify there is scrollbar")
	public void as_an_admin_add_searches_and_verify_there_is_scrollbar(Integer int1) {
		searchResultPage.adminTabClick();
		searchResultPage.importTraineesClick();
		searchResultPage.sendTextToSearchBox2();
	}

	@Then("admin should be able to see the search option and scrollbars are there")
	public void admin_should_be_able_to_see_the_search_option_and_scrollbars_are_there() {
		assertEquals(searchResultPage.zeroResultTextGet2(),"9 results");
	}
}
