@TMS_700
Feature: TMS_700 As an Admin, I want to have a two-weeks calendar view where I can view the trainers' schedules for the given two weeks.

  @TC_TMS1297_01
  Scenario: TC_TMS1297_01 Test that Admin can select "1 week" view
    Given Admin is on Calendar page
    When As an Admin, click on drop down arrow of week button
    Then Admin should be able to see drop down list with options "1 Week", "2 Weeks"
    When As an Admin,click on one week option from the drop down list
    Then Trainers schedule for one week should be displayed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_700/" as "TMS1297_01"

  @TC_TMS1297_02
  Scenario: TC_TMS1297_01 Test that Admin can select "2 weeks" view
    Given Admin is on Calendar page
    When As an Admin, click on drop down arrow of week button
    Then Admin should be able to see drop down list with options "1 Week", "2 Weeks"
    When As an Admin,click on two weeks option from the drop down list
    Then Trainers schedule for two weeks should be displayed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_700/" as "TMS1297_02"
