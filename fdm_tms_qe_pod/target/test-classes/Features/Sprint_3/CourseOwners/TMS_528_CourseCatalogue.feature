#Author: navpreet.kaur1@fdmgroup.com
#author:Navpreet Kaur
Feature: Access course material from Course Catalogue

  @TC_TMS654_Login_Test
  Scenario: TC_TMS654_01 User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password
    And user clicks the login button
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/CourseOwners/TMS_528/" as "TMS_654_01"

  @TC_TMS654_Course_Catalogue_Navigation_Bar
  Scenario: TC_TMS654_02 Test that course catalogue tab is displayed on the  TMS navigation bar
    Given User Logged in successfully
    And User navigates to course catalogue button in the navigation bar
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/CourseOwners/TMS_528/" as "TMS_654_02"

  @TC_TMS654_Course_Catalogue_Course_Tiles
  Scenario: TC_TMS654_03 Test that course tiles are displayed under course catalogue stream
    Given User navigates to course catalogue button in the navigation bar
    And User navigates to the Java Development Stream using course catalogue button in the navigation bar
    And User verify if all the course names are correct in course tiles
    Then Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/CourseOwners/TMS_528/" as "TMS_654_03"

  @TC_TMS654_Course_Material_Page_With_Course_Name
  Scenario: TC_TMS654_04 Test that Each stream has link to Course Material Page			
    Given User verify if all the course names are correct in course tiles
    And  see that each course has Go to Material Button
    And User redirected to the course material page and can see datatable on course material page and select the course material
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/CourseOwners/TMS_528/" as "TMS_654_04"
