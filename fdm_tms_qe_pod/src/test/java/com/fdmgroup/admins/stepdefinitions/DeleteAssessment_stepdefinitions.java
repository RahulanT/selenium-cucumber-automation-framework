package com.fdmgroup.admins.stepdefinitions;

import org.junit.Assert;

import com.fdmgroup.admins.pages.AssessmentHomePage;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.Then;

public class DeleteAssessment_stepdefinitions {
	
	AssessmentHomePage assessmentHomePage = new AssessmentHomePage();
	
	@Then("User should able to see delete button")
	public void user_should_able_to_see_delete_button() {
		Assert.assertEquals(String.valueOf(assessmentHomePage.isDeleteButtonDisplayed()), ConfigurationReader.getProperty("admins", "isDeleteButtonDisplayed"));
	}

	@Then("User click on Delete button")
	public void user_click_on_delete_button() {
	    assessmentHomePage.clickOnFirstDeleteButton();
	}

	@Then("User should see the confirmation dialogue box")
	public void user_should_see_the_confirmation_dialogue_box() {
		Assert.assertEquals(assessmentHomePage.deleteMessageDialogueBox(), ConfigurationReader.getProperty("admins", "deleteMessage"));
	}

	@Then("User click on confrimation button")
	public void user_click_on_confrimation_button() {
	   assessmentHomePage.clickOnConfirmationButton();
	}

	@Then("Assessment should be deleted from Assessment list")
	public void assessment_should_be_deleted_from_assessment_list() {
		if (assessmentHomePage.totalAssessmentList() == assessmentHomePage.totalAssessmentList() - 1) {
		    System.out.println("Row has been successfully deleted.");
		} else {
		    System.out.println("Row has not been deleted.");
		}
	}


}
