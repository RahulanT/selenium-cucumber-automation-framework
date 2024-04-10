#Author: Navpreet Kaur
Feature: TMS_1057 As a Course Owner I want to see if All the functions are working fine on course material page after refactoring

  @TC_TMS_Login_Test
  Scenario: TC_TMS User should be logged in to the system
    Given User launches the TMS portal page
    When Enters valid id and password of CourseOwner
    And user clicks the login button

@TC_TMS_1104_01
   Scenario: TC_TMS1104_01 Verify if Course Material filter is displayed with dropdown list				
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	Then There should be a course material filter download after search button in Proskills
   	And There should be all materials placehholder in  Proskills drop down menu
   	And There should be Current Materials placehholder in Proskills drop down menu
   	Then There should be Archived Materials placehholder in Proskills drop down menu
   	And User is able to navigate on OOD course material page
   	Then There should be a course material filter download after search button in OOD 
   	And There should be all materials placehholder in OOD drop down menu
   	And There should be Current Materials placehholder in OOD drop down menu
   	Then There should be Archived Materials placehholder in OOD drop down menu
   	And User is able to navigate on Business Analysis course material page
   	Then There should be a course material filter download after search button in Business Analysis
   	And There should be all materials placehholder in Business Analysis drop down menu
    And There should be Current Materials placehholder in Business Analysis drop down menu
   	Then There should be select Archived Materials placehholder in Business Analysis drop down menu
    And User is able to navigate on Excel course material page
   	Then There should be a course material filter download after search button in Excel 
   	And There should be all materials placehholder in Excel drop down menu
   	And There should be Current Materials placehholder in Excel drop down menu
   	Then There should be Archived Materials placehholder in Excel drop down menu
   And User is able to navigate on Git course material page
   	Then There should be a course material filter download after search button in Git 
   	And There should be all materials placehholder in Git drop down menu
   	And There should be Current Materials placehholder in Git drop down menu
   	Then There should be Archived Materials placehholder in Git drop down menu
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_01"


@TC_TMS_1104_02
   Scenario: TC_TMS1104_02 Verify if user can select  course material from drop down list
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	Then User should be able to select a "All Materials" placehholder in Proskills drop down menu
   	And User should be able to select the "Current Materials" placehholder in Proskills drop down menu
   	Then User should be able to select an "Archived Materials" placehholder in Proskills drop down menu
   	And User is able to navigate on OOD course material page
   	Then User should be able to select a "All Materials" placehholder in OOD drop down menu
   	And User should be able to select the "Current Materials" placehholder in OOD drop down menu
   	Then User should be able to select an "Archived Materials" placehholder in OOD drop down menu
   	And User is able to navigate on Business Analysis course material page
   	Then User should be able to select a "All Materials" placehholder in Business Analysis drop down menu
   	And User should be able to select the "Current Materials" placehholder in Business Analysis drop down menu
   	Then User should be able to select an "Archived Materials" placehholder in Business Analysis drop down menu
    And User is able to navigate on Excel course material page
   	Then User should be able to select a "All Materials" placehholder in Excel drop down menu
   	And User should be able to select the "Current Materials" placehholder in Excel drop down menu
   	Then User should be able to select an "Archived Materials" placehholder in Excel drop down menu
   And User is able to navigate on Git course material page
   	Then User should be able to select a "All Materials" placehholder in Git drop down menu
   	And User should be able to select the "Current Materials" placehholder in Git drop down menu
   	Then User should be able to select an "Archived Materials" placehholder in Git drop down menu
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_03"


@TC_TMS_1104_03
   Scenario: TC_TMS1104_03 Verify if user can Unselect  course material from drop down list
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	Then User should be able to UnCheck/UnSelect All Materials placehholder in Proskills drop down menu
   	And User should be able to UnCheck/UnSelect Current Materials placehholder in Proskills drop down menu
   	Then User should be able to UnCheck/UnSelect Archived Materials placehholder in Proskills drop down menu
   	And User is able to navigate on OOD course material page
   	Then User should be able to UnCheck/UnSelect All Materials placehholder in OOD drop down menu
   	And User should be able to UnCheck/UnSelect Current Materials placehholder in OOD drop down menu
   	Then User should be able to UnCheck/UnSelect Archived Materials placehholder in OOD drop down menu
   	And User is able to navigate on Business Analysis course material page
   	Then User should be able to UnCheck/UnSelect All Materials placehholder in Business Analysis drop down menu
   	And User should be able to UnCheck/UnSelect Current Materials placehholder in Business Analysis drop down menu
   	Then User should be able to UnCheck/UnSelect Archived Materials placehholder in Business Analysis drop down menu
    And User is able to navigate on Excel course material page
   	Then User should be able to UnCheck/UnSelect All Materials placehholder in Excel drop down menu
   	And User should be able to UnCheck/UnSelect Current Materials placehholder in Excel drop down menu
   	Then User should be able to UnCheck/UnSelect Archived Materials placehholder in Excel drop down menu
   And User is able to navigate on Git course material page
   	Then User should be able to UnCheck/UnSelect All Materials placehholder in Git drop down menu
   	And User should be able to UnCheck/UnSelect Current Materials placehholder in Git drop down menu
   	Then User should be able to UnCheck/UnSelect Archived Materials placehholder in Git drop down menu
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_03"

@TC_TMS_1104_04
   Scenario: TC_TMS1104_04 Verify if Select Bulk Action drop down is displayed
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	And User is able to navigate on OOD course material page
   	Then User should be able to  select bulk action drop down list in OOD 
   	And User is able to navigate on Business Analysis course material page
   	Then User should be able to  select bulk action drop down list in Business Analysis 
    And User is able to navigate on Excel course material page
   	Then User should be able to  select bulk action drop down list in Excel 
   And User is able to navigate on Git course material page
   	Then User should be able to  select bulk action drop down list in Git 
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_03"

@TC_TMS_1104_05
   Scenario: TC_TMS1104_05 Verify if Download Placeholder is displayed
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	Then There should be a Download Placeholder in select bulk action drop down list in Proskills  
   	And User is able to navigate on OOD course material page
   	Then There should be a Download Placeholder in select bulk action drop down list in OOD 
   	And User is able to navigate on Business Analysis course material page
   	Then There should be a Download Placeholder in select bulk action drop down list in Business Analysis 
    And User is able to navigate on Excel course material page
   	Then There should be a Download Placeholder in select bulk action drop down list in Excel  
   And User is able to navigate on Git course material page
   	Then There should be a Download Placeholder in select bulk action drop down list in Git  
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_05"

@TC_TMS_1104_06
   Scenario: TC_TMS1104_06 Verify if Delete Placeholder is displayed
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	Then There should be a Delete Placeholder in select bulk action drop down list in Proskills  
   	And User is able to navigate on OOD course material page
   	Then There should be a Delete Placeholder in select bulk action drop down list in OOD 
   	And User is able to navigate on Business Analysis course material page
   	Then There should be a Delete Placeholder in select bulk action drop down list in Business Analysis 
    And User is able to navigate on Excel course material page
   	Then There should be a Delete Placeholder in select bulk action drop down list in Excel  
   And User is able to navigate on Git course material page
   	Then There should be a Delete Placeholder in select bulk action drop down list in Git  
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_06"

 @TC_TMS_1104_07
 Scenario: TC_TMS1104_07 Verify if Archive Placeholder is displayed
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	Then There should be a Archive Placeholder in select bulk action drop down list in Proskills  
   	And User is able to navigate on OOD course material page
   	Then There should be a Archive Placeholder in select bulk action drop down list in OOD 
   	And User is able to navigate on Business Analysis course material page
   	Then There should be a Archive Placeholder in select bulk action drop down list in Business Analysis 
    And User is able to navigate on Excel course material page
   	Then There should be a Archive Placeholder in select bulk action drop down list in Excel  
   And User is able to navigate on Git course material page
   	Then There should be a Archive Placeholder in select bulk action drop down list in Git  
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_07"

@TC_TMS_1104_08
 Scenario: TC_TMS1104_08 Verify if Un/Archive Placeholder is displayed
   	Given User is logged in as a Course Owner 
   	And User is able to navigate on Proskills course material page
   	Then There should be a UnArchive Placeholder in select bulk action drop down list in Proskills  
   	And User is able to navigate on OOD course material page
   	Then There should be a UnArchive Placeholder in select bulk action drop down list in OOD 
   	And User is able to navigate on Business Analysis course material page
   	Then There should be a UnArchive Placeholder in select bulk action drop down list in Business Analysis 
    And User is able to navigate on Excel course material page
   	Then There should be a UnArchive Placeholder in select bulk action drop down list in Excel  
   And User is able to navigate on Git course material page
   	Then There should be a UnArchive Placeholder in select bulk action drop down list in Git  
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_5/CourseOwners/TMS_1057/" as "TMS_1104_08"

@TC_TMS_1151_01
Scenario: TC_TMS_1151_01 Verify GET Request for Course Material
    Given a GET request is made to "/course-material/1"
    Then the response status  should  200

Scenario: TC_TMS_1151_02 Verify POST Request to Create Course Material
    Given a POST request is made to "/regions/" with the following data:
      """
      {
        "regionName": "North America",
        "regionCode": "NAV"
      }
      """
    Then the response status  should  200


Scenario: TC_TMS_1151_03 Verify PUT Request to Update Course Material
    Given a PUT request is made to "/regions/edit/6" with the following data:
      """
      {
       "id":"6",
        "regionName": "AsiaN",
        "regionCode": "NA"
      }
      """
    Then the response status  should  200

@TC_TMS_1151_04
Scenario: TC_TMS_1151_04 Verify DELETE Request for Course Material
    Given a DELETE request is made to "/regions/delete/5"
Then the response status  should  200
    