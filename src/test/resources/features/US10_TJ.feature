
@regression
Feature: 10. As a user, I should be able to assign
  tasks by clicking on Task tab.


  1. Users can check  "High Priority"
  2. Users can click on "Checklist" to create checklists items
  3. Users can add Deadline,
  Time Planning using date pickers.
  (check box practice)


  Scenario: Users can check  "High Priority"

    Given user on the landing page
    When user click on Task tab
    And user check the High Priority
    Then verify that "High Priority" check box is selected


  Scenario:Users can click on "Checklist" to create checklists items

    Given user on the landing page
    When user click on Task tab
    And user click on checklist button
    Then verify that user can add checklist



  Scenario:Users can add Deadline, Time Planning using date pickers.

    Given user on the landing page
    When user click on Task tab
    And user should able to add deadline time
    And user should able to add time planing start and finish date
    Then user should able to see dates added


