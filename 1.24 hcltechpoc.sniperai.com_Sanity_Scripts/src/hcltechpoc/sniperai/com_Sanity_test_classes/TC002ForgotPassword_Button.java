package hcltechpoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import java.util.NoSuchElementException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import hcltechpoc.sniperai.com_utility_Classes.Hcltechpoc_Excel_Data_UtilityClass;
import hcltechpoc_Sanity_POM_Classes.LoginPage;

public class TC002ForgotPassword_Button extends A001_BaseTestClass_Design
{
    @Test
    public void ForgotPassword() throws IOException 
    {
    	try {
        // Object of Login Page class for performing action on those web elements.
        LoginPage LP = new LoginPage(driver);
        LP.UserTypeC(); // Select User Type
        System.out.println("User Type Selected - candidate");
        LP.ForgotPassword(); // Click on forgot password button
        System.out.println("Clicked on forgot Password Button");

        LP.FEmailField();
        System.out.println("Email ID Added in the Email field");
        LP.ForgotPasswordButton();
        System.out.println("Clicked on Forgot Password button");
        
    	}
    	
    	catch (UnhandledAlertException e) 
        {
            handleAlert();

        } catch (NoAlertPresentException e) {
            System.out.println("No alert present on the page.");
//            Excel_Data_UtilityClass.writeResult("No alert present on the page.");

        } catch (NoSuchElementException e) {
            System.out.println("No web element found on the page.");
            Hcltechpoc_Excel_Data_UtilityClass.writeResult("No web element found on the page.");
           
        } catch (WebDriverException e) {
            System.out.println("WebDriverException occurred: " + e.getMessage());
            Hcltechpoc_Excel_Data_UtilityClass.writeResult("WebDriverException occurred: " + e.getMessage());
          
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
            Hcltechpoc_Excel_Data_UtilityClass.writeResult("An exception occurred: " + e.getMessage());
           
        }
//        try
//        {
    	LoginPage LP = new LoginPage(driver);
        String ActualText = LP.ForgotPasswordSuccess(); // For this need to use string as return type in Login page class for that method
        String ExpectedText = "Thank you, a password reset link is sent to your registered email address";

        System.out.println("Actual Text is: " + ActualText);

        String ActualResult = ActualText.equals(ExpectedText) ? 
            "Actual and Expected Texts are Same : Test case is Passed" 
            : "Actual and Expected Texts are Different : Test case is failed";

        System.out.println(ActualResult);

        // Write the result to Excel
        Hcltechpoc_Excel_Data_UtilityClass.writeResult("Actual Result =" + ActualResult + " Actual Text = " + ActualText);
        
        System.out.println("Forgot Password Actual Result Added in the Excel Sheet.");
	}
//        	catch (Exception e)
//        	{
//        		System.out.println("An exception occurred while verifying the result: " + e.getMessage());
//                Excel_Data_UtilityClass.writeResult("An exception occurred while verifying the result: " + e.getMessage());
//        	}
//     }
    
}


