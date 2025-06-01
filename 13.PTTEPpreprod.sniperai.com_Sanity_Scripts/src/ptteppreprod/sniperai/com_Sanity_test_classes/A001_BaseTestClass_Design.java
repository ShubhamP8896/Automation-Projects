package ptteppreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import ptteppreprod.sniperai.com_utility_Classes.PTTEPpreprod_Excel_Data_UtilityClass;
import ptteppreprod.sniperai.com_utility_Classes.PTTEPpreprod_Take_Screenshot_UtilityClass;

public class A001_BaseTestClass_Design 
{
	WebDriver driver;

    @BeforeMethod
    public void SetUp() throws IOException
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Properties Set Successfully");

        driver = new ChromeDriver();
        System.out.println("Chrome Browser Opened");

        driver.manage().window().maximize();

        driver.get("https://ptteppreprod.sniperai.com/");
        System.out.println("URL Opened Successfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
    }
    
    @AfterMethod
    public void teardown(ITestResult result) // ITTestResult is TestNG's interface
    // Used this for taking screenshot in case any failure occurred during script
    {
    try 
    {
        // Check if there's an alert and handle it before taking a screenshot
        handleAlert();
    	
        // Check if the test case failed or has an exception
        if (result.getStatus() == ITestResult.FAILURE || result.getStatus() == ITestResult.SUCCESS_PERCENTAGE_FAILURE) 
        {
            // Take screenshot if the test case failed or has an exception
            PTTEPpreprod_Take_Screenshot_UtilityClass.takeScreenshot(driver, result.getName() + "_Failure_Screenshot");
            System.out.println("Failure Screenshot taken");
        }
        else
        {
        // Take a screenshot at the end of the test case (success or failure)
        PTTEPpreprod_Take_Screenshot_UtilityClass.takeScreenshot(driver, result.getName());
        System.out.println("Success Screenshot taken Successfully");
        }
    } 
    catch (Exception e) 
    {
        System.out.println("Exception while taking screenshot: " + e.getMessage());
    } 
    finally 
    {
        // Ensure that the browser is closed after each test
        if (driver != null) {
            driver.quit();
        }
        System.out.println("End Of Program");
    }
}
    
    protected void handleAlert() throws IOException
    {
        try 
        {
            Alert alert = driver.switchTo().alert();
            String alertMessage = alert.getText();
            System.out.println("Alert message: " + alertMessage);
            PTTEPpreprod_Excel_Data_UtilityClass.writeResult("Alert message: " + alertMessage);
            alert.accept(); // Accept the alert
        } 
        
        catch (Exception e)
        {
            System.out.println("Exception while handling alert: " + e.getMessage());
//            Excel_Data_UtilityClass.writeResult("Exception while handling alert: " + e.getMessage());
        }

    }
}
    
