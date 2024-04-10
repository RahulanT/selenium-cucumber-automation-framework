#Author: Sofia Singh
Feature: TMS_2287 As an Academy Admin, I want to have at least 8 search results display in the search box , so that I can see at least 8 search results without scrolling.

  
  Background: 
    Given User launches the TMS portal page
    When Enters valid id and password of Admin
    And user clicks the login Btn

  @TMS2320
  Scenario: TMS_2320 test search bar of trainees with no matching name
    When As an admin, search for a name not in the list and verify there is 0 matches
    Then admin should be able to see the search option and 0 matches are found
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_13/Admins/TMS_2287/" as "TMS_2320"

  @TMS2321
  Scenario: TMS_2321 On Trainee Profile page,test that when admin, clicks on search option, admin should be able to see the 8 searches without scrolling
    When As an admin, add 8 searches and verify there is no scrollbar
    Then admin should be able to see the search option and no scrollbars are there
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_13/Admins/TMS_2287/" as "TMS_2321"

  @TMS2322
  Scenario: TMS_2322 On Trainee Profile page,test that when admin, clicks on search option, admin should be able to see the 9 searches with scrolling
    When As an admin, add 9 searches and verify there is scrollbar
    Then admin should be able to see the search option and scrollbars are there
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_13/Admins/TMS_2287/" as "TMS_2322"

  @TC_TMS_Logout_Test
  Scenario: TC_TMS User should be logout the system
    When clicks profile icon of admin
    And admin clicks the Logout button
