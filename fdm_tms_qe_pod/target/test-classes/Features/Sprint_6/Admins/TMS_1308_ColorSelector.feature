#Author: Tejas Patel 09/21/2023
@Regression_Testing
@ColorSelectorFeature
Feature: TMS_1308 As an Admin using the Trainee Management System, I want the ability to select colors from preset lists to visually distinguish between business and technical pathways.

  @TMS_1490
  Scenario: TMS_1490 Test that Admin should be able select different Focus options
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin select "Business" option from Focus dropdown list
    Then "Business" option should be selected from Focus dropdown list
    When Admin select "Technical" option from Focus dropdown list
    Then "Technical" option should be selected from Focus dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1308/" as "TMS_1490"

  @TMS_1491
  Scenario: TMS_1491 Test that Admin should be able to select different color for diferent Focus options
    Given User is logged in as an Admin and navigate to Create Pathway page
   	When Admin select "Business" option from Focus dropdown list
    Then "Business" option should be selected from Focus dropdown list
    When Admin select "#0000FF" color from Color dropdown list
    Then "#0000FF" color should be selected from Color dropdown list
    When Admin select "Technical" option from Focus dropdown list
    Then "Technical" option should be selected from Focus dropdown list
    When Admin select "#FFFF00" color from Color dropdown list
    Then "#FFFF00" color should be selected from Color dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1308/" as "TMS_1491"
