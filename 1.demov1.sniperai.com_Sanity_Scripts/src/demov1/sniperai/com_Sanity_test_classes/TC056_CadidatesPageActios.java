package demov1.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import demov1.sniperai.com_utility_Classes.Demov1_Excel_Data_UtilityClass;
import demov1_RecMod_POM_classes.Rec_CandidatesPage_POM_Class;
import demov1_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC056_CadidatesPageActios extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void CandidatesPageActions() throws IOException, InterruptedException
	{
//		Constructor of Job List Page POM to perform actions on the job list page
		Rec_JobListPage_POM_Class RecJobList = new Rec_JobListPage_POM_Class(driver);
		
//		Constructor of Candidates Page POM to perform actions on the Candidates page
		Rec_CandidatesPage_POM_Class CandidatesPage = new Rec_CandidatesPage_POM_Class(driver);
		
//		Clicked On the SideBar
		RecJobList.Sidebar();
		System.out.println("Clicked on side bar");
		
//		Clicked on the candidates page
		RecJobList.Candidates();
		System.out.println("Clicked on Candidates page");
		
//		need to change this spurce names as per ribbon
		
//		CandidatesPage.NewRecommendations();
//		System.out.println("Clicked on New Recommendations");
//		
//		CandidatesPage.NewApplications();
//		System.out.println("Clicked on New Applications");
//		
//		CandidatesPage.AllCandidates();
//		System.out.println("Clicked on All Candidates");
		
		CandidatesPage.Sources();
		System.out.println("Clicked on Sources");
		
		CandidatesPage.ApplyNow();
		System.out.println("Clicked on Apply Now");
		
		CandidatesPage.ItemsPerPage();
		System.out.println("Clicked on ItemsPerPage");
		
		CandidatesPage.ItemsPerPage_25();
		System.out.println("Clicked on ItemsPerPage_25");
		
		CandidatesPage.BulkAction();
		System.out.println("Clicked on Bulk action");
		
		CandidatesPage.BulkAction();
		System.out.println("Clicked on Bulk Action");
		
//		CandidatesPage.DownloadCV();
//		System.out.println("Clicked on Download CV");
		
		CandidatesPage.NameSortingFilter();
		System.out.println("Clicked on Name Sorting");
		
		CandidatesPage.NameSortingFilter();
		System.out.println("Clicked on Name Sorting");
		
		CandidatesPage.NameColumnFilter();
		System.out.println("Clicked on Name Column filter");
		
		CandidatesPage.NameColumnFilterSearch();
		System.out.println("Clicked on Name column filter search");
		
//		CandidatesPage.EmailSortingFilter();
//		System.out.println("Clicked on Email Sorting");
//		
//		CandidatesPage.EmailSortingFilter();
//		System.out.println("Clicked on Email Sorting");
//		
//		CandidatesPage.EmailColumnFilter();
//		System.out.println("Clicked on Email Filter");
//		
//		CandidatesPage.EmailColumnFilterSearch();
//		System.out.println("Clicked on Email Filter Search");
		
//		CandidatesPage.Pagination2ndPage();
//		System.out.println("Clicked on Page 2");
		
		CandidatesPage.Reset();
		System.out.println("Clicked on Reset");
		
		Thread.sleep(5000);
//		for Scroll down on the job list page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,5000)");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/recruiter/candidates";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Candidates page opened Successfully and Actions Performed on the candidates page : Test case is passed" : 
	            "Candidates page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Demov1_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Candidates page is not opened : Test case is failed");
	    }
		
	}
}
