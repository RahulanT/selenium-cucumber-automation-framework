Feature: TMS_2059 As a user, I want my log in to be authenticated to ensure my privacy 
@Regression_Testing
@TMS_2080
  Scenario: TMS_2080 Test that login is working properly									
    Given User is on tms page and checks the login button
    When user enters correct credentials
    And user clicks on login button
    Then user checks logout button 
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_10/AcademyUsers/TMS_2059/" as "TMS_2080"