@regression @login
Feature: This feature file will validate Login Page functionality

  @smoke @positive
  Scenario: User should be able to login to HUDL with valid credentials
    Given user navigates to HUDL Landing Page
    When user navigates to HUDL Login Page
    Then user logs in to HUDL homepage with valid credentials
    And user should be able to verify account name on HUDL Homepage
