Feature: TMS_959 As an admin, I want to see Out of Office status in the calendar when showing trainer’s schedule.

@TMS_1506
  Scenario: TMS_1506 Test that "Out of office bar" is in red color										
    Given Admin selected the calendar view page
    When Click on bar	
    Then it should be in red color
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_959/" as "TMS_1506"