package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CreateCourseHomePage;
import com.fdmgroup.admins.pages.CreateCoursePage;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;
import com.fdmgroup.global.utilities.RestAssuredUtilities;
import com.fdmgroup.global.stepdefinitions.Hooks;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateCourseHome_stepdefinitions {

	CreateCourseHomePage createCourseHomePage = new CreateCourseHomePage();

	@When("Login as Admin to TMS and Go to Create Course Home Page")
	public void login_as_admin_to_tms_and_go_to_create_course_home_page() {
		createCourseHomePage.driverGet(ConfigurationReader.getProperty("admins", "createCourseHomePageURL"));
	}

	@Then("Admin should be able to see Create Course Home Page")
	public void admin_should_be_able_to_see_create_course_home_page() {
		String actualCurrentCoursesHeadingText = createCourseHomePage.currentCoursesHeadingText();
		String expectedCurrentCoursesHeadingText = ConfigurationReader.getProperty("admins",
				"currentCoursesHeadingText");
		assertEquals(actualCurrentCoursesHeadingText, expectedCurrentCoursesHeadingText);

	}

	@When("Validate Admin can see available courses on Create Course Home Page")
	public void validate_admin_can_see_available_courses_on_create_course_home_page() {
		String actualCourseHeading = createCourseHomePage.courseHeadingText();
		String expectedCourseHeading = ConfigurationReader.getProperty("admins", "currentCourseHeading");
		assertEquals(actualCourseHeading, expectedCourseHeading);
	}

	@Then("Admin should be able to see available courses on Create Course Home Page")
	public void admin_should_be_able_to_see_available_courses_on_create_course_home_page() {
		String actualFirstCourse = createCourseHomePage.firstCourseText();
		String expectedFirstCourse = ConfigurationReader.getProperty("admins", "currentFirstCourseText");
		assertEquals(actualFirstCourse, expectedFirstCourse);
	}

	@When("Validate Admin can see each course in Course List with details course name, course owner, course length and region")
	public void validate_admin_can_see_each_course_in_course_list_with_details_course_name_course_owner_course_length_and_region() {
		String actualCourseHeading = createCourseHomePage.courseHeadingText();
		String expectedCourseHeading = ConfigurationReader.getProperty("admins", "currentCourseHeading");
		assertEquals(actualCourseHeading, expectedCourseHeading);
		String actualCourseOwnerHeading = createCourseHomePage.courseOwnerHeadingText();
		String expectedCourseOwnerHeading = ConfigurationReader.getProperty("admins", "currentCourseOwnerHeading");
		assertEquals(actualCourseOwnerHeading, expectedCourseOwnerHeading);
		String actualCourseLengthHeading = createCourseHomePage.courseLengthHeadingText();
		String expectedCourseLengthHeading = ConfigurationReader.getProperty("admins", "currentCourseLengthHeading");
		assertEquals(actualCourseLengthHeading, expectedCourseLengthHeading);
		String actualRegionHeading = createCourseHomePage.regionHeadingText();
		System.out.println(actualRegionHeading);
		String expectedRegionHeading = ConfigurationReader.getProperty("admins", "currentRegionHeading");
		System.out.println(expectedRegionHeading);
		assertEquals(actualRegionHeading, expectedRegionHeading);
	}

	@Then("Admin should be able to see each course with course name, course owner,course length and region")
	public void admin_should_be_able_to_see_each_course_with_course_name_course_owner_course_length_and_region() {
		String actualFirstRow = createCourseHomePage.FirstRowText();
		String expectedFirstRow = ConfigurationReader.getProperty("admins", "currentFirstCourseText");
		assertEquals(actualFirstRow, expectedFirstRow);

	}

	@When("Click on sort button on column Course Owner and Validate course list is sorted in ascending order based on first name")
	public void click_on_sort_button_on_column_course_owner_and_validate_course_list_is_sorted_in_ascending_order_based_on_first_name() {
		createCourseHomePage.courseOwnerSortedButtonClick();

	}

	@Then("Course List should be sorted by in Course Owner descending order")
	public void course_list_should_be_sorted_by_in_course_owner_descending_order() {
		String actualOwnerNameByDes = createCourseHomePage.sortByownerNameByDes();
		System.out.println("actual name" + actualOwnerNameByDes);
		String expectedOwnerNameByDes = ConfigurationReader.getProperty("admins", "OwnerNameByDes");
		System.out.println("expected name" + expectedOwnerNameByDes);
		assertEquals(actualOwnerNameByDes, expectedOwnerNameByDes);
	}

	@When("Click on sort button on column Course Owner and Validate course list is sorted in descending order based on first name")
	public void click_on_sort_button_on_column_course_owner_and_validate_course_list_is_sorted_in_descending_order_based_on_first_name() {
		createCourseHomePage.courseOwnerSortedButtonClick();
	}

	@Then("Course List should be sorted by Course Owner in ascending order")
	public void course_list_should_be_sorted_by_course_owner_in_ascending_order() {
		String actualOwnerNameByAsc = createCourseHomePage.sortByownerNameByAsc();
		System.out.println("actual name" + actualOwnerNameByAsc);
		String expectedOwnerNameByAsc = ConfigurationReader.getProperty("admins", "OwnerNameByAsc");
		System.out.println("expected name" + expectedOwnerNameByAsc);
		assertEquals(actualOwnerNameByAsc, expectedOwnerNameByAsc);
	}

	@When("Click on sort button on column Course Length and Validate course list is sorted in descending order based on days")
	public void click_on_sort_button_on_column_course_length_and_validate_course_list_is_sorted_in_descending_order_based_on_days() {
		createCourseHomePage.courseLengthSortedButtonClick();
	}

	@Then("Course List should be sorted by days in descending order")
	public void course_list_should_be_sorted_by_days_in_descending_order() {
		String actualCourseLenByDes = createCourseHomePage.sortByCourseLenByDes();
		String expectedCourseLenByDes = ConfigurationReader.getProperty("admins", "CourseLenByDes");
		assertEquals(actualCourseLenByDes, expectedCourseLenByDes);
	}

	@When("Click on sort button on column Course Length and Validate course list is sorted in ascending order based on days")
	public void click_on_sort_button_on_column_course_length_and_validate_course_list_is_sorted_in_ascending_order_based_on_days() {
		createCourseHomePage.courseLengthSortedButtonClick();
	}

	@Then("Course List should be sorted by days in ascending order")
	public void course_list_should_be_sorted_by_days_in_ascending_order() {
		String actualCourseLenByAsc = createCourseHomePage.sortByCourseLenByAsc();
		String expectedCourseLenByAsc = ConfigurationReader.getProperty("admins", "CourseLenByAsc");
		assertEquals(actualCourseLenByAsc, expectedCourseLenByAsc);
	}

	@When("Click on sort button on column  Region\\/Country and Validate course list is sorted in ascending order based on Country")
	public void click_on_sort_button_on_column_region_country_and_validate_course_list_is_sorted_in_ascending_order_based_on_country() {
		createCourseHomePage.countrySortedButtonClick();
	}

	@Then("Course List should be sorted by Country in ascending order")
	public void course_list_should_be_sorted_by_country_in_ascending_order() {
		String actualCountryByAsc = createCourseHomePage.sortByCountryByAsc();
		String expectedCountryByAsc = ConfigurationReader.getProperty("admins", "CountryByAsc");
		assertEquals(actualCountryByAsc, expectedCountryByAsc);
	}

	@When("Click on sort button on column  Region\\/Country and Validate course list is sorted in descending order based on Country")
	public void click_on_sort_button_on_column_region_country_and_validate_course_list_is_sorted_in_descending_order_based_on_country() {
		createCourseHomePage.countrySortedButtonClick();
	}

	@Then("Course List should be sorted by Country in descending order")
	public void course_list_should_be_sorted_by_country_in_descending_order() {
		String actualCountryByDes = createCourseHomePage.sortByCountryByDes();
		String expectedCountryByDes = ConfigurationReader.getProperty("admins", "CountryByDes");
		assertEquals(actualCountryByDes, expectedCountryByDes);

	}

	@When("Click on filter button on Region\\/Country column and select checkbox NA")
	public void click_on_filter_button_on_region_country_column_and_select_checkbox_na() {
		createCourseHomePage.funnelButtonClick();
		BrowserUtilities.implicitWait(2000);
		createCourseHomePage.clearCheckBox();
		createCourseHomePage.checkBoxNAClick();
	}

	@Then("Only NA Region course list should be displayed")
	public void only_na_region_course_list_should_be_displayed() {
		assertTrue(createCourseHomePage.checkBoxNA());
	}

	@When("Click on filter button on Region\\/Country column and select checkbox NA  and APAC")
	public void click_on_filter_button_on_region_country_column_and_select_checkbox_na_and_apac() {
		createCourseHomePage.checkBoxAPACClick();
	}

	@Then("NA and APAC Region course list should be displayed")
	public void na_and_apac_region_course_list_should_be_displayed() {
		assertTrue(createCourseHomePage.checkBoxNA());
		assertTrue(createCourseHomePage.checkBoxAPAC());
	}

	@When("Click on filter button on Region\\/Country column and select checkbox NA  and APAC and EMEA")
	public void click_on_filter_button_on_region_country_column_and_select_checkbox_na_and_apac_and_emea() {
		createCourseHomePage.checkBoxEMEAClick();
	}

	@Then("NA and APAC and EMEA Region course list should be displayed")
	public void na_and_apac_and_emea_region_course_list_should_be_displayed() {
		assertTrue(createCourseHomePage.checkBoxNA());
		assertTrue(createCourseHomePage.checkBoxAPAC());
		assertTrue(createCourseHomePage.checkBoxEMEA());
	}

	@When("Enter course name as {string} in search textbox")
	public void enter_course_name_as_in_search_textbox(String name) {
		createCourseHomePage.searchCourse(name);

	}

	@Then("Search result should be displayed {string} with the course name")
	public void search_result_should_be_displayed_with_the_course_name(String name) {
		assertEquals(name, createCourseHomePage.getSearchCourse());
	}

	@When("Send a Get request to {string}")
	public void send_a_get_request_to(String uri) {
		Hooks.restAssuredUtilities.setUrl(uri);
		Hooks.restAssuredUtilities.setMethod("GET");
		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("Status code {int} should be returned with data")
	public void status_code_should_be_returned_with_data(Integer int1) {
		assertThat(Hooks.response.getStatusCode(), equalTo(int1));
	}
}
