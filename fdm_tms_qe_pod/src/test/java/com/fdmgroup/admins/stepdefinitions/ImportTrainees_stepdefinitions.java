package com.fdmgroup.admins.stepdefinitions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.admins.pages.ImportAttendedTraineesPage;
import com.fdmgroup.admins.pages.ImportTraineePage;
import com.fdmgroup.global.pojos.Trainee;
import com.fdmgroup.global.pojos.UserType;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.ConfigurationReader;
import com.fdmgroup.global.utilities.ExcelUtilities;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ImportTrainees_stepdefinitions {

	LoginPage loginPage = new LoginPage();
	ExcelUtilities excelUtilities = new ExcelUtilities();
	ImportTraineePage importTraineePage = new ImportTraineePage();
	ImportAttendedTraineesPage importAttendedTraineesPage = new ImportAttendedTraineesPage();
	private String filepath = System.getProperty("user.dir") + ConfigurationReader.getProperty("admins", "filepath");
	private String xsheet = ConfigurationReader.getProperty("admins", "Xsheet");
	private int colForLocation = 2;
	private int colForPathWay = 3;
	private int colForStartDate = 4;
	private int colForEmail = 5;
	private int colForAlreadyImported = 7;
	private int colForWriteTestResult = 9;

	@When("Enters valid id and password of admin")
	public void enters_valid_id_and_password_of_admin() {
		loginPage.setUsername(ConfigurationReader.getProperty("admins", "adminName"));
		loginPage.setPassword(ConfigurationReader.getProperty("admins", "adminPassword"));
	}

	@When("user Clicks the Login button")
	public void user_clicks_the_login_button() throws InterruptedException {
		importTraineePage.loginClick();
		Thread.sleep(1000);
		importTraineePage.navigateToUrl(ConfigurationReader.getProperty("admins", "addTraineeUrl"));

	}

	@Given("admin is signed in as a admin and has navigated to view trainees page")
	public void admin_is_signed_in_as_a_admin_and_has_navigated_to_view_trainees_page() {
		importTraineePage.navigateToUrl(ConfigurationReader.getProperty("admins", "addTraineeUrl"));
	}

	@When("As an admin, click Import New Trainees button")
	public void as_an_admin_click_import_new_trainees_button() {
		importTraineePage.importNewTraineesButton();
	}

	@Then("Admin should redirect to new pop up window with message {string}")
	public void admin_should_redirect_to_new_pop_up_window_with_message(String expectedHeading) {
		String actualHeading = importTraineePage.uploadFileHeadingText();
		assertEquals(actualHeading, expectedHeading);
	}

	@Then("Admin should be able to see textbox and Browse button should be on the right side of textbox and admin should be able to see Back button and then Ok button on bottom right of window")
	public void admin_should_be_able_to_see_textbox_and_browse_button_should_be_on_the_right_side_of_textbox_and_admin_should_be_able_to_see_back_button_and_then_ok_button_on_bottom_right_of_window() {
		assertTrue(importTraineePage.isTextboxDisplayed());
		assertTrue(importTraineePage.isBackBtnDisplayed());
		assertTrue(importTraineePage.isOkBtnDisplayed());
	}

	@When("As an admin click on Browse button and selects non excel file.")
	public void as_an_admin_click_on_browse_button_and_selects_non_excel_file() throws InterruptedException {
		importTraineePage.browseBtnClick1();
	}

	@Then("Admin should be able to see validation {string}")
	public void admin_should_be_able_to_see_validation(String actualFileUploadalidationText) {
		assertEquals(importTraineePage.getFileUploadValidationText(), actualFileUploadalidationText);
	}

	@Then("Admin clicks cancel button to selects the excel file again")
	public void admin_clicks_cancel_button_to_selects_the_excel_file_again() {
		importTraineePage.cancelBtnClick();
	}

	@When("On pop up window,As an admin click on Browse button and select excel file")
	public void on_pop_up_window_as_an_admin_click_on_browse_button_and_select_excel_file()
			throws InterruptedException {
		importTraineePage.browseBtnClick();
	}

	@When("On pop up window,As an admin click on ok button")
	public void on_pop_up_window_as_an_admin_click_on_ok_button() {
		importTraineePage.okBtnTextClick();
	}

	@Then("Admin should be able to redirect to  Import Attended Trainees page")
	public void admin_should_be_able_to_redirect_to_import_attended_trainees_page() {
		String ActualHeading = importAttendedTraineesPage.pageHeading();
		String ExpectedHeading = ConfigurationReader.getProperty("admins", "importAttendedTraineesHeading");
		assertEquals(ActualHeading, ExpectedHeading);
	}

	@When("admin click the apply button")
	public void admin_click_the_apply_button() {
		importAttendedTraineesPage.clickApplyBtn();
	}

	@When("admin click import trainee button")
	public void admin_click_import_trainee_button() {
		importAttendedTraineesPage.clickImportTraineeBtn();
	}

	@Given("admin select the location in import attended trainee page from the dropdown which is same as location in excel row  {string}")
	public void admin_select_the_location_in_import_attended_trainee_page_from_the_dropdown_which_is_same_as_location_in_excel_row(
			String string) throws IOException {
		int row = Integer.parseInt(string);
		importAttendedTraineesPage.clickLocationDropDown();
		Object location = excelUtilities.getCellData(filepath, xsheet, row - 1, colForLocation);
		String visualText = location.toString();
		System.out.println("location" + visualText);
		importAttendedTraineesPage.selectLocationFromDropDown(visualText);
	}

	@When("admin select the pathway in import attended trainee page from the dropdown which is same as pathway in excel row {string}")
	public void admin_select_the_pathway_in_import_attended_trainee_page_from_the_dropdown_which_is_same_as_pathway_in_excel_row(
			String string) throws IOException {
		int row = Integer.parseInt(string);
		importAttendedTraineesPage.clickPathwayDropDown();
		Object pathway = excelUtilities.getCellData(filepath, xsheet, row - 1, colForPathWay);
		String visualText = pathway.toString();
		importAttendedTraineesPage.selectPathwayFromDropDown(visualText);
	}

	@When("admin select the start date in import attended trainee page from the dropdown which is same as start date in excel row {string}")
	public void admin_select_the_start_date_in_import_attended_trainee_page_from_the_dropdown_which_is_same_as_start_date_in_excel_row(
			String string) throws IOException {
		int row = Integer.parseInt(string);
		importAttendedTraineesPage.clickStartDateDropDown();
		Object startDate = excelUtilities.getCellData(filepath, xsheet, row - 1, colForStartDate);
		String visualText = startDate.toString();
		importAttendedTraineesPage.selectStartDateFromDropDown(visualText);
	}

	@When("compare email result with what is shown in excel row {string} and fill the results to excel")
	public void compare_email_result_with_what_is_shown_in_excel_row_and_fill_the_results_to_excel(String string)
			throws IOException {
		int row = Integer.parseInt(string);
		Object expectedEmail = excelUtilities.getCellData(filepath, xsheet, row - 1, colForEmail);
		String expectedEmailText = expectedEmail.toString();
		String actualResult;
		if (expectedEmailText.equals(importAttendedTraineesPage.aidenGetText())) {
			actualResult = "Pass";
		} else {
			actualResult = "Fail";
		}
		assertEquals(importAttendedTraineesPage.aidenGetText(), expectedEmailText);
		excelUtilities.setCellData(filepath, xsheet, row - 1, colForWriteTestResult, actualResult);
	}

	@Then("admin check the already import column in excel row {string} and check coressponding message on pop up window")
	public void admin_check_the_already_import_column_in_excel_row_and_check_coressponding_message_on_pop_up_window(
			String string) throws IOException, InterruptedException {
		int row = Integer.parseInt(string);
		Object alreadyImported = excelUtilities.getCellData(filepath, xsheet, row - 1, colForAlreadyImported);
		String alreadyImportedText = alreadyImported.toString();
		System.out.println("value of already imported" + alreadyImportedText);
		String already = "True";
		if (alreadyImportedText.equals(already)) {
			assertEquals(importAttendedTraineesPage.alreadyExistedInSysValidationText(),
					"Oops the following trainee(s) already existed in the system.");
			Thread.sleep(1000);
			importAttendedTraineesPage.clickPopupCancelBtn();
		} else {
			assertEquals(importAttendedTraineesPage.successfullyAddedMsgText(), "Trainee(s) Successfully Added");
			importAttendedTraineesPage.clickokBtn();
		}
	}

	@When("In Postman, send a Get request to  {string}")
	public void in_postman_send_a_get_request_to(String uri) {
		Hooks.restAssuredUtilities.setUrl(uri);
		Hooks.restAssuredUtilities.setMethod("GET");
		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("status code {int} should be returned when get the list of trainees")
	public void status_code_should_be_returned_when_get_the_list_of_trainees(Integer int1) {
		assertThat(Hooks.response.getStatusCode(), equalTo(int1));
	}

	@When("I should see the name of trainees.")
	public void i_should_see_the_name_of_trainees(io.cucumber.datatable.DataTable table) {
		var data = table.asMaps();
		ArrayList<String> traineesFirstName = new ArrayList<>();
		ArrayList<String> traineesLastName = new ArrayList<>();

		for (Map<String, String> items : data) {
			traineesFirstName.add(items.get("firstName"));
			traineesLastName.add(items.get("lastName"));
		}
		assertThat(Hooks.response.getBody().jsonPath().get("firstName"), equalTo(traineesFirstName));
		assertThat(Hooks.response.getBody().jsonPath().get("lastName"), equalTo(traineesLastName));
	}

	@Then("I should see the trainee firstname name as {string}")
	public void i_should_see_the_trainee_firstname_name_as(String firstName) {
		assertThat(Hooks.response.getBody().jsonPath().get("firstName"), equalTo(firstName));
	}

	@Then("it should  have return  <null> body")
	public void it_should_have_return_null_body() {
		String responseBody = Hooks.response.getBody().asString();
		assertEquals("null", responseBody);
	}

	@Given("The user is logged in as an Academy admin in the TMS and click import trainee page")
	public void the_user_is_logged_in_as_an_academy_admin_in_the_tms_and_click_import_trainee_page() {
		importTraineePage.importNewTraineesButton();
	}

	@Then("Header of the import trainees page should be  {string} and it should be left aligned")
	public void header_of_the_import_trainees_page_should_be_and_it_should_be_left_aligned(String expectedMsg) {
		String actualMsg = importTraineePage.uploadFileHeadingText();
		assertEquals(actualMsg, expectedMsg);
	}

	@When("clicks profile icon of admin")
	public void clicks_profile_icon_of_admin() {
		importTraineePage.profileIconClick();
	}

	@When("admin clicks the Logout button")
	public void admin_clicks_the_logout_button() {
		importTraineePage.logoutClick();
	}
}
