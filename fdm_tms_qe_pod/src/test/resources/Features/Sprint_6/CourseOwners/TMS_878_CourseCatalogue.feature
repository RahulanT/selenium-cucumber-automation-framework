#Author: Sofia Singh
Feature: TMS_878 As a trainer, I want to search for courses on the All Courses page by course name so that I can find the course I’m looking for.
@Regression_Testing
  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password of trainer
    And user clicks the Login button

  @TMS_1475
  Scenario: TMS_1475 Test that Exact matches (non-case sensitive) alphabetically Ascending order of course name should display when user hit enter
    Given The user is signed in as a trainer and has navigated to the All Courses page
    When User is on search button and type three words to search a course name
    When User hit enter after typing three words
    Then user can see exact course name is displayed  in Ascending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_878/" as "TMS_1475"

  @TMS_1477
  Scenario: TMS_1477 Test that Exact matches (non-case sensitive) alphabetically Ascending order of course name should display when user hit enter
    Given The user is signed in as a trainer and has navigated to the All Courses page
    When User is on search button and type partial three words to search a course name
    When User hit enter after typing three words
    Then user can see partial course name is displayed in Ascending order as first three characters are matched
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_878/" as "TMS_1477"

  @TMS_1476
  Scenario: TMS_1476 Test that Exact matches (non-case sensitive) alphabetically Ascending order of course name should display when user hit enter
    Given The user is signed in as a trainer and has navigated to the All Courses page
    When User is on search button and type two words to search a course name
    When User hit enter after typing two words
    Then There should be an error message saying to enter three characters in the search bar
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_878/" as "TMS_1476"

  @TMS_1478
  Scenario: TMS_1478 Test that the courses on All Courses page will display with the default filter (courses specific to the region of the trainer) turned on
    Given The user is signed in as a trainer and has navigated to the All Courses page
    When User selects the cancel search option  by clicking the “X” icon
    When User click on X icon and all courses page will display with default filter
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_878/" as "TMS_1478"

  @TMS_1479
  Scenario: TMS_1479 Test that when trainer type in a search query in the search box and hit enter and there are no partial or exact matches Then the All Courses page will show “No Courses Found”
    Given The user is signed in as a trainer and has navigated to the All Courses page
    When User is on search button and type sone characters to search a course name
    When User hit enter after typing the characters
    Then There should be an "No Courses Found" message if course is not available in course tiles
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_6/CourseOwners/TMS_878/" as "TMS_1479"
