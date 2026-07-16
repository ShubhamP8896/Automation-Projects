package com.qa.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.driverFactory.DriverFactory;

public class ElementsUtility 
{
	public WebDriver getDriver()
	{
		WebDriver driver = DriverFactory.getDriver();
		if(driver == null)
		{
			throw new ExceptionUtility("WebDriver is not initialized. Please launch the browser first.");
		}
		
		return driver;
	}
	
	public WebElement getElement(By locator)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public List<WebElement> getElements(By locator)
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
	public void addInput(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public void doClear(By locator)
	{
		getElement(locator).clear();
	}
	

}
