package com.qa_0001_login_Page_Validation;

import static org.testng.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qa.annotaions.TestCaseId;
import com.qa.driverFactory.DriverFactory;
import com.qa.pages.P0001_LoginPage;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;
import com.qa_0001_BaseTest.A001_BaseTest_BeforeLogin;

public class TC_0004_URL_TermsPage extends A001_BaseTest_BeforeLogin
{
	private By termsText = By.xpath("//h3[text()='Terms']");
	private static String actualTermsText = "Terms";
	P0001_LoginPage lp = new P0001_LoginPage();
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu = new ElementsUtility();
	
	@TestCaseId("TC_004")
	@Test
	public void verifyTermsPage()
	{
		WebDriver driver = DriverFactory.getDriver();
		String parentWindow = driver.getWindowHandle();
		lp.clickTerms();
		List<String> windowList = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowList.get(1));
		String expectedTermsText = eu.getElementText(termsText);
		System.out.println("Expected Terms text: "+ expectedTermsText);
		assertEquals(actualTermsText, expectedTermsText );
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(bu.getCurrentPageURL());
	}
	
	

}
