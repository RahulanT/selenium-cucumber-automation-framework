#Author: Swapnil Patel 08/02/2023

@AssessmentListFeature
Feature: As an admin, I want to be able to view a list of existing assessment templates in the system so that I can keep track of assessment templates. 

@TC_TMS640_01
  Scenario: TC_TMS640_01 Test that Assessment Home Page should be able to display comprehensive list of all existing assessment templates
    Given User is logged in as an Admin and navigate to Assessment Home page
    When Admin reached on Assessment Home Page
    Then Admin can see existing Assessment List
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_524/" as "TMS_640_01"
   
@TC_TMS640_02
	Scenario: TC_TMS640_02 Test that each Assessment Entry should have an assessment name, grade scale,active status,description and created by
	Given User is logged in as an Admin and navigate to Assessment Home page
	When Admin should able to see Assessment List
	Then Each entry should have assessment name,grade scale,active status,description and created by
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_524/" as "TMS_640_02"

@TC_TMS640_03
	Scenario: TC_TMS640_03 Test that Admin can search Assessment Name to find specific assessment template		
	Given User is logged in as an Admin and navigate to Assessment Home page
	When Enter "SQL" in Search text box 
	Then Assessment list name with "SQL" is displayed in result
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_524/" as "TMS_640_03" 	
	
@TC_TMS640_04
	Scenario: TC_TMS640_04 Test that Assessment List supports infinite scrolling on assessment home page		
	Given User is logged in as an Admin and navigate to Assessment Home page		
	When Admin scroll down on assessment home page
	Then Verify last Assessment name in table
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_524/" as "TMS_640_04"

@TC_TMS640_05	
	Scenario: TC_TMS640_05 Test that Admin can sort list of assessment templates on created by column based on first name 
	Given User is logged in as an Admin and navigate to Assessment Home page
	When User click on sort button of column Created By
	Then User can see Assessment list sorted based on first name Created By
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_524/" as "TMS_640_05"
	
@TC_TMS640_06
	Scenario: TC_TMS640_06 Test that Admin can filter assessment templates by grade scale value				
	Given User is logged in as an Admin and navigate to Assessment Home page
	When User click on filter button on Grade scale column
	And User select Cloud Computing checkbox 
	Then Assessment List result is displayed which has "Cloud Computing" in Grade Scale
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_524/" as "TMS_640_06"

	