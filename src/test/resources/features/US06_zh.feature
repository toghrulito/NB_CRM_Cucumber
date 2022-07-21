Feature:  As a user, I should be able to log work hours with time reporting


  Background:
#    Given I am on the homepage

  @US06
    Scenario: users  (hr, marketing and helpdesk) start time tracking with "Clock in" button
      When I start time tracking with "Clock in" button
      Then I can see working day duration tab

    Scenario: users stop tracking with ""CLOCK OUT"" button when work hour is end
    When I click stop tracking with "CLOCK OUT" button
    Then I can see work hour is end

  Scenario: Users create a new task for daily plan
    When I create a new task for daily plan
    Then I should see the daily plan


    Scenario: Users add an event with starting and ending time
      When I add an event with starting and ending time
      Then I should see the event

 Scenario: users edit work day starting and ending time
  When I edit work day starting and ending time
   Then I can see edited work day



