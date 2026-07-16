package com.qa_002_registrationForm;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotaion.TestCaseId;
import com.qa.pages.P0001_RegistrationPage;
import com.qa_001_baseTest.B001_BaseTestBeforeLogin;

public class TC001_VerifyWithAddAllValidData extends B001_BaseTestBeforeLogin
{
	P0001_RegistrationPage rp = new P0001_RegistrationPage();
	private final String firstname = "Shubham";
	private final String lastName = "Shubham";
	private final String email = "Shubham_" + System.currentTimeMillis() + "@yopmail.com";
	private final String telephone = "84213333";
	private final String password = "123456";
	private final String confPassowrd = "123456";
	private final String actualText = "Your Account Has Been Created!";
	
	@TestCaseId("TC001")
	@Test
	public void verifyRegistrationWithValidData()
	{
		rp.addFirstName(firstname);
		rp.addLastName(lastName);
		rp.addemail(email);
		rp.addTelephoneNum(telephone);
		rp.addPassword(password);
		rp.addConfirmPassowrd(confPassowrd);
		rp.selectSubscribeYesCheckBox();
		rp.selectPrivacyCheckBox();
		rp.clickContinueButton();
		
		Assert.assertEquals(actualText, "Your Account Has Been Created!");
	}

}
