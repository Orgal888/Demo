@regression @homepage
Feature: This feature file will validate Home Page functionality

  Background:
    Given user navigates to HUDL Landing Page
    When user navigates to HUDL Login Page
    Then user logs in to HUDL homepage with valid credentials
    And user should be able to verify account name on HUDL Homepage

  @smoke
  Scenario: User should be able to validate main tabs on HUDL Homepage
    And user should be able to verify all main tabs on HUDL Homepage
      | options    |
      | Video      |
      | Reports    |
      | Team       |
      | Highlights |

  Scenario: User should be able to validate sub-tabs on HUDL Homepage
    And user should be able to verify all sub-tabs on HUDL Homepage
      | options |
      | Feed       |
      | Trending   |
      | Featured   |
      | Your Teams |

  Scenario: User should be able to validate global navigation bar on HUDL Homepage
    And user should be able to verify all global nav bars on HUDL Homepage
      | options |
      | Home       |
      | Watch Now  |

