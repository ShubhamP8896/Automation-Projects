package sftest.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;
import sftest.sniperai.com_utility_Classes.Sftest_Excel_Data_UtilityClass;

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
		
		Thread.sleep(2500);
//		for Scroll down on the job list page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://sftest.sniperai.com/recruiter/candidates";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Candidates page opened Successfully : Test case is passed" : 
	            "Candidates page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Sftest_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Candidates page is not opened : Test case is failed");
	    }
		
	}

}
