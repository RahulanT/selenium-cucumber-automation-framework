package com.fdmgroup.admins.stepdefinitions;

import com.fdmgroup.admins.pages.AssessmentHomePage;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssessmentHomePage_stepdefinitions {
	
	AssessmentHomePage assessmentHomePage = new AssessmentHomePage();
	
	@Given("User is logged in as an Admin and navigate to Assessment Home page")
	public void user_is_logged_in_as_an_admin_and_navigate_to_assessment_home_page() {
	    assessmentHomePage.driverGet(ConfigurationReader.getProperty("admins","assessmentListURL"));
	    BrowserUtilities.implicitWait(2000);
	}

	@When("Admin reached on Assessment Home Page")
	public void admin_reached_on_assessment_home_page() {
	  assertEquals(ConfigurationReader.getProperty("admins", "assessmentListLable"),assessmentHomePage.assessmentPageLable());
	}

	@Then("Admin can see existing Assessment List")
	public void admin_can_see_existing_assessment_list() {
	  assertEquals(ConfigurationReader.getProperty("admins", "totalAssessment"), Integer.toString(assessmentHomePage.totalAssessmentList()));
	}

	@When("Admin should able to see Assessment List")
	public void admin_should_able_to_see_assessment_list() {
		assertEquals(ConfigurationReader.getProperty("admins", "totalAssessment"), Integer.toString(assessmentHomePage.totalAssessmentList()));
	}

	@Then("Each entry should have assessment name,grade scale,active status,description and created by")
	public void each_entry_should_have_assessment_name_grade_scale_active_status_description_and_created_by() {
	    assessmentHomePage.printAssessmentList();
	}

	@When("Enter {string} in Search text box")
	public void enter_in_search_text_box(String name) {
	   assessmentHomePage.searchAssessment(name);
	}

	@Then("Assessment list name with {string} is displayed in result")
	public void assessment_list_name_with_is_displayed_in_result(String name) {
	    assertEquals(name, assessmentHomePage.getAssessmentName());
	}

	@When("Admin scroll down on assessment home page")
	public void admin_scroll_down_on_assessment_home_page() {
	    assessmentHomePage.scrollDownTable();
	}

	@Then("Verify last Assessment name in table")
	public void verify_last_assessment_name_in_table() {
	   assertEquals(ConfigurationReader.getProperty("admins", "lastAssessment"),assessmentHomePage.lastAssessmentName());
	}

	@When("User click on sort button of column Created By")
	public void user_click_on_sort_button_of_column_created_by() {
	   assessmentHomePage.clickSortButton();
	}

	@Then("User can see Assessment list sorted based on first name Created By")
	public void user_can_see_assessment_list_sorted_based_on_first_name_created_by() {
		assertTrue(assessmentHomePage.expectedList().equals(assessmentHomePage.actualList()));
	}

	@When("User click on filter button on Grade scale column")
	public void user_click_on_filter_button_on_grade_scale_column() {
	    assessmentHomePage.clickOnFilter();
	    BrowserUtilities.implicitWait(2000);
	}

	@When("User select Cloud Computing checkbox")
	public void user_select_cloud_computing_checkbox() {
	    assessmentHomePage.selectFilter();
	    BrowserUtilities.implicitWait(2000);
	    assessmentHomePage.closedButton();
	}


	@Then("Assessment List result is displayed which has {string} in Grade Scale")
	public void assessment_list_result_is_displayed_which_has_in_grade_scale(String name) {
	    assertEquals(assessmentHomePage.getGradeScale(),name);
	}


}
