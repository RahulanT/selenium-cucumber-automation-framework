#author:Siqi Ma
@TC_TMS613
Feature: Sort trainer by name and filter trainer by location, team and course


    
   	@TC_TMS613_Filter_And_Sort_Trainers_TC1
 		Scenario: TC_TMS_874_01 trainer should be sort trainers by name
	    Given User launches the TMS portal page
	    When User Enter valid id and password
	    And user clicks the login button
	    And User click on the academy Directory Selection
	    And User click on the sort icon near next to name 
	    And The name is sorted alphabetically 
	    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_613/" as "TMS_874_01"
    
    
    @TC_TMS613_Filter_And_Sort_Trainers_TC2
 		Scenario: TC_TMS_874_02 trainer should be filter trainers by location
	    When User click on the filter icon next to Location column 
	    And the drop down select display is Location
	    And User enter valid filter location message in the input for location
	    And The size of the table will be 1
	    And The line with the filtered location is to be displayed
	    And User cleared input field
	    And User entered invalid message in the input
	    And The size of the table will be 0
	    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_613/" as "TMS_874_02"    
	    And User cleared input field
    
    @TC_TMS613_Filter_And_Sort_Trainers_TC3
 		Scenario: TC_TMS_874_03 trainer should be filter trainers by team
	    When User click on the filter icon next to Team column 
	    And the drop down select display is Team
	    And User enter valid filter team message in the input for team
	    And The size of the table will be 1
	    And The line with the filtered team is to be displayed
	    And User cleared input field
	    And User entered invalid message in the input
	    And The size of the table will be 0
	    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_613/" as "TMS_874_03"    
	    And User cleared input field
    
    @TC_TMS613_Filter_And_Sort_Trainers_TC4
 		Scenario: TC_TMS_874_04 trainer should be filter trainers by course
	    When User click on the filter icon next to Course column 
	    And the drop down select display is Course
	    And User enter valid filter course message in the input for team
	    And The size of the table will be 1
	    And The line with the filtered course is to be displayed
	    And User cleared input field
	    And User entered invalid message in the input
	    And The size of the table will be 0
	    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/AcademyUsers/TMS_613/" as "TMS_874_04"
	    And User cleared input field
    