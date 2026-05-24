package com.qa.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.driverFactory.DriverFactory;

public class ElementsUtility 
{
	public WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
	public WebElement getSingleElement(By Locator)
	{
		return getDriver().findElement(Locator);
	}
	
	public List<WebElement> getMultipleElements(By locator)
	{
		return getDriver().findElements(locator);
	}
	
	public void addInput(String Value, By locator)
	{
		getSingleElement(locator).sendKeys(Value);
	}
	
	public void doClick(By locator)
	{
		getSingleElement(locator).click();
	}
	
	public void doClear(By locator)
	{
		getSingleElement(locator).clear();
	}
	
	public String getText(By locator)
	{
		return getSingleElement(locator).getText();
	}

	public String getTagName(By locator)
	{
		return getSingleElement(locator).getTagName();
	}
	 
	public String getAttribute(By locator, String attributeName)
	{
		return getSingleElement(locator).getAttribute(attributeName);
	}
	
	
	
}
