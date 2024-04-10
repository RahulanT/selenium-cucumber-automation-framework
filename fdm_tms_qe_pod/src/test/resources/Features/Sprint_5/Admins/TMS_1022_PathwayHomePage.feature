#Author: Tejas Patel 08/29/2023
@PathwayHomePageFeature
Feature: TMS_1022 As an Admin, I want to be able to view existing pathways in the system based on pathway name, assigned color, pathway owner, description, pathway length, and region so that I can stay well-informed about the learning pathways.

  @TC_TMS1174_01
  Scenario: TC_TMS1174_01 Test that Admin should be able to see the page title
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin confirm that "Current Pathways" is displayed as a title of the page
    Then "Current Pathways" should be displayed as a page title
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_01"

  @TC_TMS1174_02
  Scenario: TC_TMS1174_02 Test that Admin should be able to see list of pathways name
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin confirm that "Java Development" is in the list of Pathways
    Then "Java Development" should be displayed in the list of Pathways
    When Admin confirm that "BAPM" is in the list of Pathways
    Then "BAPM" should be displayed in the list of Pathways
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_02"

  @TC_TMS1174_03
  Scenario: TC_TMS1174_03 Test that Admin should be able to see other details for specific pathway
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin verify that Red color is displayed as a Color for "Java Development" Pathway
    Then Red color should be displayed as a Color for "Java Development" Pathway
    When Admin verify that "Peter Parker" is displayed as a Pathway Owner for "Java Development" Pathway
    Then "Peter Parker" should be displayed as a Pathway Owner for "Java Development" Pathway
    When Admin verify that Null Value is displayed as a Description for "Java Development" Pathway
    Then Null Value should be displayed as a Description for "Java Development" Pathway
    When Admin verify that "5" is displayed as a Pathway Length(w) for "Java Development" Pathway
    Then "5" should be displayed as a Pathway Length(w) for "Java Development" Pathway
    When Admin verify that "NA/Canada" is displayed as a Region/Country for "Java Development" Pathway
    Then "NA/Canada" should be displayed as a Region/Country for "Java Development" Pathway
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_03"

  @TC_TMS1174_04
  Scenario: TC_TMS1174_04 Test that Admin should be able to sort the Pathway Owner
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin verify that sorting button is displayed besides Pathway Owner
    Then Sorting button should be displayed besides Pathway Owner
    When Admin click on sorting button besides Pathway Owner
    Then Pathway Owner list should be sorted in ascending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_04"

  @TC_TMS1174_05
  Scenario: TC_TMS1174_05 Test that Admin should be able to sort the Pathway Length
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin verify that sorting button is displayed besides Pathway Length
    Then Sorting button should be displayed besides Pathway Length
    When Admin click on sorting button besides Pathway Length
    Then Pathway Length list should be sorted in ascending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_05"

  @TC_TMS1174_06
  Scenario: TC_TMS1174_06 Test that Admin should be able to sort the Region/Country
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin verify that sorting button is displayed besides Region/Country
    Then Sorting button should be displayed besides Region/Country
    When Admin click on sorting button besides Region/Country
    Then Region/Country list should be sorted in ascending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_06"

  @TC_TMS1174_07
  Scenario: TC_TMS1174_07 Test that Admin should be able to filter the Region/Country
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin verify that filter button is displayed besides Region/Country
    Then Filter button should be displayed besides Region/Country
    When Admin click on filter button besides Region/Country
    Then Filter pop-up should be displayed
    When Admin click on NA option from filter pop-up
    Then Pathway list should be filtered with only NA region
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_07"

  @TC_TMS1174_08
  Scenario: TC_TMS1174_08 Test that Admin should be able to search for different pathways name
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin verify that searchbar is displayed with hint text "Search Name"
    Then Searchbar should be displayed with hint text "Search Name"
    When Admin search for "Java" Pathway Name
    Then "Java Development" should be displayed in the list of Pathways
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_08"

  @TC_TMS1174_09
  Scenario: TC_TMS1174_09 Test that Admin should be able to navigate to the Create Pathway page when click on Create Pathway button
    Given User is logged in as an Admin and navigate to Pathway Home page
    When Admin verify that Create Pathway button should be displayed as enabled
    Then Create Pathway button should be displayed as enabled
    When Admin click on Create Pathway button on Pathway Home page
    Then Admin should be redirect to Create Pathway page from Pathway Home page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/Admins/TMS_1022/" as "TMS_1174_09"

  @TC_TMS1174_10
  Scenario: TC_TMS1174_10 Test that Get request to /pathways should return status code 200 if database has all pathways
    When I perform GET operation for "/pathways"
    Then Status code 200 should be return with requested data
