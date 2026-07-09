Feature: Datatables

@dataTable
Scenario:
	Verify and check the datatables
	
Given URL is Opened successfully
When user added following data
|Name|email|mobileNum|id|
|Shubham|sp@test.com|84555|121|
|Shubham1|sp@test1.com|845551|1212|
|Shubham2|sp@test2.com|845552|1213|
Then user completed regestration process 