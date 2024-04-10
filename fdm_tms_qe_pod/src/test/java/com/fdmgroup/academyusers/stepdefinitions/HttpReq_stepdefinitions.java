package com.fdmgroup.academyusers.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertNotNull;

import com.fdmgroup.global.stepdefinitions.Hooks;

public class HttpReq_stepdefinitions {

    private String baseUrl = "http://localhost:8080";
    private String authToken;

    @Given("^the base URL is \"(.*)\"$")
    public void setBaseUrl(String url) {
        baseUrl = url;
        RestAssured.baseURI = baseUrl;
    }

    @When("^I send a POST request to \"(.*)\" with valid admin credentials$")
    public void sendPostRequestWithAdminCredentials(String endpoint) {
        String requestBody = "{\"username\": \"bernie.romaro\", \"password\": \"1234\"}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(endpoint);

        authToken = response.getHeader("Authorization");
        assertNotNull("Authorization token not found in response", authToken);
    }

    @Then("^I copy the authorization token from the response header$")
    public void copyAuthorizationToken() {
        
        System.out.println("Authorization Token: " + authToken);
        
    }
    
    @When("I send a POST request to {string} with invalid admin credentials")
    public void i_send_a_post_request_to_with_invalid_admin_credentials(String endpoint) {
    	String requestBody = "{\"username\": \"berne.romaro\", \"password\": \"123\"}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(endpoint);

        authToken = response.getHeader("Authorization");
        assertNotNull("Authorization token not found in response", authToken);
    }

    @Then("the status code response should be {int}")
    public void the_status_code_response_should_be(Integer int1) {
    	int actualStatusCode = Hooks.response.getStatusCode();
		assertThat(int1, equalTo(actualStatusCode));
    }
}
