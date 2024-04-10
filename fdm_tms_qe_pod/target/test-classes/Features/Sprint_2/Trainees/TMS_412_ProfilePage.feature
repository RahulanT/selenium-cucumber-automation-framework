Feature: Profile Tab Visibility
  		Background: User should be on the Profile Page
  			Given User clicks the profile tab to navigate to the profile page

@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_01 Test that the Profile tab is visible on the navigation bar
    Given The user observes navigation bar
    Then The user should see the profile tab with a downward chevron key
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_01"
 
@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_02 Test that when profile tab is clicked, a dropdown menu appears with "View Results and Feedback" option at the top
    Given The user is on the profile page
    And The user clicks the dropdown arrow
    Then The first option displayed at the top is "View Results and Feedback" and chevron key is pointing upwards
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_02"

@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_03 Test that, when user hovers over "View Results and Feedback" option, the option is highlighted with light blue color
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user hovers over "View Results and Feedback" option
    Then The first option displayed at the top is "View Results and Feedback"
    And The option "View Results and Feedback" is highlighted in light blue on hover
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_03"

@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_04 Test that, when user clicks on option, text turns into bold and highlight turns into dark blue
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user selects "View Results and Feedback" option
    Then The first option displayed at the top is "View Results and Feedback"
    And the text turns into bold and the highlight is dark blue
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_04"
    
@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_05 Test that when the link is clicked in the dropdown menu, the results page is loaded along with the data
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user selects "View Results and Feedback" option
    Then The user is redirected to the results and feedback page
    And The table content should be displayed accordingly per column
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_05"
    
@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_06 Test that the data in the table should be displayed in the following order: Course Name, Start Date, End Date, Trainer, Results/feedback				
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user selects "View Results and Feedback" option
    Then The user is redirected to the results and feedback page
    When The user observes the results and feedback page
    Then Table column should follow the following order: Course, Start Date, End Date, Trainer, Results/feedback
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_06"

@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_07 Test that trainee profile card is displayed on the right side of the table				
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user selects "View Results and Feedback" option
    Then The user is redirected to the results and feedback page
    When The user observes the results and feedback page
    Then The trainee`s profile card is displayed on the right side of the table
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_07"
    
@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_08 Test that when a row is hovered over with the mouse, that row is highlighted with light blue				
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user selects "View Results and Feedback" option
    When The user hovers over table rows	
    Then Hovered row turns into light blue 
    When The user hovers away from table rows
    Then The hovered row turns into white
   	And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_08"

@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_09 Test that when a row is clicked on, that row is highlited with medium blue				
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user selects "View Results and Feedback" option
    Then The user is redirected to results and feedback page
    When The user selects a table row 
    Then The selected row turns into medium blue 
    When The user unselects the selected table row
    Then The unselected row turns into original color
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_09"

@TC_TMS412_View_Results_And_Feedback
  Scenario: TC_TMS412_10 Test that Course Name column has filter icon, Start Date and End Date have sort icon displayed				
    Given The user is on the profile page
    When The user clicks the dropdown arrow
    And The user selects "View Results and Feedback" option
    Then The user is redirected to results and feedback page
    When The user observes the results and feedback page 
    Then Course Name has filter icon, Start Date and End Date each has sort icon displayed
    And Take a screenshot and saving it in "src/test/resources/Screenshots/Trainees/Sprint2/TMS_412/" as "TMS_412_010" 
    


