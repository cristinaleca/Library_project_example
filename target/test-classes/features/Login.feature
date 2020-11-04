@login #this means every scenario under this feature will work.
Feature: As user I want to be able to login under different roles
# this is comment


  Background: common steps
    Given user is on the login page

  @scenario_1
  Scenario: Login as a sales manager
    When user logs in
    Then user should see 3 dashboard page


  @scenario_2  @Bug
  Scenario: Login as a sales manager
    When user logs in
    Then user should see 3 dashboard page

  @parametrized_test  @ie @firefox
  Scenario: Parametrized login
    When user enters valid credentials
    |username1|driver|
    |password1|UserUSer|
    |username2|SalesManager|
    |username3|storemanager|
    Then user should see dashboard pages


#  @parametrized_test  @ie @firefox
#  Scenario: Parametrized login
#    When user logs in as a "storemanager"
#    Then user should see dashboard page
#
#
#  @parametrized_test  @ie @firefox
#  Scenario: Parametrized login
#    When user logs in as a "salesmanager"
#    Then user should see dashboard page




  Scenario Outline: login under different credentials as <username>
    When user enters "<username>" and "<password>"
    Then user should see dashboard page

      Examples:
      |   username   |   password        |
      | user10       |   UserUser123     |
      | user15       |   UserUser123     |
      | user22       |   UserUser123     |



  @negative_login @chrome
  Scenario: invalid password
    When user logs in with "storemanager85" username and "wrong" password
    Then user verifies that "Invalid user name or password."  message is displayed
