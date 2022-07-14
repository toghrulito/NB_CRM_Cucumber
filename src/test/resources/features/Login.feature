@regression @smoke
Feature:Next Base CRM Login feature
  User Story:

  1. As a user, I should be able to login to the app

  Background:Assuming user in the log in page
    Given User is on NextBaseCRM login page

  @marketing @smoke
  Scenario:Login as marketing
          1. users (hr, marketing and helpdesk) login with valid credentials
      When  User enters marketing valid username
      And   User enters marketing valid password
      And   User click login button
      Then  User should launch to the homepage

  @hr @smoke
  Scenario: Login as hr
    When User enters hr valid username
    And User enters hr valid password
    And User click login button
    Then User should launch to the homepage

  @helpdesk   @smoke
  Scenario: Login as helpdesk
    When User enters helpdesk valid username
    And User enters helpdesk valid password
    And User click login button
    Then User should launch to the homepage