package com.pages;

import org.openqa.selenium.By;
import com.qa.util.ElementsUtility;

public class LoginPage 
{
	ElementsUtility eu = new ElementsUtility();
	private By emailID = By.id("input-email");
	private By password = By.id("input-password");
	private By loginButton = By.xpath("//input[@value='Login']");
	
	public void enterUserName(String username)
	{
		eu.addInput(emailID, username);
	}
	
	public void enterPassword(String pwd)
	{
		eu.addInput(password, pwd);
	}
	
	public void clickOnLogin()
	{
		eu.doClick(loginButton);
	}
	
}
