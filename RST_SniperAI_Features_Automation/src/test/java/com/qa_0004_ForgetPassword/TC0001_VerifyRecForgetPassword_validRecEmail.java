package com.qa_0004_ForgetPassword;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ConfigReader;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0001_VerifyRecForgetPassword_validRecEmail extends A001_BaseTest_BeforeLogin
{
	
	private static String recValidUsername = ConfigReader.getProperty("recValidUsername");
	private static String successMessage = "Thank you, a password reset link is sent to your registered email address";
	P0001_LoginPage lp = new P0001_LoginPage();
	
	@TestCaseId("TC_001")
	@Test
	public void forgotPasswordValidCred()
	{
		lp.selectUserTypeRecruiter();
		lp.clickForgetPassowrd();
		lp.addForgetPasswordEmail(recValidUsername);
		lp.clickResetPasswordButton();
		String forgetPasswordSuccessMsg = lp.getforgotPasswordSuccessMsg();
		System.out.println(forgetPasswordSuccessMsg);
		
		Assert.assertTrue(forgetPasswordSuccessMsg.contains(successMessage));
	}

}
