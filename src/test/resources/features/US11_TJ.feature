Feature: As a user, I should be able to access to time and reports module


  "1. Verify only hr and marketing team can access to time and report module.
  2. Verify users can filter absence chart by day / week / month
  3. Verify users can check statistics under work time
  4. Verify users can check Show start and end times under work time "


  1. users  (hr, marketing only )  access to time and report module.
  2. Helpdesk cannot access to time and report module.  (Negative )
  3. users  (hr, marketing ) can filter absence chart by day / week / month
  4. users (hr, marketing )  can check statistics under work time
  5. users can check Show start and end times under work time


  Scenario Outline:user access to time and report module
    Given "<user>" on the landing page
    When user click navigation bar
    And should able to click time and reports module
    Then User should able to see absence char
    Examples:
      | user                           |
      | hr21@cybertekschool.com        |
      | marketing21@cybertekschool.com |


  @negative
  Scenario Outline:user cant access to time and report module
    Given "<user>" on the landing page
    When user click navigation bar
    And should able to click time and reports module
    Then User should able to see absence char
    Examples:
      | user                          |
      | helpdesk21@cybertekschool.com |



  Scenario Outline:  Can filter absence chart

    Given "<user>" on the landing page
    When user click navigation bar
    And should able to click time and reports module
    When User should able to click Day in the chart
    Then User should able to see one of the day on the top of chart
      | Monday    |
      | Tuesday   |
      | Wednesday |
      | Thursday  |
      | Friday    |
      | Saturday  |
      | Sunday    |
    When User should able to click week in the chart
    Then User should able to see week days in the chart
    When User should able to click Month in the chart
    Then User should able to see days of the month in the chart


    Examples:
      | user                           |
      | hr21@cybertekschool.com        |
      | marketing21@cybertekschool.com |



  Scenario Outline:user access to time and report module
    Given "<user>" on the landing page
    When user click navigation bar
    And should able to click time and work time
    Then user should able to check statistics
    Examples:
      | user                           |
      | hr21@cybertekschool.com        |
      | marketing21@cybertekschool.com |




  @wip
  Scenario Outline:user access to time and report module
    Given "<user>" on the landing page
    When user click navigation bar
    And should able to click time and work time
    Then user should able to check Show start and end times
    Examples:
      | user                           |
      | hr21@cybertekschool.com        |
      | marketing21@cybertekschool.com |