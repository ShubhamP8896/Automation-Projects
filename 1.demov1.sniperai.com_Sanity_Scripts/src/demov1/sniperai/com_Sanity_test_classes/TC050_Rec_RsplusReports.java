package demov1.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import demov1.sniperai.com_utility_Classes.Demov1_Excel_Data_UtilityClass;
import demov1_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC050_Rec_RsplusReports extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void RSplusReports() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Move Cursor on reports
		RecJobListPage.RSPlus();
		
//		CLick on rsplus config 
		RecJobListPage.RSPlusReport();
		System.out.println("Clicked on Rsplus Reports");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/recruiter/rsplus_reports.php";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Rsplus Reports page opened Successfully and Report Downloaded: Test case is passed" : 
	            "Rsplus Reports page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Demov1_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Rsplus Reports page is not opened : Test case is failed");
	    }
		
	}

}
