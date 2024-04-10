package com.fdmgroup.academyusers.stepdefinitions;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.fdmgroup.global.pojos.AcademyAdmin;
import com.fdmgroup.global.pojos.AcademyManager;
import com.fdmgroup.global.pojos.Trainee;
import com.fdmgroup.global.pojos.Trainer;
import com.fdmgroup.global.stepdefinitions.Hooks;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class UserProfileCard_api_stepdefinitions {

	@Given("User perform GET opeartion for {string} for user id {int}")
	public void user_perform_get_opeartion_for_for_user_id(String uri, int userId) {
	    Hooks.restAssuredUtilities.setMethod("GET");
	    Hooks.restAssuredUtilities.setUrl(uri);
        HashMap<String, String> pathParams = new HashMap<>();
        pathParams.put("userId", String.valueOf(userId));
        Hooks.restAssuredUtilities.addPathParams(pathParams);
        Hooks.response = Hooks.restAssuredUtilities.executeAPI();
	}
	
	@Then("I should see the user with usertype trainee")
	public void i_should_see_the_user_with_usertype_trainee(DataTable table) {
	    var Trainee = Hooks.response.getBody().as(Trainee.class);
	    var data = table.asMaps();
	    for(Map<String,String> item: data) {
	    	assertThat(String.valueOf(Trainee.getUserId()), equalTo(item.get("userId")));
	    	assertThat(Trainee.getFirstName(), equalTo(item.get("firstName")));
	    	assertThat(Trainee.getLastName(), equalTo(item.get("lastName")));
	    	assertThat(Trainee.getEmail(), equalTo(item.get("email")));
	    	assertThat(Trainee.getUserType().getName(), equalTo(item.get("userType")));
	    }
	}
	
	@Then("I should see the user with usertype trainer")
	public void i_should_see_the_user_with_usertype_trainer(DataTable table) {
		var Trainer = Hooks.response.getBody().as(Trainer.class);
		var data = table.asMaps();
	    for(Map<String,String> item: data) {
	    	assertThat(String.valueOf(Trainer.getUserId()), equalTo(item.get("userId")));
	    	assertThat(Trainer.getFirstName(), equalTo(item.get("firstName")));
	    	assertThat(Trainer.getLastName(), equalTo(item.get("lastName")));
	    	assertThat(Trainer.getEmail(), equalTo(item.get("email")));
	    	assertThat(Trainer.getUserType().getName(), equalTo(item.get("userType")));
	    }
	}
	
	
	@Then("I should see the user with usertype academy manager")
	public void i_should_see_the_with_usertype_academy_manager(DataTable table) {
		var academyManager = Hooks.response.getBody().as(AcademyManager.class);
		var data = table.asMaps();
	    for(Map<String,String> item: data) {
	    	assertThat(String.valueOf(academyManager.getUserId()), equalTo(item.get("userId")));
	    	assertThat(academyManager.getFirstName(), equalTo(item.get("firstName")));
	    	assertThat(academyManager.getLastName(), equalTo(item.get("lastName")));
	    	assertThat(academyManager.getEmail(), equalTo(item.get("email")));
	    	assertThat(academyManager.getUserType().getName(), equalTo(item.get("userType")));
	    	assertThat(String.valueOf(academyManager.isManager()), equalTo(item.get("isManager")));
	    }
	}
	
	@Then("I should see the user with usertype academy admin")
	public void i_should_see_the_user_with_usertype_academy_admin(DataTable table) {
		var academyAdmin = Hooks.response.getBody().as(AcademyAdmin.class);
		var data = table.asMaps();
	    for(Map<String,String> item: data) {
	    	assertThat(String.valueOf(academyAdmin.getUserId()), equalTo(item.get("userId")));
	    	assertThat(academyAdmin.getFirstName(), equalTo(item.get("firstName")));
	    	assertThat(academyAdmin.getLastName(), equalTo(item.get("lastName")));
	    	assertThat(academyAdmin.getEmail(), equalTo(item.get("email")));
	    	assertThat(academyAdmin.getUserType().getName(), equalTo(item.get("userType")));
	    	assertThat(String.valueOf(academyAdmin.isManager()), equalTo(item.get("isManager")));
	    }
	}


	
	@Then("The reponse code should be {int}")
	public void the_reponse_code_should_be(int responseCode) {
        assertThat(Hooks.response.getStatusCode(), equalTo(responseCode));

	}
}
