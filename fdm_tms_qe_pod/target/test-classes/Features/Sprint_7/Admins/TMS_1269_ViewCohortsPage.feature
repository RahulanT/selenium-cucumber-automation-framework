Feature: TMS_1269 ViewCohorts

@TMS_1698
  Scenario: Test that Admin should be able to sort the Cohort Id
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on sorting button for cohort id
    Then its should sort the id's
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1698"

@TMS_1699 
  Scenario: Test that Admin should be able to sort the Start Date
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on sorting button for start date
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1699"
    
@TMS_1700 
  Scenario:Test that Admin should be able to sort the Duration
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on sorting button for duration
    Then it should sort the duration
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1700"
    
 @TMS_1701 
  Scenario: Test that Admin should be able to filter the Duration
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on filter for duration
    Then click on days 
    Then click on filter for duration
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1701"
    
    
 @TMS_1702 
  Scenario: Test that Admin should be able to sort the Region Country
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on sorting button for region country
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1702"
    
     
 @TMS_1703 
  Scenario: Test that Admin should be able to filter the Region/Country 
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on filter for region country
    Then click on NA
    Then click on filter for region country
   And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1703"
    
 
 @TMS_1704 
  Scenario: Test that Admin should be able to sort the City 
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
     Then click on sorting button for city
    Then it should sort the city
  And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1704"
    
 
 @TMS_1705 
  Scenario: Test that Admin should be able to filter the City
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on filter for city
    Then click on toronto city
    Then click on filter for city
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1705"
    
 
 @TMS_1706 
  Scenario: Test that Admin should be able to search for different pathways name
  Given User logged in using valid admin credentials
    When I click on admin view link
    Then I click on view cohorts link
    Then click on search bar on that page
    Then search for the pathway BAPM
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_15/Admins/TMS_1269/" as "TMS_1706"
    