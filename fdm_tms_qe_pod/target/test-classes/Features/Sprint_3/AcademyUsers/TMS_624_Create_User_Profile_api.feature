#author:Siqi Ma
@TC_TMS624_api
Feature: Get user infomation when called with user id


    
   	@TC_TMS624_Filter_And_Sort_Trainers_api_TC1
 		Scenario: trainer should be sort trainers by name
    Given User perform GET opeartion for "/user/{userId}" for user id 14
    Then I should see the user with usertype trainee
	    |		userId 	|	firstName  | lastName  |	email										|	userType|	
	    |		14			|	Johnny		 |	Doe			 |	johnny.doe@fdmgroup.com	| Trainee	|
    And The reponse code should be 200
    
    @TC_TMS624_Filter_And_Sort_Trainers_api_TC2
 		Scenario: trainer should be sort trainers by name
    Given User perform GET opeartion for "/user/{userId}" for user id 9
    Then I should see the user with usertype trainer
	    |		userId 	|	firstName  | lastName  |		email										|	userType	|	
	    |		9 			|	Peter  		 |	Parker	 |	peter.parker@fdmgroup.com	| Trainer		|
    And The reponse code should be 200
    
    @TC_TMS624_Filter_And_Sort_Trainers_api_TC3
 		Scenario: trainer should be sort trainers by name
    Given User perform GET opeartion for "/user/{userId}" for user id 20
    Then I should see the user with usertype academy manager
	    |		userId 	|	firstName  | lastName  |		email										|			userType		|	 isManager	|
	    |		20 			|	Jane  		 |	Smith		 |	jane.smith@fdmgroup.com 	| Academy Manager	|		true			|
    And The reponse code should be 200
    
    @TC_TMS624_Filter_And_Sort_Trainers_api_TC4
 		Scenario: trainer should be sort trainers by name
    Given User perform GET opeartion for "/user/{userId}" for user id 5
    Then I should see the user with usertype academy admin
	    |		userId 	|	firstName  | lastName  |		email											|			userType		|	 isManager	|
	    |		5 			|	Noraida  	 |	Yusop		 |	noraida.yusop@fdmgroup.com 	| Academy Admin		|		false			|    
    And The reponse code should be 200