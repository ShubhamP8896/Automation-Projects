package LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogoutPractice 
{
	public static void main(String[] args) throws IOException 
	{
		
//		Path of excel file 
		String path = "C:\\Users\\Shubz008\\Desktop\\Server Credentials\\Dev And Preprod Server List.xlsx";
		
//		Reading the Excel file
		FileInputStream File = new FileInputStream(path);
		
//		Reading the Workbook   (Apache - POI)
		XSSFWorkbook Workbook = new XSSFWorkbook(File);
		
//		Reading the SHeet 
		XSSFSheet Sheet = Workbook.getSheet("Sheet1");
		
//		Reading the Row -----------------
		XSSFRow Row = Sheet.getRow(1);
			
//		Reading the Cell -----------------
		XSSFCell Cell = Row.getCell(2);		
		
//		For Fetching Value from Sheet :: Value -> URL
		String Value = Cell.getStringCellValue();
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(Value);
		
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Reading the Row -----------------
		XSSFRow Row1 = Sheet.getRow(1);
			
//		Reading the Cell -----------------
		XSSFCell Cell1 = Row1.getCell(3);		
		
//		For Fetching Value from Sheet  :: Value1 -> Username
		String Value1 = Cell1.getStringCellValue();
			
//		Fill Username in username field
		WebElement Username = driver.findElement(By.xpath("//input [@id='user_email']"));
		Username.sendKeys(Value1);
		
//		Reading the Row -----------------
		XSSFRow Row2 = Sheet.getRow(1);
			
//		Reading the Cell -----------------
		XSSFCell Cell2 = Row2.getCell(4);		
		
//		For Fetching Value from Sheet :: Value2 -> PASSWORD
		double Value2 = Cell2.getNumericCellValue();
//		Explicit casting for converting higher data type (Double) into lower data type (Int)
		double a = Value2;
		int b = (int) Value2;	
		
//		Fill Password in password field
		WebElement Password = driver.findElement(By.xpath("//input [@id='user_password']"));
		Password.sendKeys(String.valueOf(b));
		
//		User type selecting : We need Recruiter
		WebElement UserType = driver.findElement(By.xpath("//input [@value='0']"));
		UserType.click();
		
//		Click on Login
		WebElement LoginButton = driver.findElement(By.xpath("//input [@id='login']"));
		LoginButton.click();
		
		String ExpectedUrl = "https://design.sniperai.com/recruiter/live-jobs";
		
		String ActualUrl = driver.getCurrentUrl();
		System.out.println("Actual URL is " +ActualUrl);
		
		if (ExpectedUrl.equals(ActualUrl))
		{
			System.out.println("Login Successfully : Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
			FileInputStream File1 = new FileInputStream(path);
			XSSFWorkbook Workbook1 = (XSSFWorkbook) WorkbookFactory.create(File1);
			XSSFSheet Sheet1 = Workbook1.getSheet("Sheet1");
			
			String Consoleresult = "Test Case is passed";
			
			XSSFRow resultRow = Sheet1.getRow(1); // Example: writing the result in the first row
            XSSFCell resultCell = resultRow.createCell(5); // Example: writing the result in the second column
            resultCell.setCellValue(Consoleresult);
            
            FileOutputStream outputStream = new FileOutputStream(path);
            Workbook1.write(outputStream);
            Workbook1.close();
            outputStream.close();
            
            System.out.println("Results have been written to Excel file successfully.");
            
//          LogOut From System
    		WebElement Sidebar = driver.findElement(By.id("manu-icn-exp-col"));
    		Sidebar.click();
    		
    		WebElement LogOut = driver.findElement(By.linkText("Sign out"));
    		LogOut.click();
    		
    		driver.close();

// ------------------------------ sftest Server-----------------------------------   		
    		
//    		Reading the Row -----------------
    		XSSFRow Row3 = Sheet.getRow(2);
    			
//    		Reading the Cell -----------------
    		XSSFCell Cell3 = Row3.getCell(2);		
    		
//    		For Fetching Value from Sheet :: Value3 -> URL
    		String Value3 = Cell3.getStringCellValue();
    		
    		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
    		
    		WebDriver driver1 = new ChromeDriver();
    		
    		driver1.manage().window().maximize();
    		
    		driver1.get(Value3);
    		
//    		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    		    		
//    		Reading the Row -----------------
    		XSSFRow Row4 = Sheet.getRow(2);
    			
//    		Reading the Cell -----------------
    		XSSFCell Cell4 = Row4.getCell(3);		
    		
//    		For Fetching Value from Sheet  :: Value4 -> Username
    		String Value4 = Cell4.getStringCellValue();
    			
//    		Fill Username in username field
    		WebElement SFUsername = driver1.findElement(By.xpath("//input [@id='user_email']"));
    		SFUsername.sendKeys(Value4);
    		
//    		Reading the Row -----------------
    		XSSFRow Row5 = Sheet.getRow(2);
    			
//    		Reading the Cell -----------------
    		XSSFCell Cell5 = Row5.getCell(4);		
    		
//    		For Fetching Value from Sheet :: Value2 -> PASSWORD
    		String Value5 = Cell5.getStringCellValue();

//    		Fill Password in password field
    		WebElement Password1 = driver1.findElement(By.xpath("//input [@id='user_password']"));
    		Password1.sendKeys(Value5);
    		
//    		User type selecting : We need Recruiter
    		WebElement UserType1 = driver1.findElement(By.xpath("//input [@value='0']"));
    		UserType1.click();
    		
//    		Click on Login
    		WebElement LoginButton1 = driver1.findElement(By.xpath("//input [@id='login']"));
    		LoginButton1.click();
    		
    		String SFExpectedUrl = "https://sftest.sniperai.com/recruiter/live-jobs";
    		
    		String SFActualUrl = driver1.getCurrentUrl();
    		System.out.println("Actual URL is " +ActualUrl);
    		
    		if (SFExpectedUrl.equals(SFActualUrl))
    		{
    			System.out.println("Login Successfully : Test case is Passed");
    		}
    		else
    		{
    			System.out.println("Test case is failed");
    		}
    		
    		FileInputStream File2 = new FileInputStream(path);
			XSSFWorkbook Workbook2 = (XSSFWorkbook) WorkbookFactory.create(File2);
			XSSFSheet Sheet2 = Workbook2.getSheet("Sheet1");
			
			String SFConsoleresult = "Test Case is passed";
			
			XSSFRow SFresultRow = Sheet2.getRow(2); // Example: writing the result in the first row
            XSSFCell SFresultCell = SFresultRow.createCell(5); // Example: writing the result in the second column
            SFresultCell.setCellValue(SFConsoleresult);
            
            FileOutputStream SFoutputStream = new FileOutputStream(path);
            Workbook2.write(SFoutputStream);
            Workbook2.close();
            SFoutputStream.close();
            
            System.out.println("SFTEST Results have been written to Excel file successfully.");
            
//          LogOut From System
    		WebElement SFSidebar = driver1.findElement(By.id("manu-icn-exp-col"));
    		SFSidebar.click();
    		
    		WebElement SFLogOut = driver1.findElement(By.linkText("Sign out"));
    		SFLogOut.click();
    		
    		driver1.close();    		
    			
		
	}

}
