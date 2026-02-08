Feature: Register Account

@Functional
  Scenario: user able to register with valid information
    Given the user is on the registration page
    When the user enters a valid first name
    And the user enters a valid last name
    And the user enters a valid email
    And the user enters a valid telephone
    And the user enters a valid password
    And the user enters a valid confirm password
    And the user clicks the terms conditions check box
    And the user clicks on the continue button
    Then the user should be registered successfully