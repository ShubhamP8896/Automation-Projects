package day48;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadAndDownload 
{
	static WebDriver driver;
	
//	Generic Method
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	public static void uploadFile(By locator, String filePath)
	{
		getElement(locator).sendKeys(filePath);
	}
	
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		By chooseFile = By.name("upfile");
		By pressButton = By.xpath("//input[@value='Press']");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
//		eu.addInput(chooseFile, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		uploadFile(chooseFile, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		eu.doClick(pressButton);
		
	}
}
