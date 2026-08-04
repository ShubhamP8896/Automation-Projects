package com.qa.utilities;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.driverFactory.DriverFactory;

public final class ElementsUtility 
{
	private static final Logger logger = LogManager.getLogger(ElementsUtility.class);
	private final WaitsUtility waitsUtility = new WaitsUtility();
//	To get the Webdriver instance
	private WebDriver getDriver()
	{
		return DriverFactory.getDriver();
	}
	
//	To get WebElement
	public WebElement getElement(By locator)
	{
		waitsUtility.waitForVisibilityOfElementLocated(locator);
		return getDriver().findElement(locator);
	}
	
//	To get WebElements
	public List <WebElement> getElements(By locator)
	{
		waitsUtility.waitForVisibilityOfElementLocated(locator);
		return getDriver().findElements(locator);
	}
	
//	To adding the input into the field
	public void doSendKeys(By locator, String inputValue)
	{
		logger.info("Entering text into element: {}", locator);
		getElement(locator).sendKeys(inputValue);
	}
	
//	To click on the button
	public void doClick(By locator)
	{
		logger.info("Clicking on element: {}", locator);
		getElement(locator).click();
	}
	
//	To clear the input form the field
	public void doClear(By locator)
	{
		getElement(locator).clear();
	}
	
//	Whether the element is displayed
	public boolean isDisplayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
//	True if the element is enabled, false otherwise.
	public boolean isEnabled(By locator)
	{
		return getElement(locator).isEnabled();
	}
//	This operation only applies to input elements such as checkboxes, options in a select and radio buttons. 
	public boolean isSelected(By locator)
	{
		return getElement(locator).isSelected();
	}
	
//	get attribute of single webElement
	public String getAttributeValue(By locator, String attributeKey)
	{
		return getElement(locator).getAttribute(attributeKey);
	}
	
//	get tag name of single webElement
	public String getTagName(By locator)
	{
		return getElement(locator).getTagName();
	}
	
//	get text of single webElement
	public String getText(By locator)
	{
		return getElement(locator).getText();
	}
	
	/**
	 * Handle alerts: All the methods related to alerts
	 */
		
	
	/**
	 * All the methods related to Select class
	 */
	
	
	/**
	 * All the methods related to Actions class
	 */

}
