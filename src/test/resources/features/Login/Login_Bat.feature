Feature: Login feature

  @librarian
  Scenario Outline: Login as a <role>
    Given I am on the login page
    Then I login as a "<role>"
    Then dashboard should be displayed

    Examples:
    |role|
    |librarian|
    |student  |

