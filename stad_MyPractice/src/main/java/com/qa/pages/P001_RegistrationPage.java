package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.ElementsUtility;

public class P001_RegistrationPage 
{
	
	ElementsUtility eu = new ElementsUtility();
	
	
	public WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
	private By firstName = By.id("input-firstname");
	public void enterFirstName(String fName)
	{
		eu.addInput(fName, firstName);
	}
	
	private By lastname = By.id("input-lastname");
	public void enterLastName(String lName)
	{
		eu.addInput(lName, lastname);
	}
	
	private By email = By.id("input-email");
	public void enterEmailID(String emailId)
	{
		eu.addInput(emailId, email);
	}
	
	private By telephone = By.id("input-telephone");
	public void enterTelephone(String telephoneNo)
	{
		eu.addInput(telephoneNo, telephone);
	}
	
	private By password = By.id("input-password");
	public void enterPassowrd(String pass)
	{
		eu.addInput(pass, password);
	}
	
	private By confPassword = By.id("input-confirm");
	
	
	private By yesCheckbox = By.xpath("(//input[@value='1' and @type='radio'])[2]");
	
	
	private By noCheckBox = By.xpath("//input[@value='0' and @type='radio']");
	
	
	private By privacyPolicyCheckbox = By.xpath("//input[@value='1' and @name='agree']");
	
	
	private By continueButton = By.xpath("//input[@value='Continue']");

}
