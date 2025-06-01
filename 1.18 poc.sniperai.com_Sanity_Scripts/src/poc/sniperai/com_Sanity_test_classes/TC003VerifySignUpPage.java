package poc.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.testng.annotations.Test;

import poc.sniperai.com_utility_Classes.Poc_Excel_Data_UtilityClass;
import poc_Sanity_POM_Classes.LoginPage;
import poc_Sanity_POM_Classes.SignUpPage;

public class TC003VerifySignUpPage extends A001_BaseTestClass_Design 
{
    @Test
    public void SignUp() throws IOException, InterruptedException 
    {
        try
        {
//        	Object of LoginPage for performing actions on LoginPage web Element
            LoginPage LP = new LoginPage(driver);
            LP.SignUp();
            System.out.println("Clicked on SignUp Option > SignUp page is Opened");

            String SignUpUrl = driver.getCurrentUrl();
            System.out.println("SignUp Page URL = " + SignUpUrl);

            // Object of SignUp Page class for performing action on those web elements.
            SignUpPage SignUP = new SignUpPage(driver);
            SignUP.NameField();
            System.out.println("Name Added in the Name Field");

//            No need to add email for now
            SignUP.EmailField();
            System.out.println("Email Added in Email Field");

            SignUP.PasswordField();
            System.out.println("Password added in password Field");

            SignUP.ConfirmPasswordField();
            System.out.println("Confirm Password added in Confirm password Field");

            SignUP.AgreeTermsCHeckbox();
            System.out.println("Selected/checked Terms checkbox");

//            SignUP.ActivateAccountButton();
//            System.out.println("Clicked on activate Account Button");
//
//            SignUP.ActAccEmailField();
//            System.out.println("Email Added for Activate account");
//
//            SignUP.ActAccButton();
//            System.out.println("Clicked on activate account button After adding Email ID");
             
        }    
            
        catch (UnhandledAlertException e) 
        {
            handleAlert();

        } catch (NoAlertPresentException e) {
            System.out.println("No alert present on the page.");
//            Excel_Data_UtilityClass.writeResult("No alert present on the page.");

        } catch (NoSuchElementException e) {
            System.out.println("No web element found on the page.");
            Poc_Excel_Data_UtilityClass.writeResult("No web element found on the page.");
           
        } catch (WebDriverException e) {
            System.out.println("WebDriverException occurred: " + e.getMessage());
            Poc_Excel_Data_UtilityClass.writeResult("WebDriverException occurred: " + e.getMessage());
          
        } catch (Exception e) {
            System.out.println("An exception occurred: " + e.getMessage());
            Poc_Excel_Data_UtilityClass.writeResult("An exception occurred: " + e.getMessage());
           
        }

        // Only proceed with the verification if no exceptions occurred
//        try
//        {
//         
                SignUpPage SignUP = new SignUpPage(driver);
                String ActualText = SignUP.ActivatAccSuccessWindow(); // For this need to use string as return type in Login page class for that method
                String ExpectedText = "Thank you, a password reset link is sent to your registered email address";

                System.out.println("Actual Text is: " + ActualText);

                String ActualResult = ActualText.equals(ExpectedText) ?
                        "Thank you, a password reset link is sent to your registered email address"
                        : "Actual and Expected Texts are Different : Test case is failed";

                System.out.println(ActualResult);

                Poc_Excel_Data_UtilityClass.writeResult("Actual Result =" + ActualResult + " Actual Text = " + ActualText);
   
        System.out.println("SignUp + Activate account Actual Result Added in the Excel Sheet.");
    }
        
//    	catch (Exception e)
//    	{
//    		System.out.println("An exception occurred while verifying the result: " + e.getMessage());
//            Excel_Data_UtilityClass.writeResult("An exception occurred while verifying the result: " + e.getMessage());
//    	}
        
//    }
             
}

