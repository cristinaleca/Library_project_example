Feature: Login feature

  @librarian @student
  Scenario Outline: Login as a <role>
    Given I am on the login page
    Then I login as a "<role>"
    Then dashboard should be displayed

    Examples:
    |role|
    |librarian|
    |student  |

