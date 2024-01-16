Feature: Investment Funds Search

  Scenario: Verify Investment Fund Redirect URL After Search
    Given I am on the Bank Millennium website
    When I enter the search phrase "fundusz" and press Enter
    Then the Investment Fund redirect URL is displayed
