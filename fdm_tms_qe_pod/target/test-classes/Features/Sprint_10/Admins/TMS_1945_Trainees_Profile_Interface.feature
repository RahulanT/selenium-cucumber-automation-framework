#Author: Sofia Singh
Feature: TMS_1945 As an Academy Admin,I want to have a comprehensive profile for each trainee so that it displays all the relevant information in a categorized format.

  Background: 
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    And user clicks the login btn
    Then user navigate to view trainees profile card page

  @TMS2157
  Scenario: TMS_2157 On trainee’s profile interface page, test that when admin selects triangular button along with Overview heading, admin should be able to see trainees overview information
    Then Overview section is expanded and admin should be able to see trainees overview information i.e First Name,Last Name, Username,Academic Status,Placement Status,Location,Start Date
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_1945/" as "TMS_2157"

  @TMS2158
  Scenario: TMS_2158 On trainee’s profile interface page, test that when admin selects triangular button along with Experience/Skills heading, admin should be able to see trainees Experience/Skills information
    When As an admin, selects triangular button first time along with Experience/Skills heading
    Then Experience/Skills section is expanded and admin should be able to see trainees Experience/Skills information i.e Skills, Certifications
    Then Experience/Skills section is closed and admin should not be able to see traniees Experience/Skills information
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_1945/" as "TMS_2158"

  @TMS2159
  Scenario: TMS_2159 On trainee’s profile interface page, test that when admin selects triangular button along with FDM Journery heading, admin should be able to see trainees FDM Journey information
    When As an admin, selects triangular button first time along with FDM Journey heading
    Then FDM Journey section is expanded and admin should be able to see trainees FDM Journey information i.e Pathway, cohort
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_1945/" as "TMS_2159"
