#Author: Tejas Patel 08/02/2023


@CreateCourseFeature
Feature: As an admin, I want the ability to create a course so that the course can be saved in the system.

  @TC_TMS739_01
  Scenario: TC_TMS739_01 Test that Admin should be able to see page title on Create Course page
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin confirm that "Create Course" is displayed as a title of the page
    Then "Create Course" should be displayed as a page title
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_01"

  @TC_TMS739_02
  Scenario: TC_TMS739_02 Test that Admin should be able to see hint text for each fields
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin verify that "Enter Course Name" is displayed as hint text for Name input field
    Then "Enter Course Name" should be displayed as hint text for Name input field
    When Admin verify that "Select Trainer" is displayed as hint text for Course Owner dropdown list
    Then "Select Trainer" should be displayed as hint text for Course Owner dropdown list
    When Admin verify that "Enter No. of Days" is displayed as hint text for Duration input field
    Then "Enter No. of Days" should be displayed as hint text for Duration input field
    When Admin verify that "Select Assessment Type" is displayed as hint text for Assessments dropdown list
    Then "Select Assessment Type" should be displayed as hint text for Assessments dropdown list
    When Admin verify that "Select Region" is displayed as hint text for Region dropdown list
    Then "Select Region" should be displayed as hint text for Region dropdown list
    When Admin verify that "Select Country" is displayed as hint text for Country dropdown list
    Then "Select Country" should be displayed as hint text for Country dropdown list
    When Admin verify that "Enter a Course Description" is displayed as hint text for Course Description input field
    Then "Enter a Course Description" should be displayed as hint text for Course Description input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_02"

  @TC_TMS739_03
  Scenario: TC_TMS739_03 Test that Admin should be able to see page title on Create Course page
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin confirm that Create Course button is disabled
    Then Create Course button should be disabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_03"

  @TC_TMS739_04
  Scenario: TC_TMS739_04 Test that Admin should be able to see page title on Create Course page
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin click on Name input field
    Then The Name input field should be editable
    When Admin enter "QA Test Course" in Name input field
    Then The "QA Test Course" should be entered into Name input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_04"

  @TC_TMS739_05
  Scenario: TC_TMS739_05 Test that Admin should be able to see page title on Create Course page
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin click on Course Owner dropdown list
    Then Course Owner dropdown list should be displayed
    When Admin select "Peter Parker" option from Course Owner dropdown list
    Then "Peter Parker" option should be selected from Course Owner dropdown list
    When Admin select "Bruce Wayne" option from Course Owner dropdown list
    Then "Bruce Wayne" option should be selected from Course Owner dropdown list
    When Admin select "Clark Kent" option from Course Owner dropdown list
    Then "Clark Kent" option should be selected from Course Owner dropdown list
    When Admin select "James Bond" option from Course Owner dropdown list
    Then "James Bond" option should be selected from Course Owner dropdown list
    When Admin select "Foo Bar" option from Course Owner dropdown list
    Then "Foo Bar" option should be selected from Course Owner dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_05"

  @TC_TMS739_06
  Scenario: TC_TMS739_06 Test that Admin should be able to enter no. of days in "Duration" input field
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin click on Duration input field
    Then The Duration input field should be editable
    When Admin enter "7" in Duration input field
    Then The "7" should be entered into Duration input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_06"

  @TC_TMS739_07
  Scenario: TC_TMS739_07 Test that Admin should be able to select different options from the "Assessments" dropdown list
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin click on Assessments dropdown list
    Then Assessments dropdown list should be displayed
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin select "Group Project" option from Assessments dropdown list
    Then "Group Project" option should be selected from Assessments dropdown list
    When Admin select "Individual Project" option from Assessments dropdown list
    Then "Individual Project" option should be selected from Assessments dropdown list
    When Admin select "Mock Interview" option from Assessments dropdown list
    Then "Mock Interview" option should be selected from Assessments dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_07"

  @TC_TMS739_08
  Scenario: TC_TMS739_08 Test that Admin should be able to select different Countries based on different Regions
    Given User is logged in as an Admin and navigate to Create Course page
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
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_08"

  @TC_TMS739_09
  Scenario: TC_TMS739_09 Test that Admin should be able to enter description in "Course Description" input field
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin click on Course Description input field
    Then The Course Description input field should be editable
    When Admin enter "QA Test Description" in Course Description input field
    Then The "QA Test Description" should be entered into Course Description input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_09"

  @TC_TMS739_10
  Scenario: TC_TMS739_10 Test that Admin should be able to see error messages when not selecting mandatory fields
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin click on Name input field
    Then The Name input field should be editable
    When Admin click on Course Owner dropdown list
    Then "Course Name is Required" error message should be displayed below Name input field
    When Admin click on Duration input field
    Then "Course Owner is Required" error message should be displayed below Course Owner dropdown list
    When Admin click on Assessments dropdown list
    Then "Course Duration is Required" error message should be displayed below Duration input field
    When Admin click on Region dropdown list
    Then "Assessment Type is Required" error message should be displayed below Assessments dropdown list
    When Admin click on Country dropdown list
    Then "Region is Required" error message should be displayed below Region dropdown list
    When Admin click on Course Description input field
    Then "Country is Required" error message should be displayed below Country dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_10"

  @TC_TMS739_11
  Scenario: TC_TMS739_11 Test that Admin should be able to add "Assessments" dropdown list by clicking "+" Add Assessment button
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin verify that (+) Add Assessment button is displayed besides Assessments dropdown list
    Then (+) Add Assessment button should be displayed besides Assessments dropdown list
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin click on (+) Add Assessment button
    Then "Test" option should be added below in Assessments list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_11"

  @TC_TMS739_12
  Scenario: TC_TMS739_12 Test that Admin should be able to remove "Assessments" dropdown list by clicking "-" Remove Assessment button
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin verify that (+) Add Assessment button is displayed besides Assessments dropdown list
    Then (+) Add Assessment button should be displayed besides Assessments dropdown list
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin click on (+) Add Assessment button
    Then "Test" option should be added below in Assessments list
    When Admin verify that (-) Remove Assessment button is displayed besides "Test" Assessment
    Then (-) Remove Assessment button should be displayed besides "Test" Assessment
    When Admin click on (-) Remove Assessment button
    Then "Test" Assessment should be removed from Assessments list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_12"

  @TC_TMS739_13
  Scenario: TC_TMS739_13 Test that Admin should be able to see Create Course button enabled when mandatory fields are filled
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin enter "Test Create Course button-1" in Name input field
    Then The "Test Create Course button-1" should be entered into Name input field
    When Admin select "James Bond" option from Course Owner dropdown list
    Then "James Bond" option should be selected from Course Owner dropdown list
    When Admin enter "12" in Duration input field
    Then The "12" should be entered into Duration input field
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin select "APAC" option from Region dropdown list
    Then "APAC" option should be selected from Region dropdown list
    When Admin select "Singapore" option from Country dropdown list
    Then "Singapore" option should be selected from Country dropdown list
    When Admin confirm that Create Course button is enabled
    Then Create Course button should be enabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_13"

  @TC_TMS739_14
  Scenario: TC_TMS739_14 Test that Admin should be able to see pop-up with text "Course Successfully Created" when click on Create Course button
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin enter "Test Create Course button-2" in Name input field
    Then The "Test Create Course button-2" should be entered into Name input field
    When Admin select "James Bond" option from Course Owner dropdown list
    Then "James Bond" option should be selected from Course Owner dropdown list
    When Admin enter "12" in Duration input field
    Then The "12" should be entered into Duration input field
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin select "APAC" option from Region dropdown list
    Then "APAC" option should be selected from Region dropdown list
    When Admin select "Singapore" option from Country dropdown list
    Then "Singapore" option should be selected from Country dropdown list
    When Admin click on Create Course button
    Then Pop-up window should be displayed with text "Course Successfully Created"
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_14"

  @TC_TMS739_15
  Scenario: TC_TMS739_15 Test that Admin should be able to see all same data in pop-up window as filled on "Create Course" page
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin enter "Test Create Course button-2" in Name input field
    Then The "Test Create Course button-2" should be entered into Name input field
    When Admin select "James Bond" option from Course Owner dropdown list
    Then "James Bond" option should be selected from Course Owner dropdown list
    When Admin enter "12" in Duration input field
    Then The "12" should be entered into Duration input field
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin select "APAC" option from Region dropdown list
    Then "APAC" option should be selected from Region dropdown list
    When Admin select "Singapore" option from Country dropdown list
    Then "Singapore" option should be selected from Country dropdown list
    When Admin enter "QA Test Description" in Course Description input field
    Then The "QA Test Description" should be entered into Course Description input field
    When Admin click on Create Course button
    Then Pop-up window should be displayed with text "Course Successfully Created"
    When Admin confirm that Course name is displayed as "Test Create Course button-2"
    Then Course name should be displayed as "Test Create Course button-2"
    When Admin confirm that Course Owner is displayed as "James Bond"
    Then Course Owner should be displayed as "James Bond"
    When Admin confirm that Duration is displayed as "12 Days"
    Then Duration should be displayed as "12 Days"
    When Aadmin confirm that Assessments is displayed as "Test"
    Then Assessments should be displayed as "Test"
    When Admin confirm that Region is displayed as "APAC"
    Then Region should be displayed as "APAC"
    When Admin confirm that Course Description is displayed as "QA Test Description"
    Then Course Description should be displayed as "QA Test Description"
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_15"

  @TC_TMS739_16
  Scenario: TC_TMS739_16 Test that Admin should be able to close pop-up window when click on "x" close button
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin enter "Test Close Button" in Name input field
    Then The "Test Close Button" should be entered into Name input field
    When Admin select "James Bond" option from Course Owner dropdown list
    Then "James Bond" option should be selected from Course Owner dropdown list
    When Admin enter "12" in Duration input field
    Then The "12" should be entered into Duration input field
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin select "APAC" option from Region dropdown list
    Then "APAC" option should be selected from Region dropdown list
    When Admin select "Singapore" option from Country dropdown list
    Then "Singapore" option should be selected from Country dropdown list
    When Admin enter "QA Test Description" in Course Description input field
    Then The "QA Test Description" should be entered into Course Description input field
    When Admin click on Create Course button
    Then Pop-up window should be displayed with text "Course Successfully Created"
    When Admin click on (x) close button
    Then Pop-up window should be closed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_16"

  @TC_TMS739_17
  Scenario: TC_TMS739_17 Test that Admin should be able to see "Ok" button enabled in pop-up window
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin enter "Test Ok Button" in Name input field
    Then The "Test Ok Button" should be entered into Name input field
    When Admin select "James Bond" option from Course Owner dropdown list
    Then "James Bond" option should be selected from Course Owner dropdown list
    When Admin enter "2" in Duration input field
    Then The "2" should be entered into Duration input field
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin select "APAC" option from Region dropdown list
    Then "APAC" option should be selected from Region dropdown list
    When Admin select "Singapore" option from Country dropdown list
    Then "Singapore" option should be selected from Country dropdown list
    When Admin enter "QA Test Description" in Course Description input field
    Then The "QA Test Description" should be entered into Course Description input field
    When Admin click on Create Course button
    Then Pop-up window should be displayed with text "Course Successfully Created"
    When Admin confirm that Ok button is inside the pop-up window as enabled
    Then Ok button should be inside the pop-up window as enabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_17"

  @TC_TMS739_18
  Scenario: TC_TMS739_18 Test that Admin should be able to see "Ok" button enabled in pop-up window
    Given User is logged in as an Admin and navigate to Create Course page
    When Admin enter "Test Ok Button" in Name input field
    Then The "Test Ok Button" should be entered into Name input field
    When Admin select "James Bond" option from Course Owner dropdown list
    Then "James Bond" option should be selected from Course Owner dropdown list
    When Admin enter "2" in Duration input field
    Then The "2" should be entered into Duration input field
    When Admin select "Test" option from Assessments dropdown list
    Then "Test" option should be selected from Assessments dropdown list
    When Admin select "APAC" option from Region dropdown list
    Then "APAC" option should be selected from Region dropdown list
    When Admin select "Singapore" option from Country dropdown list
    Then "Singapore" option should be selected from Country dropdown list
    When Admin enter "QA Test Description" in Course Description input field
    Then The "QA Test Description" should be entered into Course Description input field
    When Admin click on Create Course button
    Then Pop-up window should be displayed with text "Course Successfully Created"
    When Admin click on Create another course button
    Then Admin should be redirect to Create Course page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_236/" as "TMS_739_18"
