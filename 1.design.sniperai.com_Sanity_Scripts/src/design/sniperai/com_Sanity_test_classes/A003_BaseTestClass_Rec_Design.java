package design.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import design.sniperai.com_utility_Classes.Design_Excel_Data_UtilityClass;
import design.sniperai.com_utility_Classes.Design_Take_Screenshot_UtilityClass;
import dev_prepod_Sanity_POM_Classes.LoginPage;
import dev_preprod_CanMod_POM_classes.Can_DashboardPage;
import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class A003_BaseTestClass_Rec_Design 
{
	WebDriver driver;

    @BeforeMethod
    public void SetUp() throws IOException 
    {
        initializeDriver();
        navigateToUrl();
        performLogin();
    }

    private void initializeDriver() 
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Automation Testing Files\\Drivers\\Chrome Driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Properties Set Successfully");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome Browser Opened");
    }

    private void navigateToUrl() 
    {
        driver.get("https://design.sniperai.com/");
        System.out.println("URL Opened Successfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    private void performLogin() throws IOException 
    {
        LoginPage LP = new LoginPage(driver);
        
        LP.fetchRecruiterCredentials(1);
        
        LP.RCSendUsername();
        System.out.println("Recruiter Username Added");
        LP.RCSendPassword();
        System.out.println("Recruiter Password Added");
        LP.UserTypeR();
        System.out.println("Recruiter user type selected");
        LP.RememberMe();
        System.out.println("Remember Me checkbox is selected");
        LP.LoginButton();
        System.out.println("Recruiter Clicked on Login Button");

        handlePossibleAlert();
    }

    private void handlePossibleAlert() throws IOException {
        try {
            Alert alert = driver.switchTo().alert();
            String alertMessage = alert.getText();
            alert.accept();
            System.out.println("Alert message: " + alertMessage);
//          Excel_Data_UtilityClass.writeResult("Test case failed - Incorrect credentials. Alert message: " + alertMessage);
        } catch (NoAlertPresentException e) {
            System.out.println("No alert present on the page.");
        } catch (NoSuchElementException e) {
            System.out.println("No web element found on the page.");
            Design_Excel_Data_UtilityClass.writeResult("No web element found on the page.");
        } catch (WebDriverException e) {
            System.out.println("WebDriverException occurred: " + e.getMessage());
            Design_Excel_Data_UtilityClass.writeResult("WebDriverException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
            Design_Excel_Data_UtilityClass.writeResult("An exception occurred: " + e.getMessage());
        }
    }

    @AfterMethod
    public void teardown(ITestResult result) 
    {
        try 
        {
            if (result.getStatus() == ITestResult.FAILURE) 
            {
                Design_Take_Screenshot_UtilityClass.takeScreenshot(driver, result.getName() + "_Failure_Screenshot");
                System.out.println("Failure Screenshot taken Successfully");
            } 
            else 
            {
                Design_Take_Screenshot_UtilityClass.takeScreenshot(driver, result.getName());
                System.out.println("Success Screenshot taken Successfully");
            }
        } 
        catch (Exception e) 
        {
            System.out.println("Exception while taking screenshot: " + e.getMessage());
        } 
        finally 
        {
            if (driver != null) 
            {
                logoutAndQuitDriver();
            }
        }
    }

//    Recruiter Module Logout code
    private void logoutAndQuitDriver() 
    {
    	Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class (driver);
    	RecJobListPage.Sidebar();
    	RecJobListPage.Signout();
        driver.quit();
    }
}
