package com.fdmgroup.admins.stepdefinitions;

import static org.junit.Assert.assertEquals;

import com.fdmgroup.admins.pages.DisplaySkillsPage;
import com.fdmgroup.admins.pages.EditSkillsPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditSkills_stepdefinitions {
	DisplaySkillsPage displaySkillsPage = new DisplaySkillsPage();
	EditSkillsPage editSkillsPage = new EditSkillsPage();

	@When("As an admin, test that I can edit,remove and select single or mutltiple  skills from dropdown")
	public void as_an_admin_test_that_i_can_edit_remove_and_select_single_or_mutltiple_skills_from_dropdown()
			throws InterruptedException {
		displaySkillsPage.scrollToSkills();
		displaySkillsPage.skillsLinkClick();
		editSkillsPage.clickEditBtn();
		editSkillsPage.scrollToSkillsAfterClickEdit();
		editSkillsPage.skillsLinkClick2();
	}

	@Then("Admin should be able to edit, remove or select single or multiple skils")
	public void admin_should_be_able_to_edit_remove_or_select_single_or_multiple_skils() throws InterruptedException {
		// editSkillsPage.hyperCrossBtnClick();
		editSkillsPage.skillsDropDownBoxClick();
		editSkillsPage.scrollToSkills();
		editSkillsPage.apmClick();
		assertEquals(editSkillsPage.getApmText(), "APM");
		editSkillsPage.saveBtnClick();
		assertEquals(editSkillsPage.getConfirmMsgText(), "Profile Updated Successfully");
		editSkillsPage.okBtnClick();
		

	}
}
