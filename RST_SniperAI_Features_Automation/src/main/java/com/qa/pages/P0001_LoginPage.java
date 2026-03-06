package com.qa.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;

public class P0001_LoginPage
{
	ElementsUtility eu = new ElementsUtility();
	BrowserUtility bu = new BrowserUtility();
	
	private By userName = By.xpath("//input [@id='user_email']");
	public void addUsername(String emailID)
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		eu.addInput(userName, emailID);
	}
	
	private By password = By.xpath("//input [@id='user_password']");
	public void addPassword(String pass)
	{
		eu.addInput(password, pass);
	}
	
	private By userTypeRecruiter = By.xpath("//input [@value='0']");
	public void selectUserTypeRecruiter()
	{
		eu.doClick(userTypeRecruiter);
		System.out.println("Selected Recruiter checkbox");
	}
	
	private By userTypeCandidate = By.xpath("//input [@value='1']");
	public void selectUserTypeCandidate()
	{
		eu.doClick(userTypeCandidate);
		System.out.println("Selected Candidate checkbox");
	}
	
	private By rememberMe = By.xpath("//div [@id='checkator_rememberme']");
	public void clickRememberMe()
	{
		eu.doClick(rememberMe);
		System.out.println("Selected Remember me checbox");
	}
	
	private By loginButton = By.xpath("//input [@id='login']");
	public void clickloginButton()
	{
		eu.doClick(loginButton);
		System.out.println("Clicked on the login button");
	}
	
	private By forgotPassword = By.xpath("//a  [text() = ' Forgot password?']");
	public void clickForgetPassowrd()
	{
		eu.doClick(forgotPassword);
		System.out.println("Clicked on the forget password option");
	}
	
	private By emailInputForgetPass = By.xpath("//input [@id='fpemail']");
	public void addForgetPasswordEmail(String EmailId)
	{
		eu.addInput(emailInputForgetPass, EmailId);
		System.out.println("Added Email in the forget password Email Input");
	}
	
	private By forgotPasswordButton = By.xpath("(//input [@value='Reset password'])[1]");
	public void clickforgetPasswordButton()
	{
		eu.doClick(forgotPasswordButton);
		System.out.println("Clicked on the forget password button");
	}
	
	private By forgotPasswordSuccess = By.xpath("//div [@class='contentalrt']");
	public String getforgotPasswordSuccessMsg()
	{
		return eu.getElementText(forgotPasswordSuccess);
	}
	
	private By RSTLogo = By.xpath("//img [@class='header-image-config']");
	public void clickRSTLogo()
	{
		eu.doClick(RSTLogo);
		System.out.println("Clicked on the RST Logo");
	}
	
	private By jobOpenings = By.xpath("//a [text() = 'Job Openings']");
	public void clickJobOpenings()
	{
		eu.doClick(jobOpenings);
		System.out.println("Clicked on the Job Openings");
	}
	
	private By signUp = By.xpath("//a [text() = 'Sign up']");
	public void clickSignup()
	{
		eu.doClick(signUp);
		System.out.println("Clicked on the SignUp");
	}
	
	private By terms = By.xpath("//a [text() = 'Terms']");
	public void clickTerms()
	{
		eu.doClick(terms);
		System.out.println("Clicked on the terms");
	}
	
	private By socialMediaIcons = By.xpath("//a  [@class = 'social-btn']");
	public void verifySocialMediaLinks(String parentWindow)
	{
		List <WebElement> socialMedialist = DriverFactory.getDriver().findElements(socialMediaIcons);
		WebDriver driver = DriverFactory.getDriver();
		for(WebElement socialMedia : socialMedialist)
		{
			socialMedia.click();
			List<String> list = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(list.get(1));
			System.out.println("Social Media URL: " + bu.getCurrentPageURL());
			driver.close();
			driver.switchTo().window(parentWindow);
		}
	}
	
	private By loginForm = By.xpath("//div[@class='login-card login-card-config']");
	public String loginForm()
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginForm));
		return eu.getAttributeValue(loginForm, "class");
	}
	
	private By helpMe = By.id("popup");
	public void clickHelpMe()
	{
		eu.doClick(helpMe);
		System.out.println("Clicked on the HelpMe Option");
	}
	
	private By FeebBackEmail = By.id("feedback_email");
	public void addFeedbackEmail(String emailID)
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(FeebBackEmail));
		eu.addInput(FeebBackEmail, emailID);
		System.out.println("Feedback EMail added : " + emailID);
	}
	
	private By feedbackInput = By.id("feedback_desc");
	public void addFeedbackMessage(String message)
	{
		eu.addInput(feedbackInput, message);
		System.out.println("Feedback Message added : " + message);
	}
	
	private By sendFeedbackButton = By.xpath("//input[@name='feedback_send']");
	public String clickSendFeedbackButton()
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		eu.doClick(sendFeedbackButton);
		System.out.println("Clicked on the Send Feedback Button");
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt = DriverFactory.getDriver().switchTo().alert();
		String alertText = alt.getText();
		alt.accept();
		return alertText;
	}
	
	
	
	
	
	
}
