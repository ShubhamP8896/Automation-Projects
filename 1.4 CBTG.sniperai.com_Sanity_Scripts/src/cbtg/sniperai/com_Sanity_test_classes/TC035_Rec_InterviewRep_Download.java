package cbtg.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import cbtg.sniperai.com_utility_Classes.Cbtg_Excel_Data_UtilityClass;
import cbtg_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC035_Rec_InterviewRep_Download extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void InterviewSchedulerReport() throws IOException, InterruptedException
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
		
//		Move Cursor on Bot Report
		RecJobListPage.BotReports();
		
//		Click on Interview Scheduler Report
		RecJobListPage.InterviewSchedulerReport();
		System.out.println("Clicked On Interview Scheduler Report");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/recruiter/manage-dashboard.php?page=interviewscheduler_report";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Interview Scheduler Report page opened Successfully and Report Downloaded: Test case is passed" : 
	            "Interview Scheduler Report page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Cbtg_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Interview Scheduler Report page is not opened : Test case is failed");
	    }
		
	}
	
}
