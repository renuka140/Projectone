Feature: Verify Login functionality
  Scenario: Verify Login functionality
    Given I visit Login page
    When I enter username and password
    And I click on Login button
    Then I see login is successful

