package aldaajanpoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import aldaajanpoc.sniperai.com_utility_Classes.Aldaajanpoc_Excel_Data_UtilityClass;
import aldaajanpoc_CanMod_POM_classes.Can_ChangePaswordPage;
import aldaajanpoc_CanMod_POM_classes.Can_DashboardPage;
import aldaajanpoc_CanMod_POM_classes.Can_MyProfilePage;

public class TC014_Can_Change_Password extends A002_BaseTestClass_Can_Design
{
	@Test
	public void ChangePassword() throws IOException
	{	
//	Object of Dashboard POM class for perform actions on web elements from dashboard page
	Can_DashboardPage Dashboard = new Can_DashboardPage (driver);
	
//	Clcik on side bar
	Dashboard.Sidebar();
	
//	Click on Myprofile
	Dashboard.Profile();
	System.out.println("Profile Page Opened");
	
//	Object of Profile POM class for perform actions on web elements from Profile page
	Can_MyProfilePage ProfilePage = new Can_MyProfilePage (driver);
	
//	Click on the change password button
	ProfilePage.ChangePassword();
	System.out.println("Change Password Page Opened");
	
//	Compare My profile actual URL with Expected URL
    String ChangePassPageactualURL = "https://demov1.sniperai.com/candidate/change-password";
    String ChangePassPageexpectedURL = driver.getCurrentUrl();
    String ChangePassPageactualResult = ChangePassPageactualURL.equals(ChangePassPageexpectedURL) ? 
            "Candidate Redirected to my Change Password page Successfully: Test case is passed" : 
            "Candidate not able to click on Change Password: Test case is failed";
    
    System.out.println(ChangePassPageactualResult);
		
//	Object of Profile POM class for perform actions on web elements from Profile page
	Can_ChangePaswordPage ChangePassword = new Can_ChangePaswordPage (driver);
	
	ChangePassword.CurrentPassword();
	System.out.println("Current Password added");
	
	ChangePassword.NewPassword();
	System.out.println("New Password added");
	
	ChangePassword.ConfirmPassword();
	System.out.println("Confirm Password added");
	
	ChangePassword.SubmitButton();
	System.out.println("Clicked on submit button");
	
//	Accept alert
	Alert alt = driver.switchTo().alert();
	alt.accept();
	
//	Compare result with Jobs page URL for pass test case
    String actualURL = "https://demov1.sniperai.com/candidate/my-profile";
    String expectedURL = driver.getCurrentUrl();
    String actualResult = actualURL.equals(expectedURL) ? 
                 	 "Candidate clicked on Submit button and profile password saved Successfully: Test case is passed" : 
                     "Profile passowrd is not saved : Test case is failed";
    
    System.out.println(actualResult);

    Aldaajanpoc_Excel_Data_UtilityClass.writeResult(actualResult);

    if (!actualURL.equals(expectedURL)) 
    {
        Assert.fail("Candidate's profile password is not saved: Test case is failed");
    } 
	
	}

}
