package com.qa_0003_CandidateLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0002_VerifyCanLogin_InvalidPass extends A001_BaseTest_BeforeLogin
{
	private static String canValidUsername = ConfigReader.getProperty("canValidUsername");
	private static String canInvalidPass = ConfigReader.getProperty("canInValidPassword");
	private static String expectedAlertText = "Invalid user details";
	
	P0001_LoginPage lp = new P0001_LoginPage();
	ElementsUtility eu = new ElementsUtility();
		
	@TestCaseId("TC_002")
	@Test
	public void canLoginInvalidPass()
	{
		lp.addUsername(canValidUsername);
		lp.addPassword(canInvalidPass);
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
