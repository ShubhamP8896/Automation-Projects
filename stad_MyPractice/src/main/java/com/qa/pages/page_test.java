package com.qa.pages;

import org.openqa.selenium.By;


public class page_test extends P_001_BasePage
{
	private final By firstname = By.id("input-firstname");
	public void addFirstName(String fName)
	{
		elementsUtility.doSendKeys(firstname, fName);
	}
	
	private final By lastname = By.id("input-lastname");
	public void addlastName(String lName)
	{
		elementsUtility.doSendKeys(lastname, lName);
	}
	
	private final By email = By.id("input-email");
	public void addEmailId(String emailId)
	{
		elementsUtility.doSendKeys(email, emailId);
	}
	
	private final By telephone = By.id("input-telephone");
	public void addTelephoneNumber(String telephoneNumber)
	{
		elementsUtility.doSendKeys(telephone, telephoneNumber);
	}

}
