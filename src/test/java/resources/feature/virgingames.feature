Feature: VirginGames Application
  I want to verify data in the virgin games webpage

  Scenario: Virgin Games Venture ID
    Given I am on virgin games application
    When I send a request to get all data
    Then I should verify the stream ID is 194

  Scenario: Virgin Games Maximum Number of Cards
    Given I am on virgin games application
    When I send a request to get all data
    Then I should verify maximum number of cards