package com.fdmgroup.courseowners.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;

import com.fdmgroup.academyusers.pages.HomePage;
import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.fdmgroup.courseowners.pages.CourseCataloguePage;
import com.fdmgroup.courseowners.pages.CourseOwnerPage;
import com.fdmgroup.courseowners.pages.CourseMaterialPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CourseMaterial_stepdefinitions {
	CourseCataloguePage courseCatalogue = new CourseCataloguePage();
	CourseOwnerPage courseOwner = new CourseOwnerPage();

	CourseMaterialPage courseMaterial = new CourseMaterialPage();
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();

	@When("Enters valid id and password of CourseOwner")
	public void enters_valid_id_and_password_of_course_owner() {
		loginPage.setUsername(ConfigurationReader.getProperty("courseowners", "courseOwnerUserName"));
		loginPage.setPassword(ConfigurationReader.getProperty("courseowners", "courseOwnerPassword"));

	}

	@Given("User is logged in as a Course Owner and navigate to Course Catalogue page")
	public void user_is_logged_in_as_a_course_owner_and_navigate_to_course_catalogue_page() {
		courseCatalogue.navigateToUrl(ConfigurationReader.getProperty("courseowners", "myCoursesURL"));

	}

	@Then("All the {string} should be correct and displayed in the tiles")
	public void all_the_should_be_correct_and_displayed_in_the_tiles(String string) {

	}

	@When("User should be able to see Go to material button under each course in course tile")
	public void user_should_be_able_to_see_go_to_material_button_under_each_course_in_course_tile() {

		courseCatalogue.navigateToUrl(ConfigurationReader.getProperty("courseowners", "myCoursesURL"));
	}

	@When("User is able to click on Proskills go to material button")
	public void user_is_able_to_click_on_proskills_go_to_material_button() {
		courseOwner.clickProskillMaterialButton();
		BrowserUtilities.implicitWait(2000);
	}

	@Then("User is redirected to Proskills course material button")
	public void user_is_redirected_to_proskills_course_material_button() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtProskills")), courseOwner.getProskills());
	}

	@Then("User is able to click on go to OOD material button")
	public void user_is_able_to_click_on_go_to_ood_material_button() {
		courseOwner.clickOODMaterialButton();
	}

	@Then("User is redirected to OOD course material button")
	public void user_is_redirected_to_ood_course_material_button() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtOOD")), courseOwner.getOOD());
	}

	@Then("User is able to click on Botium go to material button")
	public void user_is_able_to_click_on_botium_go_to_material_button() {
		courseOwner.clickBotiumMaterialButton();
	}

	@Then("User is redirected to Botium course material button")
	public void user_is_redirected_to_botium_course_material_button() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtBotium")), courseOwner.getBotium());
	}

	@Then("User is able to click on Business Analysis go to material button")
	public void user_is_able_to_click_on_business_analysis_go_to_material_button() {
		courseOwner.clickBusinessAnalysisMaterialButton();
	}

	@Then("User is redirected to Business Analysis course material button")
	public void user_is_redirected_to_business_analysis_course_material_button() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtBusinessAnalysis")),
				courseOwner.getBusinessAnalysis());
	}

	@Then("User is able to click on Excel go to material button")
	public void user_is_able_to_click_on_excel_go_to_material_button() {
		courseOwner.clickExcelMaterialButton();
	}

	@Then("User is redirected to Excel course material button")
	public void user_is_redirected_to_excel_course_material_button() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtExcel")), courseOwner.getExcel());
	}

	@Then("User is able to click on Git go to material button")
	public void user_is_able_to_click_on_git_go_to_material_button() {
		courseOwner.clickGitMaterialButton();
	}

	@Then("User is redirected to Git course material button")
	public void user_is_redirected_to_git_course_material_button() {
		assertEquals((ConfigurationReader.getProperty("courseowners", "txtGit")), courseOwner.getGit());
	}

	@When("User should be able to see Course name is same as in course catalogue")
	public void user_should_be_able_to_see_course_name_is_same_as_in_course_catalogue() {

	}

	@When("User is on ProSkills course Material Page")
	public void user_is_on_pro_skills_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));

	}

	@Then("User should be able to see a table with rows and columns on ProSkills course Material Page")
	public void user_should_be_able_to_see_a_table_with_rows_and_columns_on_pro_skills_course_material_page() {
		courseMaterial.getDataTable();
	}

	@When("User is on OOD course Material Page")
	public void user_is_on_ood_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));

	}

	@Then("User should be able to see a table with rows and columns on OOD course Material Page")
	public void user_should_be_able_to_see_a_table_with_rows_and_columns_on_ood_course_material_page() {
		courseMaterial.getDataTable();
	}

	@When("User is on Botium course Material Page")
	public void user_is_on_botium_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));
	}

	@Then("User should be able to see a table with rows and columns	on Botium course Material Page")
	public void user_should_be_able_to_see_a_table_with_rows_and_columns_on_botium_course_material_page() {
		courseMaterial.getDataTable();
	}

	@When("User is on Business Analysis course Material Page")
	public void user_is_on_business_analysis_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
	}

	@Then("User should be able to see a table with rows and columns	on Business Analysis course Material Page")
	public void user_should_be_able_to_see_a_table_with_rows_and_columns_on_business_analysis_course_material_page() {
		courseMaterial.getDataTable();
	}

	@When("User is on Excel course Material Page")
	public void user_is_on_excel_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
	}

	@Then("User should be able to see a table with rows and columns on Excel course Material Page")
	public void user_should_be_able_to_see_a_table_with_rows_and_columns_on_excel_course_material_page() {
		courseMaterial.getDataTable();
	}

	@When("User is on Git course Material Page")
	public void user_is_on_git_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
	}

	@Then("User should be able to see a table with rows and columns	on Git course Material Page")
	public void user_should_be_able_to_see_a_table_with_rows_and_columns_on_git_course_material_page() {
		courseMaterial.getDataTable();
	}

	@Then("User should be able to verify if check box is available on ProSkills course Material Page")
	public void user_should_be_able_to_verify_if_check_box_is_available_on_pro_skills_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));

	}

	@Then("user can  select or unselect file")
	public void user_can_select_or_unselect_file() {
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
	}

	@Then("User should be able to verify if check box is available on OOD course Material Page")
	public void user_should_be_able_to_verify_if_check_box_is_available_on_ood_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));

	}

	@Then("user can  select or unselect file on OOD")
	public void user_can_select_or_unselect_file_on_ood() {
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
	}

	@Then("User should be able to verify if check box is available on Botium course Material Page")
	public void user_should_be_able_to_verify_if_check_box_is_available_on_botium_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));

	}

	@Then("user can  select or unselect file on Botium")
	public void user_can_select_or_unselect_file_on_botium() {
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
	}

	@Then("User should be able to verify if check box is available on Business Analysis course Material Page")
	public void user_should_be_able_to_verify_if_check_box_is_available_on_business_analysis_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
	}

	@Then("user can  select or unselect file on Business Analysis")
	public void user_can_select_or_unselect_file_on_business_analysis() {
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
	}

	@Then("User should be able to verify if check box is available on Excel course Material Page")
	public void user_should_be_able_to_verify_if_check_box_is_available_on_excel_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
	}

	@Then("user can  select or unselect file on Excel")
	public void user_can_select_or_unselect_file_on_excel() {
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
	}

	@Then("User should be able to verify if check box is available on Git course Material Page")
	public void user_should_be_able_to_verify_if_check_box_is_available_on_git_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
	}

	@Then("user can  select or unselect file on Git")
	public void user_can_select_or_unselect_file_on_git() {
		courseMaterial.checkRow();
		courseMaterial.getBackgroundColour();
	}

	@Then("User check if there is filename given to each file on ProSkills course Material Page")
	public void user_check_if_there_is_filename_given_to_each_file_on_pro_skills_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));
		courseOwner.getFileName();
	}

	@Then("User check if there is filename given to each file on OOD course Material Page")
	public void user_check_if_there_is_filename_given_to_each_file_on_ood_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));
		courseOwner.getFileName();
	}

	@Then("User check if there is filename given to each file on Business Analysis course Material Page")
	public void user_check_if_there_is_filename_given_to_each_file_on_business_analysis_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
		courseOwner.getFileName();
	}

	@Then("User check if there is filename given to each file on Botium course Material Page")
	public void user_check_if_there_is_filename_given_to_each_file_on_botium_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));

		courseOwner.getFileName();
	}

	@Then("User check if there is filename given to each file on Excel course Material Page")
	public void user_check_if_there_is_filename_given_to_each_file_on_excel_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
		courseOwner.getFileName();
	}

	@Then("User check if there is filename given to each file on Git course Material Page")
	public void user_check_if_there_is_filename_given_to_each_file_on_git_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
		courseOwner.getFileName();
	}

	@Then("User should be able to check modification date column in the Proskills course material")
	public void user_should_be_able_to_check_modification_date_column_in_the_proskills_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));
		courseOwner.getDateModified();
	}

	@Then("User should be able to check modification date column in the OOD course material")
	public void user_should_be_able_to_check_modification_date_column_in_the_ood_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));
		courseOwner.getDateModified();
	}

	@Then("User should be able to check modification date column in the Business Analysis course material")
	public void user_should_be_able_to_check_modification_date_column_in_the_business_analysis_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
		courseOwner.getDateModified();
	}

	@Then("User should be able to check modification date column in the Botium course material")
	public void user_should_be_able_to_check_modification_date_column_in_the_botium_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));
		courseOwner.getDateModified();
	}

	@Then("User should be able to check modification date column in the Excel course material")
	public void user_should_be_able_to_check_modification_date_column_in_the_excel_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
		courseOwner.getDateModified();
	}

	@Then("User should be able to check modification date column in the Git course material")
	public void user_should_be_able_to_check_modification_date_column_in_the_git_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
		courseOwner.getDateModified();
	}

	@Then("User should be able to check if size column is displayed  in the ProSkills course material")
	public void user_should_be_able_to_check_if_size_column_is_displayed_in_the_pro_skills_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));
		courseOwner.getSize();
	}

	@Then("User should be able to check if size column is displayed  in the OOD course material")
	public void user_should_be_able_to_check_if_size_column_is_displayed_in_the_ood_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));
		courseOwner.getSize();
	}

	@Then("User should be able to check if size column is displayed  in the Business Analysis course material")
	public void user_should_be_able_to_check_if_size_column_is_displayed_in_the_business_analysis_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
		courseOwner.getSize();
	}

	@Then("User should be able to check if size column is displayed  in the Botium course material")
	public void user_should_be_able_to_check_if_size_column_is_displayed_in_the_botium_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));
		courseOwner.getSize();
	}

	@Then("User should be able to check if size column is displayed  in the Excel course material")
	public void user_should_be_able_to_check_if_size_column_is_displayed_in_the_excel_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
		courseOwner.getSize();
	}

	@Then("User should be able to check if size column is displayed  in the Git course material")
	public void user_should_be_able_to_check_if_size_column_is_displayed_in_the_git_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
		courseOwner.getSize();
	}

	@Then("User should be able to check if view icon of an eye shape is availble in the row to view  the Proskills course material")
	public void user_should_be_able_to_check_if_view_icon_of_an_eye_shape_is_availble_in_the_row_to_view_the_proskills_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));
		courseOwner.getView();
	}

	@Then("User should be able to check if view icon of an eye shape is availble in the row to view  the OOD course material")
	public void user_should_be_able_to_check_if_view_icon_of_an_eye_shape_is_availble_in_the_row_to_view_the_ood_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));
		courseOwner.getView();
	}

	@Then("User should be able to check if view icon of an eye shape is availble in the row to view  the Business Analysis course material")
	public void user_should_be_able_to_check_if_view_icon_of_an_eye_shape_is_availble_in_the_row_to_view_the_business_analysis_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
		courseOwner.getView();
	}

	@Then("User should be able to check if view icon of an eye shape is availble in the row to view  the Botium course material")
	public void user_should_be_able_to_check_if_view_icon_of_an_eye_shape_is_availble_in_the_row_to_view_the_botium_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));
		courseOwner.getView();
	}

	@Then("User should be able to check if view icon of an eye shape is availble in the row to view  the Excel course material")
	public void user_should_be_able_to_check_if_view_icon_of_an_eye_shape_is_availble_in_the_row_to_view_the_excel_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
		courseOwner.getView();
	}

	@Then("User should be able to check if view icon of an eye shape is availble in the row to view  the Git course material")
	public void user_should_be_able_to_check_if_view_icon_of_an_eye_shape_is_availble_in_the_row_to_view_the_git_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
		courseOwner.getView();
	}

	@Then("User should be able to check if download icon of a downward arrow is availble in the row to download the Proskills course material")
	public void user_should_be_able_to_check_if_download_icon_of_a_downward_arrow_is_availble_in_the_row_to_download_the_proskills_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));
		courseOwner.getDownloadIcon();
	}

	@Then("User should be able to check if download icon of a downward arrow is availble in the row to download the OOD course material")
	public void user_should_be_able_to_check_if_download_icon_of_a_downward_arrow_is_availble_in_the_row_to_download_the_ood_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));
		courseOwner.getDownloadIcon();
	}

	@Then("User should be able to check if download icon of a downward arrow is availble in the row to download the Business Analysis course material")
	public void user_should_be_able_to_check_if_download_icon_of_a_downward_arrow_is_availble_in_the_row_to_download_the_business_analysis_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
		courseOwner.getDownloadIcon();
	}

	@Then("User should be able to check if download icon of a downward arrow is availble in the row to download the Botium course material")
	public void user_should_be_able_to_check_if_download_icon_of_a_downward_arrow_is_availble_in_the_row_to_download_the_botium_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));
		courseOwner.getDownloadIcon();
	}

	@Then("User should be able to check if download icon of a downward arrow is availble in the row to download the Excel course material")
	public void user_should_be_able_to_check_if_download_icon_of_a_downward_arrow_is_availble_in_the_row_to_download_the_excel_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
		courseOwner.getDownloadIcon();
	}

	@Then("User should be able to check if download icon of a downward arrow is availble in the row to download the Git course material")
	public void user_should_be_able_to_check_if_download_icon_of_a_downward_arrow_is_availble_in_the_row_to_download_the_git_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
		courseOwner.getDownloadIcon();
	}

	@Then("User should be able to check if delete icon  is availble in the row to delete any file in   the Proskills course material")
	public void user_should_be_able_to_check_if_delete_icon_is_availble_in_the_row_to_delete_any_file_in_the_proskills_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));
		courseOwner.getDeleteIcon();
	}

	@Then("User should be able to check if delete icon  is availble in the row to delete any file in   the OOD course material")
	public void user_should_be_able_to_check_if_delete_icon_is_availble_in_the_row_to_delete_any_file_in_the_ood_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));
		courseOwner.getDeleteIcon();
	}

	@Then("User should be able to check if delete icon  is availble in the row to delete any file in  the Business Analysis course material")
	public void user_should_be_able_to_check_if_delete_icon_is_availble_in_the_row_to_delete_any_file_in_the_business_analysis_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
		courseOwner.getDeleteIcon();
	}

	@Then("User should be able to check if delete icon  is availble in the row to delete any file in   the Botium course material")
	public void user_should_be_able_to_check_if_delete_icon_is_availble_in_the_row_to_delete_any_file_in_the_botium_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));
		courseOwner.getDeleteIcon();
	}

	@Then("User should be able to check if delete icon  is availble in the row to delete any file in   the Excel course material")
	public void user_should_be_able_to_check_if_delete_icon_is_availble_in_the_row_to_delete_any_file_in_the_excel_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
		courseOwner.getDeleteIcon();
	}

	@Then("User should be able to check if delete icon  is availble in the row to delete any file in   the Git course material")
	public void user_should_be_able_to_check_if_delete_icon_is_availble_in_the_row_to_delete_any_file_in_the_git_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
		courseOwner.getDeleteIcon();
	}

	@Then("User should be able to check if Archive\\/Unarchive Icon is availble in a dropbox shape  to Archive\\/Unarchive the file from  the Proskills course material")
	public void user_should_be_able_to_check_if_archive_unarchive_icon_is_availble_in_a_dropbox_shape_to_archive_unarchive_the_file_from_the_proskills_course_material() {
		courseOwner.getArchiveUnarchive();
	}

	@Then("User should be able to check if Archive\\/Unarchive Icon is availble in a dropbox shape  to Archive\\/Unarchive the file from  the OOD course material")
	public void user_should_be_able_to_check_if_archive_unarchive_icon_is_availble_in_a_dropbox_shape_to_archive_unarchive_the_file_from_the_ood_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));
		courseOwner.getArchiveUnarchive();
	}

	@Then("User should be able to check if Archive\\/Unarchive Icon is availble in a dropbox shape  to Archive\\/Unarchive the file from  the Business Analysis course material")
	public void user_should_be_able_to_check_if_archive_unarchive_icon_is_availble_in_a_dropbox_shape_to_archive_unarchive_the_file_from_the_business_analysis_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));
		courseOwner.getArchiveUnarchive();
	}

	@Then("User should be able to check if Archive\\/Unarchive Icon is availble in a dropbox shape  to Archive\\/Unarchive the file from  the Botium course material")
	public void user_should_be_able_to_check_if_archive_unarchive_icon_is_availble_in_a_dropbox_shape_to_archive_unarchive_the_file_from_the_botium_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "botiumURL"));
		courseOwner.getArchiveUnarchive();
	}

	@Then("User should be able to check if Archive\\/Unarchive Icon is availble in a dropbox shape  to Archive\\/Unarchive the file from  the Excel course material")
	public void user_should_be_able_to_check_if_archive_unarchive_icon_is_availble_in_a_dropbox_shape_to_archive_unarchive_the_file_from_the_excel_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));
		courseOwner.getArchiveUnarchive();
	}

	@Then("User should be able to check if Archive\\/Unarchive Icon is availble in a dropbox shape  to Archive\\/Unarchive the file from  the Git course material")
	public void user_should_be_able_to_check_if_archive_unarchive_icon_is_availble_in_a_dropbox_shape_to_archive_unarchive_the_file_from_the_git_course_material() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
		courseOwner.getArchiveUnarchive();

	}

	@When("a GET request is made to {string}")
	public void sendGetRequest(String endpoint) {
		Hooks.restAssuredUtilities.setUrl(endpoint);
		Hooks.restAssuredUtilities.setMethod("GET");
		Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}

	@Then("the response status code should be {int}")
	public void verifyStatusCode(int expectedStatusCode) {
		int actualStatusCode = Hooks.response.getStatusCode();
		Assert.assertEquals(expectedStatusCode, actualStatusCode);
	}

	@Then("the response should contain the following details:")
	public void the_response_should_contain_the_following_details(io.cucumber.datatable.DataTable dataTable) {
		dataTable.asMaps(String.class, String.class).forEach(dataRow -> {
			String columnName = dataRow.get("course");
			String expectedValue = dataRow.get("course");

			// Fetch data from your TMS database and compare with the expected value
			String actualValue = fetchDataFromTMSDatabase(columnName);
			Assert.assertEquals(expectedValue, actualValue);
		});
	}

	// Implement a method to fetch data from your TMS database
	private String fetchDataFromTMSDatabase(String columnName) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/tms";
		String dbUser = "root";
		String dbPassword = "Meharnav@11";
		String query = "SELECT " + columnName + " FROM course-material WHERE courseMaterial_id=1";
		try {
			Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			if (resultSet.next()) {
				return resultSet.getString(columnName);
			}

			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

/////////////////////////////Sprint3////////////////////////////////////////////////////////

	@Given("User is logged in as a Course Owner")
	public void user_is_logged_in_as_a_course_owner() {
		courseCatalogue.navigateToUrl(ConfigurationReader.getProperty("courseowners", "myCoursesURL"));
	}

	@Given("User is able to navigate on Proskills course material page")
	public void user_is_able_to_navigate_on_proskills_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "proSkillsURL"));

	}

	@Then("There should be a course material filter download after search button in Proskills")
	public void there_should_be_a_course_material_filter_download_after_search_button_in_proskills() {
		courseOwner.getFilter();
	}

	@Then("There should be all materials placehholder in  Proskills drop down menu")
	public void there_should_be_all_materials_placehholder_in_proskills_drop_down_menu() {
		courseOwner.getAllMaterials();
	}

	@Then("There should be Current Materials placehholder in Proskills drop down menu")
	public void there_should_be_current_materials_placehholder_in_proskills_drop_down_menu() {
		courseOwner.getCurrentMaterials();
	}

	@Then("There should be Archived Materials placehholder in Proskills drop down menu")
	public void there_should_be_archived_materials_placehholder_in_proskills_drop_down_menu() {
		courseOwner.getArchivedMaterials();
	}

	@Then("User is able to navigate on OOD course material page")
	public void user_is_able_to_navigate_on_ood_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "oodURL"));

	}

	@Then("There should be a course material filter download after search button in OOD")
	public void there_should_be_a_course_material_filter_download_after_search_button_in_ood() {
		courseOwner.getFilter();
	}

	@Then("There should be all materials placehholder in OOD drop down menu")
	public void there_should_be_all_materials_placehholder_in_ood_drop_down_menu() {
		courseOwner.getAllMaterials();
	}

	@Then("There should be Current Materials placehholder in OOD drop down menu")
	public void there_should_be_current_materials_placehholder_in_ood_drop_down_menu() {
		courseOwner.getCurrentMaterials();
	}

	@Then("There should be Archived Materials placehholder in OOD drop down menu")
	public void there_should_be_archived_materials_placehholder_in_ood_drop_down_menu() {
		courseOwner.getArchivedMaterials();
	}

	@Then("User is able to navigate on Business Analysis course material page")
	public void user_is_able_to_navigate_on_business_analysis_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "businessAnalysisURL"));

	}

	@Then("There should be a course material filter download after search button in Business Analysis")
	public void there_should_be_a_course_material_filter_download_after_search_button_in_business_analysis() {
		courseOwner.getFilter();
	}

	@Then("There should be all materials placehholder in Business Analysis drop down menu")
	public void there_should_be_all_materials_placehholder_in_business_analysis_drop_down_menu() {
		courseOwner.getAllMaterials();
	}

	@Then("There should be Current Materials placehholder in Business Analysis drop down menu")
	public void there_should_be_current_materials_placehholder_in_business_analysis_drop_down_menu() {
		courseOwner.getCurrentMaterials();
	}

	@Then("There should be select Archived Materials placehholder in Business Analysis drop down menu")
	public void there_should_be_select_archived_materials_placehholder_in_business_analysis_drop_down_menu() {
		courseOwner.getArchivedMaterials();
	}

	@Then("User is able to navigate on Excel course material page")
	public void user_is_able_to_navigate_on_excel_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "excelURL"));

	}

	@Then("There should be a course material filter download after search button in Excel")
	public void there_should_be_a_course_material_filter_download_after_search_button_in_excel() {
		courseOwner.getFilter();
	}

	@Then("There should be all materials placehholder in Excel drop down menu")
	public void there_should_be_all_materials_placehholder_in_excel_drop_down_menu() {
		courseOwner.getAllMaterials();
	}

	@Then("There should be Current Materials placehholder in Excel drop down menu")
	public void there_should_be_current_materials_placehholder_in_excel_drop_down_menu() {
		courseOwner.getCurrentMaterials();
	}

	@Then("There should be Archived Materials placehholder in Excel drop down menu")
	public void there_should_be_archived_materials_placehholder_in_excel_drop_down_menu() {
		courseOwner.getArchivedMaterials();
	}

	@Then("User is able to navigate on Git course material page")
	public void user_is_able_to_navigate_on_git_course_material_page() {
		courseOwner.navigateToUrl(ConfigurationReader.getProperty("courseowners", "gitURL"));
	}

	@Then("There should be a course material filter download after search button in Git")
	public void there_should_be_a_course_material_filter_download_after_search_button_in_git() {
		courseOwner.getFilter();
	}

	@Then("There should be all materials placehholder in Git drop down menu")
	public void there_should_be_all_materials_placehholder_in_git_drop_down_menu() {
		courseOwner.getAllMaterials();
	}

	@Then("There should be Current Materials placehholder in Git drop down menu")
	public void there_should_be_current_materials_placehholder_in_git_drop_down_menu() {
		courseOwner.getCurrentMaterials();
	}

	@Then("There should be Archived Materials placehholder in Git drop down menu")
	public void there_should_be_archived_materials_placehholder_in_git_drop_down_menu() {
		courseOwner.getArchivedMaterials();
	}

	@Then("User should be able to select a {string} placehholder in Proskills drop down menu")
	public void user_should_be_able_to_select_a_placehholder_in_proskills_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select the {string} placehholder in Proskills drop down menu")
	public void user_should_be_able_to_select_the_placehholder_in_proskills_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select an {string} placehholder in Proskills drop down menu")
	public void user_should_be_able_to_select_an_placehholder_in_proskills_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select a {string} placehholder in OOD drop down menu")
	public void user_should_be_able_to_select_a_placehholder_in_ood_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select the {string} placehholder in OOD drop down menu")
	public void user_should_be_able_to_select_the_placehholder_in_ood_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select an {string} placehholder in OOD drop down menu")
	public void user_should_be_able_to_select_an_placehholder_in_ood_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select a {string} placehholder in Business Analysis drop down menu")
	public void user_should_be_able_to_select_a_placehholder_in_business_analysis_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select the {string} placehholder in Business Analysis drop down menu")
	public void user_should_be_able_to_select_the_placehholder_in_business_analysis_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select an {string} placehholder in Business Analysis drop down menu")
	public void user_should_be_able_to_select_an_placehholder_in_business_analysis_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select a {string} placehholder in Excel drop down menu")
	public void user_should_be_able_to_select_a_placehholder_in_excel_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select the {string} placehholder in Excel drop down menu")
	public void user_should_be_able_to_select_the_placehholder_in_excel_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select an {string} placehholder in Excel drop down menu")
	public void user_should_be_able_to_select_an_placehholder_in_excel_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select a {string} placehholder in Git drop down menu")
	public void user_should_be_able_to_select_a_placehholder_in_git_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select the {string} placehholder in Git drop down menu")
	public void user_should_be_able_to_select_the_placehholder_in_git_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to select an {string} placehholder in Git drop down menu")
	public void user_should_be_able_to_select_an_placehholder_in_git_drop_down_menu(String string) {
		courseOwner.getFilter();

		if (string.equals("All Materials")) {
			courseOwner.getAllMaterials();
		} else if (string.equals("Current Materials")) {
			courseOwner.getCurrentMaterials();
		} else if (string.equals("Archived Materials")) {
			courseOwner.getArchivedMaterials();
		} else {

		}
	}

	@Then("User should be able to UnCheck\\/UnSelect All Materials placehholder in Proskills drop down menu")
	public void user_should_be_able_to_un_check_un_select_all_materials_placehholder_in_proskills_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getAllMaterials();

		courseOwner.uncheckAllMaterialsPlaceholder();

	}

	@Then("User should be able to UnCheck\\/UnSelect Current Materials placehholder in Proskills drop down menu")
	public void user_should_be_able_to_un_check_un_select_current_materials_placehholder_in_proskills_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getCurrentMaterials();
		courseOwner.uncheckCurrentMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Archived Materials placehholder in Proskills drop down menu")
	public void user_should_be_able_to_un_check_un_select_archived_materials_placehholder_in_proskills_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getArchivedMaterials();
		courseOwner.uncheckArchivedMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect All Materials placehholder in OOD drop down menu")
	public void user_should_be_able_to_un_check_un_select_all_materials_placehholder_in_ood_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getAllMaterials();

		courseOwner.uncheckAllMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Current Materials placehholder in OOD drop down menu")
	public void user_should_be_able_to_un_check_un_select_current_materials_placehholder_in_ood_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getCurrentMaterials();
		courseOwner.uncheckCurrentMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Archived Materials placehholder in OOD drop down menu")
	public void user_should_be_able_to_un_check_un_select_archived_materials_placehholder_in_ood_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getArchivedMaterials();
		courseOwner.uncheckArchivedMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect All Materials placehholder in Business Analysis drop down menu")
	public void user_should_be_able_to_un_check_un_select_all_materials_placehholder_in_business_analysis_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getAllMaterials();

		courseOwner.uncheckAllMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Current Materials placehholder in Business Analysis drop down menu")
	public void user_should_be_able_to_un_check_un_select_current_materials_placehholder_in_business_analysis_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getCurrentMaterials();
		courseOwner.uncheckCurrentMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Archived Materials placehholder in Business Analysis drop down menu")
	public void user_should_be_able_to_un_check_un_select_archived_materials_placehholder_in_business_analysis_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getArchivedMaterials();
		courseOwner.uncheckArchivedMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect All Materials placehholder in Excel drop down menu")
	public void user_should_be_able_to_un_check_un_select_all_materials_placehholder_in_excel_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getAllMaterials();

		courseOwner.uncheckAllMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Current Materials placehholder in Excel drop down menu")
	public void user_should_be_able_to_un_check_un_select_current_materials_placehholder_in_excel_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getCurrentMaterials();
		courseOwner.uncheckCurrentMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Archived Materials placehholder in Excel drop down menu")
	public void user_should_be_able_to_un_check_un_select_archived_materials_placehholder_in_excel_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getArchivedMaterials();
		courseOwner.uncheckArchivedMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect All Materials placehholder in Git drop down menu")
	public void user_should_be_able_to_un_check_un_select_all_materials_placehholder_in_git_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getAllMaterials();

		courseOwner.uncheckAllMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Current Materials placehholder in Git drop down menu")
	public void user_should_be_able_to_un_check_un_select_current_materials_placehholder_in_git_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getCurrentMaterials();
		courseOwner.uncheckCurrentMaterialsPlaceholder();
	}

	@Then("User should be able to UnCheck\\/UnSelect Archived Materials placehholder in Git drop down menu")
	public void user_should_be_able_to_un_check_un_select_archived_materials_placehholder_in_git_drop_down_menu() {
		courseOwner.getFilter();
		courseOwner.getArchivedMaterials();
		courseOwner.uncheckArchivedMaterialsPlaceholder();
	}

	@Then("User should be able to  select bulk action drop down list in OOD")
	public void user_should_be_able_to_select_bulk_action_drop_down_list_in_ood() {
		courseOwner.getBulkElementFilter();
	}

	@Then("User should be able to  select bulk action drop down list in Business Analysis")
	public void user_should_be_able_to_select_bulk_action_drop_down_list_in_business_analysis() {
		courseOwner.getBulkElementFilter();
	}

	@Then("User should be able to  select bulk action drop down list in Excel")
	public void user_should_be_able_to_select_bulk_action_drop_down_list_in_excel() {
		courseOwner.getBulkElementFilter();
	}

	@Then("User should be able to  select bulk action drop down list in Git")
	public void user_should_be_able_to_select_bulk_action_drop_down_list_in_git() {
		courseOwner.getBulkElementFilter();
	}

	@Then("There should be a Download Placeholder in select bulk action drop down list in Proskills")
	public void there_should_be_a_download_placeholder_in_select_bulk_action_drop_down_list_in_proskills() {
		courseOwner.getDownloadItem();
	}

	@Then("There should be a Download Placeholder in select bulk action drop down list in OOD")
	public void there_should_be_a_download_placeholder_in_select_bulk_action_drop_down_list_in_ood() {
		courseOwner.getDownloadItem();
	}

	@Then("There should be a Download Placeholder in select bulk action drop down list in Business Analysis")
	public void there_should_be_a_download_placeholder_in_select_bulk_action_drop_down_list_in_business_analysis() {
		courseOwner.getDownloadItem();
	}

	@Then("There should be a Download Placeholder in select bulk action drop down list in Excel")
	public void there_should_be_a_download_placeholder_in_select_bulk_action_drop_down_list_in_excel() {
		courseOwner.getDownloadItem();
	}

	@Then("There should be a Download Placeholder in select bulk action drop down list in Git")
	public void there_should_be_a_download_placeholder_in_select_bulk_action_drop_down_list_in_git() {
		courseOwner.getDownloadItem();
	}

	@Then("There should be a Delete Placeholder in select bulk action drop down list in Proskills")
	public void there_should_be_a_delete_placeholder_in_select_bulk_action_drop_down_list_in_proskills() {
		courseOwner.getDeleteItem();
	}

	@Then("There should be a Delete Placeholder in select bulk action drop down list in OOD")
	public void there_should_be_a_delete_placeholder_in_select_bulk_action_drop_down_list_in_ood() {
		courseOwner.getDeleteItem();
	}

	@Then("There should be a Delete Placeholder in select bulk action drop down list in Business Analysis")
	public void there_should_be_a_delete_placeholder_in_select_bulk_action_drop_down_list_in_business_analysis() {
		courseOwner.getDeleteItem();
	}

	@Then("There should be a Delete Placeholder in select bulk action drop down list in Excel")
	public void there_should_be_a_delete_placeholder_in_select_bulk_action_drop_down_list_in_excel() {
		courseOwner.getDeleteItem();
	}

	@Then("There should be a Delete Placeholder in select bulk action drop down list in Git")
	public void there_should_be_a_delete_placeholder_in_select_bulk_action_drop_down_list_in_git() {
		courseOwner.getDeleteItem();
	}

	@Then("There should be a Archive Placeholder in select bulk action drop down list in Proskills")
	public void there_should_be_a_archive_placeholder_in_select_bulk_action_drop_down_list_in_proskills() {
		courseOwner.getArchiveItem();
	}

	@Then("There should be a Archive Placeholder in select bulk action drop down list in OOD")
	public void there_should_be_a_archive_placeholder_in_select_bulk_action_drop_down_list_in_ood() {
		courseOwner.getArchiveItem();
	}

	@Then("There should be a Archive Placeholder in select bulk action drop down list in Business Analysis")
	public void there_should_be_a_archive_placeholder_in_select_bulk_action_drop_down_list_in_business_analysis() {
		courseOwner.getArchiveItem();
	}

	@Then("There should be a Archive Placeholder in select bulk action drop down list in Excel")
	public void there_should_be_a_archive_placeholder_in_select_bulk_action_drop_down_list_in_excel() {
		courseOwner.getArchiveItem();
	}

	@Then("There should be a Archive Placeholder in select bulk action drop down list in Git")
	public void there_should_be_a_archive_placeholder_in_select_bulk_action_drop_down_list_in_git() {
		courseOwner.getArchiveItem();
	}

	@Then("There should be a UnArchive Placeholder in select bulk action drop down list in Proskills")
	public void there_should_be_a_un_archive_placeholder_in_select_bulk_action_drop_down_list_in_proskills() {
		courseOwner.getUnArchiveItem();
	}

	@Then("There should be a UnArchive Placeholder in select bulk action drop down list in OOD")
	public void there_should_be_a_un_archive_placeholder_in_select_bulk_action_drop_down_list_in_ood() {
		courseOwner.getUnArchiveItem();

	}

	@Then("There should be a UnArchive Placeholder in select bulk action drop down list in Business Analysis")
	public void there_should_be_a_un_archive_placeholder_in_select_bulk_action_drop_down_list_in_business_analysis() {
		courseOwner.getUnArchiveItem();
	}

	@Then("There should be a UnArchive Placeholder in select bulk action drop down list in Excel")
	public void there_should_be_a_un_archive_placeholder_in_select_bulk_action_drop_down_list_in_excel() {
		courseOwner.getUnArchiveItem();
	}

	@Then("There should be a UnArchive Placeholder in select bulk action drop down list in Git")
	public void there_should_be_a_un_archive_placeholder_in_select_bulk_action_drop_down_list_in_git() {
		courseOwner.getUnArchiveItem();
	}

//API Testing sprint 5

	@Given("a POST request is made to {string} with the following data:")
	public void a_POST_request_is_made_to_with_the_following_data(String endpoint, String requestBody) {
		Hooks.restAssuredUtilities.setUrl(endpoint);
		Hooks.restAssuredUtilities.setMethod("POST");
		Hooks.restAssuredUtilities.addBody(requestBody);
		System.out.println("Request Body: " + requestBody);
		System.out.println("Response Body: " + Hooks.response.getBody().asString());
		System.out.println("Actual Status Code: " + Hooks.response.getStatusCode());
	}

@Then("the response status  should  {int}")
public void the_response_status_should(int expectedStatusCode) {
	int actualStatusCode = Hooks.response.getStatusCode();
	Assert.assertEquals(expectedStatusCode, actualStatusCode);
}
	@Given("a PUT request is made to {string} with the following data:")
	public void a_PUT_request_is_made_to_with_the_following_data(String endpoint, String requestBody) {
		Hooks.restAssuredUtilities.setUrl(endpoint);
		Response response = RestAssured.given().contentType(ContentType.JSON).body(requestBody).put(endpoint);
	}

	@Given("a DELETE request is made to {string}")
	public void a_delete_request_is_made_to(String url) {
		Hooks.restAssuredUtilities.setUrl(url);
		Response response = RestAssured.delete(url);
	}

	@When("Course Owner hovers over file row on Course List Page")
	public void course_owner_hovers_over_file_row_on_course_list_page() {
		courseMaterial.hoverOverFirstFileName();
	}

	@Then("Rename Icon Appears beside file name")
	public void rename_icon_appears_beside_file_name() {
	    Assert.assertTrue(courseMaterial.renameOptionIsAvailable());
	}
	
	@When("Course Owner clicks Rename Icon")
	public void course_owner_clicks_rename_icon() {
		courseMaterial.clickRenameIcon();
	}

	@Then("File name becomes editable with {string}")
	public void file_name_becomes_editable_with(String string) {
		courseMaterial.sendKeysToRenameFile(string);
	}
	
	@When("Click in empty space")
	public void click_in_empty_space() {
	    courseMaterial.clickInEmptySpace();
	}

	@Then("File name should be {string}")
	public void file_name_should_be(String string) {
	    Assert.assertTrue(courseMaterial.getFileName().equals(string));
	}

	@When("Change full file name to {string}")
	public void change_full_file_name_to(String string) {
		courseMaterial.setFileName(string);
	}
}
