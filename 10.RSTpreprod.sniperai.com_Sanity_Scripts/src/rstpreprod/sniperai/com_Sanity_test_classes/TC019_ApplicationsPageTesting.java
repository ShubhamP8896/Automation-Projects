package rstpreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev_preprod_CanMod_POM_classes.Can_ApplicationsPage;
import dev_preprod_CanMod_POM_classes.Can_DashboardPage;
import rstpreprod.sniperai.com_utility_Classes.RSTPreprod_Excel_Data_UtilityClass;

public class TC019_ApplicationsPageTesting extends A002_BaseTestClass_Can_Design
{
	@Test
	public void ApplicationsPageTesting() throws IOException
	{
//		Object of Dashboard POM class for perform actions on web elements from dashboard page
		Can_DashboardPage Dashboard = new Can_DashboardPage (driver);
		
		Dashboard.Sidebar();
		System.out.println("Clicked On sidebar");
		
		Dashboard.applications();
		System.out.println("Applications page Opened successfully");
		
//		Object of ApplicationPage POM class for perform actions on web elements from ApplicationPage page
		Can_ApplicationsPage ApplicationPage = new Can_ApplicationsPage (driver);
		
		ApplicationPage.JobReqSorting();
		System.out.println("Clicked On JobReqSorting");
		
		ApplicationPage.JobTitleSorting();
		System.out.println("Clicked On JobTitleSorting");
		
		ApplicationPage.JobLocationSorting();
		System.out.println("Clicked On JobLocationSorting");
		
		ApplicationPage.CreatedOnSorting();
		System.out.println("Clicked On CreatedOnSorting");
		
//		Compare result with contact page URL for pass test case
	    String actualURL = "https://johnclementspreprod.sniperai.com/candidate/applied-jobs";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Applications page opened Successfully and all the sorting filter working properly: Test case is passed" : 
	            "Applications page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    RSTPreprod_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Applications page is not opened : Test case is failed");
	    } 
		
	}

}
