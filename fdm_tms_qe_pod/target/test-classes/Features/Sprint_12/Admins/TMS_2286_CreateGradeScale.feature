#Keywords Summary :
#Feature: List of scenarios.
#Date Created : January 08 , 2024
#Author: Rahulan Thevakanthan

@CreateGradingScale
Feature: TMS_2286 Title of your feature I want to use this template for my feature file


  Background: 
    Given User launches the TMS portal page
    When Enters valid id and password of admin
    Then user clicks the Login button
    
  @TMS_2389
  Scenario Outline: TMS_2389 test that admin should be able to change the Percentage value associated with each numerical field in the grade scale
   	When User is logged in as an Admin and navigate to Create Grade Scale Page  
	  When Admin inputs the Grade Scale Name "<GradeScaleName>" 
	  When Admin inputs the Max Points "<MaxPoints>" for the Grade Scale 
  	Then Grade Scale form Distinction Pass and Merit Percentage fields should be autopopulated
  	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2286/" as "TMS_2389"
  	
  Examples:    
	|GradeScaleName|MaxPoints|
	|TestGSName1|120|
	
	  @TMS_2390
  Scenario Outline: TMS_2390 test that when admin changes the grade scale value the associated grade percentage field changes
  	  When User is logged in as an Admin and navigate to Create Grade Scale Page  
		  When Admin inputs the Grade Scale Name "<GradeScaleName>" 
		  When Admin inputs the Max Points "<MaxPoints>" for the Grade Scale
		  When Admin changes "<GradeField>" numerical grade value to "<GradeValue>"
		  Then The percentage field "<PercentageFormField>" changes to "<NewPercentage>"
		  And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2286/" as "TMS_2390"
		  
	Examples:    
	|GradeScaleName|MaxPoints|GradeField|GradeValue|PercentageFormField|NewPercentage|
	|TestGSName|120|Merit|96|Merit|80|
 	|TestGSName1|120|Merit|102|Merit|85|
  |TestGSName2|120|Pass|72|Pass|60|
  
  @TMS_2391
  Scenario: TMS_2391 test that admin should be able to optionally select the region for each grade scale
    When User is logged in as an Admin and navigate to Create Grade Scale Page  
    When Admin inputs the Grade Scale Name "<GradeScaleName>" 
    When Admin inputs the Max Points "<MaxPoints>" for the Grade Scale 
    When Admin inputs the Pass Mark "<PassMark>" for the Grade Scale as a value
    When Admin selects the Status "<Status>" for the Grade Scale
    Then The create grade scale submit button should be clickable 
    When Admin clicks Create Grade Scale submit button
    Then Grade Scale created popup window should appear
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2286/" as "TMS_2391"
    
   Examples:    
	|GradeScaleName|MaxPoints|PassMark|Status|
	|TestGSName|120|100|Active|
  
  @TMS_2392
  Scenario Outline: TMS_2392 test that admin should be able to see distinction pass and merit autopopulate for each grade scale
	  When User is logged in as an Admin and navigate to Create Grade Scale Page  
	  When Admin inputs the Grade Scale Name "<GradeScaleName>" 
	  When Admin inputs the Max Points "<MaxPoints>" for the Grade Scale 
  	Then Grade Scale form fields Distinction and Merit should be autopopulated
  	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2286/" as "TMS_2392"
  	
     Examples:    
	|GradeScaleName|MaxPoints|
	|TestGSName|120|
  
  @TMS_2393
  Scenario: TMS_2393 test that admin should be able to create a grade scale
   When User is logged in as an Admin and navigate to Create Grade Scale Page  
    When Admin inputs the Grade Scale Name "<GradeScaleName>" 
    When Admin inputs the Max Points "<MaxPoints>" for the Grade Scale 
    When Admin inputs the Pass Mark "<PassMark>" for the Grade Scale as a value
    When Admin selects the Region "<Region>" for the Grade Scale
    When Admin selects the Status "<Status>" for the Grade Scale
    Then The create grade scale submit button should be clickable 
    When Admin clicks Create Grade Scale submit button
    Then Grade Scale created popup window should appear
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2286/" as "TMS_2393"
    
  Examples:    
	|GradeScaleName|MaxPoints|PassMark|Region|Status|
	|TestGSName|120|100|North America|Active|

  #@TMS_2394
  #Scenario: TMS_2393 test that created grade scale popup details should match inputted data
  
  
  @TMS_2395
  Scenario Outline: TMS_2395 test that when admin changes the percentage value the associated grade value field changes
  	  When User is logged in as an Admin and navigate to Create Grade Scale Page  
		  When Admin inputs the Grade Scale Name "<GradeScaleName>" 
		  When Admin inputs the Max Points "<MaxPoints>" for the Grade Scale
		  When Admin changes "<GradeField>" percentage grade value to "<PercentageValue>"
		  Then The grade field "<GradeFormField>" changes to "<NewGrade>"
		  And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_12/Admins/TMS_2286/" as "TMS_2395"
		  
	Examples:    
	|GradeScaleName|MaxPoints|GradeField|PercentageValue|GradeFormField|NewGrade|
	|TestGSName|120|Merit|90|Merit|108|
  |TestGSName1|120|Merit|85|Merit|102|
  |TestGSName2|120|Pass|60|Pass|72|
