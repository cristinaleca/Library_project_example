Feature: Login feature

  @librarian
  Scenario: Login as a librarian
    Given I am on the login page
    Then I login as a librarian
    Then dashboard should be displayed

