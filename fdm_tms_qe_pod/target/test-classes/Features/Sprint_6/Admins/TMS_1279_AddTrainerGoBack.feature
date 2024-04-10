#Author:Amit Sharma 
# Sprint 7 Automation
# Team3
# TMS_1248 story was further divided into 1276,77,78 and 79
# TMS_1279


@TMS1279

Feature: TMS_1279 As an Academy Admin I should be able go back to add trainer page
    @TMS_1279_AddTrainer_GoBack
 		Scenario: TMS_1279 As an Academy Admin, the user should be able go back on add trainer page
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And Navigate to the Academy Directory page using url
    And User Clicks on Add Trainer 
    And User clicks back without submitting 
		And User should be able to go back to add trainer page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1279/" as "TMS_1279"
    
     
     
