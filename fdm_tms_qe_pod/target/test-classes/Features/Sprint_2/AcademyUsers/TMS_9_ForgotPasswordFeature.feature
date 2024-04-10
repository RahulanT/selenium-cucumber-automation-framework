Feature: As a user, I would like to be able  to request a new password if I've forgotten my password, 
so that I can regain access to the system.

@TMS_425_01
  Scenario: @TMS_425_01 Verify that Enter FDM Email Address input field is available.
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on Enter FDM Email address
    Then it should be clickable and viewable
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_01"

@TMS_425_02
  Scenario: @TMS_425_02 Verify that user can enter text in ‘Enter FDM Email Address’
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on Enter FDM Email address
    Then it should accept text
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_02"
    
@TMS_425_03
  Scenario: @TMS_425_03 Verify that Confirm FDM Email Address input field is available
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on Confirm FDM Email address
    Then it should be clickable and viewable
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_03"
    
@TMS_425_04
  Scenario: @TMS_425_04 Verify that user can enter text in ‘Confirm FDM Email Address’
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on Confirm FDM Email address
    Then it should accept text
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_04"
 
@TMS_425_05 
  Scenario: @TMS_425_05 Verify that ‘Request new password’ button is clickable
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on request new password button
    Then it should be clickable 
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_05"
    
@TMS_425_06
  Scenario: @TMS_425_06 Verify that clicking on ‘Back to Login’ will redirect to login page
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on back to login button
    Then it should redirect to login page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_06"
    
@TMS_425_07
  Scenario: @TMS_425_07 Verify that user is receiving ‘Please enter a valid FDM email address’ error if its not ending with @fdmgroup.com
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on Enter FDM email address
    And I write the email address that's not end with @fdmgroup.com
    Then it should give the error
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_07"
    
@TMS_425_08
  Scenario: @TMS_425_08 Verify that email passed in both the fields of enter fdm email and confirm email matches with each other
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I enter FDM email address
    And I enter Confirm FDM email address
    Then both fields should match
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_08"
    
@TMS_425_09
  Scenario: @TMS_425_09 Verify that user is receiving ‘Emails do not match. Please try again’ error if both of fields are not matching with each other
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I click on Enter FDM email address
    And I write the email address
    And I click on Confirm FDM email address
    And I write the email address different than first field
    Then It should give the error ‘The entered email does not match’ 
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_09"
    
@TMS_425_10
  Scenario: @TMS_425_10 Verify that user receives Password reset request submited once it enter valid username password
    Given User is naviated to login page
    When I click on forgot password link
    Then It should redirect to forgot password page
    And I enter valid Confirm FDM email address
    And I enter valid FDM email address
    And I click on Request new password button
    Then it should be clickable and should display confirmation message Password reset request submited
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/TMS_9/" as "TMS_425_10"
    