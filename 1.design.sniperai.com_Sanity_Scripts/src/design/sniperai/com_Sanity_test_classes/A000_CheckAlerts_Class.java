package design.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.testng.Assert;

import design.sniperai.com_utility_Classes.Design_Excel_Data_UtilityClass;

public class A000_CheckAlerts_Class extends A001_BaseTestClass_Design {
    
    public void checkForAlert() throws IOException {  // Change to public
        try {
            // Check if an alert is present
            driver.switchTo().alert();
            // If an alert is found, throw an exception
            throw new UnhandledAlertException("An alert is present on the page.");
        } catch (NoAlertPresentException e) {
            // No alert is present, do nothing
        } catch (UnhandledAlertException e) {
            // Log the alert and fail the test
            System.out.println("Alert detected: " + e.getMessage());
            Design_Excel_Data_UtilityClass.writeResult("Alert detected: " + e.getMessage());
            Assert.fail("Test case failed due to alert.");
        }
    }
}
