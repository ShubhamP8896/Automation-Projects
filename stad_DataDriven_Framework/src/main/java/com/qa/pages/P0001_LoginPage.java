package com.qa.pages;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.ElementsUtility;

public class P0001_LoginPage
{
	ElementsUtility eu = new ElementsUtility();
	private By userName = By.cssSelector("input[name='email']");
	public void addUserName(String uName)
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(userName));
		eu.addInput(userName, uName);
	}
	
	private By password = By.cssSelector("#input-password");
	public void addPassword(String pass)
	{
		Wait<WebDriver> wait = new FluentWait<WebDriver>(DriverFactory.getDriver())
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class)
				.withMessage("Element Not Found");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(password));
		eu.addInput(password, pass);
	}
	
		

}