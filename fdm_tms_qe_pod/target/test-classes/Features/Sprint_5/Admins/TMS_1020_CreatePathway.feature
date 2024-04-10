#Author: Tejas Patel 08/29/2023
@CreateCourseFeature
Feature: TMS_1020 As an Admin, I want to have the ability to create and manage learning pathways for employees. This includes adding a description, selecting a pathway owner.

  @TC_TMS1129_01
  Scenario: TC_TMS1129_01 Test that Admin should be able to see page title on Create Pathway page
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin confirm that "Create Pathway" is displayed as a title of the page
    Then "Create Pathway" should be displayed as a page title
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_01"

 
  @TC_TMS1129_02
  Scenario: TC_TMS1129_02 Test that Admin should be able to see hint text for Pathway name, Region and Country
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin verify that "Enter Pathway Name" is displayed as hint text for Pathway Name input field
    Then "Enter Pathway Name" should be displayed as hint text for Pathway Name input field
    When Admin verify that "Select Region" is displayed as hint text for Region dropdown list
    Then "Select Region" should be displayed as hint text for Region dropdown list
    When Admin verify that "Select Country" is displayed as hint text for Country dropdown list
    Then "Select Country" should be displayed as hint text for Country dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS1129_02"

  @TC_TMS1129_03
  Scenario: TC_TMS1129_03 Test that Admin should be able to enter Pathway Name in Pathway Name input field
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin click on Pathway Name input field
    Then The Pathway Name input field should be editable
    When Admin enter "QA Test Pathway" in Pathway Name input field
    Then The "QA Test Pathway" should be entered into Pathway Name input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_03"

  @TC_TMS1129_04
  Scenario: TC_TMS1129_04 Test that Admin should be able to select Color
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_04"

  @TC_TMS1129_05
  Scenario: TC_TMS1129_05 Test that Admin should be able to select different Countries based on different Regions on Create Pathway page
    Given User is logged in as an Admin and navigate to Create Pathway page
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
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_05"

	@TC_TMS1129_06
  Scenario: TC_TMS1129_06 Test that Admin should be able to select different Countries based on different Regions on Create Pathway page
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin click on Region dropdown list
    Then Region dropdown list should be displayed
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "Bruce Wayne" option from Pathway Owner dropdown list	
    Then "Bruce Wayne" option should be selected from Pathway Owner dropdown list
    When Admin select "James Bond" option from Pathway Owner dropdown list	
    Then "James Bond" option should be selected from Pathway Owner dropdown list
    When Admin select "United States" option from Country dropdown list	
    Then "United States" option should be selected from Country dropdown list
    When Admin select "Peter Parker" option from Pathway Owner dropdown list	
    Then "Peter Parker" option should be selected from Pathway Owner dropdown list
    When Admin select "Clark Kent" option from Pathway Owner dropdown list	
    Then "Clark Kent" option should be selected from Pathway Owner dropdown list
    When Admin select "Foo Bar" option from Pathway Owner dropdown list	
    Then "Foo Bar" option should be selected from Pathway Owner dropdown list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_06"

 @TC_TMS1129_07
  Scenario: TC_TMS1129_07 Test that Admin should be able to enter description in Description input field
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin click on Description input field
    Then The Description input field should be editable
    When Admin enter "QA Test Description" in Description input field
    Then The "QA Test Description" should be entered into Description input field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_07"


  @TC_TMS1129_08
  Scenario: TC_TMS1129_08 Test that Admin should be able to see no. of days in Duration in Days field
    Given User is logged in as an Admin and navigate to Create Pathway page
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
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_08"

	@TC_TMS1129_09
  Scenario: TC_TMS1129_09 Test that Admin should be able to see no. of weeks in Duration in Weeks field
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin verify "1" no. of weeks in Duration in Weeks field
    Then "1" should be displayed in Duration in Weeks field
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_09"

  @TC_TMS1129_10
  Scenario: TC_TMS1129_10 Test that Admin should be able to see Create a Pathway button as disabled when all mandatory fields not filled
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin verify that Pathway Name input field is empty
    Then Pathway Name input field should be empty
    When Admin verify that Select Color field is empty
    Then Select Color field should be empty
    When Admin verify that Region is not selected
    Then Region should not be selected
    When Admin verify that Country is not selected
    Then Country should not be selected
    When Admin verify that Pathway Owner dropdown list not selected any option
    Then Pathway Owner dropdown list should not be selected an option
    When Admin verify that Duration in Days field is empty
    Then Duration in Days field should be empty
    When Admin verify that Create a Pathway button is disabled
    Then Create a Pathway button should be disabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_10"

  @TC_TMS1129_11
  Scenario: TC_TMS1129_11 Test that Admin should be able to add courses by clicking Add button
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_11"

  @TC_TMS1129_12
  Scenario: TC_TMS1129_12 Test that Admin should be able to remove courses by clicking Remove button
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on "OOD" course from Selected Courses list
    Then "1     OOD" course should be selected from Selected Courses list
    When Admin click on Remove button
    Then "OOD" course should be removed from Selected Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_12"

  @TC_TMS1129_13
  Scenario: TC_TMS1129_13 Test that Admin should be able to see removed courses into Available Courses list
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on "OOD" course from Selected Courses list
    Then "1     OOD" course should be selected from Selected Courses list
    When Admin click on Remove button
    Then "OOD" course should be removed from Selected Courses list
    When Admin verify that "OOD" course is added back into Available Courses list
    Then "OOD" course should be added into Available Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_13"

  @TC_TMS1129_14
  Scenario: TC_TMS1129_14 Test that Admin should be able to see pop-up with text Pathway Created when click on Create Pathway button
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin enter "QA Test Pathway" in Pathway Name input field
    Then The "QA Test Pathway" should be entered into Pathway Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "James Bond" option from Pathway Owner dropdown list
    Then "James Bond" option should be selected from Pathway Owner dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Pathway button
    Then Pop-up window should be displayed with "Pathway Created" text
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_14"

  @TC_TMS1129_15
  Scenario: TC_TMS1129_15 Test that Admin should be able to see all same data in pop-up window as filled on Create Pathway page
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin enter "QA Test Pathway" in Pathway Name input field
    Then The "QA Test Pathway" should be entered into Pathway Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "James Bond" option from Pathway Owner dropdown list
    Then "James Bond" option should be selected from Pathway Owner dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin verify "5" no. of days in Duration in Days field
    Then "5" should be displayed in Duration in Days field
    When Admin verify "1" no. of weeks in Duration in Weeks field
    Then "1" should be displayed in Duration in Weeks field
    When Admin enter "QA Test Description" in Description input field
    Then The "QA Test Description" should be entered into Description input field
    When Admin click on Create Pathway button
    Then Pop-up window should be displayed with "Pathway Created" text
    When Admin verify Pathway Name as "QA Test Pathway" in pop-up window
    Then "QA Test Pathway" should be displayed as Pathway Name in pop-up window
    When Admin verify Pathway Color code as "##ff0000" in pop-up window
    Then "##ff0000" should be displayed as Pathway Color code in pop-up window
    When Admin verify Pathway Owner as "James Bond" in pop-up window
    Then "James Bond" should be displayed as Pathway Owner in pop-up window
    When Admin verify Description as "QA Test Description" in pop-up window
    Then "QA Test Description" should be displayed as Description in pop-up window
    When Admin verify Course Selected as "OOD" in pop-up window
    Then "OOD" should be displayed as Course Selected in pop-up window
    When Admin verify Duration of Pathway as "5 Days" in pop-up window
    Then "5 Days" should be displayed as Duration of Pathway in pop-up window
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_15"

  @TC_TMS1129_16
  Scenario: TC_TMS1129_16 Test that Admin should be able to close pop-up window when click on (x) close button
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin enter "QA Test Pathway" in Pathway Name input field
    Then The "QA Test Pathway" should be entered into Pathway Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "James Bond" option from Pathway Owner dropdown list
    Then "James Bond" option should be selected from Pathway Owner dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Pathway button
    Then Pop-up window should be displayed with "Pathway Created" text
    When Admin click on (x) close button
    Then Pop-up window should be closed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_16"

  @TC_TMS1129_17
  Scenario: TC_TMS1129_17 Test that Admin should be able to see Ok button enabled in pop-up window
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin enter "QA Test Pathway" in Pathway Name input field
    Then The "QA Test Pathway" should be entered into Pathway Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "James Bond" option from Pathway Owner dropdown list
    Then "James Bond" option should be selected from Pathway Owner dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Pathway button
    Then Pop-up window should be displayed with "Pathway Created" text
    When Admin verify Ok button is displayed as enabled
    Then Ok button should be displayed as enabled
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_17"

  @TC_TMS1129_18
  Scenario: TC_TMS1129_18 Test that Admin should be able to see Create Pathway page when click on Create Another Pathway button in pop-up window
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin enter "QA Test Pathway" in Pathway Name input field
    Then The "QA Test Pathway" should be entered into Pathway Name input field
    When Admin click on Select Color field
    Then The color picker window should be open
    When Admin select Red color "#ff0000" from color picker window
    Then The Red color "#ff0000" should be selected for select color field
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin select "James Bond" option from Pathway Owner dropdown list
    Then "James Bond" option should be selected from Pathway Owner dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "OOD" course should be added into Selected Courses list
    When Admin click on Create Pathway button
    Then Pop-up window should be displayed with "Pathway Created" text
    When Admin click on Create Another Pathway button
    Then Admin should be redirect to Create Pathway page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1020/" as "TMS_1129_18"
