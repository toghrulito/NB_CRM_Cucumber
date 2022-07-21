Feature: As a user, I should be able to login to the app


  Scenario Outline: users <hr>, <marketing> and <helpdesk> login with valid credentials
    Given I am on the login window
    When I enter "<username>" and enter "<password>" on "login" window

    Then I should land homepage

    Examples:
      | username  | password |
      | hr21      | UserUser |
      | marketing | UserUser |
      | helpdesk  | UserUser |


