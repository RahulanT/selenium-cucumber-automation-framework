package com.fdmgroup.academyusers.stepdefinitions;

import java.util.List;

import org.junit.Assert;

import static org.junit.Assert.assertTrue;
import com.fdmgroup.academyusers.pages.LoginPage;
import com.fdmgroup.academyusers.pages.ProfileCardPage;
import com.fdmgroup.global.stepdefinitions.Hooks;
import com.fdmgroup.global.utilities.BrowserUtilities;
import com.fdmgroup.global.utilities.ConfigurationReader;

import io.cucumber.java.en.When;

public class CheckProfileCard_stepdefinitions {
	LoginPage loginPage = new LoginPage();
	ProfileCardPage profileCardPage= new ProfileCardPage();
	
	//username and password are hard coded this now, will update after the development done
	@When("Enters valid id and password for trainee")
	public void enters_valid_id_and_password_for_trainee() {
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "userNameTrainee"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "passwordTrainee"));
	}
	
	@When("Enters valid id and password for trainer")
	public void enters_valid_id_and_password_for_trainer() {
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "userNameTrainer"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "passwordTrainer"));
	}
		
	@When("Enters valid id and password for Academy Manager")
	public void enters_valid_id_and_password_for_academy_manager() {
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "userNameAcademyManager"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "passwordAcademyManager"));
	}
	
	@When("Enters valid id and password for Academy Admin")
	public void enters_valid_id_and_password_for_academy_admin() {
		loginPage.setUsername(ConfigurationReader.getProperty("academyusers", "userNameAcademyAdmin"));
		loginPage.setPassword(ConfigurationReader.getProperty("academyusers", "passwordAcademyAdmin"));
	}

	
	@When("User should be able to see the profile card with the following properities")
	public void checkProfileCardProperty(List<String> properties) {
		for (String properity: properties) {
	    	if(properity.equals("title")){
	    		continue;
	    	}
    		assertTrue(profileCardPage.cardContent(Hooks.driver, properity));

	    }
	}
}
