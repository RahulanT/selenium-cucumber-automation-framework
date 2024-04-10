#Author: Tejas Patel 08/16/2023
@CreateStreamFeature
Feature: As an Admin, I want to be able to create a Stream, so I can populate it with courses.

  @TC_TMS391_01
  Scenario: TC_TMS391_01 Test that Admin should be able to see page title on Create Stream page
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin confirm that "Create Stream" is displayed as a title of the page
    Then "Create Stream" should be displayed as a page title
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_01"

  @TC_TMS391_02
  Scenario: TC_TMS391_02 Test that Admin should be able to see hint text for Stream name, Region and Country
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin verify that "Enter Stream Name" is displayed as hint text for Stream Name input field
    Then "Enter Stream Name" should be displayed as hint text for Stream Name input field
    When Admin verify that "Select Region" is displayed as hint text for Region dropdown list
    Then "Select Region" should be displayed as hint text for Region dropdown list
    When Admin verify that "Select Country" is displayed as hint text for Country dropdown list
    Then "Select Country" should be displayed as hint text for Country dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_02"

  @TC_TMS391_03
  Scenario: TC_TMS391_03 Test that Admin should be able to enter Stream Name in Stream Name input field
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin click on Stream Name input field
    Then The Stream Name input field should be editable
    When Admin enter "QA Test Stream" in Stream Name input field
    Then The "QA Test Stream" should be entered into Stream Name input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_03"

  @TC_TMS391_04
  Scenario: TC_TMS391_04 Test that Admin should be able to select Color
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_04"

  @TC_TMS391_05
  Scenario: TC_TMS391_05 Test that Admin should be able to select different Countries based on different Regions on Create Stream page
    Given User is logged in as an Admin and navigate to Create Stream page
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
    When Admin select "EMEA" option from Region dropdown list
    Then "EMEA" option should be selected from Region dropdown list
    When Admin select "Germany" option from Country dropdown list
    Then "Germany" option should be selected from Country dropdown list
    When Admin select "Poland" option from Country dropdown list
    Then "Poland" option should be selected from Country dropdown list
    When Admin select "UK" option from Country dropdown list
    Then "UK" option should be selected from Country dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_05"

  @TC_TMS391_06
  Scenario: TC_TMS391_06 Test that Admin should be able to see no. of days in Duration in Days field
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin verify "5" no. of days in Duration in Days field
    Then "5" should be displayed in Duration in Days field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_06"

  @TC_TMS391_07
  Scenario: TC_TMS391_07 Test that Admin should be able to see Create a Stream button as disabled when all mandatory fields not filled
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin verify that Stream Name input field is empty
    Then Stream Name input field should be empty
    When Admin verify that Select Color field is empty
    Then Select Color field should be empty
    When Admin verify that Region is not selected
    Then Region should not be selected
    When Admin verify that Country is not selected
    Then Country should not be selected
    When Admin verify that Duration in Days field is empty
    Then Duration in Days field should be empty
    When Admin verify that Create a Stream button is disabled
    Then Create a Stream button should be disabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_07"

  @TC_TMS391_08
  Scenario: TC_TMS391_08 Test that Admin should be able to add courses by clicking Add button
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_08"

  @TC_TMS391_09
  Scenario: TC_TMS391_09 Test that Admin should be able to remove courses by clicking Remove button
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on "OOD" course from Selected Courses list
    Then "OOD" course should be selected from Selected Courses list
    When Admin click on Remove button
    Then "OOD" course should be removed from Selected Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_09"

  @TC_TMS391_10
  Scenario: TC_TMS391_10 Test that Admin should be able to see removed courses into Available Courses list
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on "OOD" course from Selected Courses list
    Then "OOD" course should be selected from Selected Courses list
    When Admin click on Remove button
    Then "OOD" course should be removed from Selected Courses list
    When Admin verify that "OOD" course is added back into Available Courses list
    Then "OOD" course should be added into Available Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_10"

  @TC_TMS391_11
  Scenario: TC_TMS391_11 Test that Admin should be able to see pop-up with text "Stream Created" when click on Create Stream button
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin enter "QA Test Stream" in Stream Name input field
    Then The "QA Test Stream" should be entered into Stream Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Stream button
    Then Pop-up window should be displayed with "Stream Created" text
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_11"

  @TC_TMS391_12
  Scenario: TC_TMS391_12 Test that Admin should be able to see all same data in pop-up window as filled on Create Stream page
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin enter "QA Test Stream" in Stream Name input field
    Then The "QA Test Stream" should be entered into Stream Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin verify "5" no. of days in Duration in Days field
    Then "5" should be displayed in Duration in Days field
    When Admin click on Create Stream button
    Then Pop-up window should be displayed with "Stream Created" text
    When Admin verify Stream Name as "QA Test Stream" in pop-up window
    Then "QA Test Stream" should be displayed as Stream Name in pop-up window
    When Admin verify Stream Color code as "##ff0000" in pop-up window
    Then "##ff0000" should be displayed as Stream Color code in pop-up window
    When Admin verify Course Selected as "OOD" in pop-up window
    Then "OOD" should be displayed as Course Selected in pop-up window
    When Admin verify Duration of Stream as "5 Days" in pop-up window
    Then "5 Days" should be displayed as Duration of Stream in pop-up window
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_12"

  @TC_TMS391_13
  Scenario: TC_TMS391_13 Test that Admin should be able to close pop-up window when click on (x) close button
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin enter "QA Test Stream" in Stream Name input field
    Then The "QA Test Stream" should be entered into Stream Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Stream button
    Then Pop-up window should be displayed with "Stream Created" text
    When Admin click on (x) close button
    Then Pop-up window should be closed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_13"

  @TC_TMS391_14
  Scenario: TC_TMS391_14 Test that Admin should be able to see Ok button enabled in pop-up window
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin enter "QA Test Stream" in Stream Name input field
    Then The "QA Test Stream" should be entered into Stream Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Stream button
    Then Pop-up window should be displayed with "Stream Created" text
    When Admin verify Ok button is displayed as enabled
    Then Ok button should be displayed as enabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_14"

  @TC_TMS391_15
  Scenario: TC_TMS391_15 Test that Admin should be able to see Create Stream page when click on Create Another Stream button in pop-up window
    Given User is logged in as an Admin and navigate to Create Stream page
    When Admin enter "QA Test Stream" in Stream Name input field
    Then The "QA Test Stream" should be entered into Stream Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Stream button
    Then Pop-up window should be displayed with "Stream Created" text
    When Admin click on Create Another Stream button
    Then Admin should be redirect to Create Stream page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_237/" as "TMS_391_15"
