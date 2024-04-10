Feature: As an admin, I want to be able to use the search option in the calendar so that I can quickly
find schedule based on the searched criteria.

@TMS_825_01
  Scenario: TMS_825_01 Test that Admin could be able to click on search box and enter text.				
    Given Admin is navigated to calendar page			
    When I click on search box
    Then it should be clicked	
    And I enter text into search bar.	
    Then text should be entered
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_699/" as "TMS_825_01"

@TMS_825_02
  Scenario: TMS_825_02 Test that Admin could be able to search for a trainer by typing in search box and calendar results update in real-time.							
    Given Admin is navigated to calendar page				
    When I click on search box
    Then it should be clicked	
    And I enter the first two letters of a name of a trainer in the search box - "Br"	
    Then Multiple results should populate in the search box with names starting with "Br-"	
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_699/" as "TMS_825_02"

@TMS_825_03
  Scenario: TMS_825_03 Test that Admin could be able to search for a trainer and when at least 3 results populate in search box, a scroll bar appears within search box to allow scrolling through results.											
    Given Admin is navigated to calendar page			
    When I click on search box 
    Then it should be clicked	
    And I enter the first two letters of a name of a trainer in the search box - "Br"	
    Then Multiple results should populate in the search box with names starting with "Br-"	
    And verify scroll bar should appear next to search box, which allows scrolling of results, when at least 3 results populate.	
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_699/" as "TMS_825_03"
 
 @TMS_825_04
  Scenario: TMS_825_04 Test that Admin could be able to search for a trainer and when results are found, the number of results is shown above the search bar.															
    Given Admin is navigated to calendar page				
    When I click on search box
    Then it should be clicked	
    And I enter letter "A"		
    And verify "0 results" is displayed above the search box.		
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_699/" as "TMS_825_04"
 
  @TMS_825_05
  Scenario: TMS_825_05 Test that Admin could be able to search for a trainer, then click on the name in the dropdown box to select the trainer to be displayed.																					
    Given Admin is navigated to calendar page				
    When I click on search box
    Then it should be clicked	
     And I enter the first two letters of a name of a trainer in the search box - "Br"	
    Then Multiple results should populate in the search box with names starting with "Br-"	
    And I click on the name "Bruce Wayne" from the results dropdown that should be clickable	
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_699/" as "TMS_825_05"
 
  @TMS_825_06
  Scenario: TMS_825_06 Test that Admin could be able to type a single letter into search box and the search returns the results of all trainers whose first names start with that letter.																									
    Given Admin is navigated to calendar page				
    When I click on search box
    Then it should be clicked	
     And I enter the first letters of a name of a trainer in the search box - "B"		
    Then Only trainers whose first names start with the letter "B" should display on calendar view
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_699/" as "TMS_825_06"
    
    
     @TMS_825_07
  Scenario: TMS_825_07 Test that Get request to /trainers should return status code 200 if database has all trainers																												
    When I send a Get request to "/trainer/trainers"
    Then Status code 200 should be return with data
     
                         
                         