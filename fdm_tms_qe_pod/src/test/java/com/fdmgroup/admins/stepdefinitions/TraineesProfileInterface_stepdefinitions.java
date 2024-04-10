package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.EditTraineesProfilePage;
import com.fdmgroup.admins.pages.TraineesProfileInterfacePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TraineesProfileInterface_stepdefinitions {
	EditTraineesProfilePage editTraineesProfilePage = new EditTraineesProfilePage();
	TraineesProfileInterfacePage traineesProfile = new TraineesProfileInterfacePage();

	@Then("user navigate to view trainees profile card page")
	public void user_navigate_to_view_trainees_profile_card_page() {
		editTraineesProfilePage.adminTabClick();
		editTraineesProfilePage.importTraineesClick();
		editTraineesProfilePage.juliaTraineeLinkClick();
	}

	@Then("Overview section is expanded and admin should be able to see trainees overview information i.e First Name,Last Name, Username,Academic Status,Placement Status,Location,Start Date")
	public void overview_section_is_expanded_and_admin_should_be_able_to_see_trainees_overview_information_i_e_first_name_last_name_username_academic_status_placement_status_location_start_date() {
		String ActualFirstNameText = traineesProfile.getTextFirstName();
		assertEquals(ActualFirstNameText, "First Name:");
		String ActualLastNameText = traineesProfile.getTextLastName();
		assertEquals(ActualLastNameText, "Last Name:");
		String ActualUserNameText = traineesProfile.getTextUserName();
		assertEquals(ActualUserNameText, "Username:");
		String ActualStatusText = traineesProfile.getTextStatus();
		assertEquals(ActualStatusText, "Status:");
		String ActualLocationText = traineesProfile.getTextLocation();
		assertEquals(ActualLocationText, "Location:");
		String ActualStartDateText = traineesProfile.getTextStartDate();
		assertEquals(ActualStartDateText, "Start Date:");

	}

	@When("As an admin, selects triangular button first time along with Experience\\/Skills heading")
	public void as_an_admin_selects_triangular_button_first_time_along_with_experience_skills_heading()
			throws InterruptedException {
		traineesProfile.scrollToFDMJourney();
		traineesProfile.fdmJourneyBtnClick();
	}

	@Then("Experience\\/Skills section is expanded and admin should be able to see trainees Experience\\/Skills information i.e Skills, Certifications")
	public void experience_skills_section_is_expanded_and_admin_should_be_able_to_see_trainees_experience_skills_information_i_e_skills_certifications()
			throws InterruptedException {
		Thread.sleep(1000);
		String ActualPathwayText = traineesProfile.getTextPathway();
		assertEquals(ActualPathwayText, "Pathway:");
		String ActualCohortText = traineesProfile.getTextCohort();
		assertEquals(ActualCohortText, "Cohort:");
	}

	@Then("Experience\\/Skills section is closed and admin should not be able to see traniees Experience\\/Skills information")
	public void experience_skills_section_is_closed_and_admin_should_not_be_able_to_see_traniees_experience_skills_information() {
		traineesProfile.fdmJourneyBtnClick();
	}

	@When("As an admin, selects triangular button first time along with FDM Journey heading")
	public void as_an_admin_selects_triangular_button_first_time_along_with_fdm_journey_heading()
			throws InterruptedException {
		traineesProfile.scrollToSkills();
		traineesProfile.skillsBtnClick();
	}

	@Then("FDM Journey section is expanded and admin should be able to see trainees FDM Journey information i.e Pathway, cohort")
	public void fdm_journey_section_is_expanded_and_admin_should_be_able_to_see_trainees_fdm_journey_information_i_e_pathway_cohort()
			throws InterruptedException {
		String ActualSkillsText = traineesProfile.getTextSkills();
		assertEquals(ActualSkillsText, "Skills:");
		String ActualCertificationText = traineesProfile.getTextCertifications();
		assertEquals(ActualCertificationText, "Certifications:");
	}

}
