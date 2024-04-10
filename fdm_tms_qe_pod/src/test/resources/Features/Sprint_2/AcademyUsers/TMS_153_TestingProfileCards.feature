@TC_TMS153
Feature: TMS-153 As an Academy User, when I login, I want system to populate details relevant to me on the interface, 
				 so that I can be sure that it is my profile. given the User login to the system, when user enters 
				 the login details, then the system should automatically understand the role of user and populate 
				 the details on the User interface.
				 
	 @TC_TMS166_01
   Scenario:  TC_TMS166_01 As a user. test that profile tab is displayed on the TMS navigation bar
	  Given User successfully logs into FDM TMS
	  When You are on the landing page
	  Then View that the profile tab is displayed on the TMS nav bar
	  And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_01"
	  
	   @TC_TMS166_02 
	   Scenario: TC_TMS166_02 As a user, test that profile page is displayed on the TMS profile tab 
	    Given User successfully logs into FDM TMS 
	    When You are on the landing page 
	    Then View that the profile page content is displayed under profile tab 
	    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_02" 
	    
	 @TC_TMS166_03 
	 Scenario: TC_TMS166_03 As a user, test that the users profile image and information are displayed and  
	 aligned in a white tile, where the profile image is displayed on top and the information at the bottom  
	   Given User successfully logs into FDM TMS 
	   When You are on the landing page 
	   Then View that the profile image and relative information are displayed on a white tile 
	   And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_03" 
		  
 	 @TC_TMS166_04 
 	 Scenario: TC_TMS166_04 As a user, test that both profile image and information are not editable 
 	 Given User successfully logs into FDM TMS 
 	 When You are on the landing page 
 	 Then Select profile picture 
 	 And View that it is not clickable 
 	 And Select relative information  
 	 And View that it is not clickable 
 	 And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_04" 
 	 
 	 
 	  @TC_TMS166_05 
 	  Scenario: TC_TMS166_05 As a user, test that if there are no profile images uploaded, a default profile image is displayed  
 	  Given User successfully logs into FDM TMS 
 	  When You are on the landing page 
 	  Then Default profile picture is displayed 
 	  And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_05" 
 	  
 	  @TC_TMS166_06 
		Scenario: TC_TMS166_06 As a trainee, test that the trainees profile information is displayed: first and last name, role,  
		stream, ex-military, status, start date, signed off date, client start date, certifications 
		Given Trainee successfully logs into FDM TMS 
		When You are on the landing page 
		Then View that the role is displayed 
		And View that the stream is displayed 
		And View that the ex-military field is displayed 
		And View that the accademy status is displyed 
		And View that the FDM Start Date is displayed 
		And View that the signed off date is diplayed 
		And View that the client start date is displayed 
		And View that the certifications are displayed 
		And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_06"  
		
		@TC_TMS166_07 
		Scenario: TC_TMS166_07 As a trainer, test that the trainer profile information is displayed:  
				 first and last name, role, location, team, courses, skill list, certifications 
				 Given Trainer successfully logs into FDM TMS 
				 When You are on the landing page 
				 Then View that the name is displayed  
				 And View that the role is displayed 
				 And View that the location is displayed 
				 And View that the team is displayed 
				 And View that the teaching courses field is displayed 
				 And View that the other skills field is displayed 
				 And View that the certifications are displayed 
				 And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_07"  
				 
		 @TC_TMS166_08 
		 Scenario: TC_TMS166_08 As an academy admin, test that the academy admin profile information  
			 is displayed: first and last name, role, location, username, area of responsibility 
		Given Academy admin successfully logs into FDM TMS 
		When You are on the landing page 
		Then View that the name is displayed 
		And View that the role is displayed 
		And View that the location is displayed 
		And View that the username is displayed 
		And View that the academy admin area of responsibility is displayed 
		And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_08"  
				
				
		@TC_TMS166_09 
		Scenario: TC_TMS166_09 As an academy manager, test that the academy managers profile information  
							is displayed: first and last name, role, location, username, bio 
		Given As an academy manager, successfully logs into FDM TMS 
		When You are on the landing page 
		Then View that the name is displayed 
		And View that the role is displayed 
		And View that the location is displayed 
		And View that the username is displayed 
		And View that the bio is displayed 
		And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_2/AcademyUsers/" as "TC_TMS166_09" 
		