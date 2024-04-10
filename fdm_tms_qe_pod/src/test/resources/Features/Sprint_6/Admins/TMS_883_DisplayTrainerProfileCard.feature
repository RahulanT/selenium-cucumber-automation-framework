#Author:Amit Sharma 
# Sprint 7 Automation
# Team3
# Stepdef: DisplayTrainerProfileCards
# Last Updated: 18-Sep-2023 (Amit)


@TC_TMS883

Feature: TMS_883 The Academy Admin is able to view the Academy Directory page with all the Trainer Profile Cards
    
    @TMS_1614_TrainerProfileCards
 		Scenario: TMS_1614 User should be able to see all the Trainer Profile Cards
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And Navigate to the Academy Directory page using url
    And Clicks on the Trainer from the Academy Directory dropdown
		And Check all the trainer profile cards for whether trainers are active using APACHE POI
		And User should be able to see all the Trainer Profile Cards 
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_883/" as "TMS_1614"
    
     
