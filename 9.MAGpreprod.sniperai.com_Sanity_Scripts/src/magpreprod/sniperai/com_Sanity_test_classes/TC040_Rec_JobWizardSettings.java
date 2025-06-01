package magpreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;
import mag_preprod.sniperai.com_utility_Classes.MagPreprod_Excel_Data_UtilityClass;

public class TC040_Rec_JobWizardSettings extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void JobWizardSettingsPage() throws IOException
	{
//		Object of Job list page to perform actions
		Rec_JobListPage_POM_Class JobListPage = new Rec_JobListPage_POM_Class(driver);
		
		JobListPage.Sidebar();
		System.out.println("Clicked on Sidebar");
		
		JobListPage.SettingsCursorMove();
		System.out.println("Moved Cursor on Settings");
		
		JobListPage.JobWizardSettings();
		System.out.println("Clicked on Job Wizard Settings page");
	
//		Compare Actual and expected URL of Job Wizard Sttings page
		String actualURL = "https://malaysiaairlinespreprod.sniperai.com/recruiter/jd_generator_settings";
		String expectedURL = driver.getCurrentUrl();
		String actualResult = actualURL.equals(expectedURL) ? 
            "Job Wizard Settings page opened Successfully and : Test case is passed" : 
            "Job Wizard Settings page is not opened : Test case is failed";
    
	    System.out.println(actualResult);
	
	    MagPreprod_Excel_Data_UtilityClass.writeResult(actualResult);
	
	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Job Wizard Settings page is not opened : Test case is failed");
	    }
	}

}
