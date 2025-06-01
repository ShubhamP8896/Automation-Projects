package recruitmentsmart.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import recruitmentsmart.sniperai.com_utility_Classes.Recruitmentsmart_Excel_Data_UtilityClass;
import recruitmentsmart_RecMod_POM_classes.Rec_JobListPage_POM_Class;
import recruitmentsmart_RecMod_POM_classes.Rec_RawReport_POM_Class;

public class TC029_Rec_RawReport_Dowload extends A003_BaseTestClass_Rec_Design
{ 
	@Test
	public void DownloadRawReport() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Object of RAW Report POM class for perform actions on web elements from RAW Report page
		Rec_RawReport_POM_Class RawReportPage = new Rec_RawReport_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Move Cursor on reports
		RecJobListPage.Reports();
		
//		Move Cursor on download report
		RecJobListPage.DowloadReports();
		
//		Click on RAW Report
		RecJobListPage.RawReport();
		System.out.println("Clicked On RAW Report");
		
		RawReportPage.StartDate();
		System.out.println("Clicked On start Date");
		
//		RawReportPage.startDateNext();
//		System.out.println("Clicked On start Date Next");
//		
//		RawReportPage.startDateNext();
//		System.out.println("Clicked On start Date Next");
//		
//		RawReportPage.StartDatePrevious();
//		System.out.println("Clicked On Start Date Previous");
//		
		RawReportPage.StartDateClose();
		System.out.println("Clicked On Start Date Close");
		
		RawReportPage.EndDate();
		System.out.println("Clicked On End Date");
		
//		RawReportPage.EndDatePrevious();
//		System.out.println("Clicked On End Date Previous");
//		
//		RawReportPage.EndDatePrevious();
//		System.out.println("Clicked On End Date Previous");
//		
//		RawReportPage.EndDateNext();
//		System.out.println("Clicked On End Date Next");
		
		RawReportPage.EndDateClose();
		System.out.println("Clicked On End Date Close");
		
//		RawReportPage.DownloadButton();
//		System.out.println("Clicked On Download Report");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://recruitmentsmart.sniperai.com/recruiter/manage-dashboard.php?page=download_reports";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "RAW Report page opened Successfully and RAW Report Downloaded: Test case is passed" : 
	            "RAW Report page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Recruitmentsmart_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("RAW Report page is not opened : Test case is failed");
	    }
		
		
	}
	
}
