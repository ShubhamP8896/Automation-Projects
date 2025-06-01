package aastratech.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import aastratech.sniperai.com_utility_Classes.Aastratech_Excel_Data_UtilityClass;
import aastratech_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC026_Req_BotCandidatePage extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void OpenBotCandidatesPage() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class (driver);
		
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
		RecJobListPage.Admin();
		
		RecJobListPage.BotCandidate();
		System.out.println("Opened Bot Candidates page");
		
		Thread.sleep(5000);
//		for Scroll down on the job list page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		
//		Compare result with Bot candidate page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/recruiter/bot_candidate.php";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Bot Candidates page opened Successfully: Test case is passed" : 
	            "Bot Candidates page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Aastratech_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Bot Candidates page is not opened : Test case is failed");
	    } 
	}

}
