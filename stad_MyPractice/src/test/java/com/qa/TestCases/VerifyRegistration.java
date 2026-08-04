package com.qa.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.baseTest.BaseTestClass;
import com.qa.pages.page_test;

public class VerifyRegistration extends BaseTestClass
{
	page_test pg = new page_test();
	@Test
	public void verifyRegPage()
	{
		pg.addFirstName("Shubham");
		pg.addlastName("Pawar");
		pg.addEmailId("shub@123.com");
		pg.addTelephoneNumber("1235685");
		
		Assert.assertTrue(false);
	}
	
}
