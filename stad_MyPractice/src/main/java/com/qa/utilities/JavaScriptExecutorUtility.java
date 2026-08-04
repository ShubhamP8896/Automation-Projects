package com.qa.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.driverFactory.DriverFactory;

public final class JavaScriptExecutorUtility
{
	private WebDriver getDriver() 
	{
        return DriverFactory.getDriver();
    }
	
	private JavascriptExecutor getJsExecutor()
	{
		return (JavascriptExecutor) getDriver();
	}
		
/// javascriptexecutor interface methods : Below all the methods using the java script executor
//	1. GetTile (Get page title) > Same available in the selenium also  :: Store this in the string
	public String getTitleUsingJs()
	{
		return getJsExecutor().executeScript("return document.title").toString();
	}
//	2. Get the WebElement and send the value/perform the action :: Same like selenium methods
///here multiple methods for using class name.. tag name.. and the name attributes  >> Those are not created, id needed the create below		
	public void setValueById(String id, String value)
	{
		getJsExecutor().executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}
///Generic methods  : we are used this if there is no forward and backward for the browser level then we able to use this
//1 : Forward, -1: Backward and 0 Refresh the page
	public void forwardBackRelodeJsScript(int number)
	{
		getJsExecutor().executeScript("history.go("+number+")");
	}	
/// Click on the element 		
	public void clickUsingJs(WebElement element_name)
	{
		getJsExecutor().executeScript("arguments[0].click()",element_name);
	}
///	Draw the red border where we are doing any action.		
	public void highlightElement(WebElement element_name)
	{
		getJsExecutor().executeScript("arguments[0].style.border='3px solid red'", element_name); 
	}

	/**
	 * Below all the Methods which we are using for the Scrolling
	 */
//	1. ScrollBy()  :- Continuous relative scrolling (Add values in negative if want to goto bottom to up for Y axis and right to left for x axis)
	public void scrollBy(int xPixel , int yPixel)
	{
		getJsExecutor().executeScript("window.scrollBy("+xPixel+"," +yPixel+")");
	}

//	2. ScrollTo() :- Absolute Scrolling from 0,0 (Add values in negative if want to goto bottom to up for Y axis and right to left for x axis)
	public void scrollTo(int xPixel , int yPixel)
	{
		getJsExecutor().executeScript("window.scrollTo("+xPixel+"," +yPixel+")");
	}
	
//	3. Up to Bottom of the page 
	public void scrollToBottom(int xPixel)
	{
		getJsExecutor().executeScript("window.scrollTo("+xPixel+",document.body.scrollHeight)");
	}
	
//	4. Bottom to Up of the page 
	public void scrollToTop(int yPixel)
	{
		getJsExecutor().executeScript("window.scrollTo(document.body.scrollHeight ,"+yPixel+")");
	}
	
//	Up to the specific WebElement
	public void scrollIntoView(WebElement elementName)
	{
		getJsExecutor().executeScript("arguments[0].scrollIntoView(true)" , elementName);
	}
	
//	Get the InnerText (All the text present on the WebPage) : Sanity check: the webElement is present on the WebPage or not
	public String getInnerTextJsScript()
	{
		return getJsExecutor().executeScript("return document.documentElement.innerText").toString();
	}
	
}
