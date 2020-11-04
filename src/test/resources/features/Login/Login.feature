Feature: login
  Scenario: login as a Librarian
    Given user is on the login page
    When user enters valid credentials
    Then System should displays the dashboard