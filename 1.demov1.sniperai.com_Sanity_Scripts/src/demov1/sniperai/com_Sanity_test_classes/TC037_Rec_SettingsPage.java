package demov1.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import demov1.sniperai.com_utility_Classes.Demov1_Excel_Data_UtilityClass;
import demov1_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC037_Rec_SettingsPage extends A003_BaseTestClass_Rec_Design
{
	
	@Test
	public void SettingsPage() throws IOException
	{
//		Object of Job list page to perform actions
		Rec_JobListPage_POM_Class JobListPage = new Rec_JobListPage_POM_Class(driver);
		
		JobListPage.Sidebar();
		System.out.println("Clicked on Sidebar");
		
		JobListPage.SettingsClick();
		System.out.println("Clicked on Settings");
	
//		Compare Actual and expected URL of Settings  page
		String actualURL = "https://demov1.sniperai.com/recruiter/settings";
		String expectedURL = driver.getCurrentUrl();
		String actualResult = actualURL.equals(expectedURL) ? 
            "Settings page opened Successfully : Test case is passed" : 
            "Settings page is not opened : Test case is failed";
    
	    System.out.println(actualResult);
	
	    Demov1_Excel_Data_UtilityClass.writeResult(actualResult);
	
	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Settings page is not opened : Test case is failed");
	    }
	    
	}

}
