#Author: Sofia Singh
@Regression_Testing
@IntegrationTesting
Feature: TMS_2330 As an Academy Admin,I want to be able to view a full list of Trainee’s skills when viewing their profile, so that I can know what skills the particular Trainee/Consultant has.

  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    And user clicks the login btn

  @TMS2435
  Scenario: TMS_2435 Test that skills are sorted in alphabetically vertical order
    Given The user is logged in as an Academy admin in the TMS
    When As an admin, test that sorting skills is working properly
    Then It should work
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2330/" as "TMS_2435"

  @TC_TMS_Logout_Test
  Scenario: TC_TMS User should be logout the system
    When clicks profile icon of admin
    And admin clicks the Logout button
