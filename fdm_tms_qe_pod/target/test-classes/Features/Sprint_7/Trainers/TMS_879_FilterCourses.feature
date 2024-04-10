#Author: Kristina Hodomska
#Date Created: Sep. 26, 2023
@FilterCoursesFeature
Feature: TMS_879 As a Trainer, I want to be able to filter courses on the All Courses page by region,
  so that I can find courses in a specific region

  @TMS_1575
  Scenario: TMS_1575 Test that the Region filter should filter and display courses
    using the default region of the trainer as the selection

    Given User click on course catalogue tab
    And Can see All courses are displayed
    When User click on region filter drop down list
    Then They can see region drop down list with default region selected

  @TMS_1576
  Scenario: TMS_1576 Test that the default region should be unchecked,
    and courses in the new region should be displayed

    Given User click on region filter drop down list
    When They select any other region from dropdown list
    #Then All courses from this region are displayed

  @TMS_1580
  Scenario: TMS_1580 Test that an error will display on the All Courses page stating “No Courses Found”
    Given User click on region filter drop down list
    When User select region without assigned course(s) from dropdown list
    Then No courses Found will be displayed
