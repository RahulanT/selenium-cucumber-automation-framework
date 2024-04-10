@Regression_Testing
@IntegrationTesting
Feature: As a user I want to be able to click on the date button and activate a pop up calendar window to choose a specific 
week in the year to view.

@TMS_2359
  Scenario: @TMS_2359 Test that popup calendar is appear when user clicks on date function
    Given User is redirected to tms calendar page
    When I click on popup calendar button
    Then popup calendar should appear
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_11/AcademyUsers/TMS_1001/" as "TMS_2359"

@TMS_2360
  Scenario: @TMS_2360 Test that user is allowed to navigate in past and future				
    Given User is redirected to tms calendar page
   When I click on popup calendar button
    Then popup calendar should appear
    And I can move forward backward in calendar
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_11/AcademyUsers/TMS_1001/" as "TMS_2360"
    