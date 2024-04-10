package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.fdmgroup.admins.pages.CreatePathwayPage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SequencingCourses_stepdefinitions {
	
	CreatePathwayPage createPathwayPage = new CreatePathwayPage();
	
	
	
	@Given("User is logged in as an Admin and navigate to Create Pathway page")
	public void user_is_logged_in_as_an_admin_and_navigate_to_create_pathway_page() {
		createPathwayPage.driverGet(ConfigurationReader.getProperty("admins","createPathwayPageURL"));
		
	}

	@Then("{string} should display as an index for {string} course in Selected Courses list")
	public void should_display_as_an_index_for_course_in_selected_courses_list(String index, String courseName) {
	    assertEquals(createPathwayPage.getSelectedCourseIndex(courseName), index);
	    assertTrue(createPathwayPage.checkSelectedCourseName(courseName));
	}

	@When("Admin drag and drop the {string} course to index no. {string}")
	public void admin_drag_and_drop_the_course_to_index_no(String courseName, String index) {
	    createPathwayPage.dragAndDropCourses();
	}

}
