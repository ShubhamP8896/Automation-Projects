package insightinc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import insightinc.sniperai.com_utility_Classes.Iinsightinc_Excel_Data_UtilityClass;
import insightinc_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC045_UtilitiesSkillAffinity extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void SkillAffinityUtility() throws IOException
	{
//		Object of job list page POM for perform actions on the web Elements
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class(driver);
		
//		Click on sidebar
		RecJobListPage.Sidebar();
		System.out.println("Clicked on sidebar");
		
//		Move mouse on the utilities
		RecJobListPage.Utilities();
		
//		Click on Skill Affinity
		RecJobListPage.SkillAffinity();
		
//		Compare Actual and Expected URL to get test result
		String ActualURL = "https://insightinc.sniperai.com/recruiter/skill_affinity_utility";
		
		String ExpectedUrl = driver.getCurrentUrl();
		
		String ActualResult = ActualURL.equals(ExpectedUrl) ?
		          "Skill Affinity Utility page opened Successfully : Test case is passed" : 
		              "Skill Affinity Utility page is not opened : Test case is failed";
		      
		  	    System.out.println(ActualResult);
		  	
		  	    Iinsightinc_Excel_Data_UtilityClass.writeResult(ActualResult);
		  	
		  	    if (!ActualURL.equals(ExpectedUrl)) 
		  	    {
		  	        Assert.fail("Skill Affinity Utility page is not opened : Test case is failed");
		  	    }
		
	}

}
