#Author: Tejas Patel 09/12/2023
@Regression_Testing
@CreateCohortFeature
Feature: TMS_1023 As an admin, I want to be able to schedule a pathway by selecting a starting date so that I can effectively plan and create class.

  @TMS_1378
  Scenario: TMS_1378 Test that Admin should be able to see page title on Create Cohort page
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin confirm that "Create Cohort" is displayed as a title of the page
    Then "Create Cohort" should be displayed as a page title
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1378"

  @TMS_1379
  Scenario: TMS_1379 Test that Admin should be able to see hint text for Region, Country, City, Pathway and start Date
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin verify that "Select Region" is displayed as hint text for Region dropdown list
    Then "Select Region" should be displayed as hint text for Region dropdown list
    When Admin verify that "Select Country" is displayed as hint text for Country dropdown list
    Then "Select Country" should be displayed as hint text for Country dropdown list
    When As an Admin verify that "Select City" is displayed as hint text for City dropdown list
    Then "Select City" should be displayed as hint text for City dropdown list
    When As an Admin verify that "Select Pathway" is displayed as hint text for Pathway dropdown list
    Then "Select Pathway" should be displayed as hint text for Pathway dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1379"

  @TMS_1380
  Scenario: TMS_1380 Test that Admin should be able to select different Regions and Countries on Create Cohort page
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin click on Region dropdown list
    Then Region dropdown list should be displayed
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "United States" option from Country dropdown list
    Then "United States" option should be selected from Country dropdown list
    When Admin select "APAC" option from Region dropdown list
    Then "APAC" option should be selected from Region dropdown list
    When Admin select "Australia" option from Country dropdown list
    Then "Australia" option should be selected from Country dropdown list
    When Admin select "China" option from Country dropdown list
    Then "China" option should be selected from Country dropdown list
    When Admin select "Singapore" option from Country dropdown list
    Then "Singapore" option should be selected from Country dropdown list
    When Admin select "EMEA" option from Region dropdown list
    Then "EMEA" option should be selected from Region dropdown list
    When Admin select "Germany" option from Country dropdown list
    Then "Germany" option should be selected from Country dropdown list
    When Admin select "Poland" option from Country dropdown list
    Then "Poland" option should be selected from Country dropdown list
    When Admin select "UK" option from Country dropdown list
    Then "UK" option should be selected from Country dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1380"

  @TMS_1381
  Scenario: TMS_1381 Test that Admin should be able to select different Cities
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin click on Region dropdown list
    Then Region dropdown list should be displayed
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Toronto, ON" option from City dropdown list
    Then "Toronto, ON" option should be selected from City dropdown list
    When Admin select "United States" option from Country dropdown list
    Then "United States" option should be selected from Country dropdown list
    When Admin select "New York, NY" option from City dropdown list
    Then "New York, NY" option should be selected from City dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1381"

  @TMS_1382
  Scenario: TMS_1382 Test that Admin should be able to select different Pathways
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Java Development" option from Pathway dropdown list
    Then "Java Development" option should be selected from Pathway dropdown list
    When Admin select "Cloud Computing" option from Pathway dropdown list
    Then "Cloud Computing" option should be selected from Pathway dropdown list
    When Admin select "BAPM" option from Pathway dropdown list
    Then "BAPM" option should be selected from Pathway dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1382"

  @TMS_1383
  Scenario: TMS_1383 Test that Admin should be able to select Date from Calender view for Start Date input field
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin enter "2023-10-16" date into Start Date input field
    Then "2023-10-16" date should be displayed in Start Date input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1383"

  @TMS_1384
  Scenario: TMS_1384 Test that Admin should be able to see Create Cohort button as disabled when all mandatory fields not filled
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin verify that Region is not selected
    Then Region should not be selected
    When Admin verify that Country is not selected
    Then Country should not be selected
    When Admin verify that City is not selected
    Then City should not be selected
    When Admin verify that Pathway is not selected
    Then Pathway should not be selected
    When Admin verify that Start Date input field should be empty
    Then Start Date input field should be empty
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1384"

  @TMS_1466
  Scenario: TMS_1466 Test that Admin should be able to see Cohort Code when all mandatory fields are filled
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Java Development" option from Pathway dropdown list
    Then "Java Development" option should be selected from Pathway dropdown list
    When Admin select "Cloud Computing" option from Pathway dropdown list
    Then "Cloud Computing" option should be selected from Pathway dropdown list
    When Admin select "BAPM" option from Pathway dropdown list
    Then "BAPM" option should be selected from Pathway dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1466"

  @TMS_1467
  Scenario: TMS_1467 Test that Admin should be able to update Cohort Code by clicking on Edit Button
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Toronto, ON" option from City dropdown list
    Then "Toronto, ON" option should be selected from City dropdown list
    When Admin select "Java Development" option from Pathway dropdown list
    Then "Java Development" option should be selected from Pathway dropdown list
    When Admin enter "2023-10-16" date into Start Date input field
    Then "2023-10-16" date should be displayed in Start Date input field
    When Admin verify that "TO-23-JDE-01" should be displayed as Cohort Code
    Then "TO-23-JDE-01" should be displayed as Cohort Code
    When Admin click on Edit button
    Then Cohort Code field should be editable
    When Admin edit Cohort Code to "TO-23-TDJDE-01"
    Then "TO-23-TDJDE-01" should be displayed as Cohort Code
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1467"

  @TMS_1468
  Scenario: TMS_1468 Test that Admin should be able to see pop-up with text "Cohort Created" when click on Create Cohort button
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Toronto, ON" option from City dropdown list
    Then "Toronto, ON" option should be selected from City dropdown list
    When Admin select "Java Development" option from Pathway dropdown list
    Then "Java Development" option should be selected from Pathway dropdown list
    When Admin enter "2023-10-16" date into Start Date input field
    Then "2023-10-16" date should be displayed in Start Date input field
    When Admin verify that "TO-23-JDE-01" should be displayed as Cohort Code
    Then "TO-23-JDE-01" should be displayed as Cohort Code
    When Admin click on Create Cohort button
    Then Pop-up window should be displayed with "Cohort Created" title text
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1468"

  @TMS_1469
  Scenario: TMS_1469 Test that Admin should be able to see pop-up with text "Cohort Created" when click on Create Cohort button
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Toronto, ON" option from City dropdown list
    Then "Toronto, ON" option should be selected from City dropdown list
    When Admin select "Java Development" option from Pathway dropdown list
    Then "Java Development" option should be selected from Pathway dropdown list
    When Admin enter "2023-10-16" date into Start Date input field
    Then "2023-10-16" date should be displayed in Start Date input field
    When Admin verify that "TO-23-JDE-01" should be displayed as Cohort Code
    Then "TO-23-JDE-01" should be displayed as Cohort Code
    When Admin click on Create Cohort button
    Then Pop-up window should be displayed with "Cohort Created" title text
    When Admin verify that "TO-23-JDE-01" should be displayed as Cohort Code in the pop-up
    Then "TO-23-JDE-01" should be displayed as Cohort Code in the pop-up
    When Admin verify that "NA/ Canada" should be displayed as Region in the pop-up
    Then "NA/ Canada" should be displayed as Region in the pop-up
    When Admin verify that "Toronto" should be displayed as City in the pop-up
    Then "Toronto" should be displayed as City in the pop-up
    When Admin verify that "Java Development" should be displayed as Pathway in the pop-up
    Then "Java Development" should be displayed as Pathway in the pop-up
    When Admin verify that Start Date should be displayed as "10/16/2023" in the pop-up
    Then Start Date should be displayed as "10/16/2023" in the pop-up
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1469"

  @TMS_1470
  Scenario: TMS_1470 Test that Admin should be able to close pop-up window when click on (x) close button
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Toronto, ON" option from City dropdown list
    Then "Toronto, ON" option should be selected from City dropdown list
    When Admin select "Java Development" option from Pathway dropdown list
    Then "Java Development" option should be selected from Pathway dropdown list
    When Admin enter "2023-10-16" date into Start Date input field
    Then "2023-10-16" date should be displayed in Start Date input field
    When Admin verify that "TO-23-JDE-01" should be displayed as Cohort Code
    Then "TO-23-JDE-01" should be displayed as Cohort Code
    When Admin click on Create Cohort button
    Then Pop-up window should be displayed with "Cohort Created" title text
    When Admin click on (x) close button
    Then Pop-up window should be closed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1470"

  @TMS_1471
  Scenario: TMS_1471 Test that Admin should be able to see Ok button enabled in pop-up window
    Given User is logged in as an Admin and navigate to Create Cohort page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Toronto, ON" option from City dropdown list
    Then "Toronto, ON" option should be selected from City dropdown list
    When Admin select "Java Development" option from Pathway dropdown list
    Then "Java Development" option should be selected from Pathway dropdown list
    When Admin enter "2023-10-16" date into Start Date input field
    Then "2023-10-16" date should be displayed in Start Date input field
    When Admin verify that "TO-23-JDE-01" should be displayed as Cohort Code
    Then "TO-23-JDE-01" should be displayed as Cohort Code
    When Admin click on Create Cohort button
    Then Pop-up window should be displayed with "Cohort Created" title text
    When Admin verify Ok button is displayed as enabled in pop-up
    Then Ok button should be displayed as enabled in pop-up
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1023/" as "TMS_1471"
