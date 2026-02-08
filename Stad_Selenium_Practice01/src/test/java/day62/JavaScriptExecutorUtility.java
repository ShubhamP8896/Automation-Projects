package day62;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorUtility 
{
	private WebDriver driver;
	
//	JavaScriptExecutorUtility class constructor
	
	public JavaScriptExecutorUtility(WebDriver driver)
	{
		this.driver = driver;
	}
		
/// javascriptexecutor interface methods : Below all the methods using the java script executor
//	1. GetTile (Get page title) > Same available in the selenium also  :: Store this in the string
	public String getTitleJsScript()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		return js.executeScript("return document.title").toString();
	}
//	2. Get the WebElement and send the value/perform the action :: Same like selenium methods
///here multiple methods for using class name.. tag name.. and the name attributes  >> Those are not created, id needed the create below		
	public void addInputByIDUsingJsScript(String id, String value)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('"+id+"').value='"+value+"'");
	}
///Generic methods  : we are used this if there is no forward and backward for the browser level then we able to use this
//1 : Forward, -1: Backward and 0 Refresh the page
	public void forwardBackRelodeJsScript(int number)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go("+number+")");
	}	
/// Click on the element 		
	public void doClickJsScript(WebElement element_name)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",element_name);
	}
///	Draw the red border where we are doing any action.		
	public void drawBorderJsScript(WebElement element_name)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border='3px solid red'", element_name); 
	}

	/**
	 * Below all the Methods which we are using for the Scrolling
	 */
//	1. ScrollBy()  :- Continuous relative scrolling (Add values in negative if want to goto bottom to up for Y axis and right to left for x axis)
	public void scrollByMethod(int xPixel , int yPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+xPixel+"," +yPixel+")");
	}

//	2. ScrollTo() :- Absolute Scrolling from 0,0 (Add values in negative if want to goto bottom to up for Y axis and right to left for x axis)
	public void scrollToMethod(int xPixel , int yPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+xPixel+"," +yPixel+")");
	}
	
//	3. Up to Bottom of the page 
	public void scrollUpToBottom(int xPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo("+xPixel+",document.body.scrollHeight)");
	}
	
//	4. Bottom to Up of the page 
	public void scrollBottomToUp(int yPixel)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight ,"+yPixel+")");
	}
	
//	Up to the specific WebElement
	public void scrollUpTOSpecificElement(WebElement elementName)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)" , elementName);
	}
	
//	Get the InnerText (All the text present on the WebPage) : Sanity check: the webElement is present on the WebPage or not
	public String getInnerTextJsScript()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript("return document.documentElement.innerText").toString();
	}
	

}
