@Regression_Testing
Feature: TMS_1247 As an Admin, I want to have the ability to choose to view courses by cohort so that I can 
know which courses are being offered under the cohorts. 

@TMS_1410
  Scenario: TMS_1410 Test that Admin can see by cohort option						
    Given Admin selected the calendar page			
    When I click on cohort view
    Then it should clicked
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1247/" as "TMS_1410"

    
@TMS_1411
  Scenario: TMS_1411 Test that Admin can see list of cohort codes after selecting cohort view										
    Given Admin selected the calendar page			
    When I click on cohort view
    Then it should clicked
    Then check that cohort codes are available
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1247/" as "TMS_1411"
    
    
@TMS_1412
  Scenario: TMS_1412 Test that Admin can see column label as "By cohort"													
    Given Admin selected the calendar page			
    When I click on cohort view
    Then it should clicked
    Then check that label name "By cohort" is there
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1247/" as "TMS_1412"
    
@TMS_1413
  Scenario: TMS_1413 Test that Admin can select one view at a time, Trainer or cohort																	
    Given Admin selected the calendar page			
    When I switch to trainer view
    And try selecting both view
    Then it should not possible
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/Admins/TMS_1247/" as "TMS_1413"
    
@TMS_1414
 Scenario: TMS_1414 Test that Get request /cohorts should return status code 200 if database has all cohorts																												
    When I sent a Get request to "/cohorts"
    Then Status code 200 should be return with data in postman
      