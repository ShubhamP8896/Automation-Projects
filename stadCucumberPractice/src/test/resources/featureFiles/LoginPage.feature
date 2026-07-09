Feature: Verify Login Functionality

Background: 
Given Login page is opened

Scenario: Verify login functionality with valid credentials

When added valid userName "shubham@test123.com"
And added valid passowrd "shub@123"
And clicked on the login button
Then Dashboard is showing

Scenario: Verify login functionality with invalid credentials

When added invalid username "sss"
And  added invalid password "sss"
And clicked on the login button
Then User not able to login