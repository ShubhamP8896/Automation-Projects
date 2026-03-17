package com.qa_0004_ForgetPassword;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0005_VerifyCanForgetPassword_validCanEmail extends A001_BaseTest_BeforeLogin
{
	
	private static String candidateUsername = ConfigReader.getProperty("canValidUsername");
	private static String successMsg = "Thank you, a password reset link is sent to your registered email address";
	P0001_LoginPage lp = new P0001_LoginPage();
	
	@TestCaseId("TC_005")
	@Test
	public void forgotPasswordValidCred()
	{
		lp.selectUserTypeCandidate();
		lp.clickForgetPassowrd();
		lp.addForgetPasswordEmail(candidateUsername);
		lp.clickResetPasswordButton();
		String forgetPassSuccessMsg = lp.getforgotPasswordSuccessMsg();
		System.out.println("Forget Password success Message: " + forgetPassSuccessMsg);
		
		Assert.assertTrue(forgetPassSuccessMsg.contains(successMsg));
		
	}

}
