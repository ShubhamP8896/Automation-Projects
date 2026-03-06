package com.qa_0001_login_Page_Validation;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.driverFactory.DriverFactory;
import com.qa.pages.P0001_LoginPage;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC_0005_URL_SocialMediaIcons extends A001_BaseTest_BeforeLogin
{
	P0001_LoginPage lp = new P0001_LoginPage();
	
	@TestCaseId("TC_005")
	@Test
	public void verifySocialMediaURL()
	{		
		WebDriver driver = DriverFactory.getDriver();
		String parentWindow = driver.getWindowHandle();
		lp.verifySocialMediaLinks(parentWindow);
		assertTrue(true);
	}

}
