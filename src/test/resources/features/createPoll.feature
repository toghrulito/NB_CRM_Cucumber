
  Feature: As a user, I should be able to create a poll



    Background:
      Given I am on the homepage
      When I click "poll" button on "homepage" window
     @wip
    Scenario: Verify users can write a poll message title with question & answer.


      And I fill all fields and click "send" button on the "homepage" window
      Then I should see poll in the activity stream




     Scenario: users check "allow multiple Choice" while create a poll
        When I click "allow multiple Choice" checkbox
       Then allow multiple Choice should be checked

       Scenario: users can add more questions to a poll

         When I click "add question" button on "homepage" window
         Then I should be able to add more question


         Scenario: users are able to cancel creating a poll
           When I click "cancel" button on "homepage" window
           Then I should be able to cancel poll
