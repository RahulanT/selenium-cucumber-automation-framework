#Author: Tejas Patel 08/29/2023
@SequencingCoursesFeature
Feature: TMS_1076 As an Admin, I want to be able to manage learning pathways for employees So I can govern courses within the pathway

  @TC_TMS1173_01
  Scenario: TC_TMS1173_01 Test that Admin should be able to see the courses index numbers in Selected Courses List
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "1" should display as an index for "OOD" course in Selected Courses list
    When Admin click on "AEM" course from Available Courses list
    Then "AEM" course should be selected from Available Courses
    When Admin click on Add button
    Then "2" should display as an index for "AEM" course in Selected Courses list
    When Admin click on "Botium" course from Available Courses list
    Then "Botium" course should be selected from Available Courses
    When Admin click on Add button
    Then "3" should display as an index for "Botium" course in Selected Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1076/" as "TMS_1173_01"

  @TC_TMS1173_02
  Scenario: TC_TMS1173_02 Test that Admin should be able to change the sequence of courses by drag and drop in Selected Courses List
    Given User is logged in as an Admin and navigate to Create Pathway page
    When Admin select "NA" option from Region dropdown list
    Then "NA" option should be selected from Region dropdown list
    When Admin select "Canada" option from Country dropdown list
    Then "Canada" option should be selected from Country dropdown list
    When Admin click on "OOD" course from Available Courses list
    Then "OOD" course should be selected from Available Courses
    When Admin click on Add button
    Then "1" should display as an index for "OOD" course in Selected Courses list
    When Admin click on "AEM" course from Available Courses list
    Then "AEM" course should be selected from Available Courses
    When Admin click on Add button
    Then "2" should display as an index for "AEM" course in Selected Courses list
    When Admin click on "Botium" course from Available Courses list
    Then "Botium" course should be selected from Available Courses
    When Admin click on Add button
    Then "3" should display as an index for "Botium" course in Selected Courses list
    When Admin drag and drop the "Botium" course to index no. "1"
    Then "1" should display as an index for "Botium" course in Selected Courses list
    When Admin drag and drop the "AEM" course to index no. "1"
    Then "1" should display as an index for "AEM" course in Selected Courses list
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1076/" as "TMS_1173_02"
