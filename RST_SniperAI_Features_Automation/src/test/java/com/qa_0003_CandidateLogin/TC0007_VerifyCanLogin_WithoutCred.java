package com.qa_0003_CandidateLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0007_VerifyCanLogin_WithoutCred extends A001_BaseTest_BeforeLogin
{

private static String expectedAlertText = "Please enter email address";
	
	P0001_LoginPage lp = new P0001_LoginPage();
	ElementsUtility eu = new ElementsUtility();	
	
	@TestCaseId("TC_007")
	@Test
	public void canLoginWithoutCred()
	{
		lp.addUsername("");
		lp.addPassword("");
		lp.selectUserTypeCandidate();
		lp.clickRememberMe();
		lp.clickloginButton();
		
		Alert alt = eu.waitForAlertPresent(10);
		String actualAlertText = alt.getText();
		System.out.println("Actual Alert Message: " + actualAlertText);
		alt.accept();
		
		assertEquals(actualAlertText, expectedAlertText);
	}
		

}
