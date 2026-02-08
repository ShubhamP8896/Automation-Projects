package AutimationTesting5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelSheet3 
{
	public static void main(String[] args) throws IOException
	{
//		How to Login with fetching data from Excel file and insert them into specific fields on browser.
		
		String path = "C:\\Users\\Shubz008\\Downloads\\Excel For Practice.xlsx";
		
		FileInputStream File = new FileInputStream(path);
		
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		
		XSSFRow Row = Sheet.getRow(1);	
		XSSFCell Cell = Row.getCell(1);
		String Value = Cell.getStringCellValue();		
		System.out.println("UserName "+Value);
		
//		We need to change only Row, cell and value (ref valriables) names
		XSSFRow Row1 = Sheet.getRow(1);	
		XSSFCell Cell1 = Row1.getCell(2);
		String Value1 = Cell1.getStringCellValue();		
		System.out.println("Password "+Value1);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='user-name']"));
		UserName.sendKeys(Value);     //value :- which fetched from excel file

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys(Value1);     //value1 :- which fetched from excel file
				
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		String ActualUrl = "https://www.saucedemo.com/inventory.html";
		
		String ExpectedUrl = driver.getCurrentUrl();
		System.out.println(ExpectedUrl);
		
		if(ExpectedUrl.equals(ActualUrl))
		{
			System.out.println("Test case is passed Login Successfully");
		}
		else
		{
			System.out.println("Test case is Failed ");
		}
		
		System.out.println("End Of Program");
		
		
	}

}
