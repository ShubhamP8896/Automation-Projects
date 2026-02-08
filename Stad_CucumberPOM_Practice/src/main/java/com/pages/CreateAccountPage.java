package com.pages;

import org.openqa.selenium.By;

import com.qa.util.ElementsUtility;

public class CreateAccountPage 
{
	private By fName = By.xpath("//input[@id='input-firstname']");
	private By lName = By.xpath("//input[@id='input-lastname']");
	private By emailId = By.xpath("//input[@id='input-email']");
	private By telephoneNo = By.xpath("//input[@id='input-telephone']");
	private By pass = By.xpath("//input[@id='input-password']");
	private By cmfPass = By.xpath("//input[@id='input-confirm']");
	private By checkBox = By.xpath("//input[@type='checkbox']");
	private By continueButton = By.xpath("//input[@type='submit']");
	
	ElementsUtility eu = new ElementsUtility();
	
	public void addFirstName(String firstName)
	{
		eu.addInput(fName, firstName);
	}
	
	public void addLastName(String lastName)
	{
		eu.addInput(lName, lastName);
	}
	
	public void emailID(String email)
	{
		eu.addInput(emailId, email);
	}
	
	public void telePhone(String phoneNo)
	{
		eu.addInput(telephoneNo, phoneNo);
	}
	
	public void password(String password)
	{
		eu.addInput(pass, password);
	}
	
	public void cnfPassword(String confPassword)
	{
		eu.addInput(cmfPass, confPassword);
	}
	
	public void clickCheckbox()
	{
		eu.doClick(checkBox);
	}
	
	public void clickContinue()
	{
		eu.doClick(continueButton);
	}
}
