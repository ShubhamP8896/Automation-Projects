package deveregrouppoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import deveregrouppoc.sniperai.com_utility_Classes.Deveregrouppoc_Excel_Data_UtilityClass;
import deveregrouppoc_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC042_Rec_ScoreReprePage extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void ScoreRepreConfig() throws IOException
	{
//		Object of Job list page to perform actions
		Rec_JobListPage_POM_Class JobListPage = new Rec_JobListPage_POM_Class(driver);
		
		JobListPage.Sidebar();
		System.out.println("Clicked on Sidebar");
		
		JobListPage.SettingsCursorMove();
		System.out.println("Moved Cursor on Settings");
		
		JobListPage.ScoreRepConfig();
		System.out.println("Clicked on Score Representation Config");
		
//		Compare Actual and expected URL of LinkedIn Config page
		String actualURL = "https://deveregrouppoc.sniperai.com/recruiter/score_representation_settings";
		String expectedURL = driver.getCurrentUrl();
		String actualResult = actualURL.equals(expectedURL) ? 
            "Score Representation Config page opened Successfully and RAW Report Downloaded: Test case is passed" : 
            "Score Representation Config page is not opened : Test case is failed";
    
	    System.out.println(actualResult);
	
	    Deveregrouppoc_Excel_Data_UtilityClass.writeResult(actualResult);
	
	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Score Representation Config Settings page is not opened : Test case is failed");
	    }
	}


}
