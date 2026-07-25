Feature: Registration Page

Background: 
Given user is on the registration page

Scenario: Verify and check the registration page is opened successfully

Then All the fields showing proper to user

Scenario:
Verify and check user able to register successfully

When user added the valid firstName "Shubham"
And user added the valid lastName "Pawar"
And user added the valid EmailID
And user added the valid telephone 1256355855
And user added the valid password "shub@123"
And user added the valid confirm password "shub@123"
And user accepted the terms and condition and clicked on the continue
Then user successfully registed and success message should be showing on the screen

