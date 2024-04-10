#Author: Sofia Singh
Feature: TMS_2065 As an Academy Admin, I want to change the date format on the profile card page to be “Day-Mon-Year” i.e “16-Oct-2023” so that the correct date format is displayed.

  Background: 
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    And user clicks the login btn

  @TMS2095
  Scenario: TMS_2095 On view profile card page, test that admin should be able to see date in the  format “Day-Mon-Year” i.e “16-Oct-2023”.view 				
    Given The user is logged in as an Academy admin in the TMS and navigate to view trainees profile card page				
    Then Admin should be able to see date in the  format “Day-Mon-Year” 
   And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/Admins/TMS_2065/" as "TMS_2095"
