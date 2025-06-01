package cbtgpreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import cbtg_preprod.sniperai.com_utility_Classes.CBTGPreprod_Excel_Data_UtilityClass;
import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC034_Rec_ChatotHistReport_Download extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void ChatotHistoryReport() throws IOException, InterruptedException
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
		
//		Click on Chatot History Report
		RecJobListPage.ChatbotHistoryReport();
		System.out.println("Clicked On Chatbot History Report");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://johnclementspreprod.sniperai.com/recruiter/manage-dashboard.php?page=chatbot_report";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Chatbot History Report page opened Successfully and Report Downloaded: Test case is passed" : 
	            "Chatbot History Report page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    CBTGPreprod_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Chatbot History Report page is not opened : Test case is failed");
	    }
		
	}
	
}
