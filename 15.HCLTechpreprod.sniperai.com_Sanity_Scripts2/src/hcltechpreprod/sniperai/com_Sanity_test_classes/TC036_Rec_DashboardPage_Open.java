package hcltechpreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;
import hcltechpreprod.sniperai.com_utility_Classes.HcltechPreprod_Excel_Data_UtilityClass;

public class TC036_Rec_DashboardPage_Open extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void OpenDashboardPage() throws IOException
	{
//		Object of Job list page to perform actions
		Rec_JobListPage_POM_Class JobListPage = new Rec_JobListPage_POM_Class(driver);
		
		JobListPage.Sidebar();
		
		JobListPage.Reports();
		
		JobListPage.DashboardReports();
		
//		Compare Actual and expected URL of Dashboard page
		String actualURL = "https://design.sniperai.com/recruiter/manage-dashboard.php?page=view_reports";
		String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Dashboard page opened Successfully and RAW Report Downloaded: Test case is passed" : 
	            "Dashboard page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    HcltechPreprod_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Dashboard page is not opened : Test case is failed");
	    }
		
		
		
	}

}
