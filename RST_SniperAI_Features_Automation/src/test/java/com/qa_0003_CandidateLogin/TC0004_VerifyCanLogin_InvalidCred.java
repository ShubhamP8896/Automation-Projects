package com.qa_0003_CandidateLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0004_VerifyCanLogin_InvalidCred extends A001_BaseTest_BeforeLogin
{
	private static String canInvalidUsername = ConfigReader.getProperty("canInValidUsername");
	private static String canInValidPassword = ConfigReader.getProperty("canValidPassword");
	private static String expectedAlertText = "Invalid user details";
	
	P0001_LoginPage lp = new P0001_LoginPage();
	ElementsUtility eu = new ElementsUtility();	
	
	@TestCaseId("TC_004")
	@Test
	public void canLoginInvalidCred()
	{

		lp.addUsername(canInvalidUsername);
		lp.addPassword(canInValidPassword);
		lp.selectUserTypeCandidate();
		lp.clickRememberMe();
		lp.clickloginButton();
		
		Alert alt = eu.waitForAlertPresent(10);
		String actualAlertText = alt.getText();
		System.out.println("Actual Alert Text: " + expectedAlertText);
		alt.accept();
		
		assertEquals(actualAlertText, expectedAlertText);
		
	}
	

}
