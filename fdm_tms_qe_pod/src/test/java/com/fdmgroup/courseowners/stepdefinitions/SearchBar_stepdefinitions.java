package com.fdmgroup.courseowners.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.courseowners.pages.CourseCataloguePage;

import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBar_stepdefinitions {
	CourseCataloguePage courseCatalogue = new CourseCataloguePage();
	LoginPage loginPage = new LoginPage();

	@When("Enters valid id and password of trainer")
	public void enters_valid_id_and_password_of_trainer() throws InterruptedException {
		loginPage.setUsername(ConfigurationReader.getProperty("courseowners", "trainerName"));
		loginPage.setPassword(ConfigurationReader.getProperty("courseowners", "trainerPassword"));
	}

	@When("user clicks the Login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		loginPage.clickOnLoginButton();
	}

	@Given("The user is signed in as a trainer and has navigated to the All Courses page")
	public void the_user_is_signed_in_as_a_trainer_and_has_navigated_to_the_all_courses_page() {
		//courseCatalogue.clickCatelogLink();
		courseCatalogue.navigateToUrl("http://localhost:4200/course-catalog/my-courses");
	}

	@When("User is on search button and type three words to search a course name")
	public void user_is_on_search_button_and_type_three_words_to_search_a_course_name() {
		courseCatalogue.searchBarText();
	}

	@When("User hit enter after typing three words")
	public void user_hit_enter_after_typing_three_words() {
		courseCatalogue.searchBarEnter();
	}

	@Then("user can see exact course name is displayed  in Ascending order")
	public void user_can_see_exact_course_name_is_displayed_in_ascending_order() {
		String actualThreeWords = courseCatalogue.getAEMText();
		String expectedThreeWords = ConfigurationReader.getProperty("courseowners", "courseNameWith3Words");
		assertEquals(actualThreeWords, expectedThreeWords);
	}

	@When("User is on search button and type partial three words to search a course name")
	public void user_is_on_search_button_and_type_partial_three_words_to_search_a_course_name() {
		courseCatalogue.partialSearchBarText();
	}

	@Then("user can see partial course name is displayed in Ascending order as first three characters are matched")
	public void user_can_see_partial_course_name_is_displayed_in_ascending_order_as_first_three_characters_are_matched() {
		String actualPartialText = courseCatalogue.getAPIText();
		String expectedPartialText = ConfigurationReader.getProperty("courseowners", "courseNameWithPartialWords");
		assertEquals(actualPartialText, expectedPartialText);
	}

	@When("User is on search button and type two words to search a course name")
	public void user_is_on_search_button_and_type_two_words_to_search_a_course_name() {
		courseCatalogue.SearchBarTwoWordsText();
	}

	@When("User hit enter after typing two words")
	public void user_hit_enter_after_typing_two_words() {
		courseCatalogue.searchBarEnter();
	}

	@Then("There should be an error message saying to enter three characters in the search bar")
	public void there_should_be_an_error_message_saying_to_enter_three_characters_in_the_search_bar() {
		String actualMsgText = courseCatalogue.errorMsgText();
		String expectedMsgText = ConfigurationReader.getProperty("courseowners", "errorMsg");
		assertEquals(actualMsgText, expectedMsgText);
	}

	@When("User selects the cancel search option  by clicking the “X” icon")
	public void user_selects_the_cancel_search_option_by_clicking_the_x_icon() {
		courseCatalogue.searchBarClick();
	}

	@When("User click on X icon and all courses page will display with default filter")
	public void user_click_on_x_icon_and_all_courses_page_will_display_with_default_filter() {
		String actualThreeWords = courseCatalogue.getAEMText();
		String expectedThreeWords = ConfigurationReader.getProperty("courseowners", "courseNameWith3Words");
		assertEquals(actualThreeWords, expectedThreeWords);
	}

	@When("User is on search button and type sone characters to search a course name")
	public void user_is_on_search_button_and_type_sone_characters_to_search_a_course_name() {
		courseCatalogue.SearchBarAnyText();
	}

	@When("User hit enter after typing the characters")
	public void user_hit_enter_after_typing_the_characters() {
		courseCatalogue.searchBarEnter();
	}

	@Then("There should be an {string} message if course is not available in course tiles")
	public void there_should_be_an_message_if_course_is_not_available_in_course_tiles(String error) {
		String actualErrorMsg2 = courseCatalogue.errorMsgText2();
		assertEquals(actualErrorMsg2, error);
	}

}
