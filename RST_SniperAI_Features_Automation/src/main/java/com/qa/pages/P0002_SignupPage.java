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
	
	private By candidateName = By.id("name");
	public void addCandidateName(String name)
	{
		eu.addInput(candidateName, name);
	}
	
	private By candidateEmail = By.id("email");
	public void addCandidateEmail(String emailId)
	{
		eu.addInput(candidateEmail, emailId);
	}
	
	private By candidatePassword = By.id("pass");
	public void addCandidatePassword(String password)
	{
		eu.addInput(candidatePassword, password);
	}
	
	private By candidateConfPassword = By.id("cpass");
	public void addCandidateConfPassword(String confPassword)
	{
		eu.addInput(candidateConfPassword, confPassword);
	}
	
	private By termsAndCond = By.id("checkator_agree");
	public void clickTerms()
	{
		eu.doClick(termsAndCond);
	}
	
	private By createAccountButton = By.id("create_btn");
	public void clickCreateAccountButton()
	{
		eu.doClick(createAccountButton);
	}
	
	private By alreadyHaveAccountLink = By.linkText("Already Signed Up?");
	public void clickAlreadyHaveAccount()
	{
		eu.doClick(alreadyHaveAccountLink);
	}
	
	private By activateAccountUI = By.id("userexistpopup");
	public void clickActivateAccount()
	{
		eu.doClick(activateAccountUI);
	}
	
	private By activateAccountWindow = By.id("userexistpopup");
	public void clickActivateAccountWindow()
	{
		eu.doClick(activateAccountWindow);
	}
	
	private By activateAccountEmailField = By.id("activate-email");
	public void addEmailForActivation(String email)
	{
		eu.addInput(activateAccountEmailField, email);
	}
}
