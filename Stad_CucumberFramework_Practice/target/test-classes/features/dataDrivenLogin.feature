Feature: Login functionality

  Background:
    Given the user is open the login page
    
  @DataDriven
  Scenario Outline: Login with valid credentials
    When the user enter a valid username "<username>"
    And the user enter a valid password "<password>"
    And the user click the login button
    Then the user should be log in successfully

    Examples:
      | username               | password  |
      | shubhamP1@test.com     | shub@123  |
      | shubhamP2@test.com     | shub@123  |
      | shubhamP3@test.com     | shub@123  |

  @DataDriven
  Scenario Outline: Login with invalid username and password
    When the user enter an invalid username "<Invalidusername>"
    And the user enter a valid password "<password>"
    And the user click the login button
    Then the user should not be log in

    Examples:
      | Invalidusername               | password   |
      | shubhamP5@test.com     | shub@123   |
      | shubhamP4@test.com     | shub@12    |
      | shubhamP3@test.com     | shub@1234  |
