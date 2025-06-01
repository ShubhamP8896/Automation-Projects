//package design.sniperai.com_Sanity_test_classes;
//
//import java.io.IOException;
//import java.util.NoSuchElementException;
//
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.ITestResult;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//import dev_prepod_Sanity_POM_Classes.LoginPage;
//import utility_Classes.Excel_Data_UtilityClass;
//import utility_Classes.Take_Screenshot_UtilityClass;
//
//public class TC001_LoginTest_RecruiterModule 
//{
//	WebDriver driver;
//	@BeforeMethod
//	public void SetUp() throws IOException
//	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
//		System.out.println("Properties Set Successfully");
//		
//		driver = new ChromeDriver();
//		System.out.println("Chrome Browser Opened");
//		
//		driver.manage().window().maximize();
//		
//		driver.get("https://design.sniperai.com/");
//		System.out.println("URL Opened Successfully");
//		
////		Object of Login Page class for performing action on those web elements.
//		
//		LoginPage LP = new LoginPage(driver);
//		
//		LP.loginPage();             // For Reading data from the excel file
//		
//		LP.SendUsername();
//		System.out.println("Username added successfully");
//		LP.SendPassword();
//		System.out.println("Password added successfully");
//		LP.LoginButton();
//		System.out.println("Click on Login Button successfully");
//		
//	}
//	
//		@Test	
//		public void LoginFunctionality() throws IOException
//		{
//			try {
//			String AxtcualURLLogin = driver.getCurrentUrl();
//			System.out.println("Actual URL After Login "+ AxtcualURLLogin);
//			
//			String ExpectedURLLogin = "https://design.sniperai.com/recruiter/live-jobs";
//			
//			
////			Add this to verify result instead of if else.
//			
//			String ActualResult = AxtcualURLLogin.equals(ExpectedURLLogin) ? 
//					"Login Successfully: Login Test case is Passed" 
//					: "Login Test case is failed";
//			
//			System.out.println(ActualResult);
//			
//	        // Write the result to Excel
//	        try 
//	        {
//	          Excel_Data_UtilityClass.writeResult(34, ActualResult); // Assuming the result should be written to row 1
//	        } catch (IOException e) 
//	        {
//	            e.printStackTrace();
//	        }
//	        
//			} catch (NoAlertPresentException e) {
//	            // Handle the case of no alert present
//	            System.out.println("No alert present on the page.");
//	            Excel_Data_UtilityClass.writeResult(34, "No alert present on the page.");
//
//	        } catch (NoSuchElementException e) {
//	            // Handle NoSuchElementException
//	            System.out.println("No web element found on the page.");
//	            Excel_Data_UtilityClass.writeResult(34, "No web element found on the page.");
//
//	        } catch (WebDriverException e) {
//	            // Handle WebDriverException
//	            System.out.println("WebDriverException occurred: " + e.getMessage());
//	            Excel_Data_UtilityClass.writeResult(34, "WebDriverException occurred: " + e.getMessage());
//
//	        } catch (Exception e) {
//	            // Handle any other exceptions
//	            System.out.println("An exception occurred: " + e.getMessage());
//	            Excel_Data_UtilityClass.writeResult(34, "An exception occurred: " + e.getMessage());
//	        }
//			// After the test case is done, take a screenshot
//			Take_Screenshot_UtilityClass.takeScreenshot(driver, "1.Recruiter_LoginFunctionality_Screenshot");
//			System.out.println("Success Screenshot taken Successfully");
//		}
//		
//		@AfterMethod
//
//		 public void teardown(ITestResult RecruiterLogin)   //ITTestResult is TestNG's interface
////		 Used this for taking screenshot in case any failure occurred during script
//		{
//	        // Check if the test case failed or has an exception
//	        if (RecruiterLogin.getStatus() == ITestResult.FAILURE || RecruiterLogin.getStatus() == ITestResult.SUCCESS_PERCENTAGE_FAILURE) 
//	        {
//	            // Take screenshot if the test case failed or has an exception
//	        	Take_Screenshot_UtilityClass.takeScreenshot(driver, RecruiterLogin.getName() + "_Failure_Screenshot");
//	        	System.out.println("Failure Screenshot taken");
//	        }
//	        
//			driver.quit();                              // Close the browser after each test
//			System.out.println("End Of Program");
//		}
//		
//				
//	}
//
