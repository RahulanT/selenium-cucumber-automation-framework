Feature: As an admin, I want to have the header of the calendar locked on scroll so that when I scroll I can see the dates and the header options.

@TMS_584_01
  Scenario: TMS_584_01 Test that admin is able to move the scroll bar from top to bottom
    Given Admin is on the calendar page
    When I move scroll bar from top to bottom
    Then It should be movable
    
@TMS_584_02
  Scenario: TMS_584_02 Test that header is locked in place when scrolling down
    Given Admin is on the calendar page
    When I move scroll bar from top to bottom
    Then It should be movable and header should be locked
    