@IntegrationTesting
Feature: TMS_1774 As user, I want a log/sign out button.

@TMS_1850
  Scenario: TMS_1850 Test that sign out option is available											
    Given Admin is on calendar view to check log out button
    When Click on sign out option	
    Then it should be clicked the sign out
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_8/AcademyUsers/TMS_1774/" as "TMS_1850"
    
