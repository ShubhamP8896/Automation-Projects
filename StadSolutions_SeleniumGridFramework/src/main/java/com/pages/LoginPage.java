package com.pages;

import org.openqa.selenium.By;
import com.qa.util.ElementsUtility;

public class LoginPage 
{
	ElementsUtility eu = new ElementsUtility();
	private By emailID = By.xpath("//input[@name='username']");
	private By password = By.xpath("//input[@name='password']");
	private By loginButton = By.xpath("//button[@type='submit']");
	
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
