#Author:Amit Sharma 
# Sprint 7 Automation
# Team3
# TMS_1248 story was further divided into 1276,77,78 and 79
# TMS_1278


@TMS1278

Feature: TMS_1278 As an Academy Admin I should be able to add the trainer only if all fields on the add trainer form are filled
    @TMS_1278_AddTrainer_AllFieldsFilled
 		Scenario: TMS_1278 As an Academy Admin, the user should be able to add a trainer only if all the fields of the form are filled
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And Navigate to the Academy Directory page using url
    And User Clicks on Add Trainer 
    And User does not fill in all details for the trainer
    And User clicks on Submit button
		And User should NOT be able add trainer 
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1278/" as "TMS_1278"
    
     
     
