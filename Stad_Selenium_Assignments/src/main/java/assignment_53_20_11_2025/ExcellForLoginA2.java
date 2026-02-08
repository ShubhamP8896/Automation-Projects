package assignment_53_20_11_2025;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ExcellForLoginA2 
{
	static String username;	
	static String password;
	static String path;
	static FileInputStream file;
	static Workbook wb;
	static Sheet sheet;
	static Row row;
	static Cell cell;
	
	public static void main(String[] args) throws IOException
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		try 
		{
			path = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\screenshots\\Automation.xlsx";
			file = new FileInputStream(path);
			wb = WorkbookFactory.create(file);
			sheet = wb.getSheet("NaveenCred");
			username = sheet.getRow(1).getCell(1).toString();	
			password = sheet.getRow(1).getCell(2).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		By uName = By.xpath("//input[@id='input-email']");
		By pass = By.xpath("//input[@id='input-password']");
		By lButton = By.xpath("//input[@value='Login']");
		
		eu.addInput(uName, username);
		eu.addInput(pass, password);
		
		eu.doClick(lButton);
		
		String actualURL = bu.getCurrentPageURL();
		String expectedURL = "https://naveenautomationlabs.com/opencart/index.php?route=account/accousnt";
		
		if(actualURL.equals(expectedURL))
		{
			try
			{	
			row = sheet.getRow(1);
			cell = row.createCell(3);
			cell.setCellValue(actualURL);
			cell = row.createCell(4);
			cell.setCellValue("Passed");
			}
			catch( Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			row = sheet.getRow(2);
			cell = row.createCell(3);
			cell.setCellValue("Failed");
		}
		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		file.close();
		fos.close();
	}

}
