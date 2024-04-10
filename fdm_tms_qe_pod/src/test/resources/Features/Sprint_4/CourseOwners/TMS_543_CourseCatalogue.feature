#Author: navpreet.kaur1@fdmgroup.com
#author:Navpreet Kaur
Feature: Access course material Functionality
  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password of CourseOwner
    And user clicks the login button
    
@TC_TMS852_01
  Scenario: TC_TMS852_01 Test that all the courses are available in the course Catalogue				
    Given User is logged in as a Course Owner and navigate to Course Catalogue page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_1"

@TC_TMS_852_02
   Scenario: TC_TMS852_02 Test that go to material button redirected to correct course material
   	Given User is logged in as a Course Owner and navigate to Course Catalogue page
   	And User is able to click on Proskills go to material button
   	Then User is redirected to Proskills course material button	
   	And User is able to click on go to OOD material button
   	Then User is redirected to OOD course material button	
   	And User is able to click on Botium go to material button
   	Then User is redirected to Botium course material button	
   	And User is able to click on Business Analysis go to material button
   	Then User is redirected to Business Analysis course material button	
   	And User is able to click on Excel go to material button
   	Then User is redirected to Excel course material button	
   	And User is able to click on Git go to material button
   	Then User is redirected to Git course material button	
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_2"

@TC_TMS_852_03
   Scenario: TC_TMS852_03 Test that  if data table is dispalyed with columns and rows
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
   When User is on ProSkills course Material Page
   Then User should be able to see a table with rows and columns on ProSkills course Material Page
   When User is on OOD course Material Page
   Then User should be able to see a table with rows and columns on OOD course Material Page
   When User is on Business Analysis course Material Page
   Then User should be able to see a table with rows and columns	on Business Analysis course Material Page
   When User is on Excel course Material Page
   Then User should be able to see a table with rows and columns on Excel course Material Page
   When User is on Git course Material Page
   Then User should be able to see a table with rows and columns	on Git course Material Page
   
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_3"
   
@TC_TMS_852_04
   Scenario: TC_TMS852_04 Test that  if Check box is available in each row to select the file
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
When User is on ProSkills course Material Page  
   Then User should be able to verify if check box is available on ProSkills course Material Page
   And  user can  select or unselect file
   When User is on OOD course Material Page  
   Then User should be able to verify if check box is available on OOD course Material Page
   And  user can  select or unselect file on OOD
   When User is on Business Analysis course Material Page  
   Then User should be able to verify if check box is available on Business Analysis course Material Page
   And  user can  select or unselect file on Business Analysis
   When User is on Excel course Material Page  
   Then User should be able to verify if check box is available on Excel course Material Page
   And  user can  select or unselect file on Excel
   When User is on Git course Material Page  
   Then User should be able to verify if check box is available on Git course Material Page
   And  user can  select or unselect file on Git
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_4"

@TC_TMS_852_05
   Scenario: TC_TMS852_05 Test that if File name column is there
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
   When User is on ProSkills course Material Page  
   Then User check if there is filename given to each file on ProSkills course Material Page
   When User is on OOD course Material Page  
   Then User check if there is filename given to each file on OOD course Material Page
   When User is on Business Analysis course Material Page  
   Then User check if there is filename given to each file on Business Analysis course Material Page
   When User is on Excel course Material Page  
   Then User check if there is filename given to each file on Excel course Material Page
   When User is on Git course Material Page  
   Then User check if there is filename given to each file on Git course Material Page
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_5"


@TC_TMS_852_06
   Scenario: TC_TMS852_06 Test that if "file modification column" is available
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
   When User is on ProSkills course Material Page
   Then User should be able to check modification date column in the Proskills course material
   When User is on OOD course Material Page
   Then User should be able to check modification date column in the OOD course material
   When User is on Business Analysis course Material Page
   Then User should be able to check modification date column in the Business Analysis course material
   When User is on Excel course Material Page
   Then User should be able to check modification date column in the Excel course material
   When User is on Git course Material Page
   Then User should be able to check modification date column in the Git course material
   
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_6"

@TC_TMS_852_07
   Scenario: TC_TMS852_07 Test that if  "size of file" column is available
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
   When User is on ProSkills course Material Page
   Then User should be able to check if size column is displayed  in the ProSkills course material
   When User is on OOD course Material Page
   Then User should be able to check if size column is displayed  in the OOD course material
   When User is on Business Analysis course Material Page
   Then User should be able to check if size column is displayed  in the Business Analysis course material
   When User is on Excel course Material Page
   Then User should be able to check if size column is displayed  in the Excel course material
   When User is on Git course Material Page
   Then User should be able to check if size column is displayed  in the Git course material
   
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_7"
   
@TC_TMS_852_09
   Scenario: TC_TMS852_09 Test that if "view icon" is available in the row
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
   
   When User is on ProSkills course Material Page
   Then User should be able to check if view icon of an eye shape is availble in the row to view  the Proskills course material
   When User is on OOD course Material Page
   Then User should be able to check if view icon of an eye shape is availble in the row to view  the OOD course material
   When User is on Business Analysis course Material Page
   Then User should be able to check if view icon of an eye shape is availble in the row to view  the Business Analysis course material
   When User is on Excel course Material Page
   Then User should be able to check if view icon of an eye shape is availble in the row to view  the Excel course material
   When User is on Git course Material Page
   Then User should be able to check if view icon of an eye shape is availble in the row to view  the Git course material
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_9"

@TC_TMS_852_10
   Scenario: TC_TMS852_10 Test that if "download icon" is available in the row
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
   When User is on ProSkills course Material Page
   Then User should be able to check if download icon of a downward arrow is availble in the row to download the Proskills course material
   When User is on OOD course Material Page
   Then User should be able to check if download icon of a downward arrow is availble in the row to download the OOD course material
   When User is on Business Analysis course Material Page
   Then User should be able to check if download icon of a downward arrow is availble in the row to download the Business Analysis course material
   When User is on Excel course Material Page
   Then User should be able to check if download icon of a downward arrow is availble in the row to download the Excel course material
   When User is on Git course Material Page
   Then User should be able to check if download icon of a downward arrow is availble in the row to download the Git course material
    And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_10"

@TC_TMS_852_11
   Scenario: TC_TMS852_11 Test that if "delete icon" is available in the row
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
	 When User is on ProSkills course Material Page
   Then User should be able to check if delete icon  is availble in the row to delete any file in   the Proskills course material
   When User is on OOD course Material Page
   Then User should be able to check if delete icon  is availble in the row to delete any file in   the OOD course material
   When User is on Business Analysis course Material Page
   Then User should be able to check if delete icon  is availble in the row to delete any file in  the Business Analysis course material
   When User is on Excel course Material Page
   Then User should be able to check if delete icon  is availble in the row to delete any file in   the Excel course material
   When User is on Git course Material Page
   Then User should be able to check if delete icon  is availble in the row to delete any file in   the Git course material
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_11"

@TC_TMS_852_12
   Scenario: TC_TMS852_12 Test that if Archive/Unarchive  icon is available in the row
   Given User is logged in as a Course Owner and navigate to Course Catalogue page
   When User is on ProSkills course Material Page
   Then User should be able to check if Archive/Unarchive Icon is availble in a dropbox shape  to Archive/Unarchive the file from  the Proskills course material
   When User is on OOD course Material Page
   Then User should be able to check if Archive/Unarchive Icon is availble in a dropbox shape  to Archive/Unarchive the file from  the OOD course material
   When User is on Business Analysis course Material Page
   Then User should be able to check if Archive/Unarchive Icon is availble in a dropbox shape  to Archive/Unarchive the file from  the Business Analysis course material
   When User is on Excel course Material Page
   Then User should be able to check if Archive/Unarchive Icon is availble in a dropbox shape  to Archive/Unarchive the file from  the Excel course material
   When User is on Git course Material Page
   Then User should be able to check if Archive/Unarchive Icon is availble in a dropbox shape  to Archive/Unarchive the file from  the Git course material
   And 	Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_543/" as "TMS_852_12"
   
   
   
@TC_TMS_852_13
Scenario: Verify GET Request for Course Material
    Given a GET request is made to "/course-material/1"
    Then the response status code should be 200
    And the response should contain the following details:
      | courseMaterial_id | 1              |
      | subjectMaterialPath | TMS/CourseMaterial/Java_Development/Java_OOD/Slides |
      | lastUpdated | 2023-07-26     |
      | course.courseId | 9            |
      | course.name | OOD             |
      | course.duration | 5           |
      | course.description | test description |
      | course.courseOwner.userId | 13 |
      | course.courseOwner.firstName | Foo |
      | course.courseOwner.lastName | Bar |
      | course.courseOwner.email | foo.bar@fdmgroup.com |
      | course.courseOwner.username | foo.bar |
      | course.courseOwner.password | 1234 |
      | course.courseOwner.userType.userTypeId | 2 |
      | course.courseOwner.userType.name | Trainer |
      | course.courseOwner.officeLocation.id | 5 |
      | course.courseOwner.officeLocation.city | Charlotte |
      | course.courseOwner.officeLocation.stateOrProvince | NC |
      | course.courseOwner.officeLocation.country.id | 2 |
      | course.courseOwner.officeLocation.country.countryName | United States |
      | course.courseOwner.officeLocation.country.region.id | 1 |
      | course.courseOwner.officeLocation.country.region.regionName | North America |
      | course.courseOwner.officeLocation.country.region.regionCode | NA |
      | course.country.id | 1 |
      | course.country.countryName | Canada |
      | course.country.region.id | 1 |
      | course.country.region.regionName | North America |
      | course.country.region.regionCode | NA |
      | assessmentTypes | empty         |
      | fileType | pptx                |
      | fileName | Data_Types          |
      | size | 219KB                  |   