#author:Siqi Ma
@TC_TMS1077
Feature: Check the dropdown menus for navigation bar

  @TC_TMS1131
 		Scenario: trainees should be able to see dropdown menu of the navbar 
    Given User launches the TMS portal page
    When Enters valid id and password for trainee
    And user clicks the login button
    And user hang on the Profile on navigation bar
    And user should be able to see the drop down menu
    And user hang on the calendar on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Academy Directory on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Academy Documents on navigation bar
    And user should be able to see the drop down menu
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/AcademyUsers/TMS_1077/" as "TMS_1375_01"
    And user close this page
    
   @TC_TMS1132
 		Scenario: trainers should be able to see dropdown menu of the navbar 
    Given User launches the TMS portal page
    When Enters valid id and password for trainer
    And user clicks the login button
    And user hang on the Profile on navigation bar
    And user should be able to see the drop down menu
    And user hang on the calendar on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Trainees on navigation bar
    And user should be able to see the drop down menu    
    And user hang on the Academy Directory on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Academy Documents on navigation bar
    And user should be able to see the drop down menu
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/AcademyUsers/TMS_1077/" as "TMS_1375_02"
    And user close this page
    
   @TC_TMS1133
 		Scenario: academy managers should be able to see dropdown menu of the navbar 
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Manager
    And user clicks the login button
    And user hang on the Profile on navigation bar
    And user should be able to see the drop down menu
    And user hang on the calendar on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Trainees on navigation bar
    And user should be able to see the drop down menu    
    And user hang on the Classes on navigation bar
    And user should be able to see the drop down menu   
    And user hang on the Academy Directory on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Academy Documents on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Admin on navigation bar
    And user should be able to see the drop down menu
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/AcademyUsers/TMS_1077/" as "TMS_1375_03"
    And user close this page
    
   @TC_TMS1134
 		Scenario: academy admins should be able to see dropdown menu of the navbar 
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And user clicks the login button
    And user hang on the Profile on navigation bar
    And user should be able to see the drop down menu
    And user hang on the calendar on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Trainees on navigation bar
    And user should be able to see the drop down menu    
    And user hang on the Classes on navigation bar
    And user should be able to see the drop down menu   
    And user hang on the Academy Directory on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Academy Documents on navigation bar
    And user should be able to see the drop down menu
    And user hang on the Admin on navigation bar
    And user should be able to see the drop down menu
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/AcademyUsers/TMS_1077/" as "TMS_1375_04"
    And user close this page
