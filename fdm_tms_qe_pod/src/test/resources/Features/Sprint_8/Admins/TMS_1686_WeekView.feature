@IntegrationTesting
Feature: TMS_1686 As an admin, I want to be able to view the calendar in three and four week views.

@TMS_1815
  Scenario: TMS_1815 Test that three week view is available														
    Given Admin selected the calendar page view	for checking week view	
    When Click on 3 week button
    Then 3 week should be clicked
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_8/Admins/TMS_1686/" as "TMS_1815"
    
@TMS_1816
  Scenario: TMS_1816 Test that four week view is available																	
    Given Admin selected the calendar page view	for checking week view	
    When Click on 4 week view button
    Then 4 week view should be clicked
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_8/Admins/TMS_1686/" as "TMS_1816"