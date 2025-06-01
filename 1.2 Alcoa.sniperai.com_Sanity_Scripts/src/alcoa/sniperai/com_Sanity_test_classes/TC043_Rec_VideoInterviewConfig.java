package alcoa.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import alcoa.sniperai.com_utility_Classes.Alcoa_Excel_Data_UtilityClass;
import alcoa_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC043_Rec_VideoInterviewConfig extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void VideoInterviewConfig() throws IOException
	{
//		Object of Job list page to perform actions
		Rec_JobListPage_POM_Class JobListPage = new Rec_JobListPage_POM_Class(driver);
		
		JobListPage.Sidebar();
		System.out.println("Clicked on Sidebar");
		
		JobListPage.SettingsCursorMove();
		System.out.println("Moved Cursor on Settings");
		
		JobListPage.VideoInterviewConfig();
		System.out.println("Clicked on Video Interview Config");
		
//		Compare Actual and expected URL of LinkedIn Config page
		String actualURL = "https://alcoa.sniperai.com/recruiter/video_interview_configuration";
		String expectedURL = driver.getCurrentUrl();
		String actualResult = actualURL.equals(expectedURL) ? 
            "Video Interview Config page opened Successfully and RAW Report Downloaded: Test case is passed" : 
            "Video Interview Config page is not opened : Test case is failed";
    
	    System.out.println(actualResult);
	
	    Alcoa_Excel_Data_UtilityClass.writeResult(actualResult);
	
	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Video Interview Config Settings page is not opened : Test case is failed");
	    }
	}
}
