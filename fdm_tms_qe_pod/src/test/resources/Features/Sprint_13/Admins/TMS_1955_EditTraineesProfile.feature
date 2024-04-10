#Author: Sofia Singh
Feature: TMS_1955 As an Academy Admin,I want to be able to edit  trainee’s information on the trainee profile interface so that I can update the trainee’s information.

  Background: 
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    And user clicks the login btn

  @TMS2368
  Scenario: TMS_2368 On Trainee Profile page, verify if the edit button is working correctly
    Given A user is logged in as an admin in the TMS and is on the view trainees profile card page
    When As an admin, verify if the edit button is working correctly
    Then admin should be able to edit the text fields
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_1955/" as "TMS_2368"

  @TC_TMS_Logout_Test
  Scenario: TC_TMS User should be logout the system
    When clicks profile icon of admin
    And admin clicks the Logout button
