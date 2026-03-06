package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;

public class P0002_SignupPage
{
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu = new ElementsUtility();
	
	private By signUpForm = By.xpath("//div[@class='login-card login-card-config']");
	
	public String signUpForm()
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(signUpForm));
		return eu.getAttributeValue(signUpForm, "class");
	}

}
