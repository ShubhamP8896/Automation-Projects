package edgegroup.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import edgegroup.sniperai.com_utility_Classes.Edgegroup_Excel_Data_UtilityClass;
import edgegroup_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC024_Rec_AddSupportRecruiterPage extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void OpenAddSupportRecPage() throws IOException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class (driver);
		
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
		RecJobListPage.Admin();
		
		RecJobListPage.AddSupportRecruiter();
		System.out.println("Opened Add Support Recruiter page");
		
//		Compare result with contact page URL for pass test case
	    String actualURL = "https://edgegroup.sniperai.com/recruiter/manage-dashboard.php?page=manage_support_recruiter";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Add Support Recruiter page opened Successfully: Test case is passed" : 
	            "Add Support Recruiter page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Edgegroup_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Add Support Recruiter page is not opened : Test case is failed");
	    } 
	}

}
