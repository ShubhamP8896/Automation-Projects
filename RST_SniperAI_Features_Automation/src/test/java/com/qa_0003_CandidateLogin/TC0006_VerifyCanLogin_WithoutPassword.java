package com.qa_0003_CandidateLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0006_VerifyCanLogin_WithoutPassword extends A001_BaseTest_BeforeLogin
{
	private static String canValidUsername = ConfigReader.getProperty("canValidUsername");
	private static String expectedAlertText = "Please enter password";
	
	P0001_LoginPage lp = new P0001_LoginPage();
	ElementsUtility eu = new ElementsUtility();	
	
	@TestCaseId("TC_006")
	@Test
	public void canLoginWithoutPass()
	{
		lp.addUsername(canValidUsername);
		lp.addPassword("");
		lp.selectUserTypeCandidate();
		lp.clickRememberMe();
		lp.clickloginButton();
		
		Alert alt = eu.waitForAlertPresent(10);
		String actualAlert = alt.getText();
		System.out.println("Actual Alert: " + actualAlert);
		
		assertEquals(expectedAlertText, actualAlert);
	}

}
