#author:Siqi Ma
@TC_TMS624
Feature: User Profile Card Shows when log in



    
   	@TC_TMS624_User_Profile_Card_TC1
 		Scenario: trainer should be able to see the profile card after log in
    Given User launches the TMS portal page
    When Enters valid id and password for trainee
    And user clicks the login button
    And User should be able to see the profile card with the following properities
    |title|
    |Name|
    |Role|
    |Stream|
    |Ex-Military|
    |Academy Status|
    |Placement Status|
    |FDM Start Date|
    |FDM Signed Off|
    |Client Start Date|
    |Certifications|
    |Picture|
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/AcademyUsers/TMS_624/" as "TMS_624_01"
    
    @TC_TMS624_User_Profile_Card_TC2
  	Scenario: trainer should be able to see the profile card after log in
    Given User launches the TMS portal page
    When Enters valid id and password for trainer
    And user clicks the login button
    And User should be able to see the profile card with the following properities
    |title|
    |Name|
    |Role|
    |Location|
    |Username|
    |Team|
    |Teaching courses|
    |Other Skills|
    |Certifications|
    |Picture|
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/AcademyUsers/TMS_624/" as "TMS_624_02"
    
    @TC_TMS624_User_Profile_Card_TC3
 		Scenario: trainer should be able to see the profile card after log in
    Given User launches the TMS portal page
    When Enters valid id and password for academy manager
    And user clicks the login button
    And User should be able to see the profile card with the following properities
    |title|
    |Name|
    |Role|
    |Location|
    |Username|
    |Bio|
    |Picture|
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/AcademyUsers/TMS_624/" as "TMS_624_03"
    
    
    
    @TC_TMS624_User_Profile_Card_TC4
 		Scenario: trainer should be able to see the profile card after log in
    Given User launches the TMS portal page
    When Enters valid id and password for Academy Admin
    And user clicks the login button
    And User should be able to see the profile card with the following properities
    |title|
    |Name|
    |Role|
    |Location|
    |Username|
    |Area of Responsibility|
    |Picture|
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_3/AcademyUsers/TMS_624/" as "TMS_624_04"
    
    
    @TC_TMS624_Filter_And_Sort_Trainers_api_TC1
 		Scenario: User should be able to get the user information for trainee
    Given User perform GET opeartion for "/user/{userId}" for user id 14
    Then I should see the user with usertype trainee
	    |		userId 	|	firstName  | lastName  |	email										|	userType|	
	    |		14			|	Johnny		 |	Doe			 |	johnny.doe@fdmgroup.com	| Trainee	|
    And The reponse code should be 200
    
    @TC_TMS624_Filter_And_Sort_Trainers_api_TC2
 		Scenario: User should be able to get the user information for trainer
    Given User perform GET opeartion for "/user/{userId}" for user id 9
    Then I should see the user with usertype trainer
	    |		userId 	|	firstName  | lastName  |		email										|	userType	|	
	    |		9 			|	Peter  		 |	Parker	 |	peter.parker@fdmgroup.com	| Trainer		|
    And The reponse code should be 200
    
    @TC_TMS624_Filter_And_Sort_Trainers_api_TC3
 		Scenario: User should be able to get the user information for academy manager
    Given User perform GET opeartion for "/user/{userId}" for user id 20
    Then I should see the user with usertype academy manager
	    |		userId 	|	firstName  | lastName  |		email										|			userType		|	 isManager	|
	    |		20 			|	Jane  		 |	Smith		 |	jane.smith@fdmgroup.com 	| Academy Manager	|		true			|
    And The reponse code should be 200
    
    @TC_TMS624_Filter_And_Sort_Trainers_api_TC4
 		Scenario: User should be able to get the user information for academy admin
    Given User perform GET opeartion for "/user/{userId}" for user id 5
    Then I should see the user with usertype academy admin
	    |		userId 	|	firstName  | lastName  |		email											|			userType		|	 isManager	|
	    |		5 			|	Noraida  	 |	Yusop		 |	noraida.yusop@fdmgroup.com 	| Academy Admin		|		false			|    
    And The reponse code should be 200