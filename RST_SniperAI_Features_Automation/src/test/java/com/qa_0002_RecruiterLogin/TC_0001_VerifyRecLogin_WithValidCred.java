package com.qa_0002_RecruiterLogin;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0008_RecJobList;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ConfigReader;
import com.qa_0001_BaseTest.A002_BaseTestRecruiterModule;

public class TC_0001_VerifyRecLogin_WithValidCred extends A002_BaseTestRecruiterModule
{
	String expectedText = "Jobs"; 
	String expectedURL = ConfigReader.getProperty("jobListPageURL");
	BrowserUtility bu = new BrowserUtility();
	P0008_RecJobList rec = new P0008_RecJobList();
	
	@TestCaseId("TC_001")
	@Test
	public void RecLoginValidCred()
	{
		String actualUrl = bu.getCurrentPageURL();
		System.out.println("Actual URL : " + actualUrl );
		
		String actaulText = rec.getJobsText();
		System.out.println("Actual Text : " + actaulText );
		
		assertEquals(actualUrl, expectedURL);
		assertEquals(actaulText, expectedText);
		
		System.out.println("Logged In Successfully");
	}
	
	

}
