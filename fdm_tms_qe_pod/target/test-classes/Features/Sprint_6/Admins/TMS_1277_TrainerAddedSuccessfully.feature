#Author:Amit Sharma 
# Sprint 7 Automation
# Team3
# TMS_1248 story was further divided into 1276,77,78 and 79
# TMS_1277


@TMS1277

Feature: TMS_1277 As an Academy Admin I should be able to add the trainer successfully
    @TC_TMS_1277_AddTrainerSuccessfully
 		Scenario: TMS_1277 As an Academy Admin, the user should be able to add a trainer
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And Navigate to the Academy Directory page using url
    And User Clicks on Add Trainer 
    And User fills in details of the trainer
    And User clicks on Submit button
		And User should be able add trainer and get a message that trainer was added successfully
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1277/" as "TMS_1277"
    
