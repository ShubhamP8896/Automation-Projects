Feature: Login functionality

@Sanity
  Scenario: Login with valid credentials
  	Given the user is on the login page
    When the user enters a valid username "shubhamP1@test.com"
    And the user enters a valid password "shub@123"
    And the user clicks the login button
    Then the user should be logged in successfully
    
@Sanity
  Scenario: Login with invalid username
   	Given the user is on the login page
    When the user enters an invalid username "shubhamP12@test.com"
    And the user enters a valid password "shub@123"
    And the user clicks the login button
    Then the user should not be logged in
    
@Regression
  Scenario: Login with invalid password
    Given the user is on the login page
    When the user enters a valid username "shubhamP1@test.com"
    And the user enters an invalid password "shub@1234"
    And the user clicks the login button
    Then the user should not be logged in
    
@Regression
  Scenario: Login without credentials
    Given the user is on the login page
    When the user clicks the login button
    Then the user should not be logged in
