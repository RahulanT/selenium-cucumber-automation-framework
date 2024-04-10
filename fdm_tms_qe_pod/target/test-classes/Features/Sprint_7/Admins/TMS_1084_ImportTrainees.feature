#Author: Sofia Singh
Feature: TMS_1084 As an Academy Admin, I want to import a list of trainees from an Excel file into our Training Management System (TMS), With the ability to filter trainees by location, pathway, and start date before saving them to the database, So that I can efficiently onboard and organize trainees based on specific criteria.

  #@TC_TMS_Login_Test
  #Scenario: TC_TMS User should be logged in to the system
  #Given User launches the TMS portal page
  #When Enters valid id and password of admin
  #And user Clicks the Login button
  @TMS1432
  Scenario: TMS_1432 On view trainees page, test that when admin click on the “Import New Trainees” button it redirects to new pop up window with message Upload excel file with atttended trainees information
    Given admin is signed in as a admin and has navigated to view trainees page
    When As an admin, click Import New Trainees button
    Then Admin should redirect to new pop up window with message "Upload excel file with attended trainees information"
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1084/" as "TMS_1432"

  @TMS1433
  Scenario: TMS_1433 On pop up window, test that admin should see "file name path or just file name" textbox and "Browse" button, "Cancel" button ,"Ok" button.
    # Given Admin is logged into Training Management System and navigated to view trainees page and has clicked "Import New Trainees" button
    Then Admin should be able to see textbox and Browse button should be on the right side of textbox and admin should be able to see Back button and then Ok button on bottom right of window
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1084/" as "TMS_1433"

  @TMS1435
  Scenario: TMS_1435 On pop up window, test that, when admin selects a non-excel file, then validation message should be "The file you uploaded is not in the right format. Please check and re-upload again"
    #Given Admin is logged into Training Management System and navigated to "view trainees" page and has clicked "Import New Trainees" button
    When As an admin click on Browse button and selects non excel file.
    Then Admin should be able to see validation "The file you uploaded is not in the right format. Please check and re-upload"
    Then Admin clicks cancel button to selects the excel file again
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1084/" as "TMS_1435"

  @TMS1434
  Scenario: TMS_1434 On pop up window, test that when admin click the “Browse” button, admin should be able to see a pop-up window and when admin selects the excel file containing the list of trainees, "ok" button should be activated and when admin clicks on "ok" button, admin should be redirected to " Import Attended Trainees" page. If admin clicks on "cancel" button, then admin should not be redirected to "Import Attended Trainees" page
    #Given Admin is logged into Training Management System and navigated to "view trainees" page and has clicked "Import New Trainees" button
    When On pop up window,As an admin click on Browse button and select excel file
    When On pop up window,As an admin click on ok button
    Then Admin should be able to redirect to  Import Attended Trainees page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_7/Admins/TMS_1084/" as "TMS_1434"

  @TMS1447
  Scenario: TMS_1447 Verify that GET request to http://localhost:8080/trainee/trainees should return status code 200 if database has all trainees
    When In Postman, send a Get request to  "/trainee/trainees"
    Then status code 200 should be returned when get the list of trainees
    And I should see the name of trainees.
      | firstName | lastName |
      | Johnny    | Doe      |
      | Jan       | Smith    |
      | David     | Johnson  |
      | Susan     | Wayne    |
      | Aiden     | Wilson   |

  @TMS1447
  Scenario: Verify that GET request to /trainer/id should return status code 200 if database has trainers for that id
    When send a Get request with path parameter to  "/trainee/{userId}"
      | userId |
      |     14 |
    Then I should see the trainee firstname name as "Johnny"

  @TMS1447
  Scenario: TC_TMS1176_06 Verify that GET request to /trainer/id should return null if database has no trainers for that id
    When send a Get request with path parameter to  "/trainer/{userId}"
      | userId |
      |      6 |
    Then it should  have return  <null> body
   
  #@TMS1608
  #Scenario: TMS_1608 Verify that POST request to http://localhost:8080/trainee/allTrainee should return status code 400 for an empty list of trainees sent to the server for saving into the database
  #When In Postman, send a POST request to  "/trainee/trainees" a trainee to the server for saving into the database
  #| firstName | lastName    | email                              | password |
  #| firstname | lastname100 | firstname.lastname100@fdmgroup.com |     1234 |
  #Then Status code 200 should be returned
  
  @ImportTranieeThroughExcelFile
  Scenario Outline: admin check for email of trainee
    Given admin select the location in import attended trainee page from the dropdown which is same as location in excel row  "<row>"
    When admin select the pathway in import attended trainee page from the dropdown which is same as pathway in excel row "<row>"
    And admin select the start date in import attended trainee page from the dropdown which is same as start date in excel row "<row>"
    And admin click the apply button
    And admin click import trainee button
    And compare email result with what is shown in excel row "<row>" and fill the results to excel
    Then admin check the already import column in excel row "<row>" and check coressponding message on pop up window

    Examples: 
      | row |
      |   2 |
