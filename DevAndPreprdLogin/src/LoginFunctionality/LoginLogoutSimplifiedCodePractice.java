package LoginFunctionality;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutSimplifiedCodePractice 
{
	
	public static void main(String[] args) throws IOException 
	{
//		Path of Excel Fine
        String path = "C:\\Users\\Shubz008\\Desktop\\Server Credentials\\Dev And Preprod Server List.xlsx";
        FileInputStream File = new FileInputStream(path);
        XSSFWorkbook workbook = new XSSFWorkbook(File);
        		
//        		(XSSFWorkbook) WorkbookFactory.create(File);
//        Path of chromedriver and properties set
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe" );
        
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
//        For loop 
        for (int i = 1; i <= 16; i++) 
        {
            String url = workbook.getSheet("Sheet1").getRow(i).getCell(2).getStringCellValue();
            driver.get(url);

            String username = workbook.getSheet("Sheet1").getRow(i).getCell(3).getStringCellValue();
            WebElement usernameField = driver.findElement(By.id("user_email"));
            usernameField.sendKeys(username);

            String password = workbook.getSheet("Sheet1").getRow(i).getCell(4).getStringCellValue();
            WebElement passwordField = driver.findElement(By.id("user_password"));
            passwordField.sendKeys(password);

            WebElement loginButton = driver.findElement(By.id("login"));
            loginButton.click();

            String expectedUrl = i == 1 ? "https://design.sniperai.com/recruiter/live-jobs" : 
            	(i == 2? "https://sftest.sniperai.com/recruiter/live-jobs" :
            	(i == 3? "https://ixceedpreprod.sniperai.com/recruiter/live-jobs" : 
            	(i == 4? "https://afgpreprod.sniperai.com/recruiter/live-jobs" :
            	(i == 5? "https://ab-inbevpreprod.sniperai.com/recruiter/live-jobs" : 
            	(i == 6? "https://afgdev.sniperai.com/recruiter/live-jobs" :
            	(i == 7? "https://atospreprod.sniperai.com/recruiter/live-jobs":
            	(i == 8? "https://alcoapreprod.sniperai.com/recruiter/live-jobs" :
            	(i == 9? "https://bajajautopreprod.sniperai.com/recruiter/live-jobs" :
            	(i == 10? "https://clearbridgetechpreprod.sniperai.com/recruiter/live-jobs" :
            	(i == 11? "https://globallogic.sniperai.com/recruiter/live-jobs" :
            	(i == 12? "https://edgegrouppreprod.sniperai.com/recruiter/live-jobs" :
            	(i == 13? "https://johnclementspreprod.sniperai.com/recruiter/live-jobs" :
            	(i == 14? "https://malaysiaairlinespreprod.sniperai.com/recruiter/live-jobs":
            	(i == 15? "https://ptteppreprod.sniperai.com/recruiter/live-jobs" :
            				"https://recruitmentsmartpreprod.sniperai.com/recruiter/live-jobs"))))))))))))));
            String actualUrl = driver.getCurrentUrl();
            
            String Result = expectedUrl.equals(actualUrl) ? "Test Case is passed" : "Test case is failed";
            workbook.getSheet("Sheet1").getRow(i).createCell(5).setCellValue(Result);

            WebElement sidebar = driver.findElement(By.id("manu-icn-exp-col"));
            sidebar.click();

            WebElement logout = driver.findElement(By.linkText("Sign out"));
            logout.click();
        }

        FileOutputStream outputStream = new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        driver.quit();
        
	}
	

}
