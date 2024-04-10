package com.fdmgroup.academyusers.stepdefinitions;

import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.academyusers.pages.ProfileCardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DropDownMenuForNavBar_stepdefinitions {
	ProfileCardPage profileCardPage = new ProfileCardPage();
	HomePage homePage = new HomePage();
	
	@When("user hang on the Profile on navigation bar")
	public void user_hang_on_the_profile_on_navigation_bar() {
	    profileCardPage.hoverOverProfileOnNavBar();
	}

	@When("user hang on the calendar on navigation bar")
	public void user_hang_on_the_profile_on_calendar_bar() {
		profileCardPage.hoverOverCalendarOnNavBar();
	}


	@When("user hang on the Academy Directory on navigation bar")
	public void user_hang_on_the_profile_on_academy_directory_on_navigation_bar() {
		profileCardPage.hoverOverAcademyDirectoryOnNavBar();
	}

	@When("user hang on the Academy Documents on navigation bar")
	public void user_hang_on_the_profile_on_academy_documents_on_navigation_bar() {
		profileCardPage.hoverOverAcademyDocumentsOnNavBar();
	}
	
	@When("user hang on the Trainees on navigation bar")
	public void user_hang_on_the_trainees_on_navigation_bar() {
		profileCardPage.hoverOverTraineesOnNavBar();
	}
	
	@When("user hang on the Classes on navigation bar")
	public void user_hang_on_the_classes_on_navigation_bar() {
		profileCardPage.hoverOverClassesOnNavBar();
	}
	@When("user hang on the Admin on navigation bar")
	public void user_hang_on_the_admin_on_navigation_bar() {
		profileCardPage.hoverOverAdminOnNavBar();
	}

	@When("user should be able to see the drop down menu")
	public void user_should_be_able_to_see_the_drop_down_menu_for_profile() {
		profileCardPage.dropDownMenuDisplayedForNavBar();
	}
	
	@When("user close this page")
	public void user_close_this_page() {
	    profileCardPage.closePage();
	}
	
	@Given("User launches the TMS portal page again")
	public void user_launches_the_tms_portal_page_again() {
	    homePage.openURLAgain();
	}

}
