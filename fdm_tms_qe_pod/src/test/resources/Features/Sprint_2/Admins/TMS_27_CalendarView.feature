Feature: Sort Filter on Start Date

Scenario: TC_TMS205_01 Test that Admin can select filter button on the left top corner.
	When Admin clicks on calendar button on the Nav bar		
	Then Admin clicks on filter button on the right top corner
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Admins/Sprint_2/TMS_27/" as "TMS_205_01"		
	
Scenario: TC_TMS205_02 Test that Admin can select specific week by navigating through the left navigator and right navigator button through a button on top right corner.			
	When Admin clicks on calendar button on the Nav bar	
	Then Admin clicks on left navigator button on the center corner button	
	Then Admin clicks on right navigator button on the center corner button		
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Admins/Sprint_2/TMS_27/" as "TMS_205_02"
	
Scenario: TC_TMS205_03 Test that Admin can intially see  one weekly calendar 										
	When Admin clicks on calendar button on the Nav bar	
	Then Admin is on calendar page
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Admins/Sprint_2/TMS_27/" as "TMS_205_03"	
	
Scenario: TC_TMS205_04 Test that Admin can see the calendar that is aligned to current date.				                                  							
	When Admin clicks on calendar button on the Nav bar	
	Then Admin is on calendar page	
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Admins/Sprint_2/TMS_27/" as "TMS_205_04"
			
Scenario: TC_TMS205_05 Test that Admin can see list of Trainers name in the first Column.				                                        							
	When Admin clicks on calendar button on the Nav bar	
	Then Admin is on calendar page
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Admins/Sprint_2/TMS_27/" as "TMS_205_05"
	
Scenario: TC_TMS205_06 Test that Calendar has AM and PM section for each day in the date.				                                                              							
	When Admin clicks on calendar button on the Nav bar	
	Then Admin is on calendar page
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Admins/Sprint_2/TMS_27/" as "TMS_205_06"
	
Scenario: TC_TMS205_07 Test that Calendar has 1 week calendar button in the right top corner.				                                                        							
	When Admin clicks on calendar button on the Nav bar
	Then Admin clicks on One week button on right top corner	
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Admins/Sprint_2/TMS_27/" as "TMS_205_07"	
		