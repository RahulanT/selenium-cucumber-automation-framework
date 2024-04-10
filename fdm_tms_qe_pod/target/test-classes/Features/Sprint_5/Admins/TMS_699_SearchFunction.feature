Feature: TMS_699 As an Admin, I want to use the search option in the calendar so that I can quickly
find schedule based on the searched criteria.

@TMS_1085_01
  Scenario: TMS_1085_01 Test that admin can type any keyword in search option then it should display all the trainers whose first name and last name start with those keywords			
    Given Admin clicked calendar view			
    When click on the search box.	
    Then it should be clicked	
    And enter the first letters of trainer name in the search box - "J"		
    Then It should display each and every trainers whose first name and last name starts with "J"	
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_699/" as "TMS_1085_01"

 @TMS_1085_02
  Scenario: TMS_1085_02 Test that GET request to /trainer/{id} should return specific trainers according to given user id																												
    When send a Get request to "/trainer/9"
    Then Status code 200 should return 