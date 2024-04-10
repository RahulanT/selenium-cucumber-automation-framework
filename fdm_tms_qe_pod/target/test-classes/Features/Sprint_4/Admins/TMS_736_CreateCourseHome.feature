@CreateCourseHomeFeature
Feature: As an Admin, I want to be able to view a list of existing courses in the system so that I can keep track of them.

  @TC_TMS882_01
  Scenario: TC_TMS882_01 Test that Admin can see a page of courses available when access to "Course List" functionality
    Given Login as Admin to TMS and Go to Create Course Home Page
    Then Admin should be able to see Create Course Home Page
    When Validate Admin can see available courses on Create Course Home Page
    Then Admin should be able to see available courses on Create Course Home Page
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_01"

  @TC_TMS882_02
  Scenario: TC_TMS882_02 Test that Admin can view list of courses and each course should contains details course name,course owner,course length and region
    Given Login as Admin to TMS and Go to Create Course Home Page
    Then Admin should be able to see Create Course Home Page
    When Validate Admin can see each course in Course List with details course name, course owner, course length and region
    Then Admin should be able to see each course with course name, course owner,course length and region
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_02"

  @TC_TMS882_03
  Scenario: TC_TMS882_03 Test that Admin can sort courses based on Course Owner first name
    Given Login as Admin to TMS and Go to Create Course Home Page
    Then Admin should be able to see Create Course Home Page
    When Click on sort button on column Course Owner and Validate course list is sorted in ascending order based on first name
    Then Course List should be sorted by Course Owner in ascending order
    When Click on sort button on column Course Owner and Validate course list is sorted in descending order based on first name
    Then Course List should be sorted by in Course Owner descending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_03"

  @TC_TMS882_04
  Scenario: TC_TMS882_04 Test that Admin can sort courses based on course length
    Given Login as Admin to TMS and Go to Create Course Home Page
    Then Admin should be able to see Create Course Home Page
    When Click on sort button on column Course Length and Validate course list is sorted in descending order based on days
    Then Course List should be sorted by days in descending order
    When Click on sort button on column Course Length and Validate course list is sorted in ascending order based on days
    Then Course List should be sorted by days in ascending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_04"

  @TC_TMS882_05
  Scenario: TC_TMS882_05 Test that Admin can sort courses based on Country
    Given Login as Admin to TMS and Go to Create Course Home Page
    Then Admin should be able to see Create Course Home Page
    When Click on sort button on column  Region/Country and Validate course list is sorted in ascending order based on Country
    Then Course List should be sorted by Country in ascending order
    When Click on sort button on column  Region/Country and Validate course list is sorted in descending order based on Country
    Then Course List should be sorted by Country in descending order
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_05"

  @TC_TMS882_06
  Scenario: TC_TMS882_06 Test that Admin can filter courses based on Region
    Given Admin should be able to see Create Course Home Page
    When Click on filter button on Region/Country column and select checkbox NA
    Then Only NA Region course list should be displayed
    When Click on filter button on Region/Country column and select checkbox NA  and APAC
    Then NA and APAC Region course list should be displayed
    When Click on filter button on Region/Country column and select checkbox NA  and APAC and EMEA
    Then NA and APAC and EMEA Region course list should be displayed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_06"

  @TC_TMS882_07
  Scenario: TC_TMS882_07 Test that Admin can search courses based on Course name
    Given Login as Admin to TMS and Go to Create Course Home Page
    When Enter course name as "SQL" in search textbox
    Then Search result should be displayed "SQL" with the course name
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_07"

  #@TC_TMS882_08
  #Scenario: TC_TMS882_08 Test that Admin can scroll down or scroll up to find courses
  #When Login as Admin to TMS and Go to Create Course Home Page
  #Then Admin should be able to see Create Course Home Page
  #When Validate Create Course Home Page can be scrolled up or down
  #Then Admin should be able to scroll down or scroll up to find relevent course from course list
  #And Take a screenshot and saving it in "src/test/resources/Screenshots/Sprint_4/Admins/TMS_736/" as "TMS882_08"
  
  @TC_TMS882_09
  Scenario: TC_TMS882_09 Test that GET request to /course should return status code 200 if database has all course
    When Send a Get request to "/course"
    Then Status code 200 should be returned with data
