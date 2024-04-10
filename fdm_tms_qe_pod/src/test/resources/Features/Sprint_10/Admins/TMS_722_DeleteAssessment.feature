#Before runnig the execution make sure assessments are available to delete
Feature: Delete Assessment

@TMS_2228
Scenario: @TMS_2228 Test that admin should see Delete button.
		Given User logged in using valid credentials
    When I click on admin link
    Then I click on view assessment link
    And User should able to see delete button
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_722/" as "TMS_7228"

@TMS_2229
Scenario: @TMS_2229 Test that when an admin clicks on the Delete button confirmation dialog should appear asking for confirmation to proceed with the deletion.				   
	Given User logged in using valid credentials
    When I click on admin link
    Then I click on view assessment link
    And User click on Delete button
    And User should see the confirmation dialogue box
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_722/" as "TMS_7229"
    
@TMS_2230 @TMS_2231 @TMS_2232
Scenario: @TMS_2230 @TMS_2231 @TMS_2232 On the confirmation of deletion dialog, test that when admin clicks on the "Confirm" button, that the selected assessment template should be permanently removed from the list.				
	Given User logged in using valid credentials
    When I click on admin link
    Then I click on view assessment link
    And User click on Delete button
    And User should see the confirmation dialogue box
    And User click on confrimation button
    And Assessment should be deleted from Assessment list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_722/" as "TMS_7230"
    
