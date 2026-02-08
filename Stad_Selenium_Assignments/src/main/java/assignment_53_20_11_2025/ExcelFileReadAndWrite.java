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

/// Registration and data fetch from Excel
public class ExcelFileReadAndWrite
{
	static String firstName;	
	static String lastName;
	static String email;
	static String telephone;
	static String password;
	static String cmfPassword;
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
		bu.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		try 
		{
			path = "C:\\Users\\ADMIN\\OneDrive\\Desktop\\screenshots\\Automation.xlsx";
			file = new FileInputStream(path);
			wb = WorkbookFactory.create(file);
			sheet = wb.getSheet("Registration");
			firstName = sheet.getRow(1).getCell(2).getStringCellValue();
			lastName = sheet.getRow(2).getCell(2).getStringCellValue();
			email = System.currentTimeMillis()+sheet.getRow(3).getCell(2).getStringCellValue();
			telephone = sheet.getRow(4).getCell(2).toString();
			password = sheet.getRow(5).getCell(2).getStringCellValue();
			cmfPassword = sheet.getRow(6).getCell(2).getStringCellValue();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		By fName = By.xpath("//input[@id='input-firstname']");
		By lName = By.xpath("//input[@id='input-lastname']");
		By emailId = By.xpath("//input[@id='input-email']");
		By telephoneNo = By.xpath("//input[@id='input-telephone']");
		By pass = By.xpath("//input[@id='input-password']");
		By cmfPass = By.xpath("//input[@id='input-confirm']");
		By checkBox = By.xpath("//input[@type='checkbox']");
		By continueButton = By.xpath("//input[@type='submit']");
		
		eu.addInput(fName, firstName);
		eu.addInput(lName, lastName);
		eu.addInput(emailId, email);
		eu.addInput(telephoneNo, telephone);
		eu.addInput(pass, password);
		eu.addInput(cmfPass, cmfPassword);
		
		eu.doClick(checkBox);
		eu.doClick(continueButton);
		
		By text = By.xpath("//div[@id='content']/p[1]");
		String actualText = eu.getElementText(text);
		String expectedText = "Congratulations! Your new account has been successfully created!";
		
		row = sheet.getRow(6);
		
		if(actualText.equalsIgnoreCase(expectedText))
		{
			try
			{	
			cell = row.createCell(3);
			cell.setCellValue(actualText);
			cell = row.createCell(4);
			cell.setCellValue("Pass");
			}
			catch( Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			cell = row.createCell(4);
			cell.setCellValue("Fail");
		}		
		FileOutputStream fos = new FileOutputStream(path);
		wb.write(fos);
		wb.close();
		file.close();
		fos.close();
		
		
		bu.quitBrowser();
	}

	
	
}
