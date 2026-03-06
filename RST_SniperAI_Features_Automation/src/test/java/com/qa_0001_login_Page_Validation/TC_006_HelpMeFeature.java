package com.qa_0001_login_Page_Validation;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.driverFactory.DriverFactory;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ExceptionsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC_006_HelpMeFeature extends A001_BaseTest_BeforeLogin
{
	private static String expectedAlertMessage = "Your feedback has been sent successfully!";
	P0001_LoginPage lp = new P0001_LoginPage();
	private static String emailId =  "shubham8896@yopmail.com";
	private static String feedbackMsg =  "Automation Testing";
	
	@TestCaseId("TC_006")
	@Test
	public void verifyHelpMeFeature() throws InterruptedException
	{		
		lp.clickHelpMe();
		lp.addFeedbackEmail(emailId);
		lp.addFeedbackMessage(feedbackMsg);
		
		try 
		{
		String actualAlertMessage = lp.clickSendFeedbackButton();
		System.out.println("Actual Alert Message : "+actualAlertMessage);
		assertEquals(actualAlertMessage, expectedAlertMessage);
		}
		catch(NoAlertPresentException e)
		{
			throw new ExceptionsUtility("Alert is not Present, Something went wrong.");
		}
		
	}

}
