package day57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

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
	
//	Generic method to click on the single given Element from multiple elements with get Text
	public void doClickListElement(By locator, String value)
	{   boolean flag = false;
		List<WebElement> linkList = getElements(locator);
		for(WebElement lists : linkList)
		{
			if(lists.getText().equals(value))
			{
				lists.click();
				System.out.println("Clicked on the Element : " + value);
				flag = true;
				break;
			}	
		}
		if(flag == false)
		{
			System.out.println(value + " This given Element is not found");
		}
	}
	/**
	 * 
	 * @param locator
	 * @param value >> We provide when we call this method for selection of items from the dropdown
	 * 
	 * We are able to use for single String and Array of String because we provide "String...Value"
	 * >> ... means it will provide us that flexibility to add the String and String array as well
	 * 
	 * this method is work for
	 * 1) Single Selection
	 * 2) Multiple selection
	 * 3) All Selection
	 * 4) Blank
	 *
	 */
	
	public void doClickListElements(By locator, String... value)
	{   boolean flag = false;
		List<WebElement> linkList = getElements(locator);
		for(WebElement lists : linkList)
		{	
			if (!lists.getText().equals(""))
			{
				for(int i = 0; i<value.length; i++)
				{
					if(value[0].equalsIgnoreCase("all"))
					{
						lists.click();
						flag = true;
					}
					else
					{
						if(lists.getText().equals(value[i]))
						{
							lists.click();
							flag = true;	
						}
					}
				}
			}
		}
		if(flag == false)
		{
			System.out.println("This given Element is not found");
		}
		else
		{
			System.out.println("Selected the given Options");
		}
	}
	
//	Method To Print the Web Elements Links (Attribute Value of href)
	public void doGetAttributesList(By locator, String attributeName)
	{
		List<WebElement> linkList = getElements(locator);
		System.out.println("Count :" + linkList.size());
		System.out.println("Below is the List :");
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
//	Generic method to click on the given Element from multiple elements with get attribute
	public void doClickLinkElement(By locator, String attributeName, String value)
	{ 	boolean flag = false;
		List<WebElement> linkList = getElements(locator);
		for(WebElement lists : linkList)
		{
			if(lists.getText().equals(value))
			{
				lists.click();
				System.out.println("Clicked on the Element : " + value);
				flag = true;
				break;
			}	
		}
		if(flag == false)
		{
			System.out.println(value + " This given Element is not found");
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
	
	/**
	 * Select Class (Selenium class) Methods
	 * 
	 * DropDown Methods to select the values from the drop down
	 * 1) Select by index
	 * 2) Select By Value
	 * 3) Select By visible text
	 * So in the method we passed the locator and required things as per method and in the Select class argument we passed the GetElement method with locator
	 * 4) Print the options list
	 * 5) Click on the given option 
	 */
	public void selectByIndex(By locator, int index)
	{
		Select si = new Select(getElement(locator));
		si.selectByIndex(index);
		System.out.println("Selected the option from dropdown as per Index : " + index);
	}
	public void selectByValue(By locator, String Value)
	{
		Select si = new Select(getElement(locator));
		si.selectByValue(Value);
		System.out.println("Selected the option from dropdown as per Value : " + Value);
	}
	public void selectByVisibleText(By locator, String visibleText)
	{
		Select si = new Select(getElement(locator));
		si.selectByVisibleText(visibleText);
		System.out.println("Selected the option from dropdown as per visible text : " + visibleText);
	}
//	Print the drop down values using the Select class
	public void doGetOptionsList(By locator)
	{
		Select so = new Select(getElement(locator));
		List <WebElement> elementList = so.getOptions();
		System.out.println("Options count in dropdown : " +elementList.size() );
		System.out.println("Following are the options are available in the dropdown : ");
		for(WebElement element : elementList)
		{
			System.out.println(element.getText());
		}
	}
//	Click the drop down values using the Select class
	public void doClickOptionsList(By locator, String value)
	{	boolean flag = false;
		Select so = new Select(getElement(locator));
		List <WebElement> elementList = so.getOptions();
		for(WebElement element : elementList)
		{
			if(element.getText().equals(value))
			{
				element.click();
				System.out.println("Clicked on the Given Option : " + value);
				flag = true;
				break;
			}
		}
		if(flag == false)
		{
			System.out.println(value + " This given Element is not found");
		}
	}
	
//	----------------------------------------------------------------------
//	To store the text values in the Dynamic Array List
	
	public void doStoreLinksText(By locator)
	{
		List <WebElement> footerLinks = getElements(locator);
		List <String> LinksText = new ArrayList <String>();
		for(WebElement list : footerLinks)
		{
			String s = list.getText();
			LinksText.add(s);
//			System.out.println(s);  // use this if you want print list one by one
		}
		System.out.println(LinksText.size());
		System.out.println(LinksText);	          // print values in array
	}
	
//	----------------------------------------------------------------------
//	Generic method to know the WebElement is displayed or not without isDisplayed Method
	public boolean isDisplayedGeneric(By locator)
	{		
		if(getElements(locator).size() == 1)
		{
			System.out.println("Element is Displayed");
			return true;
		}
		else
		{
			System.out.println("Element is not Displayed");
			return false;
		}
	}
	/**
	 * In both below method it checked for multiple element exists or not but in 
	 * first method you does not know how many elements are present while on other hand in 
	 * second method you know the exact element present and checking whether this much amount of elements are presents or not.
	 */
//	to check multiple elements are present?
	public boolean isMultipleElementsExist(By locator)
	{
		if(getElements(locator).size()>=1)
		{
			System.out.println("Number of Elements Present : " +getElements(locator).size());
			return true;
		}
		else
		{
			System.out.println("Element is not Exist");
			return false;
		}
	}
//	2) Verify the count is same for number of element with giving the number
	public boolean isMultipleElementsExist(By locator, int countofElement)
	{
		if(getElements(locator).size() == countofElement)
		{
			System.out.println("Number of Elements Exist : " +getElements(locator).size() + " Count is matched");
			return true;
		}
		else
		{
			System.out.println("Elements count is not matched");
			return false;
		}
	}
	
	/**
	 * Actions class Generic Methods
	 * 1) We need to pass the locator in the argument
	 * 2) When we call the second method we need to pass the tagname then the name of the Element 
	 * 3) This is for the drag and drop
	 * 5) Send Keys 
	 * 6) Double click
	 * 7) Right Click
	 * 8) Click
	 */
	
	public void MouseAction(By locator)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(locator)).build().perform();		
	}
	
	public void MouseAction(String tagname, String GPMenu, String PMenue, String CMenu) throws InterruptedException
	{
//		We are able to add the variables in the Xpath as well
		By GP = By.xpath("(//"+tagname+"[text()='"+GPMenu+"'])[2]");
		By P = By.xpath("//"+tagname+"[text()='"+PMenue+"']");
		By C = By.xpath("//"+tagname+"[text()='"+CMenu+"']");
		
		Actions act = new Actions(driver);
		
		WebElement GPM = getElement(GP);
		act.moveToElement(GPM).build().perform();
		Thread.sleep(3000);
		WebElement PPM = getElement(P);
		act.moveToElement(PPM).build().perform();
		Thread.sleep(3000);
		WebElement CM = getElement(C);
		CM.click();
	}
//	3) Drag and drop with mouse
	public void dragAndDropActions(By locator1, By locator2)
	{
		WebElement drag = getElement(locator1);
		WebElement drop = getElement(locator2);
		
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();		
	}
//	4) SendKesy Using the actions class
	public void addInputActions(By locator, String text)
	{
		WebElement textBox = getElement(locator);
		Actions act = new Actions(driver);
		act.sendKeys(textBox, text).build().perform();
	}
//	5) Double Click
	public void doubleClick(By locator)
	{
		WebElement doubleClick = getElement(locator);
		Actions act = new Actions(driver);
		act.doubleClick(doubleClick).build().perform();
	}
//	6) Right Click
	public void rightClick(By locator)
	{
		WebElement rightClick = getElement(locator);
		Actions act = new Actions(driver);
		act.contextClick(rightClick).build().perform();
	}
//	7)Click on the Element
	public void doClickActions(By locator)
	{
		WebElement Click = getElement(locator);
		Actions act = new Actions(driver);
		act.click(Click).build().perform();		
	}
	
	/**
	 * All the Alerts methods
	 * 1) Accept the alert
	 * 2) Dismiss the Alert (Same like click on the Escape button) / click on the cancel button on the alert
	 * 3) Propt alert with Send keys
	 * 4) Authorization Alert
	 */
//	To accept the Alert
	public void acceptAlert(By locator)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
	}
//	To Dismiss the alert
	public void dismissAlert(By locator)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();
	}
//	Prompt Alert with Send Keys
	public void promptAlert(By locator, String text)
	{
		getElement(locator).click();
		Alert alt = driver.switchTo().alert();
		alt.sendKeys(text);
		System.out.println(alt.getText());
		alt.accept();
	}
//	Authorization Alert with send User name and Password in the URL
	public void authAlert(String URL)
	{
		driver.get(URL);
	}
	
	/**
	 * Generic method to upload the file on server
	 * in locator send the name of Choose file button and in the sendKeys send the path of the file
	 */
	public void uploadFile(By locator, String filePath)
	{
		getElement(locator).sendKeys(filePath);
	}
	
	/**
	 * Generic method basically used where we need to click on the links and open the new window
	 * (Used for verify the links of social media)
	 * We need to use the for each loop and in that loop we need to call this method and in argument need to pass
	 * the for each loop reference variable
	 */
	public void multipleWindow(WebElement element)
	{
		element.click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String pw = it.next();
		String cw = it.next();
		
		driver.switchTo().window(cw);
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(pw);
	}
	
///	Switch to Iframe methods used for the Switching from main window to frame using difference methods
	public void switchToFrameIndex(int index)
	{
		driver.switchTo().frame(index);
	}
	
	public void switchToFrameNameId(String nameId)
	{
		driver.switchTo().frame(nameId);
	}
	
	public void SwithToFrameByWebElement(WebElement webName)
	{
		driver.switchTo().frame(webName);
	}
	
///	 Below Method/function created for handel or perform action on the Element which is inside the shadow DOM Need to store that in WebElement

	public WebElement javaScriptExecutorM(String hostCss, String elementCss)
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    return (WebElement) js.executeScript(
	        "return document.querySelector(arguments[0]).shadowRoot.querySelector(arguments[1]);",
	        hostCss, elementCss
	    );
	}
	
	
}