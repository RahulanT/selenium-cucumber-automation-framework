#Author: Sofia Singh
Feature: TMS_1668 As an Course Owner,  I want to rename course material files so that they are easily recognizable for trainees. 

  Background: 
    Given User launches the TMS portal page
    When Enters valid id and password
    And user clicks the login Btn

  @TMS2404
  Scenario Outline: TMS_2404 Rename Icon Appears When Course Owner hovers over a line on the Course List Page 
		When Course Owner navigates to all courses
		When Course Owner selects course "<CourseName>"
		When Course Owner hovers over file row on Course List Page
		Then Rename Icon Appears beside file name
   And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/CourseOwners/TMS_1668/" as "TMS_2404"

  Examples:
  	|CourseName|
  	|Advanced Bash Scripting|
  	
   
  @TMS2410
  Scenario: TMS_2410 File name should become editable when a course owner clicks on the rename icon
  	When Course Owner navigates to all courses
		When Course Owner selects course "<CourseName>"
		When Course Owner hovers over file row on Course List Page
		When Course Owner clicks Rename Icon
		When Change full file name to "<OriginalFileName>"
		When Click in empty space
		When Course Owner hovers over file row on Course List Page
		When Course Owner clicks Rename Icon
		Then File name becomes editable with "<AddLettersToFileName>"
		When Click in empty space
		Then File name should be "<FileName>"
		And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_14/CourseOwners/TMS_1668/" as "TMS_2410"

		
  Examples:
  	|CourseName|OriginalFileName|AddLettersToFileName|FileName|
  	|Advanced Bash Scripting|Powershell|AddedLetters|PowershellAddedLetters|
  	
  	
  #@TMS2413
  #Scenario: TMS_2413 New file name should be saved when a course owner clicks outside the edit box