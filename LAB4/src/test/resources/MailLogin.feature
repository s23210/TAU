Feature: Mail Login

  Scenario: Verify Mail Login
    Given I am on the WP Mail login page
    When I enter my username and password and click submit
    Then I should see the mailbox
