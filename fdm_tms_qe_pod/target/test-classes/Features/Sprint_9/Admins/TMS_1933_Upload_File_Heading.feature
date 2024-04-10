@Regression_Testing
#Author: Sofia Singh
Feature: TMS_1933 As an academy admin,I want to have the header of the import trainees page to display “Upload file with trainees information” and the upload file options left aligned So that the header displays the correct information  and is aligned.

  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    And user Clicks the Login button

  @TMS1951
  Scenario: TMS_1951 On import trainee page,test that admin should be able to see header relating to upload file and it should be left aligned
    Given The user is logged in as an Academy admin in the TMS and click import trainee page
    #When As an admin, observes header of the import trainees page
    Then Header of the import trainees page should be  "Upload Trainees Information" and it should be left aligned
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/Admins/TMS_1933/" as "TMS_1951"

  @TC_TMS_Logout_Test
  Scenario: TC_TMS User should be logout the system
    When clicks profile icon of admin
    And admin clicks the Logout button
