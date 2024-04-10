Feature: Sort Filter on Start Date


	
Scenario: TC_TMS205_03 Test that Admin can intially see  one weekly calendar 										
	When Admin clicks on calendar button on the Nav bar	
	Then As a Admin, I should see One Week View by default in the left top corner button.	
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_27/" as "TMS_205_03"	
	
Scenario: TC_TMS205_04 Test that Admin can see the calendar that is aligned to current date.				                                  							
	When Admin clicks on calendar button on the Nav bar	
	Then As a Admin, I should see that the date displayed on center top is aligned to current date.		
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_27/" as "TMS_205_04"
			
Scenario: TC_TMS205_05 Test that Admin can see list of Trainers name in the first Column.				                                        							
	When Admin clicks on calendar button on the Nav bar	
	Then Verify that as a admin, I should see that all the trainers are listed in the first column in the table 	
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_27/" as "TMS_205_05"
	
Scenario: TC_TMS205_06 Test that Calendar has AM and PM section for each day in the date.				                                                              							
	When Admin clicks on calendar button on the Nav bar	
	Then As a Admin, I should see that each date is divided further in two sections AM and PM.	
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_27/" as "TMS_205_06"
	
Scenario: TC_TMS205_07 Test that Calendar has 1 week calendar button in the right top corner.				                                                        							
	When Admin clicks on calendar button on the Nav bar
	Then As a Admin, admin clicks on One week button on right top corner		
	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/Admins/TMS_27/" as "TMS_205_07"	
		