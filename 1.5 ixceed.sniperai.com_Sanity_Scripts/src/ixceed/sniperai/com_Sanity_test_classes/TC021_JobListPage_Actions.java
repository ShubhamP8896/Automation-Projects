package ixceed.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import ixceed.sniperai.com_utility_Classes.Ixceed_Excel_Data_UtilityClass;
import ixceed_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC021_JobListPage_Actions extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void JobListPageActions_Rec() throws InterruptedException, IOException
	{
//		JobList page POM class object to perform actions on job list page
		Rec_JobListPage_POM_Class JobListPage = new Rec_JobListPage_POM_Class(driver);
		
		JobListPage.Alljobs();
		System.out.println("Clicked on all jobs");
		
		JobListPage.Inactivejobs();
		System.out.println("Clicked on Inactive jobs");
		
		JobListPage.Activejobs();
		System.out.println("Clicked on active jobs");
		
		JobListPage.Myjobs();
		System.out.println("Clicked on My jobs");
		
		JobListPage.ItemsPerPage();
		System.out.println("Clicked on Items per page");
		
		JobListPage.ItemsPerPage25();
		System.out.println("Selected Items per page :> 25");
		
		JobListPage.BulkAction();
		System.out.println("Clicked on Bulk action");
		
		JobListPage.BulkAction();
		System.out.println("Clicked on Bulk action");
		
		JobListPage.JobReqSorting();
		System.out.println("Clicked on Job req Sorting");
		
		JobListPage.JobReqColumnFilter();
		System.out.println("Clicked on Job req Column filter icon");
		
		JobListPage.JobReqColumnFilterSearch();
		System.out.println("Clicked on Job req Column filter Search icon");
		
//		JobListPage.JobTitleSorting();
//		System.out.println("Clicked on Job Title Sorting");
//		
//		JobListPage.JobTitleColumnFilter();
//		System.out.println("Clicked on Job Title Column filter icon");
//		
//		JobListPage.JobTitleColumnFilterSearch();
//		System.out.println("Clicked on Job Title Column filter Search icon");
//		
//		JobListPage.JobLocationSorting();
//		System.out.println("Clicked on Job Location Sorting");
//		
//		JobListPage.JobLocationColumnFilter();
//		System.out.println("Clicked on Job Location Column filter icon");
//		
//		JobListPage.JobLocationColumnFilterSearch();
//		System.out.println("Clicked on Job Location Column filter Search icon");
		
//		JobListPage.PaginationLast();
//		System.out.println("Clicked on Pagination");
		
//		JobListPage.PaginationFirst();
//		System.out.println("Clicked on Pagination");
//		
		JobListPage.ResetButton();
		System.out.println("Clicked on Reset button");
		
//		Thread.sleep(5000);
////		for Scroll down on the job list page
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
		
//		For compare results 
		 String actualURL = "https://ixceed.sniperai.com/recruiter/live-jobs";
	        String expectedURL = driver.getCurrentUrl();

	        String actualResult = actualURL.equals(expectedURL) ? 
	                "Recruiter able to perform actions on job list Successfully: Test case is passed" : 
	                "Recruiter Not able to perform all the actions: Test case is failed";
	        
	        System.out.println(actualResult);

	        Ixceed_Excel_Data_UtilityClass.writeResult(actualResult);

	        if (!actualURL.equals(expectedURL)) 
	        {
	            Assert.fail("Recruiter Not able to perform all the actions");
	        }

	}

}
