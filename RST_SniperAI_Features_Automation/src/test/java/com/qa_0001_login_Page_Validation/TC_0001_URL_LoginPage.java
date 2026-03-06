package com.qa_0001_login_Page_Validation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC_0001_URL_LoginPage extends A001_BaseTest_BeforeLogin
{
	P0001_LoginPage lp = new P0001_LoginPage();
	private final String loginFormAV = "login-card login-card-config";
	
	@TestCaseId("TC_001")      //custom annotation for dynamic row selection from the Excel Sheet
	@Test
	public void verifyLoginPage()
	{
		assertEquals(loginFormAV , lp.loginForm());
		System.out.println(lp.loginForm() + ": Login form is present on the login page");
	}
}
