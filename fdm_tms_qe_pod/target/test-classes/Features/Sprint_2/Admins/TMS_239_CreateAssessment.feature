#Author: Tejas Patel 07/18/2023


@CreateAssessmentFormFeature
Feature: As an Academy Admin, I want to create an assessment template, So that I can start designing customized assessments from there.

  @TC_TMS469_01
  Scenario: TC_TMS469_01 Test that Admin should be able to enter Assessment Name in "Assessment Name" input field
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin click on Assessment Name input field
    Then The input field should be editable
    When Admin enter "QA Test" in Assessment Name input field
    Then The "QA Test" should be entered into input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_01"

  @TC_TMS469_02
  Scenario: TC_TMS469_02 Test that Admin should be able to select different status from the "Status" dropdown list
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Active" status from Status dropdown list
    Then "Active" status should be selected
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Inactive" status from Status dropdown list
    Then "Inactive" status should be selected
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Select status" status from Status dropdown list
    Then "Select status" status should be selected
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_02"

  @TC_TMS469_03
  Scenario: TC_TMS469_03 Test that Admin should be able to select different grade scale from the "Grade Scale" dropdown list
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "FDM Academy Grade Scale" option from Grade Scale dropdown list
    Then "FDM Academy Grade Scale" option should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "Other" option from Grade Scale dropdown list
    Then "Other" option should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "Select Grade Scale" option from Grade Scale dropdown list
    Then "Select Grade Scale" option should be selected
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_03"

  @TC_TMS469_04
  Scenario: TC_TMS469_04 Test that Admin should be able to enter description in "Description" input field
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin click on Description input field
    Then The Description input field should be editable
    When Admin enter "QA Test Description" in Description input field
    Then The "QA Test Description" should be entered into Description input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_04"

  @TC_TMS469_05
  Scenario: TC_TMS469_05 Test that Admin should be able to enter instructions in "Instructions" input field
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin click on Instructions input field
    Then The Instructions input field should be editable
    When Admin enter "QA Test Instructions" in Instructions input field
    Then The "QA Test Instructions" should be entered into Instructions input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_05"

  @TC_TMS469_06
  Scenario: TC_TMS469_06 Test that Admin should be able to see "Create" button disabled when mandatory fields are empty
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin check that mandatory field Assessment Name is empty
    Then Assessment Name input field should be empty
    When Admin check that mandatory field Status is selected as "Select status" option
    Then Status dropdown list should be selected as "Select status" option
    When Admin check that mandatory field Grade Scale is selected as "Select Grade Scale" option
    Then Grade Scale dropdown list should be selected as "Select Grade Scale" option
    When Admin confirm that Create button is disabled
    Then Create button should be disabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_06"

  @TC_TMS469_07
  Scenario: TC_TMS469_07 Test that Admin should be able to see "Create" button enabled when mandatory fields are filled
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin enter "Test Create Button" in Assessment Name input field
    Then "Test Create Button" should be displayed in Assessment Name input field
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Active" status from Status dropdown list
    Then "Active" status should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "FDM Academy Grade Scale" option from Grade Scale dropdown list
    Then "FDM Academy Grade Scale" option should be selected
    When Admin confirm that Create button is enabled
    Then Create button should be enabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_07"

  @TC_TMS469_08
  Scenario: TC_TMS469_08 Test that Admin should be able to clear all fields when click on "Cancel" button
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin enter "Test Cancel Button" in Assessment Name input field
    Then "Test Cancel Button" should be displayed in Assessment Name input field
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Active" status from Status dropdown list
    Then "Active" status should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "FDM Academy Grade Scale" option from Grade Scale dropdown list
    Then "FDM Academy Grade Scale" option should be selected
    When Admin enter "Test Description" in Description input field
    Then The "Test Description" should be entered into Description input field
    When Admin enter "Test Instructions" in Instructions input field
    Then The "Test Instructions" should be entered into Instructions input field
    When Admin click on Cancel button
    Then Data from all the fields should be cleared
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_08"

  @TC_TMS469_09
  Scenario: TC_TMS469_09 Test that Admin should be able to see heading on Create Assessment page
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin confirm that "Create Assessment Form" is displayed as a heading of the page
    Then "Create Assessment Form" should be displayed as a page heading
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_09"

  @TC_TMS469_10
  Scenario: TC_TMS469_10 Test that Admin should be able to see pop-up with text "Assessment created successfully." when click on "Create" button
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin enter "Test Create Button" in Assessment Name input field
    Then "Test Create Button" should be displayed in Assessment Name input field
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Active" status from Status dropdown list
    Then "Active" status should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "FDM Academy Grade Scale" option from Grade Scale dropdown list
    Then "FDM Academy Grade Scale" option should be selected
    When Admin click on Create button
    Then Pop-up should be displayed with text "Assessment created successfully."
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_10"

  @TC_TMS469_11
  Scenario: TC_TMS469_11 Test that Admin should be able to see pop-up with text "Assessment already exists. Try different assessment name." when click on "Create" button
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin enter "Test Create Button" in Assessment Name input field
    Then "Test Create Button" should be displayed in Assessment Name input field
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Active" status from Status dropdown list
    Then "Active" status should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "FDM Academy Grade Scale" option from Grade Scale dropdown list
    Then "FDM Academy Grade Scale" option should be selected
    When Admin click on Create button
    Then Pop-up should be displayed with text "Assessment already exists. Try different assessment name."
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_11"

  @TC_TMS469_12
  Scenario: TC_TMS469_12 Test that Admin should be able to close pop-up when click on "x" close buton
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin enter "Test close Button" in Assessment Name input field
    Then "Test close Button" should be displayed in Assessment Name input field
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Active" status from Status dropdown list
    Then "Active" status should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "FDM Academy Grade Scale" option from Grade Scale dropdown list
    Then "FDM Academy Grade Scale" option should be selected
    When Admin click on Create button
    Then Pop-up should be displayed with the x close button on top-right corner
    When Admin click on x close button
    Then Pop-up should be closed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_12"

  @TC_TMS469_13
  Scenario: TC_TMS469_13 Test that Admin should be able to open Customize Form page when click on "Customize Form" button inside the pop-up
    Given User is logged in as an Admin and navigate to Create Assessment Form page
    When Admin enter "Test Customize Form" in Assessment Name input field
    Then "Test Customize Form" should be displayed in Assessment Name input field
    When Admin click on Status dropdown list
    Then Status dropdown list should be displayed
    When Admin select "Active" status from Status dropdown list
    Then "Active" status should be selected
    When Admin click on Grade Scale dropdown list
    Then Grade Scale dropdown list should be displayed
    When Admin select "FDM Academy Grade Scale" option from Grade Scale dropdown list
    Then "FDM Academy Grade Scale" option should be selected
    When Admin click on Create button
    Then Pop-up should be displayed with Customize Form button
    When Admin click on Customize Form button
    Then Customize Form page should be displayed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/Admins/TMS_239/" as "TMS_469_13"
