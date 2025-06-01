package design.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import design.sniperai.com_utility_Classes.Design_Excel_Data_UtilityClass;
import dev_preprod_CanMod_POM_classes.Can_DashboardPage;
import dev_preprod_CanMod_POM_classes.Can_MyProfilePage;

public class TC013_Can_Profile_Update extends A002_BaseTestClass_Can_Design
{
	@Test
	public void ProfilePageUpdate() throws IOException, InterruptedException
	{
//    	Object of Dashboard POM class for perform actions on web elements from dashboard page
    	Can_DashboardPage Dashboard = new Can_DashboardPage (driver);
    	
//    	Clcik on side bar
    	Dashboard.Sidebar();
    	
//    	Click on Myprofile
    	Dashboard.Profile();
    	
//    	Compare My profile actual URL with Expected URL
        String ProfilePageactualURL = "https://design.sniperai.com/candidate/my-profile";
        String ProfilePageexpectedURL = driver.getCurrentUrl();
        String ProfilePageactualResult = ProfilePageactualURL.equals(ProfilePageexpectedURL) ? 
                "Candidate Redirected to my profile page Successfully: Test case is passed" : 
                "Candidate not able to click on my profile: Test case is failed";
        
        System.out.println(ProfilePageactualResult);
        
//    	Object of Profile Page POM class for perform actions on web elements from dashboard page
        Can_MyProfilePage ProfilePage = new Can_MyProfilePage (driver);
        
//      CLick on download CV
        ProfilePage.DownloadCV();
        System.out.println("CV downloaded Successfully");
        
//      Click on save button
        ProfilePage.SaveButton();
        Thread.sleep(5000);
        
//       Accept Alert for save profile password
		Alert Alt = driver.switchTo().alert();
		Alt.accept();
		
//		Compare result with Job openings page URL for pass test case
        String actualURL = "https://design.sniperai.com/candidate/job-openings";
        String expectedURL = driver.getCurrentUrl();
        String actualResult = actualURL.equals(expectedURL) ? 
                "Candidate clicked on Submit button and profile password saved Successfully: Test case is passed" : 
                "Profile passowrd is not saved : Test case is failed";
        
        System.out.println(actualResult);

        Design_Excel_Data_UtilityClass.writeResult(actualResult);

        if (!actualURL.equals(expectedURL)) 
        {
            Assert.fail("Candidate's profile password is not saved: Test case is failed");
        } 	
	}

}
