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
	
	public WebElement getElement(By locator)
	{
		return getDriver().findElement(locator);
	}
	
	public List<WebElement> getElementList(By locator)
	{
		return getDriver().findElements(locator);
	}
	
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
	
	public void doClear(By locator)
	{
		getElement(locator).clear();
	}
	
	public void addInput(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	public String getText(By locator)
	{
		return getElement(locator).getText();
	}
	
	public String getAttributeValue(By locator, String attributeName)
	{
		return getElement(locator).getAttribute(attributeName);
	}
	
	public boolean isDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
	
	public boolean isEnabled(By locator)
	{
		return getElement(locator).isEnabled();
	}
	
	public boolean isSelected(By locator)
	{
		return getElement(locator).isSelected();
	}
	
}
