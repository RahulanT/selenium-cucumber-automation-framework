Feature: TMS-1428 As an admin, I want to be able to clear all currently applied filters so that I can view all data in its default form."

@TMS_1662
  Scenario: TMS_1662 Test that "clear all" button is clickable									
    Given Admin redirected to calendar page to check filter functions		
    When click on "clear all" button	
    Then it should clicked clear all
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1428/" as "TMS_1662"


   
