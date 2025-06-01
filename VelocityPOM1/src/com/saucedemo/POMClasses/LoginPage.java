package com.saucedemo.POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage                                   // Session - 50
{
//	WebElements :- Username, Password, Login button

//	1} Web Driver Declared
	private WebDriver driver;
	
//	2} Find the webElements {@ >> Annotation) :: We are using @ with shorcut of find elements 
//	Username
	@FindBy (xpath = "((//input[@class='input_error form_input'])[1])")
	private WebElement UserName;
	
//	Password
	@FindBy (xpath = "((//input[@class='input_error form_input'])[2])")
	private WebElement Password;
	
//	LoginButton 
	@FindBy (xpath = "(//input [contains(@class, 'submit-button btn_action')])")
	private WebElement LoginButton;
	
//	3) Create Constructor
	
	public LoginPage(WebDriver driver)
	{
//			Globel    Local
		this.driver = driver;		
		
//		Selenium Class  --- > Initiate Elements
		PageFactory.initElements(driver, this);
	}

	
//	4) Action Perform on elements
	
	public void SendUsername()
	{
		UserName.sendKeys("standard_user");
	}
	
	public void SendPassword()
	{
		Password.sendKeys("secret_sauce");
	}

	public void LoginButtonClick()
	{
		LoginButton.click();
	}
	
	

}
