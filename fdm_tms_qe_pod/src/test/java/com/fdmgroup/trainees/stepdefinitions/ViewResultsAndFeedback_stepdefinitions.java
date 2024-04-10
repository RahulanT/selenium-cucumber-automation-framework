package com.fdmgroup.trainees.stepdefinitions;

import com.fdmgroup.trainees.pages.ViewResultsAndFeedbackPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ViewResultsAndFeedback_stepdefinitions {
	ViewResultsAndFeedbackPage resultsAndFeedback = new ViewResultsAndFeedbackPage();
	
	@Then("The user is redirected to the results and feedback page")
	public void the_user_is_redirected_to_the_results_and_feedback_page() throws InterruptedException {
		resultsAndFeedback.navigateToViewResultsAndFeedbackPage();
	}

	@Then("The table content should be displayed accordingly per column")
	public void the_table_content_should_be_displayed_accordingly_per_column() throws InterruptedException {
		resultsAndFeedback.verifyTableHeaderOrder();
	}
	
	@When("The user observes the results and feedback page")
	public void the_user_observes_the_results_and_feedback_page() throws InterruptedException {
		resultsAndFeedback.navigateToViewResultsAndFeedbackPage();
	}

	@Then("Table column should follow the following order: Course, Start Date, End Date, Trainer, Results\\/feedback")
	public void table_column_should_follow_the_following_order_course_start_date_end_date_trainer_results_feedback() throws InterruptedException {
		resultsAndFeedback.verifyTableContent();
	}
	
	@Then("The trainee`s profile card is displayed on the right side of the table")
	public void the_trainee_s_profile_card_is_displayed_on_the_right_side_of_the_table() {
		resultsAndFeedback.profileCardIsOnTheRight();
	}
	
	@When("The user hovers over table rows")
	public void the_user_hovers_over_table_rows() throws InterruptedException {
		resultsAndFeedback.hoverOverTableRow();
	}

	@Then("Hovered row turns into light blue")
	public void hovered_row_turns_into_light_blue() throws InterruptedException {
		resultsAndFeedback.verifyLightBlue();
	}

	@When("The user hovers away from table rows")
	public void the_user_hovers_away_from_table_rows() throws InterruptedException {
		resultsAndFeedback.hoverAwayFromTable();
	}

	@Then("The hovered row turns into white")
	public void the_hovered_row_turns_into_white() throws InterruptedException {
		resultsAndFeedback.verifyWhite();
	}
	
	@Then("The user is redirected to results and feedback page")
	public void the_user_is_redirected_to_results_and_feedback_page() throws InterruptedException {
		resultsAndFeedback.navigateToViewResultsAndFeedbackPage();
	}

	@When("The user selects a table row")
	public void the_user_selects_a_table_row() throws InterruptedException {
		resultsAndFeedback.clickTableRow();
	}

	@Then("The selected row turns into medium blue")
	public void the_selected_row_turns_into_medium_blue() throws InterruptedException {
		resultsAndFeedback.verifyLightBlue();
	}

	@When("The user unselects the selected table row")
	public void the_user_unselects_the_selected_table_row() throws InterruptedException {
		resultsAndFeedback.hoverAwayFromTable();
	}

	@Then("The unselected row turns into original color")
	public void the_unselected_row_turns_into_original_color() throws InterruptedException {
		resultsAndFeedback.verifyWhite();
	}
	
	@Then("Course Name has filter icon, Start Date and End Date each has sort icon displayed")
	public void course_name_has_filter_icon_start_date_and_end_date_each_has_sort_icon_displayed() {
		resultsAndFeedback.filtersDisplayed();
	}
}
