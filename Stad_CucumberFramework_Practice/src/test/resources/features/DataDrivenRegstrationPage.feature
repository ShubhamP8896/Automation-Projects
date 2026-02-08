Feature: Registartion Page
 User able to registered successfully
 
@Regestration
Scenario Outline: User able to regestered with valid data
Given the user is open Regestration page
When the user added fullname "<fullname>"
And the user added email "<email>"
And the user added contact "<contactNo>"
And user added password "<Cpassword>"
Then the user should be registered

Examples:
|fullname        |email            |contactNo    |Cpassword    |
|shubham Pawar   |shub@test.com    |58566686     |shub@123    |
|Rohan More      |rohan@test.com   |8555651545   |roha@132    |
|Soham Gote      |soham@test.com   |564654564    |so@123      |
 