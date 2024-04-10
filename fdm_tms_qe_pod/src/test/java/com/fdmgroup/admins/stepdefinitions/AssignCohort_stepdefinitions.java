package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;

import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.admins.pages.AssignCohortPage;
import com.fdmgroup.admins.pages.ImportAttendedTraineesPage;
import com.fdmgroup.admins.pages.ImportTraineePage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssignCohort_stepdefinitions {

	LoginPage loginPage = new LoginPage();
	AssignCohortPage assignCohortPage = new AssignCohortPage();
	ImportTraineePage importTraineePage = new ImportTraineePage();
	ImportAttendedTraineesPage importAttendedTraineesPage = new ImportAttendedTraineesPage();

	@Given("The user is logged in as an Academy admin in the TMS.The user should only be able to assign the imported trainees to a specific existing cohort and user should be on Assign Cohort page")
	public void the_user_is_logged_in_as_an_academy_admin_in_the_tms_the_user_should_only_be_able_to_assign_the_imported_trainees_to_a_specific_existing_cohort_and_user_should_be_on_assign_cohort_page()
			throws InterruptedException {
		importTraineePage.importNewTraineesButton();
		importTraineePage.browseBtnClick();
		importTraineePage.okBtnTextClick();
		importAttendedTraineesPage.clickLocationDropDown();
		importAttendedTraineesPage.selectLocation();
		importAttendedTraineesPage.clickPathwayDropDown();
		importAttendedTraineesPage.selectPathway();
		importAttendedTraineesPage.clickStartDateDropDown();
		importAttendedTraineesPage.selectDate();
		importAttendedTraineesPage.clickApplyBtn();
		importAttendedTraineesPage.clickImportTraineeBtn();
		importAttendedTraineesPage.clickokBtn();
	}

	@Then("admin should be able to see cohort dropdown  having grey background color bar.")
	public void admin_should_be_able_to_see_cohort_dropdown_having_grey_background_color_bar() {
		assignCohortPage.getBackgroundColour();
	}

	@When("As an admin,clicks on drop down")
	public void as_an_admin_clicks_on_drop_down() {
		assignCohortPage.clickCohortDropDwn();
	}

	@When("As an admin, selects specific cohort from drop down")
	public void as_an_admin_selects_specific_cohort_from_drop_down() throws InterruptedException {
		assignCohortPage.selectCohortFromDropDown();
	}

	@Then("admin should be able to assign it to all the trainees by selecting select all checkbox")
	public void admin_should_be_able_to_assign_it_to_all_the_trainees_by_selecting_select_all_checkbox() {
		assignCohortPage.clickChkBox();
	}

	@When("As an admin, clicks cancel button at bottom right corner of the screen")
	public void as_an_admin_clicks_cancel_button_at_bottom_right_corner_of_the_screen() {
		assignCohortPage.cancelBtn();
	}

	@Then("admin should be to cancel the process of assigning cohorts and  admin will be redirected to the Profile card page")
	public void admin_should_be_to_cancel_the_process_of_assigning_cohorts_and_admin_will_be_redirected_to_the_profile_card_page()
			throws InterruptedException {
		importTraineePage.importNewTraineesButton();
		importTraineePage.browseBtnClick();
		importTraineePage.okBtnTextClick();
		importAttendedTraineesPage.clickLocationDropDown();
		importAttendedTraineesPage.selectLocation1();
		importAttendedTraineesPage.clickPathwayDropDown();
		importAttendedTraineesPage.selectPathway1();
		importAttendedTraineesPage.clickStartDateDropDown();
		importAttendedTraineesPage.selectDate1();
		importAttendedTraineesPage.clickApplyBtn();
		importAttendedTraineesPage.clickImportTraineeBtn();
		importAttendedTraineesPage.clickokBtn();
	}

	@Then("admin should be able to see assign cohort button should be disabled by default having grey color.")
	public void admin_should_be_able_to_see_assign_cohort_button_should_be_disabled_by_default_having_grey_color() {
		assignCohortPage.getDisabledBtnBackgroundColour();
	}

	@When("As an admin, selects a specific cohort from the drop down menu and is reflected in the cohort column and assign it to trainee.")
	public void as_an_admin_selects_a_specific_cohort_from_the_drop_down_menu_and_is_reflected_in_the_cohort_column_and_assign_it_to_trainee()
			throws InterruptedException {
		assignCohortPage.clickCohortDropDwn();
		assignCohortPage.selectCohortFromDropDown1();
		Thread.sleep(1000);
		assignCohortPage.clickChkBox();
	}

	@When("As an admin, clicks on assign cohort button")
	public void as_an_admin_clicks_on_assign_cohort_button() {
		assignCohortPage.assignCohortBtn();
	}

	@Then("pop-up should be displayed on the same page which will verify if the user wants to assign the selected cohort to the list of selected trainees.")
	public void pop_up_should_be_displayed_on_the_same_page_which_will_verify_if_the_user_wants_to_assign_the_selected_cohort_to_the_list_of_selected_trainees() {
		String actualMsg = assignCohortPage.getConfirmDailogBoxText();
		assertEquals(actualMsg, "Confirm Cohort Assignment");
	}

	@When("As an admin,clicks back button")
	public void as_an_admin_clicks_back_button() {
		assignCohortPage.clickBackBtn();
	}

	@When("As an admin,clicks confirm button")
	public void as_an_admin_clicks_confirm_button() throws InterruptedException {
		Thread.sleep(1000);
		assignCohortPage.assignCohortBtn();
		assignCohortPage.clickConfirmBtn();

	}

	@Then("The confirm button should redirect the user to the confirmation pop-up which will display {string}  with ok button")
	public void the_confirm_button_should_redirect_the_user_to_the_confirmation_pop_up_which_will_display_with_ok_button(
			String expectedMsg) {
		String actualMsg = assignCohortPage.getConfirmDailogBoxText1();
		assertEquals(actualMsg, expectedMsg);
	}

	@When("As an admin,clicks ok button of confirmation pop-up dialogbox")
	public void as_an_admin_clicks_ok_button_of_confirmation_pop_up_dialogbox() {
		assignCohortPage.clickOkBtn();
	}

	@When("In Postman, send a Get request to {string}")
	public void in_postman_send_a_get_request_to(String string) {
		Hooks.restAssuredUtilities.setUrl(string);
		Hooks.restAssuredUtilities.setMethod("GET");
		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("Status code {int} should be returned and get the list of trainees")
	public void status_code_should_be_returned_and_get_the_list_of_trainees(Integer int1) {
		int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(int1, equalTo(actualStatusCode));
	}

	@Then("Status code {int} should be returned and get all trainees with cohort assigned")
	public void status_code_should_be_returned_and_get_all_trainees_with_cohort_assigned(Integer int1) {
		int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(int1, equalTo(actualStatusCode));
	}

	@Then("Status code {int} should be returned and get all trainees without cohort assigned")
	public void status_code_should_be_returned_and_get_all_trainees_without_cohort_assigned(Integer int1) {
		int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(int1, equalTo(actualStatusCode));
	}

}
