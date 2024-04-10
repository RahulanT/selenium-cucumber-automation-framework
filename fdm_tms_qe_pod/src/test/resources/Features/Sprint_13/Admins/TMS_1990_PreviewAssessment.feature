Feature: TMS_1990 Preview Assessment 

@TMS_2233
  Scenario: @TMS_2233 Test that admin can see a "Preview" button or option available during the assessment template creation process.
    Given User logged in using valid credentials
    When I click on admin link
    Then I click on view assessment link
    Then I click on create assessment button
    Then check that preview button is available
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_13/Admins/TMS_1990/" as "TMS_2233"

@TMS_2236
  Scenario: @TMS_2236 Test that admin can close the preview mode 				
    Given User logged in using valid credentials
    When I click on admin link
    Then I click on view assessment link
    Then I click on create assessment button
    Then check that preview button is available
    Then check that close button is working
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_13/Admins/TMS_1990/" as "TMS_2236"