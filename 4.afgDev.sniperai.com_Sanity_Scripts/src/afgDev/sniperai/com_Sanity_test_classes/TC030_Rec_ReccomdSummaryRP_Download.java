package afgDev.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import afg_dev.sniperai.com_utility_Classes.AfgDev_Excel_Data_UtilityClass;
import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC030_Rec_ReccomdSummaryRP_Download extends A003_BaseTestClass_Rec_Design

{ 
	@Test
	public void DownloadReccomdSummaryRep() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Move Cursor on reports
		RecJobListPage.Reports();
		
//		Move Cursor on download report
		RecJobListPage.DowloadReports();
		
//		Click on Reccomd Summary Report
		RecJobListPage.RecommendationsSummary();
		System.out.println("Clicked On Reccomedations Summary Report");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://afgdev.sniperai.com/recruiter/manage-dashboard.php?page=recommendation_reports";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Reccomedations Summary Report page opened Successfully and Report Downloaded: Test case is passed" : 
	            "Reccomedations Summary Report page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    AfgDev_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Reccomedations Summary Report page is not opened : Test case is failed");
	    }
		
		
	}
		
		



}
