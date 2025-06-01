package DesignServer1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesignServer1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
			
//		Chrome Browser Open
		WebDriver driver = new ChromeDriver();
		
//		Browser Maximize
		driver.manage().window().maximize();
		
//		Open URL
		driver.get("https://design.sniperai.com/index");
		
//		Implicit wait for finding elemenmts for that time - 10 sec
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		Login Script :--------------------------------------------------->> 001
		
//		Fill Username in username field
		WebElement Username = driver.findElement(By.xpath("//input [@id='user_email']"));
		Username.sendKeys("shubham.pawars@recruitmentsmart.com");
		
//		Fill Password in password field
		WebElement Password = driver.findElement(By.xpath("//input [@id='user_password']"));
		Password.sendKeys("123456");
		
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
		
//		Login Test case is Done:----------------------------------------------
		
//		Add New Job Test Script :--------------------------------------------->> 2
		
		WebElement AddJob = driver.findElement(By.xpath("//a [@title = 'Add Job']"));
		AddJob.click();
		
		WebElement PageText = driver.findElement(By.xpath("//h4 [text() = 'Select Requisition Option']"));
		String ActualText = PageText.getText();
		
		String ExpectedText = "Select Requisition Option";
	
		System.out.println("Actual Text is " +ActualText);
		
		if (ExpectedText.equals(ActualText))
		{
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		WebElement CreateNewJob = driver.findElement(By.xpath("(//a [@class = 'joboptions add_job '])[2]"));
		CreateNewJob.click();
		
//		Add Job Description		
		WebElement JobDescription = driver.findElement(By.xpath("//input [@type='search']"));
		JobDescription.sendKeys("data Science");
		
		WebElement JobTitle = driver.findElement(By.xpath("//li [text() = 'Data Science']"));
		JobTitle.click();
		
		WebElement JDGenerate = driver.findElement(By.xpath("//div [@id='jdgeneratordv']"));
		JDGenerate.click();
		
		WebElement Location = driver.findElement(By.xpath("//input [@id='location']"));
		Location.sendKeys("Pune, Maharashtra, India");
		
		WebElement JobReqID = driver.findElement(By.xpath("//input [@id='ref_id']"));
		JobReqID.sendKeys("AT1");
		
		WebElement EndDate = driver.findElement(By.xpath("//input [@id='end_date']"));
		EndDate.click();
		
		WebElement Next = driver.findElement(By.xpath("//span [text() ='Next']"));
		Next.click();
		
		WebElement SelectDate = driver.findElement(By.xpath("//a [text() ='30']"));
		SelectDate.click();
		
		WebElement Next1 = driver.findElement(By.xpath("(//input [@value='Next Step'])[1]"));
		Next1.click();
		
		WebElement Next2 = driver.findElement(By.xpath("(//input [@value='Next Step'])[2]"));
		Next2.click();
	
		WebElement Submit = driver.findElement(By.xpath("//input [@id='addjobbtn']"));
		Submit.click();
		
					
	}

}
