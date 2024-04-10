#Author:Amit Sharma 
# Sprint 7 Automation
# Team3 Story Manually Testing with Team 2
# TMS_1248 story was further divided into 1276,77,78 and 79


@TMS1276
Feature: TMS_1276 Academy Admin Add Trainer Enhancement
    @TMS_1276_AddTrainerPage
 		Scenario: TMS_1276 As an Academy Admin, the user should be able to add a trainer
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And Navigate to the Academy Directory page using url
    And User Clicks on Add Trainer 
		And User should be able taken to Add Trainer Page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1276/" as "TMS_1276"
    
     
