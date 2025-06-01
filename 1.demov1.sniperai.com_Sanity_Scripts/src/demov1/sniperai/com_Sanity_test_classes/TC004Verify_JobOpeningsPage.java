package demov1.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import demov1.sniperai.com_utility_Classes.Demov1_Excel_Data_UtilityClass;
import demov1_Sanity_POM_Classes.LoginPage;

public class TC004Verify_JobOpeningsPage extends A001_BaseTestClass_Design
{
	@Test
    public void JobOpeningsPage() throws IOException 
    {
        // Object of Login Page class for performing action on those web elements.
    	LoginPage LP = new LoginPage(driver);
        LP.JobOpenings();
        System.out.println("Clicked on Job Openings Page and Job Openings Page is Opened");
        
        try 
        {
            String ActualURLJobOpenings = driver.getCurrentUrl();
            System.out.println("Actual URL After Terms Page Open " + ActualURLJobOpenings);

            String ExpectedURLJobOpenings = "https://demov1.sniperai.com/job-openings";

            // Add this to verify result instead of if else.
            String ActualResult = ActualURLJobOpenings.equals(ExpectedURLJobOpenings) ?
            		"Job Openings Page Opened Successfully: Test case is Passed"
                    : "Job Openings Page Not Opened : Test case is failed";

            System.out.println(ActualResult);

            // Write the result to Excel
            try 
            {
                Demov1_Excel_Data_UtilityClass.writeResult(ActualResult);
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }
        
        catch (NoAlertPresentException e) 
        {
            // Handle the case of no alert present
            System.out.println("No alert present on the page.");
            Demov1_Excel_Data_UtilityClass.writeResult("No alert present on the page.");

        } 
        catch (NoSuchElementException e) 
        {
            // Handle NoSuchElementException
            System.out.println("No web element found on the page.");
            Demov1_Excel_Data_UtilityClass.writeResult("No web element found on the page.");

        } 
        catch (WebDriverException e) 
        {
            // Handle WebDriverException
            System.out.println("WebDriverException occurred: " + e.getMessage());
            Demov1_Excel_Data_UtilityClass.writeResult("WebDriverException occurred: " + e.getMessage());

        }
        catch (Exception e) 
        {
            // Handle any other exceptions
            System.out.println("An exception occurred: " + e.getMessage());
            Demov1_Excel_Data_UtilityClass.writeResult("An exception occurred: " + e.getMessage());
        }
        
        System.out.println("Job Openings Page Actual Result Added in the Excel Sheet.");

    }

}
