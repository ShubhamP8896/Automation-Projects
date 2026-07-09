package com.qa_001_baseTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMyPract 
{
	@DataProvider(name = "dp")
	public String [] [] loginData()
	{
		String data [][] = 
		{
				{"shubham@test.com", "test@123"},
				{"shubham123@test.com", "test@321"}
		};
		
		return data;
	}

	
	@Test (dataProvider = "dp")
	public static void test(String username, String pass)
	{
		System.out.println(username + "  " + pass);
	}
	
}
