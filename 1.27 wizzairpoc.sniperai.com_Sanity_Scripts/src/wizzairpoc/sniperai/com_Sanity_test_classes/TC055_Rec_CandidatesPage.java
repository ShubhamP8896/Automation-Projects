package wizzairpoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import wizzairpoc.sniperai.com_utility_Classes.Wizzairpoc_Excel_Data_UtilityClass;
import wizzairpoc_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC055_Rec_CandidatesPage extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void CandidatesPage() throws IOException, InterruptedException
	{			
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Click on candidates
		RecJobListPage.Candidates();
		
//		Thread.sleep(5000);
////		for Scroll down on the job list page
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://wizzairpoc.sniperai.com/recruiter/candidates";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Candidates page opened Successfully : Test case is passed" : 
	            "Candidates page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Wizzairpoc_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Candidates page is not opened : Test case is failed");
	    }
		
	}

}
