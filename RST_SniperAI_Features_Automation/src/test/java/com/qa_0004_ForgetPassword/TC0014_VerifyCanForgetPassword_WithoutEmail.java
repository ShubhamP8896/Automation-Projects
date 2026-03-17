package com.qa_0004_ForgetPassword;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0014_VerifyCanForgetPassword_WithoutEmail extends A001_BaseTest_BeforeLogin
{
	private static String expectedAlertMsg = "Please enter email address";
	P0001_LoginPage lp = new P0001_LoginPage();	
	ElementsUtility eu = new ElementsUtility();
	
	@TestCaseId("TC_014")
	@Test
	public void canForgetPassword_withoutEmail()
	{
		lp.selectUserTypeCandidate();
		lp.clickForgetPassowrd();
		lp.addForgetPasswordEmail("");
		lp.clickResetPasswordButton();
		Alert alt = eu.waitForAlertPresent(5);
		String actualAlertMsg = alt.getText();
		alt.accept();
		Assert.assertEquals(expectedAlertMsg, actualAlertMsg);		
	}
}
