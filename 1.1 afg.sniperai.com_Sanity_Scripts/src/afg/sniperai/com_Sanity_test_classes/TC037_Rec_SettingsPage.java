package afg.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import afg.sniperai.com_utility_Classes.Afg_Excel_Data_UtilityClass;
import afg_RecMod_POM_classes.Rec_JobListPage_POM_Class;

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
		String actualURL = "https://afg.sniperai.com/recruiter/settings";
		String expectedURL = driver.getCurrentUrl();
		String actualResult = actualURL.equals(expectedURL) ? 
            "Settings page opened Successfully : Test case is passed" : 
            "Settings page is not opened : Test case is failed";
    
	    System.out.println(actualResult);
	
	    Afg_Excel_Data_UtilityClass.writeResult(actualResult);
	
	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Settings page is not opened : Test case is failed");
	    }
	    
	}

}
