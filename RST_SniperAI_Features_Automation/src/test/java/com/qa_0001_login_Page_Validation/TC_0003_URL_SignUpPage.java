package com.qa_0001_login_Page_Validation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.pages.P0002_SignupPage;
import com.qa.utilities.BrowserUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC_0003_URL_SignUpPage extends A001_BaseTest_BeforeLogin
{
	BrowserUtility bu = new BrowserUtility();
	P0001_LoginPage lp = new P0001_LoginPage();
	P0002_SignupPage sup = new P0002_SignupPage();
	private final String signUpFormAV = "login-card login-card-config";
	
	@TestCaseId("TC_003")
	@Test
	public void verifySignupPageURL()
	{
		assertEquals(signUpFormAV , sup.signUpForm());
		System.out.println(sup.signUpForm() + ": SignUp form is present on the Sign Up page"); 	
	}

}
