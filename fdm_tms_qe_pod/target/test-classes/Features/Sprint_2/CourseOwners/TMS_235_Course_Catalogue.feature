#author:Navpreet Kaur
Feature: Access course material from Course Catalogue

  @TC_TMS304_Login_Test
  Scenario: TC_TMS304_01 User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password
    And user clicks the login button
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/CourseOwners/TMS_235/" as "TMS_304_01"

  @TC_TMS304_Course_Catalogue_Navigation
  Scenario: TC_TMS304_02 Test that course catalogue tab is displayed on the  TMS navigation bar
    Given User Logged in successfully
    And User navigates to the BAPM Stream using course catalogue button in the navigation bar
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/CourseOwners/TMS_235/" as "TMS_304_02"

  @TC_TMS304_Course_Catalogue_Tiles
  Scenario: TC_TMS304_03 Test that Eight course tiles are displayed under BAPM Stream
    Given 8 Tiles of courses are displayed
    And User verify if all the course names are correct
    Then Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/CourseOwners/TMS_235/" as "TMS_304_03"

  @TC_TMS304_Course_Material_Page
  Scenario: TC_TMS304_04 Test that  Course Material Button is displayed
    Given Go to Material Button is displayed
    And User clicks the button
    And User redirected to course material page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/CourseOwners/TMS_235/" as "TMS_304_04"

  @TC_TMS304_Course_Material_Page_Selected
  Scenario: TC_TMS304_05 Test that  Background colour is changing
    Given Data Table is displayed
    And User selected a row
    And User see the background colour is changed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/CourseOwners/TMS_235/" as "TMS_304_05"

     @TC_TMS304_Course_Material_Page_Selected
  Scenario:TC_TMS304_06 Test that  Background colour is changing when hover over the element
    Given User is on Course Material Page
    And User hovered over a row and background colour is changing
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/CourseOwners/TMS_235/" as "TMS_304_06"
  