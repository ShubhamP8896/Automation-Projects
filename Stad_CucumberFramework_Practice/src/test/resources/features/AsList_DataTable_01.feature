Feature: Registration Functionality

@SingleUserAsList
Scenario: Single user registration single column multiple rows

Given single user open reg page
When single user enter data
|Shubham|
|Pawar|
|Nanded|
Then single user registered