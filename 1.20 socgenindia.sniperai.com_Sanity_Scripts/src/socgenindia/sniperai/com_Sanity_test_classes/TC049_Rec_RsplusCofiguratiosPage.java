package socgenindia.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import socgenindia.sniperai.com_utility_Classes.Socgenindia_Excel_Data_UtilityClass;
import socgenindia_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC049_Rec_RsplusCofiguratiosPage extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void RSplusCofig() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on the SideBar
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
//		Move Cursor on reports
		RecJobListPage.RSPlus();
		
//		CLick on rsplus config 
		RecJobListPage.RSPlusConfig();
		System.out.println("Clicked on Rsplus Configurations");
		
//		Compare result with RAW Report page URL for pass test case
	    String actualURL = "https://insightinc.sniperai.com/recruiter/rsplus_settings.php";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Rsplus Configurations page opened Successfully : Test case is passed" : 
	            "Rsplus Configurations page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Socgenindia_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Rsplus Configurations page is not opened : Test case is failed");
	    }
		
	}

}
