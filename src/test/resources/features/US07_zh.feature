@US07
Feature: As a user, I should be able to do see posts from homepage.

  Background:
    Given I am on the NextBase CRM homepage

#  Scenario: users  (hr, marketing and helpdesk)  click ""Like"" button for any post
#    When I click on Like button for any post
#    Then I can see like under like button

  Scenario: users are able to follow a post by clicking "Follow" button
    When I able to "follow" a post by clicking "Follow" button

  Scenario: Users can see who are the people viewed a post with eye icon
    When I hover over mouse on eye icon button and can see who viewed a post

    Scenario: Users click star icon to save a post as favorite
      When I click on star icon and I can see start icon changed it color to orange

      Scenario: Users can write a comment to a post
        When I click on comment section and I able to write comment

Scenario: Users cancel a comment with "Cancel" button
  When I can "cancel" a comment with "Cancel" button



