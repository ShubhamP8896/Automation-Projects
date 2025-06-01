package deveregrouppoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import deveregrouppoc.sniperai.com_utility_Classes.Deveregrouppoc_Excel_Data_UtilityClass;
import deveregrouppoc_CanMod_POM_classes.Can_DashboardPage;
import deveregrouppoc_CanMod_POM_classes.Can_jobsPage;

public class TC017_Actions_JobsPage extends A002_BaseTestClass_Can_Design
{
	@Test
	public void JobsPageGTesting() throws IOException
	{
//		Object of Dashboard POM class for perform actions on web elements from dashboard page
		Can_DashboardPage Dashboard = new Can_DashboardPage (driver);
		
		Dashboard.Sidebar();
		System.out.println("Clicked On sidebar");
		
		Dashboard.jobs();
		System.out.println("Opened Job openings page");
	    
//		Object of Dashboard POM class for perform actions on web elements from dashboard page
	    Can_jobsPage JobsPage = new Can_jobsPage (driver);
	    
	    JobsPage.JobReqSorting();
	    System.out.println("Clicked On Job req Sorting filters");
	    
	    JobsPage.JobReqColFilter();
	    System.out.println("Clicked on job req Columns filter");
	    
	    JobsPage.JRColFiltButton();
	    System.out.println("Clicked on job req column filter search button");
	    
	    JobsPage.JobTitleSorting();
	    System.out.println("Clicked On Job Title Sorting filters");
	    
	    JobsPage.JobTitleFilter();
	    System.out.println("Clicked on job Title Columns filter");
	    
	    JobsPage.JTColFiltButton();
	    System.out.println("Clicked on job Title column filter search button");;
	    
	    JobsPage.RecruiterSorting();
	    System.out.println("Clicked On Recruiter Sorting filters");
	    
	    JobsPage.JobLocationSorting();
	    System.out.println("Clicked On Job Location Sorting filters");
	    
	    JobsPage.JobLocFilter();
	    System.out.println("Clicked on job Location Columns filter");
	    
	    JobsPage.JLColFiltButton();
	    System.out.println("Clicked on job Location column filter search button");
	    
	    JobsPage.JobTypeSorting();
	    System.out.println("Clicked On Job Type Sorting filters");
	    
//	    JobsPage.PaginationLast();
//	    System.out.println("Clicked On ragination and go to Last page");
//	    
//	    JobsPage.PaginationFirst();
//	    System.out.println("Clicked On ragination and go to first page");
	    
	    JobsPage.reset();
	    System.out.println("Clicked on reset button");
	    
//		Compare result with contact page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/candidate/job-openings";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Job openings page opened Successfully and all the column sorting and filter working properly : Test case is passed" : 
	            "Job openings page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Deveregrouppoc_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Job openings page is not opened : Test case is failed");
	    } 
	    
	    
	}

}
