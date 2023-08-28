@regression @upload
Feature: This feature file will validate Upload functionality

  Background:
    Given user navigates to HUDL Landing Page
    When user navigates to HUDL Login Page
    Then user logs in to HUDL homepage with valid credentials
    And user should be able to verify account name on HUDL Homepage

  Scenario: User should be able to successfully upload a file
    When user clicks on the upload button
    And user uploads "hudlTest.mp4" file
    Then user should see a success message