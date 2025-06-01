package edgeGrouppreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import dev_preprod_RecMod_POM_classes.Rec_JobListPage_POM_Class;
import edgegroup_preprod.sniperai.com_utility_Classes.EdgeGroupPreprod_Excel_Data_UtilityClass;

public class TC025_Rec_EquitibleHiringPage extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void OpenEquitibleHiringPage() throws IOException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class (driver);
		
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
		RecJobListPage.Admin();
		
		RecJobListPage.EquitableHiring();
		System.out.println("Opened Equitible Hiring page");
		
//		Compare result with contact page URL for pass test case
	    String actualURL = "https://design.sniperai.com/recruiter/bulk_blind_hiring.php";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Equitible Hiring page opened Successfully: Test case is passed" : 
	            "Equitible Hiring page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    EdgeGroupPreprod_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Equitible Hiring page is not opened : Test case is failed");
	    } 
	}
}
