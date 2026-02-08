Feature: Registration Functionality Multiple columns

@MultipleUserAsLists
Scenario: Multiple user registration single column multiple rows

Given multiple user open reg page
When multiple user enter data
|Shubham|Pawar|Nanded|
|Shub|P|Pune|
|Pawar|Shub|Mumbai|
Then multiple user registered