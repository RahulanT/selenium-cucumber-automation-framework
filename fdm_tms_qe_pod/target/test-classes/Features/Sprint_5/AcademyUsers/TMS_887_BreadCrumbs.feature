#author:Amit Sharma 

@TC_TMS887
Feature: TMS_887 Breadcrumbs are displayed while clicking on different pages
    
    @TC_TMS911_Breadcrumb_AcademyDirectory
 		Scenario: TC_TMS_911 User should be able to see clickable breadcrumbs on Academy Directory Page
    Given User launches the TMS portal page
    When Enters valid id and password for trainee
    And Navigate to the Home Page using url 
    Then User should be able to see the breadcrumbs home
    And Navigate to the Academy Directory page using url 
    And Navigate to the Profile Card from navbar
    And User clicks on bread crumb academy directory
    And User should be taken to academy directory page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/AcademyUsers/TMS_887/" as "TMS_911"
    
     
    @TC_TMS912_Breadcrumb_HomePage
 		Scenario: TC_TMS_912 User should be able to see clickable breadcrumbs on profile card page
    Given User launches the TMS portal page
    When Enters valid id and password for trainer
    And Navigate to the Home Page using url
    And User should be able to see the breadcrumbs home
    And Navigate to the Profile Card using URL
    And User should be able to see the breadcrumbs profile card
    And User clicks on breadcrumb home
    And User should be taken to home page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/AcademyUsers/TMS_887/" as "TMS_912"
    
 