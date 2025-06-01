package bajajautopreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import bajajautopreprod.sniperai.com_utility_Classes.BajajAutoPreprod_Excel_Data_UtilityClass;
import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC041_Rec_LinkedInConfigPage extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void LinkedInConfig() throws IOException
	{
//		Object of Job list page to perform actions
		Rec_JobListPage_POM_Class JobListPage = new Rec_JobListPage_POM_Class(driver);
		
		JobListPage.Sidebar();
		System.out.println("Clicked on Sidebar");
		
		JobListPage.SettingsCursorMove();
		System.out.println("Moved Cursor on Settings");
		
		JobListPage.LinkedEnrichmentConfig();
		System.out.println("Clicked on LinkedIn Enrichment Config");
	
//		Compare Actual and expected URL of LinkedIn Config page
		String actualURL = "https://malaysiaairlinespreprod.sniperai.com/recruiter/touchless_rpa_settings";
		String expectedURL = driver.getCurrentUrl();
		String actualResult = actualURL.equals(expectedURL) ? 
            "LinkedIn Enrichment Config page opened Successfully and : Test case is passed" : 
            "LinkedIn Enrichment Config page is not opened : Test case is failed";
    
	    System.out.println(actualResult);
	
	    BajajAutoPreprod_Excel_Data_UtilityClass.writeResult(actualResult);
	
	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("LinkedIn Enrichment Config Settings page is not opened : Test case is failed");
	    }
	}

}
