package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.EditTraineesProfilePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditTraineesProfile_stepdefinition {
	EditTraineesProfilePage editTraineesProfilePage = new EditTraineesProfilePage();

	@Given("A user is logged in as an admin in the TMS and is on the view trainees profile card page")
	public void a_user_is_logged_in_as_an_admin_in_the_tms_and_is_on_the_view_trainees_profile_card_page() {
		editTraineesProfilePage.adminTabClick();
		editTraineesProfilePage.importTraineesClick();
	}

	@When("As an admin, verify if the edit button is working correctly")
	public void as_an_admin_verify_if_the_edit_button_is_working_correctly() {
		editTraineesProfilePage.juliaTraineeLinkClick();
	}

	@Then("admin should be able to edit the text fields")
	public void admin_should_be_able_to_edit_the_text_fields() throws InterruptedException {
		editTraineesProfilePage.editBtnClick();
		editTraineesProfilePage.firstnameText();
		editTraineesProfilePage.lastnameText();
		editTraineesProfilePage.academicStatusDropDownClick();
		editTraineesProfilePage.selectStatusClick();
		editTraineesProfilePage.locationClick();
		editTraineesProfilePage.selectLocationClick();
		editTraineesProfilePage.scrollToFDMJourney();
		editTraineesProfilePage.fdmJourneyBtnClick();
		editTraineesProfilePage.cohortDropDownClick();
		editTraineesProfilePage.selectCohortClick();
		editTraineesProfilePage.saveBtnClick();
		assertEquals(editTraineesProfilePage.updateMsgText(), "Profile Updated Successfully");
		editTraineesProfilePage.okBtnClick();
	}

	

}
