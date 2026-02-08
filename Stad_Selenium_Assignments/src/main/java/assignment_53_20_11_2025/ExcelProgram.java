package assignment_53_20_11_2025;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelProgram
{
	WebDriver driver;
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu;	
	String userName;
	String passWord;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	FileOutputStream fos;
	String path = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\screenshots\\Automation.xlsx";
	TakeScreenshotUtility ts;
	
	@BeforeMethod
	public void setUp()
	{
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		eu = new ElementsUtility(driver);
		ts = new TakeScreenshotUtility(driver);
	}
	
	@Test
	public void login()
	{
		By userNmae = By.cssSelector("#input-email");
		By password = By.cssSelector("#input-password");
		By loginButton = By.xpath("//input[@value='Login']");
		By logOut = By.xpath("(//a[text()='Logout'])[2]");
		By loginOption = By.xpath("(//a[text()='Login'])[2]");
		
		try 
		{
			fis = new FileInputStream(path);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("NaveenCred");
			
			for(int i = 1; i <= sheet.getLastRowNum(); i++)
			{
				row = sheet.getRow(i);
				userName = row.getCell(1).getStringCellValue();
				passWord = row.getCell(2).getStringCellValue();
				
				eu.doClear(userNmae);
				eu.doClear(password);
				
				eu.addInput(userNmae, userName);
				eu.addInput(password, passWord);
				eu.doClick(loginButton);
				String actualUrl = bu.getCurrentPageURL();
				String expectedUrl = "https://naveenautomationlabs.com/opencart/index.php?route=account/account";
				cell = row.createCell(3);
				if(actualUrl.equals(expectedUrl))
				{
					ts.takeScreenshots("Pass" + i);
					cell.setCellValue("Passed");
					eu.doClick(logOut);
					eu.doClick(loginOption);
				}
				else
				{
					ts.takeScreenshots("Failed" + i);
					cell.setCellValue("Failed");
				}
			}
			fos = new FileOutputStream(path);
			wb.write(fos);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void tearDown()
	{
		try 
		{
			if (wb != null) wb.close();
			if (fis != null) fis.close();
			if (fos != null) fos.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		bu.quitBrowser();
	}

}