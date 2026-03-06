package com.qa_0003_CandidateLogin;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0004_CanDashboard;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ConfigReader;
import com.qa_0001_BaseTest.A003_BaseTestCandidateModule;

public class TC0001_VerifyCanLogin_validCred extends A003_BaseTestCandidateModule
{
	private static String expectedDashboardText = "Dashboard";
	private static String dahsboardURL = ConfigReader.getProperty("canDashboardUrl");
	
	BrowserUtility bu = new BrowserUtility();
	P0004_CanDashboard canDash = new P0004_CanDashboard();
	
	@TestCaseId("TC_001")
	@Test
	public void canLoginValidCred()
	{
		String actualText = canDash.getDashboardText();
		String actualURL = bu.getCurrentPageURL();
		
		assertEquals(actualText, expectedDashboardText);
		assertEquals(actualURL, dahsboardURL);		
	}

}
