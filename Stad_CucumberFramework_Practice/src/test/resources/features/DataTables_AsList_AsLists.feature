Feature: Login Function and registration function
	Data tables single user login and multiple user regisrations
@DataTables
Scenario: Successful login with single user

Given User is on the login page   
When User enters the following details
|Shubham|
|Pawar|
|Shubham@test.com|
|89658555|
|Shubham@123|
|Shubham@123|
Then User Should be able to login successfully

@DataTables
Scenario: Check Registration multiple users

Given User go to registration page
When Enter registration details
|Riya|9876234455|Jaipur|
|Amit|9127863366|Ajmer|
|Anuj|9785566879|Ahmedabad|
Then click submit button
