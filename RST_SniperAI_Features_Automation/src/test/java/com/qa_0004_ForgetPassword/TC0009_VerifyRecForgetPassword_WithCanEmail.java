package com.qa_0004_ForgetPassword;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0009_VerifyRecForgetPassword_WithCanEmail extends A001_BaseTest_BeforeLogin
{
	private static String canValidEmail = ConfigReader.getProperty("canSecondaryEmail");
	private static String expectedAlertMsg = "Sorry your email address has not been recognised, please try again";
	P0001_LoginPage lp = new P0001_LoginPage();	
	ElementsUtility eu = new ElementsUtility();
	
	@TestCaseId("TC_009")
	@Test
	public void recForgetPassword_withCanEmail()
	{
		lp.selectUserTypeRecruiter();
		lp.clickForgetPassowrd();
		lp.addForgetPasswordEmail(canValidEmail);
		lp.clickResetPasswordButton();
		Alert alt = eu.waitForAlertPresent(5);
		String actualAlertMsg = alt.getText();
		alt.accept();
		Assert.assertEquals(expectedAlertMsg, actualAlertMsg);		
	}
	

}
