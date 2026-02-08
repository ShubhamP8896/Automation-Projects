package assignment_4_15_10_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsUtility 
{
//	By Locator + Generic function of getElement for find webElement + SendKeys Generic function + Element Utility Class
	
	/**
	 * We created constructor here in this class and we are creating the object is test class and passing the driver in argument because
	 * we have to use the same driver in browser utility, ElementUtility and Test class
	 * 
	 * 1) In the Browser utility class return the driver with launchURL method and use WebDriver as return type of this method
	 * 2) In the Element Utility create the constructor and pass the WebDriver driver in argument.
	 * 3) In the test class captured the return driver from Browser utilit class :: webDriver driver = butil.launchbrowser("chrome");
	 * 4) Create object of the Element utility class and pass the driver in the Argument
	 */
	
	WebDriver driver;
	
	   // ✅ Constructor   : it is because we have to use the same driver who having same session ID.
    public ElementsUtility(WebDriver driver) 
    {
        this.driver = driver;
    }
//	To Find the Web Element
	public WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
//	To Find the List<WebElement>
	public List <WebElement> getElements(By locator)
	{
		return driver.findElements(locator);	
	}
//	Method To Print the Web Elements Text 
	public void doGetTextList(By locator)
	{
		List<WebElement> linkList = getElements(locator);
		System.out.println("Number of WebElements :" + linkList.size());
		System.out.println("Below is the List of WebElements :");
		for(WebElement lists : linkList)
		{
			if(lists.getText().isBlank())
			{
				continue;
			}
			else
			{
				System.out.println(lists.getText());
			}	
		}
	}
	
//	Method To Print the Web Elements Links (Attribute Value of href)
	public void doGetLinksList(By locator, String attributeName)
	{
		List<WebElement> linkList = getElements(locator);
		System.out.println("Number of Links :" + linkList.size());
		System.out.println("Below is the List of WebElements Links :");
		for(WebElement lists : linkList)
		{
			if(lists.getAttribute(attributeName).isBlank())
			{
				continue;
			}
			else
			{
				System.out.println(lists.getAttribute(attributeName));
			}	
		}
	}
	
//	TO add inputs in the text field
	public void addInput(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}
//	To click on the web Element
	public void doClick(By locator)
	{
		getElement(locator).click();
	}
//	To clean the WebElement text arear
	public void doClear(By locator)
	{
		getElement(locator).clear();
	}
//	Get the text value of the element
	public String getElementText(By locator)
	{
		return getElement(locator).getText();
	}
//	Get the Attribute value of the attribute
	public String getAttributeValue(By locator, String AttributeName)
	{
		return getElement(locator).getAttribute(AttributeName);
	}
//	Get the Tag name of that web Element
	public String getTagName(By locator)
	{
		return getElement(locator).getTagName();
	}
//	that web element is displayed or not
	public boolean is_Displayed(By locator)
	{
		return getElement(locator).isDisplayed();
	}
//	Web Element is selected or not (for checkboxes, radio buttons)
	public boolean is_Selected(By locator)
	{
		return getElement(locator).isSelected();
	}
//	Web element is enabled or not (Button, text field, links ..etc)
	public boolean is_Enabled(By locator)
	{
		return getElement(locator).isEnabled();
	}
	
	
}
