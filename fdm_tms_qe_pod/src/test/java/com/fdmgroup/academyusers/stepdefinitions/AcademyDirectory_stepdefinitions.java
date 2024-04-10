package com.fdmgroup.academyusers.stepdefinitions;

import com.fdmgroup.academyusers.pages.AcademyDirectoryPage;
import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;
import com.fdmgroup.academyusers.pages.LoginPage;


import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.When;

public class AcademyDirectory_stepdefinitions extends BrowserUtilities{
	AcademyDirectoryPage academyDirectoryPage = new AcademyDirectoryPage();
	LoginPage loginPage = new LoginPage();
	
	private void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	
	@When("User Enter valid id and password")
	public void user_enter_valid_id_and_password() {
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "userName"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "password"));
		
	}
	
	@When("User click on the academy Directory Selection")
	public void user_click_on_the_academy_directory_selection() {
		HomePage.clickOnAcademyDirectoryButton();

	}

	
	@When("User should see the Train name, location, team and course on the page")
	public void user_should_see_the_train_name_location_team_and_course_on_the_page() {

	    assertTrue(academyDirectoryPage.getName().equals("Name"));
	    assertTrue(academyDirectoryPage.getLocation().equals("Location"));
	    assertTrue(academyDirectoryPage.getTeam().equals("Team"));
	    assertTrue(academyDirectoryPage.getCourse().equals("Course"));


	}
	
	@When("User click on the sort icon near next to name")
	public void user_click_on_the_sort_icon_near_next_to_name() {
		academyDirectoryPage.clickSortByNameIcon();
		waitFor(2);

	}
	@When("The name is sorted alphabetically")
	public void the_name_is_sorted_alphabetically() {
		int i;
		for(i = 0; i < academyDirectoryPage.checkTableSize(); i++) {
			assertTrue(academyDirectoryPage.actualNames().get(i).equals(academyDirectoryPage.expectedNames().get(i)));
		}
	}
	
	@When("User click on the filter icon next to Location column")
	public void user_click_on_the_filter_icon_next_to_location_column() {
		academyDirectoryPage.filterByLocationClick();
	}
	
	@When("the drop down select display is Location")
	public void the_drop_down_select_display_is_location() {
	    assertTrue(academyDirectoryPage.locationSelectionIsDisplayed());
	}
	
	@When("User enter valid filter location message in the input for location")
	public void user_enter_valid_filter_location_message_in_the_input_for_location() {
		academyDirectoryPage.setInputMessage(ConfigurationReader.getProperty("academyusers", "searchByLocation_valid"));
	}
	
	@When("The size of the table will be {int}")
	public void the_size_of_the_table_will_be(int size) {
		assertTrue(academyDirectoryPage.checkTableSize() == size);
	}
	
	@When("The line with the filtered location is to be displayed")
	public void the_line_with_the_filtered_message_is_to_be_displayed() {
	    assertTrue(academyDirectoryPage.LocationAfterFilter().equals(ConfigurationReader.getProperty("academyusers", "searchByLocation_valid")));
	}
	
	@When("User cleared input field")
	public void user_cleared_input_field() {
		academyDirectoryPage.clearInput();
	}
	
	@When("User entered invalid message in the input")
	public void user_entered_invalid_message_in_the_input() {
		academyDirectoryPage.setInputMessage(ConfigurationReader.getProperty("academyusers", "invalidSearchMessage"));
	}
	
	@When("User click on the filter icon next to Team column")
	public void user_click_on_the_filter_icon_next_to_team_column() {
		academyDirectoryPage.filterByTeamClick();
	}
	
	@When("the drop down select display is Team")
	public void the_drop_down_select_display_is_team() {
	    assertTrue(academyDirectoryPage.TeamSelectionIsDisplayed());
	}
	
	@When("User enter valid filter team message in the input for team")
	public void user_enter_valid_filter_team_message_in_the_input_for_team() {
		academyDirectoryPage.setInputMessage(ConfigurationReader.getProperty("academyusers", "searchByTeam_valid"));
	}
	
	@When("The line with the filtered team is to be displayed")
	public void the_line_with_the_filtered_team_is_to_be_displayed() {
	    assertTrue(academyDirectoryPage.TeamAfterFilter().equals(ConfigurationReader.getProperty("academyusers", "searchByTeam_valid")));
	}
	
	@When("User click on the filter icon next to Course column")
	public void user_click_on_the_filter_icon_next_to_course_column() {
		academyDirectoryPage.filterByCourseClick();
	}
	
	@When("the drop down select display is Course")
	public void the_drop_down_select_display_is_course() {
	    assertTrue(academyDirectoryPage.CourseSelectionIsDisplayed());
	}
	
	@When("User enter valid filter course message in the input for team")
	public void user_enter_valid_filter_course_message_in_the_input_for_team() {
	    academyDirectoryPage.setInputMessage(ConfigurationReader.getProperty("academyusers", "searchByCourse_valid"));
	}
	
	@When("The line with the filtered course is to be displayed")
	public void the_line_with_the_filtered_course_is_to_be_displayed() {
		assertTrue(academyDirectoryPage.CourseAfterFilter().equals(ConfigurationReader.getProperty("academyusers", "searchByCourse_valid")));
	}
	

	
}
