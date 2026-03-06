package com.qa_0001_login_Page_Validation;

import static org.testng.Assert.assertNotNull;

import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0003_JobOpeningsPage;
import com.qa.utilities.BrowserUtility;
import com.qa.pages.P0001_LoginPage;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC_0002_URL_JobOpeningsPage extends A001_BaseTest_BeforeLogin
{
	P0001_LoginPage lp = new P0001_LoginPage();
	P0003_JobOpeningsPage jop = new P0003_JobOpeningsPage();
	BrowserUtility bu = new BrowserUtility();
	
	
	@TestCaseId("TC_002")
	@Test
	public void verifyJobOpeningsUrl()
	{
		lp.clickJobOpenings();
		String expectedText = jop.getCurrentOpeningsText();
		System.out.println("Expected URL: " + expectedText);
		String currentOpeningCount = jop.getCurrentOpeningCount();
		System.out.println("Current Openings Count: " + currentOpeningCount);
		
		assertNotNull(expectedText);
	}
	

}
