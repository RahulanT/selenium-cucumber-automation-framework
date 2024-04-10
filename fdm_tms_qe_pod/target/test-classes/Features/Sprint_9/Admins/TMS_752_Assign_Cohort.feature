#Author: Sofia Singh
@IntegrationTesting
Feature: TMS_752 As an academy admin, I want to be able to assign a specific cohort to a group of selected trainees So that I can effectively manage and track the progress of trainees within specific cohorts.

  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    And user Clicks the Login button

  @TMS1838
  Scenario: TMS_1838 On Assign Cohort page,test that admin should be able to see cohort dropdown on top left corner of the screen having grey background color bar.
    Given The user is logged in as an Academy admin in the TMS.The user should only be able to assign the imported trainees to a specific existing cohort and user should be on Assign Cohort page
    Then admin should be able to see cohort dropdown  having grey background color bar.
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/Admins/TMS_752/" as "TMS_1838"

  @TMS1839
  Scenario: TMS_1839 On Assign Cohort page,test that admin should be able to click the dropdown and should be able to see the list of cohorts
    # Given The user is logged in as an Academy admin in the TMS.The user should only be able to assign the imported trainees to a specific existing cohort and user should be on Assign Cohort page
    When As an admin,clicks on drop down
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/Admins/TMS_752/" as "TMS_1839"

  @TMS1840
  Scenario: TMS_1840 On Assign Cohort page,test that admin should be able to see select all checkbox for selecting all the trainees to specific cohort
    #Given The user is logged in as an Academy admin in the TMS.The user should only be able to assign the imported trainees to a specific existing cohort and user should be on Assign Cohort page
    When As an admin, selects specific cohort from drop down
    Then admin should be able to assign it to all the trainees by selecting select all checkbox
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/Admins/TMS_752/" as "TMS_1840"

  @TMS1842
  Scenario: TMS_1842 On Assign Cohort page,test that admin should be able to see cancel button at bottom right corner of the screen
    #Given The user is logged in as an Academy admin in the TMS.The user should only be able to assign the imported trainees to a specific existing cohort and user should be on Assign Cohort page
    When As an admin, clicks cancel button at bottom right corner of the screen
    Then admin should be to cancel the process of assigning cohorts and  admin will be redirected to the Profile card page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/Admins/TMS_752/" as "TMS_1842"

  @TMS1843
  Scenario: TMS_1843 On Assign Cohort page,test that admin should be able to see assign cohort button next to cancel button at the bottom right corner of the screen
    #Given The user is logged in as an Academy admin in the TMS.The user should be on Assign Cohort page
    Then admin should be able to see assign cohort button should be disabled by default having grey color.
    When As an admin, selects a specific cohort from the drop down menu and is reflected in the cohort column and assign it to trainee.
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/Admins/TMS_752/" as "TMS_1843"

  @TMS1844
  Scenario: TMS_1844 On Assign Cohort page,test that when admin clicks on assign cohort button then a pop-up should be displayed on same page that verify if the admin wants to assign the selected cohort to the list of selected trainees
    # Given The user is logged in as an Academy admin in the TMS.The user should only be able to assign the imported trainees to a specific existing cohort and user should be on Assign Cohort page
    When As an admin, clicks on assign cohort button
    Then pop-up should be displayed on the same page which will verify if the user wants to assign the selected cohort to the list of selected trainees.
    When As an admin,clicks back button
    When As an admin,clicks confirm button
    Then The confirm button should redirect the user to the confirmation pop-up which will display "Cohort Assigned to Trainees Successfully"  with ok button
    When As an admin,clicks ok button of confirmation pop-up dialogbox
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_9/Admins/TMS_752/" as "TMS_1844"

  #@TMS1845
  #Scenario: TMS_1845 Verify that PUT request to /trainee/allTrainee/update should return status code 200 for updating trainee into the database
  #When In Postman, send a PUT request to  "/trainee/allTrainee/update" a trainee to the server for saving into the database
  #Then Status code 200 should be returned
  @TMS1846
  Scenario: TMS_1846 Verify GET /trainees?isCohortAssigned=true or false should return status code 200 with the list of trainees from database
    When In Postman, send a Get request to "/trainee/trainees"
    Then Status code 200 should be returned and get the list of trainees
    When In Postman, send a Get request to  "/trainee/trainees?isCohortAssigned=true"
    Then Status code 200 should be returned and get all trainees with cohort assigned
    When In Postman, send a Get request to "/trainee/trainees?isCohortAssigned=false"
    Then Status code 200 should be returned and get all trainees without cohort assigned
