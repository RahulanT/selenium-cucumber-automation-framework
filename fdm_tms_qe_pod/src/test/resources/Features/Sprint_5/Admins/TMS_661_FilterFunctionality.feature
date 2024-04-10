@Regression_Testing
Feature: TMS_661 As an Admin, I want to be able to use the filter option in the calendar page so that I can view the calendar based on course, 
stream, trainer or region.

@TMS_988_01
  Scenario: TMS_988_01 Test that Admin can use filter buttons to display trainers even if they do not have courses scheduled for the week.			
    Given Admin selected calendar page			
    When I click on region, pathway and course
    Then Filter options should be selected.
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_699/" as "TMS_988_01"

@TMS_988_02
  Scenario: TMS_988_02 Test that Admin can click on the Region button on the Calendar screen to expand a multi-select list to filter the Regions of trainers.				
    Given Admin selected calendar page		
    When I click on the Region filter button on the top left of the screen.
    Then Region filter button clicked.
    And Verify 3 options are available to be selected in the Region multi-select list.
    Then 3 options are available to be selected in the Region multi-select list.
    And Select "North America" for the Region filter.
    Then North America selected for Region filter.
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_699/" as "TMS_988_02"

@TMS_988_03
  Scenario: TMS_988_03 Test that Admin can click on the Pathway button on the Calendar screen to expand a multi-select list to filter the Streams that trainers are teaching.				
    Given Admin selected calendar page			
    When I click on the Pathway filter button on the top left of the screen.
    Then Pathway filter button should be clicked.
    And Verify the 3 options are available to be selected in the Pathway multi-select list.
    Then Java Development, Cloud Computing and BAPM options are available to be selected in the Pathway multi-select list.
    And Select "Java" for the Pathway filter.
    Then Verify calendar filtered only Java pathway trainers for view. 
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_699/" as "TMS_988_03"

 
 @TMS_988_04
  Scenario: TMS_988_04 Test that Admin can click on the Course button on the Calendar screen to expand a multi-select list to filter the Courses that trainers are teaching.				
    Given Admin selected calendar page		
    When I click on the Course filter button on the top left of the screen.
    Then it should be clicked	
    And select "AEM" for the Course filter.
    Then verify only AEM course trainers are shown on calendar.
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_699/" as "TMS_988_04"

@TMS_988_05
  Scenario: TMS_988_05 Test that Admin can select multiple filters at once to filter trainers.			
    Given Admin selected calendar page		
    When I click on the Region filter button on the top left of the screen.	
    Then it should be clicked	
    And select "North America" for the Region filter.	
    Then Calendar filtered only North American trainers for view.	
    And click on the Pathway filter button on the top left of the screen.	
    And select "Java" for the Pathway filter.	
    Then Calendar filtered only Java pathway trainers in North America for view.	
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_699/" as "TMS_988_05"

 
    
   @TMS_988_06
Scenario: TMS_988_06 Test that Get request to /trainer/trainers should return a list of trainers
  When I send a Get request to "/trainer/trainers" using Postman
  Then I should see the name of trainers
    | Peter   |
    | Bruce   |
    | Clark   |
    | James   |
    | Foo     |
    | Jan     |
    | Michael |
    | Michael |
    | David   |
    | Sarah   |

  @TMS_988_07
  Scenario: TMS_988_07 Test that GET request to /trainer/{id} should return null if trainer is not in database 																												
    When send a Get request to "/trainer/50"
    Then it should return <null> 
                                                                                      