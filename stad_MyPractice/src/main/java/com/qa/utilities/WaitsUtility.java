package com.qa.utilities;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.driverFactory.DriverFactory;

public final class WaitsUtility 
{
	private static final Logger logger = LogManager.getLogger(WaitsUtility.class);
	
	private WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
	private WebDriverWait getWebDriverWait()
	{
		return new WebDriverWait(getDriver(), Duration.ofSeconds(20));
	}
	
	public void implicitWait(int duration)
	{
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(duration));
	}
	
	public void waitForVisibilityOfElementLocated(By locator)
	{
		logger.info("Waiting for visibility of element: {}", locator);
		getWebDriverWait().until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public void waitForVisibilityOfElement(WebElement element)
	{
		getWebDriverWait().until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitPresenceOfElement(By locator, int duration)
	{
		
	}
	
	public void waitForAlert(int duration)
	{
		
	}
	
	
	
}
