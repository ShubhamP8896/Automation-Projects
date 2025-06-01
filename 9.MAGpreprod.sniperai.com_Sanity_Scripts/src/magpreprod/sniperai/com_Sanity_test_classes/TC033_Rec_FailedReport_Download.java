package magpreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;
import mag_preprod.sniperai.com_utility_Classes.MagPreprod_Excel_Data_UtilityClass;

public class TC033_Rec_FailedReport_Download  extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void FailedEmailReport() throws IOException, InterruptedException
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
		
//		Move Cursor on send Mail Delivery
		RecJobListPage.SendMailDeliveryReport();
		
//		Click on Hide Unhide Report
		RecJobListPage.FailedEmailDeliveryReport();
		System.out.println("Clicked On Failed Email Report");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://design.sniperai.com/recruiter/manage-dashboard.php?page=download_email_reports&type=failed";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Failed Email Report page opened Successfully and Report Downloaded: Test case is passed" : 
	            "Failed Email Report page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    MagPreprod_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Failed Email Report page is not opened : Test case is failed");
	    }
		
		
	}

}
