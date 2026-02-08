Feature: Login functionality 

Background:
Given the user is open URL

Scenario: Verify the web page
When the user is on login page
Then the user get login page title "Account Login"

Scenario: Login with valid credentials
When the user enter valid username "shubhamp1@test.com"
And the user enter valid password "shub@123"
And the user click on login button
And the user logged in successfully
Then then user get Dashboard page title "My Account"