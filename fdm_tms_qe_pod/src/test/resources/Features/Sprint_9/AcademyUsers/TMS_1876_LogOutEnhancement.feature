@Regression_Testing
Feature: TMS_1876 As user, I want a log/sign out button.

@TMS_1961
  Scenario: TMS_1961 Test that when user clicks logout button, user should be redirected to login page										
    Given Admin is on calendar view to check log out button
    When Click on sign out option	
    Then it should be clicked the sign out
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/AcademyUsers/TMS_1876/" as "TMS_1961"