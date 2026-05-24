package com.qa_002_registrationForm;

import org.testng.annotations.Test;

import com.qa.pages.P001_RegistrationPage;
import com.qa_001_baseTest.B0001_BeforeLoginBaseTest;

public class T0001_VerifyRegistrationForm extends B0001_BeforeLoginBaseTest
{
	P001_RegistrationPage rp = new P001_RegistrationPage();
	
	@Test
	public void verifyRegistration()
	{
		rp.enterFirstName("Shubham");
		rp.enterLastName("Pawar");
		rp.enterEmailID("shubham.p88@yopmail.com");
		rp.enterTelephone("123666555");
		rp.enterPassowrd("shub@123");
	}
	

}
