#author:Amit Sharma Check 
@TC_TMS669
Feature: Check all the relevant options in the Navigation Bar for all the users
    
   	@TC_TMS669_01_Check_NavigatinOptions_Trainee
 		Scenario: TC_TMS_832_01 trainer should be able to see the navigation options for trainee after log in
    Given User launches the TMS portal page
    When Enters valid id and password for trainee
    And user clicks the login button
    And Navigate to the profile card page 
    And User should see the navigation options for trainee
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_832/" as "TMS_832_01"
    
    
    @TC_TMS669_02_Check_NavigatinOptions_Trainer
 		Scenario: TC_TMS_832_02 trainer should be able to see navigation options for trainer after log in
    Given User launches the TMS portal page
    When Enters valid id and password for trainer
    And user clicks the login button
    And Navigate to the profile card page 
    And User should see the navigation options for trainer
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_832/" as "TMS_832_02"
    
     	@TC_TMS669_03_Check_NavigatinOptions_AcademyAdmin
 		Scenario: TC_TMS_832_03 trainer should be able to see navigation options for Academy Admin after log in
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And user clicks the login button
    And Navigate to the profile card page 
    And User should see the navigation options for Academy Admin
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_832/" as "TMS_832_03"
    
    
    @TC_TMS669_04_Check_NavigatinOptions_AcademyManager
 		Scenario: TC_TMS_832_04 trainer should be able to see navigation options for Academy Manager after log in
    Given User launches the TMS portal page
    When Enters valid id and password for academy manager
    And user clicks the login button
    And Navigate to the profile card page     
    And User should see the navigation options for Academy Manager
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_832/" as "TMS_832_04"
    
