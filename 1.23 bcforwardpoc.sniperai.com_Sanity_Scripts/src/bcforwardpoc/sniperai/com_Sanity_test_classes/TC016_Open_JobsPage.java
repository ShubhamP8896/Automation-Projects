package bcforwardpoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import bcforwardpoc.sniperai.com_utility_Classes.Bcforwardpoc_Excel_Data_UtilityClass;
import bcforwardpoc_CanMod_POM_classes.Can_DashboardPage;

public class TC016_Open_JobsPage extends A002_BaseTestClass_Can_Design
{
	@Test
	public void OpenJobsPage() throws IOException
	{
//		Object of Dashboard POM class for perform actions on web elements from dashboard page
		Can_DashboardPage Dashboard = new Can_DashboardPage (driver);
		
		Dashboard.Sidebar();
		System.out.println("Clicked On sidebar");
		
		Dashboard.jobs();
		System.out.println("Opened Job openings page");
		
//		Compare result with contact page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/candidate/job-openings";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Job openings page opened Successfully: Test case is passed" : 
	            "Job openings page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Bcforwardpoc_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Job openings page is not opened : Test case is failed");
	    } 
	}

}
