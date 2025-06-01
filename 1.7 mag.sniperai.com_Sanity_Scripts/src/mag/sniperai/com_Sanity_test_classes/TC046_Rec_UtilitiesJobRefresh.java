package mag.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mag.sniperai.com_utility_Classes.MAG_Excel_Data_UtilityClass;
import mag_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC046_Rec_UtilitiesJobRefresh extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void JobRefreshUtility() throws IOException
	{
//		Object of job list page POM for perform actions on the web Elements
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on sidebar
		RecJobListPage.Sidebar();
		System.out.println("Clicked on sidebar");
		
//		Move mouse on the utilities
		RecJobListPage.Utilities();
		
//		Click on Job Refresh
		RecJobListPage.JobRefresh();
		
//		Compare Actual and Expected URL to get test result
		String ActualURL = "https://malaysiaairlines.sniperai.com/recruiter/job_refresh_utility";
		
		String ExpectedUrl = driver.getCurrentUrl();
		
		String ActualResult = ActualURL.equals(ExpectedUrl) ?
		          "Job Refresh Utility page opened Successfully : Test case is passed" : 
		              "Job Refresh Utility page is not opened : Test case is failed";
		      
		  	    System.out.println(ActualResult);
		  	
		  	    MAG_Excel_Data_UtilityClass.writeResult(ActualResult);
		  	
		  	    if (!ActualURL.equals(ExpectedUrl)) 
		  	    {
		  	        Assert.fail("Job Refresh Utility page is not opened : Test case is failed");
		  	    }
		
	}

}
