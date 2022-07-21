@usZM
Feature: User should be able to login to the app
  Agile Story:
  Verify users can login,
  verify users can check "Remember me on this computer" option,
  Verify users can access to "FORGOT YOUR PASSWORD?" link page


  Scenario: Login with valid credentials
    Given User is on the login page
    When User is at NextBase login page and user entered email "hr21@cybertekschool.com " and passcode "UserUser"
    And User is checked on  "Remember me on this computer" option
    Then User succesfully logged in the page


  Scenario: User is at login page and clicked on "FORGOT YOUR PASSWORD?" link page
  Given Verify user is able to see "FORGOT YOUR PASSWORD?"
   Then  User is able to enter to "FORGOT YOUR PASSWORD?" link page
