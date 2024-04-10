@TMS_735
Feature: TMS_735 As an Admin, I want to have the ability to sort trainers in the calendar so that I can view the trainers in alphabetical order.

  @TC_TMS1176_01
  Scenario: TC_TMS1176_01 Test that admin can click on sort icon
    Given Admin is on Calendar page
    When Click on sort icon
    Then It should be clickable
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_735/" as "TMS1176_01"

  @TC_TMS1176_02
  Scenario: TC_TMS1176_02 Test that after clicking on sort icon, the icon should be highlighted and list of trainer should be sorted in descending order by their first name
    Given Admin is on Calendar page
    When Click on sort icon
    Then It should be clickable
    # When Check that after clicking on sort icon, it should be highlighted and trainer list should be sorted in descending order
    Then Sort icon should be highlighted and trainer list should be sort in descending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_735/" as "TMS1176_02"

  @TC_TMS1176_03
  Scenario: TC_TMS1176_03 Test that clicking on sort icon once its applied, the icon shouldn't be highlighted and list of trainer should be sorted in ascending(default) order by their first name
    Given Admin is on Calendar page
    When Click on sort icon
    Then It should be clickable
    When Check that clicking on sort icon once its applied, it should not be highlighted and trainer list should be sorted in ascending order
    Then Sort icon shouldn't be highlighted and trainer list should be sort in ascending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_735/" as "TMS1176_03"

  @TC_TMS1176_04
  Scenario: TC_TMS1176_04 Verify that GET request to /trainer/trainers should return status code 200 if database has all trainers
    When In Postman ,send a Get request to  "/trainer/trainers"
    Then Status code 200 should be returned with data
    And I should see the name of trainers.
      | firstName | lastName |
      | Peter     | Parker   |
      | Bruce     | Wayne    |
      | Clark     | Kent     |
      | James     | Bond     |
      | Foo       | Bar      |
      | Jan       | Smith    |
      | Michael   | Davis    |
      | Michael   | Johnson  |
      | David     | Lee      |
      | Sarah     | Kim      |
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_735/" as "TMS1176_04"

  @TC_TMS1176_05
  Scenario: TC_TMS1176_05 Verify that GET request to /trainer/id should return status code 200 if database has trainers for that id
    When send a Get request with path parameter to  "/trainer/{userId}"
      | userId |
      |      9 |
    Then I should see the trainer firstname name as "Peter"
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_735/" as "TMS1176_05"

  @TC_TMS1176_06
  Scenario: TC_TMS1176_06 Verify that GET request to /trainer/id should return null if database has no trainers for that id
    When send a Get request with path parameter to  "/trainer/{userId}"
      | userId |
      |      6 |
    Then it should  have return <null>
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_735/" as "TMS1176_06"
