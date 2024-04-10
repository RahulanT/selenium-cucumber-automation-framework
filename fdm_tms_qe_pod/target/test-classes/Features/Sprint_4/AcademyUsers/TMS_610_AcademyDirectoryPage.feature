#author:Siqi Ma
@TC_TMS610
Feature: Access course material from Course Catalogue

  @TC_TMS610_Create_Academy_Directory_Page_TC1
  Scenario: TC_TMS_673_01 trainer should be able to see the profile card after log in
    Given User launches the TMS portal page
    When Enters valid id and password for trainee
    And user clicks the login button
    And User click on the academy Directory Selection
    And User should see the Train name, location, team and course on the page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_610/" as "TMS_673_01"
