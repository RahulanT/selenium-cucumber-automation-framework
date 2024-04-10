#Author: Sofia Singh
@Regression_Testing
@IntegrationTesting
Feature: TMS_2205 As an Academy Admin, I want to be able to select single or multiple skills from a ‘Skills’ drop-down so that each trainee has an appropriate skills assigned to them.

  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    And user clicks the login btn

  @TMS2432
  Scenario: TMS_2432 Test that user can edit, remove and select single/multiple skills from dropdown
    Given The user is logged in as an Academy admin in the TMS
    When As an admin, test that I can edit,remove and select single or mutltiple  skills from dropdown
    Then Admin should be able to edit, remove or select single or multiple skils
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2205/" as "TMS_2432"
