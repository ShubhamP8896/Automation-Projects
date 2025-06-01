package mag.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import mag.sniperai.com_utility_Classes.MAG_Excel_Data_UtilityClass;
import mag_Sanity_POM_Classes.LoginPage;


public class TC001Open_Terms_Page extends A001_BaseTestClass_Design
{
    @Test
    public void TermsPage() throws IOException 
    {
        // Object of Login Page class for performing action on those web elements.
    	LoginPage LP = new LoginPage(driver);
        LP.Terms();	
    	System.out.println("Clicked on Terms Page and Terms Page is Opened");
        
        try 
        {
            // All The Opened Pages Address we Found
            Set<String> AllPageAddress = driver.getWindowHandles();
            // Need to do Upcasting casting for converting Set into List because in set we didn't found Indexes

            List<String> AllPageAddresses = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(AllPageAddresses.get(1)); // in this we need to pass index

            String ActualURLTerms = driver.getCurrentUrl();
            System.out.println("Actual URL After Terms Page Open " + ActualURLTerms);

            String ExpectedURLTerms = "https://malaysiaairlines.sniperai.com/terms?type=";

            // Add this to verify result instead of if else.
            String ActualResult = ActualURLTerms.equals(ExpectedURLTerms) ?
            		"Terms Page Opened Successfully: Test case is Passed"
                    : "Terms Page Not Opened : Test case is failed";

            System.out.println(ActualResult);

            // Write the result to Excel
            try 
            {
                MAG_Excel_Data_UtilityClass.writeResult(ActualResult);
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
            MAG_Excel_Data_UtilityClass.writeResult("No alert present on the page.");

        } 
        catch (NoSuchElementException e) 
        {
            // Handle NoSuchElementException
            System.out.println("No web element found on the page.");
            MAG_Excel_Data_UtilityClass.writeResult("No web element found on the page.");

        } 
        catch (WebDriverException e) 
        {
            // Handle WebDriverException
            System.out.println("WebDriverException occurred: " + e.getMessage());
            MAG_Excel_Data_UtilityClass.writeResult("WebDriverException occurred: " + e.getMessage());

        }
        catch (Exception e) 
        {
            // Handle any other exceptions
            System.out.println("An exception occurred: " + e.getMessage());
            MAG_Excel_Data_UtilityClass.writeResult("An exception occurred: " + e.getMessage());
        }
        
        System.out.println("Terms Page Actual Result Added in the Excel Sheet.");

    }

}
