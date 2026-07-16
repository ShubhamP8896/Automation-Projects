package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;

public class P0001_RegistrationPage 
{
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu = new ElementsUtility();
	
	private By firstName = By.cssSelector("#input-firstname");
	public void addFirstName(String fName)
	{
		eu.addInput(firstName, fName);
		System.out.println("First Name: " + fName + " added successfully");
	}
	
	private By lastName = By.cssSelector("#input-lastname");
	public void addLastName(String lName)
	{
		eu.addInput(lastName, lName);
		System.out.println("Last Name: " + lName + " added successfully");
	}
	
	private By email = By.cssSelector("input[id='input-email']");
	public void addemail(String emailId)
	{
		eu.addInput(email, emailId);
		System.out.println("email: " + emailId + " added successfully");
	}
	
	private By telephone = By.cssSelector("input[id='input-telephone'][name='telephone']");
	public void addTelephoneNum(String telephoneNumber)
	{
		eu.addInput(telephone, telephoneNumber);
		System.out.println("Telephone: " + telephoneNumber + " added successfully");
	}
	
	private By password = By.cssSelector("#input-password");
	public void addPassword(String pass)
	{
		eu.addInput(password, pass);
	}
	
	private By confirmPassword = By.cssSelector("#input-confirm");
	public void addConfirmPassowrd(String confirmPass)
	{
		eu.addInput(confirmPassword, confirmPass);
	}
	
	private By subscribeCheckBoxYes = By.xpath("//input[@type='radio' and @value='1' and @name='newsletter']");
	public void selectSubscribeYesCheckBox()
	{
		eu.doClick(subscribeCheckBoxYes);
	}
	
	private By subscribeCheckBoxNo = By.xpath("//input[@type='radio' and @value='0' and @name='newsletter']");
	public void selectSubscribeNoCheckBox()
	{
		eu.doClick(subscribeCheckBoxNo);
	}
	
	private By privacyCheckBox = By.xpath("//input[@type='checkbox' and @value='1' and @name='agree']");
	public void selectPrivacyCheckBox()
	{
		eu.doClick(privacyCheckBox);
	}
	
	private By continueButton = By.xpath("//input[@type='submit' and @value='Continue']");
	public void clickContinueButton()
	{
		eu.doClick(continueButton);
	}
}
