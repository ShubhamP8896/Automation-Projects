package design.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import design.sniperai.com_utility_Classes.Design_Excel_Data_UtilityClass;
import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC051_RsplusCandidates extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void RSplusCadidates() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Move Cursor on reports
		RecJobListPage.RSPlus();
		
//		CLick on rsplus config 
		RecJobListPage.RSPlusCandidates();
		System.out.println("Clicked on Rsplus Candidates");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://design.sniperai.com/recruiter/rsplus_candidates.php";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Rsplus Candidates page opened Successfully : Test case is passed" : 
	            "Rsplus Candidates page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Design_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Rsplus Candidates page is not opened : Test case is failed");
	    }
		
	}

}
