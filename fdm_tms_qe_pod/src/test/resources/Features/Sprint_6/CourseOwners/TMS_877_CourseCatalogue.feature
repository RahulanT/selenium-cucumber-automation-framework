#Author: Navpreet Kaur
@Regression_Testing
Feature: TMS_877 As a Trainer I want to view all course titles on one page so that I can easily access any course that I want to review

  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password
    And user clicks the login button

@TC_TMS_1390
   Scenario: TC_TMS1390 Test that Exact matches (non-case sensitive) alphabetically Ascending order of course name should display when user hit enter				
   	Given User is logged in as a Trainer
   	And User is able to navigate on course catalogue page
   	Then Select region should be displayed in filter bar 
   	And All the courses in the course tiles should be in ascending order 
     And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_877/" as "TMS_1390"


@TC_TMS_1391
   Scenario: TC_TMS1391 Test that all the course filters are left aligned				
   	Given User is logged in as a Trainer 
   	And User is able to navigate on course catalogue page
   	And Select region should be displayed in left of filter bar
   	Then  Select Country should be right after Region Filter
   	And Select Pathways should be right after Country Filter
     And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_877/" as "TMS_1391"


@TC_TMS_1392
   Scenario: TC_TMS1392 Test that background colour of function bar is Grey			
   	Given User is logged in as a Trainer 
   	And User is able to navigate on course catalogue page
   	And Background colour of filter bar should be gray
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_877/" as "TMS_1392"
     

@TC_TMS_1393
   Scenario: TC_TMS1393 Test that Search bar is right aligned		
   	Given User is logged in as a Trainer 
   	And User is able to navigate on course catalogue page
   	Then Search bar is displayed in the filter bar
   	And Search bar is right aligned after all the filters
     And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_877/" as "TMS_1393"
     

@TC_TMS_1394
   Scenario: TC_TMS1394 Test that Select Country drop down list is avaialble when user Selects Country from Row	
   	Given User is logged in as a Trainer 
   	And User is able to navigate on course catalogue page
   	Then Search bar is displayed in the filter bar
   	And Search bar is right aligned after all the filters
     And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_877/" as "TMS_1394"