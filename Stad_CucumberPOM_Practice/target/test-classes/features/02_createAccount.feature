Feature: create account 

Scenario: create an account with valid details

Given the user is on the registration page
When the user added First Name "shubham"
And the user added Last Name "Pawar"
And user added Email "shub123@test.com"
And user added Telephone "85955555555"
And user added Password "shub@123"
And user added Password Confirm "shub@123"
And user confirm privacy policy
And user click on continue button
Then the user is regestered successfully