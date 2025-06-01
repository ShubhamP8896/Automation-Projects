package alcoapreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import alcoapreprod_sniperai.com_utility_Classes.AlcoaPreprod_Excel_Data_UtilityClass;
import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC031_Rec_HideUhideRep_Download extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void HideUnhideReport() throws IOException, InterruptedException
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
		
//		Click on Hide Unhide Report
		RecJobListPage.HideUnhideHistory();
		System.out.println("Clicked On Hide Unhide Report");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://design.sniperai.com/recruiter/manage-dashboard.php?page=hideunhide_report";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Hide Unhide Report page opened Successfully and Report Downloaded: Test case is passed" : 
	            "Hide Unhide Report page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    AlcoaPreprod_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Hide Unhide Report page is not opened : Test case is failed");
	    }
		
		
	}
		

}
