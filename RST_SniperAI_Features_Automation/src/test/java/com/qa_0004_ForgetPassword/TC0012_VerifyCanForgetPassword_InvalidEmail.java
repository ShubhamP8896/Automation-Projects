package com.qa_0004_ForgetPassword;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0012_VerifyCanForgetPassword_InvalidEmail extends A001_BaseTest_BeforeLogin
{
	private static String canInValidUsername = ConfigReader.getProperty("canInValidUsername");
	private static String expectedAlertMsg = "Sorry your email address has not been recognised, please try again";
	P0001_LoginPage lp = new P0001_LoginPage();	
	ElementsUtility eu = new ElementsUtility();
	
	@TestCaseId("TC_012")
	@Test
	public void canForgetPassword_invalidEmail()
	{
		lp.selectUserTypeCandidate();
		lp.clickForgetPassowrd();
		lp.addForgetPasswordEmail(canInValidUsername);
		lp.clickResetPasswordButton();
		Alert alt = eu.waitForAlertPresent(5);
		String actualAlertMsg = alt.getText();
		alt.accept();
		Assert.assertEquals(expectedAlertMsg, actualAlertMsg);		
	}

}
