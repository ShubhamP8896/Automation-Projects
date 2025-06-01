package afgPreprod.sniperai.com_Sanity_test_classes;

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

import afgpreprd.sniperai.com_utility_Classes.AfgPreprod_Excel_Data_UtilityClass;
import afgpreprd.sniperai.com_utility_Classes.AfgPreprod_Take_Screenshot_UtilityClass;
import dev_prepod_Sanity_POM_Classes.LoginPage;
import dev_preprod_CanMod_POM_classes.Can_DashboardPage;

public class A002_BaseTestClass_Can_Design 
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
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
        System.out.println("Properties Set Successfully");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Chrome Browser Opened");
    }

    private void navigateToUrl() {
        driver.get("https://afgpreprod.sniperai.com/index");
        System.out.println("URL Opened Successfully");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    private void performLogin() throws IOException {
        LoginPage LP = new LoginPage(driver);
        LP.fetchCandidateCredentials(6);
        LP.CMSendUsername();
        System.out.println("Candidate Username Added");
        LP.CMSendPassword();
        System.out.println("Candidate Password Added");
        LP.UserTypeC();
        System.out.println("Candidate user type selected");
        LP.RememberMe();
        System.out.println("Remember Me checkbox is selected");
        LP.LoginButton();
        System.out.println("Candidate Clicked on Login Button");

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
            AfgPreprod_Excel_Data_UtilityClass.writeResult("No web element found on the page.");
        } catch (WebDriverException e) {
            System.out.println("WebDriverException occurred: " + e.getMessage());
            AfgPreprod_Excel_Data_UtilityClass.writeResult("WebDriverException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
            AfgPreprod_Excel_Data_UtilityClass.writeResult("An exception occurred: " + e.getMessage());
        }
    }

    @AfterMethod
    public void teardown(ITestResult result) 
    {
        try 
        {
            if (result.getStatus() == ITestResult.FAILURE) 
            {
                AfgPreprod_Take_Screenshot_UtilityClass.takeScreenshot(driver, result.getName() + "_Failure_Screenshot");
                System.out.println("Failure Screenshot taken Successfully");
            } 
            else 
            {
                AfgPreprod_Take_Screenshot_UtilityClass.takeScreenshot(driver, result.getName());
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

    private void logoutAndQuitDriver() 
    {
        Can_DashboardPage CanDashboard = new Can_DashboardPage(driver);
        CanDashboard.Sidebar();
        CanDashboard.Signout();
        driver.quit();
    }
}
