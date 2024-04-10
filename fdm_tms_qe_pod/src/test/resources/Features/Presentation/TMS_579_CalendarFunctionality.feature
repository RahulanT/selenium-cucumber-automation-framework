@CalendarFunctionalityFeature
Feature: TMS_579 As an admin, I want the ability to click on the single arrow and select next and previous week on the calendar, so that I can view the schedule for the next and previous week.

  Background: 
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    Then user clicks the Login button

  # NOT WORKING
  #@TC_TMS586_01
  #Scenario: TC_TMS586_01 Test that Admin could be able to click on the forward arrow to the right of the calendar date range to view the next week schedule.
  #When Admin click on the calendar button on the navigation bar.
  #Then TMS calendar view should be displayed.
  #When Admin click on the forward arrow button to the right of the calendar date range, under the navigation bar.
  #Then Forward arrow button should be clicked.
  #When Admin verify the calendar view is shifted to next week
  #Then Calendar date range should display next week's dates.
  #And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_579/" as "TMS586_01"
  #
  # NOT WORKING
  #@TC_TMS586_02
  #Scenario: TC_TMS586_02 Test that Admin could be able to click on the back arrow to the left of the calendar date range to view the previous week schedule.
  #When Admin click on the calendar button on the navigation bar.
  #Then TMS calendar view should be displayed.
  #When Admin click on the back arrow button to the left of the calendar date range, under the navigation bar.
  #Then Back arrow button should be clicked.
  #When Admin verify the calendar view is shifted to the previous week's
  #Then Calendar date range should display the previous week's dates.
  #And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_579/" as "TMS586_02"
  #
  #WORKS ---
  @TC_TMS586_03
  Scenario: TC_TMS586_03 Test that Admin could be able to click on the back arrow to the left of the calendar date range to view the previous week schedule.
    When Admin click on the calendar button on the navigation bar.
    Then TMS calendar view should be displayed.
    When Admin click on the forward arrow button to the right of the calendar date range, under the navigation bar.
    Then Dates below the days of the week and above the AM/PM sloths should display next week's dates.
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Presentation/TMS_579/" as "TMS586_03"

  @TC_TMS586_04
  Scenario: TC_TMS586_04 Test that Admin could be able to click on the back arrow to the left of the calendar date range to view the previous week schedule.
    When Admin click on the calendar button on the navigation bar.
    Then TMS calendar view should be displayed.
    When Admin click on the back arrow button to the left of the calendar date range, under the navigation bar.
    Then Dates below the days of the week and above the AM/PM sloths should display the previous week's dates.
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Presentation/TMS_579/" as "TMS586_04"
