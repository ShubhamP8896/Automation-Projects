package damacgrouppoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import damacgrouppoc.sniperai.com_utility_Classes.Damacgrouppoc_Excel_Data_UtilityClass;
import damacgrouppoc_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC054_Rec_ClientSummary extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void ClietSummary() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Move Cursor on Client Module
		RecJobListPage.ClientModule();
		
//		CLick on Client Summary
		RecJobListPage.ClientSummary();
		System.out.println("Clicked on Client Summary");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://aacpoc.sniperai.com/recruiter/client_summary";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Client Summary page opened Successfully : Test case is passed" : 
	            "Client Summary page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Damacgrouppoc_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Client Summary page is not opened : Test case is failed");
	    }
		
	}

}
