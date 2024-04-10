Feature: TMS_1429 As an admin I want to able to clear each filter individually in the calendar page so that I can reset any of the specific applied filters. 

@TMS_1658
  Scenario: TMS_1658 Test that "clear all" button will be located inside each filter including region, pathway and course.										
    Given Admin selected the calendar page view		
    When Click on region	
    Then check that clear all is available for region	
    When Click on pathway
    Then check that clear all is available for pathway
    When Click on course
    Then check that clear all is available for course
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1429/" as "TMS_1658"

@TMS_1659
  Scenario: TMS_1659 Test that "clear all" button is  available													
    Given Admin selected the calendar page view		
    When Click on region	
    Then it should clicked region
    Then check that clear all button is available for region	
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1429/" as "TMS_1659"
    
@TMS_1660
  Scenario: TMS_1660 Test that clicking on "clear all" button will reset the filter															
    Given Admin selected the calendar page view		
    When Click on pathway		
    Then Click on BAPM
    Then check that clicking on clear all button will reset the filter	
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1429/" as "TMS_1660"
    
@TMS_1661
  Scenario: TMS_1661 Test that clearing section of one filter will not affect the other filters																		
    Given Admin selected the calendar page view		
    When click on course		
    Then Click on AEM course	
    Then check that clear on filter for course doesn't affect others		
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1429/" as "TMS_1661"
        