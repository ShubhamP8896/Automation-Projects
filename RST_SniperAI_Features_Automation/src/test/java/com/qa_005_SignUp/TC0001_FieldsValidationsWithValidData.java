package com.qa_005_SignUp;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.pages.P0002_SignupPage;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC0001_FieldsValidationsWithValidData extends A001_BaseTest_BeforeLogin
{
	P0001_LoginPage lp = new P0001_LoginPage();
	P0002_SignupPage sup = new P0002_SignupPage();
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu = new ElementsUtility();
	private String expectedAlertMsg = "Please verify captcha";
	
	@TestCaseId("TC_001")
	@Test
	public void verifyInputFields()
	{
		lp.clickSignup();
		String currentPageURL = bu.getCurrentPageURL();
		System.out.println("Current Page URL: " + currentPageURL);
		
		sup.addCandidateName("shubham");
		sup.addCandidateEmail("shubham.p8896@yopmail.com");
		sup.addCandidatePassword("shub@123");
		sup.addCandidateConfPassword("shub@123");
		sup.clickTerms();
		sup.clickCreateAccountButton();
		
//		We are not able to verify the captcha so we are not able to signUp so we just added all the 
//		fields and select the check boxes on that basis we verify the fields
		
		Alert alt = eu.waitForAlertPresent(5);
		String actualAlertMsg = alt.getText();
		alt.accept();
		Assert.assertEquals(expectedAlertMsg, actualAlertMsg);		
		
	}

}
