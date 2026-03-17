package com.qa_0003_CandidateLogin;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0008_VerifyCanLogin_WithRecCred extends A001_BaseTest_BeforeLogin
{
	P0001_LoginPage lp = new P0001_LoginPage();
	ElementsUtility eu = new ElementsUtility();
	String recValidUsername = ConfigReader.getProperty("recSecondaryEmail");
	String recValidPassword = ConfigReader.getProperty("recSecondaryPassword");
	String expectedAlertText = "Invalid user details";
	
	@TestCaseId("TC_008")
	@Test
	public void canLoginWithRecCred()
	{
		lp.addUsername(recValidUsername);
		lp.addPassword(recValidPassword);
		lp.selectUserTypeCandidate();
		lp.clickRememberMe();
		lp.clickloginButton();
		
		Alert alt = eu.waitForAlertPresent(10);
		String actualAlertText= alt.getText();
		System.out.println("Alert = " + actualAlertText);
		alt.accept();
		
		assertEquals(actualAlertText, expectedAlertText, 
		        "Alert message mismatch for invalid recruiter login");
		
	}
	

}
