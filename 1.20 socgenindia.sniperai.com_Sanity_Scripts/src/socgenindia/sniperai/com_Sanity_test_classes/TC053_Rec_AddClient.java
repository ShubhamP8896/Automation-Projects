package socgenindia.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import socgenindia.sniperai.com_utility_Classes.Socgenindia_Excel_Data_UtilityClass;
import socgenindia_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC053_Rec_AddClient extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void AddCliet() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Move Cursor on Client Module
		RecJobListPage.ClientModule();
		
//		CLick on add Client
		RecJobListPage.AddClient();
		System.out.println("Clicked on Add Client");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/recruiter/add_client";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Add Client page opened Successfully : Test case is passed" : 
	            "Add Client page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Socgenindia_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Add Client page is not opened : Test case is failed");
	    }
		
	}

}
