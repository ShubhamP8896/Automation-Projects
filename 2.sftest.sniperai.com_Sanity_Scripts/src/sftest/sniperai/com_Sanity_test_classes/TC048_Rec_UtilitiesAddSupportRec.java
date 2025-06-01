package sftest.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;
import sftest.sniperai.com_utility_Classes.Sftest_Excel_Data_UtilityClass;

public class TC048_Rec_UtilitiesAddSupportRec extends A003_BaseTestClass_Rec_Design 
{
	@Test
	public void AddSupportRecruiterUtility() throws IOException
	{
//		Object of job list page POM for perform actions on the web Elements
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on sidebar
		RecJobListPage.Sidebar();
		System.out.println("Clicked on sidebar");
		
//		Move mouse on the utilities
		RecJobListPage.Utilities();
		
//		Click on Add Support Recruiter
		RecJobListPage.AddSupportRecruiterUtility();
		
//		Compare Actual and Expected URL to get test result
		String ActualURL = "https://sftest.sniperai.com/recruiter/manage-dashboard.php?page=manage_support_recruiter&utility=supportrec";
		
		String ExpectedUrl = driver.getCurrentUrl();
		
		String ActualResult = ActualURL.equals(ExpectedUrl) ?
		          "Add Support Recruiter Utility page opened Successfully : Test case is passed" : 
		              "Add Support Recruiter page is not opened : Test case is failed";
		      
		  	    System.out.println(ActualResult);
		  	
		  	    Sftest_Excel_Data_UtilityClass.writeResult(ActualResult);
		  	
		  	    if (!ActualURL.equals(ExpectedUrl)) 
		  	    {
		  	        Assert.fail("Add Support Recruiter page is not opened : Test case is failed");
		  	    }
		
	}

}
