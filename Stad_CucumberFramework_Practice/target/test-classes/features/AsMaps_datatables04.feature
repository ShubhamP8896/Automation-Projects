Feature: Registration Functionality Multiple columns Multiple rows

@MultipleColumnsAsMaps
Scenario: multiple columns multiple rows

Given multiple Columns multiple rows
When multer users enter data following
|firstName|lastName|email|contact|city|
|Shubham|Pawar|shub@test.com|123456|Pune|
|Shubham|Pawar|shub@test.com|123456|Pune|
|Shubham|Pawar|shub@test.com|123456|Pune|
|Shubham|Pawar|shub@test.com|123456|Pune|
Then multiple users are registered