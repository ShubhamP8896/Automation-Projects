package com.qa_0002_RecruiterLogin;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import com.qa.annotaions.TestCaseId;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC_0007_VerifyRecLogin_withoutCred extends A001_BaseTest_BeforeLogin
{
	P0001_LoginPage lp = new P0001_LoginPage();
	ElementsUtility eu = new ElementsUtility();
	String expectedAlertText = "Please enter email address";
	
	@TestCaseId("TC_007")
	@Test
	public void recLoginWithoutCred()
	{
		lp.addUsername("");
		lp.addPassword("");
		lp.selectUserTypeRecruiter();
		lp.clickRememberMe();
		lp.clickloginButton();
		
		Alert alt = eu.waitForAlertPresent(10);
		String actualAlertText= alt.getText();
		System.out.println("Alert = " + actualAlertText);
		assertEquals(actualAlertText, expectedAlertText, 
		        "Alert message mismatch for invalid recruiter login");
		alt.accept();
	}
	
	

}
