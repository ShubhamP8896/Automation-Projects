package myPractice_2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsUtility_Practice 
{
	public WebDriver getDriver()
	{		
		return DriverFactory_Practice.getDriver();
	}
	
	public WebElement getSingleElement(By locator)
	{
		return getDriver().findElement(locator);
	}
	
	public List<WebElement> getMultipleElements(By locator)
	{
		return getDriver().findElements(locator);
	}
	
	public void doClick(By locator)
	{
		getSingleElement(locator).click();
	}
	
	public void addInput(By locator, String value)
	{
		getSingleElement(locator).sendKeys(value);
	}
	
	public void doClear(By locator)
	{
		getSingleElement(locator).clear();
	}
	
	
	
///	Alerts Handle
	public Alert alertHandle()
	{
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public void clickAndAcceptAlert(By locator) 
	{
	    doClick(locator);
	    alertHandle().accept();
	}

	public void acceptAlert() 
	{
	    alertHandle().accept();
	}

	public void dismissAlert()
	{
	    alertHandle().dismiss();
	}

	public String getAlertText() 
	{
	    return alertHandle().getText();
	}

	public void sendAlertInput(String value) 
	{
	    alertHandle().sendKeys(value);
	}
	
///	 Frames
	public void switchToFrameByLocator(By locator)
	{
	    getDriver().switchTo().frame(getSingleElement(locator));
	}

	public void switchToFrameByNameId(String nameOrId)
	{
	    getDriver().switchTo().frame(nameOrId);
	}

	public void switchToFrameByIndex(int index) 
	{
	    getDriver().switchTo().frame(index);
	}

	public void switchToDefaultContent() 
	{
	    getDriver().switchTo().defaultContent();
	}

}
