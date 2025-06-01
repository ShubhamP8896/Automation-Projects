package design.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import design.sniperai.com_utility_Classes.Design_Excel_Data_UtilityClass;

public class TC020_Login_RecruiterModule extends A003_BaseTestClass_Rec_Design
{
	@Test
	public void RecruiterLogin() throws IOException, InterruptedException
	{	
		Thread.sleep(5000);
//		for Scroll down on the job list page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		
//		For compare results 
		 String actualURL = "https://design.sniperai.com/recruiter/live-jobs";
	        String expectedURL = driver.getCurrentUrl();

	        String actualResult = actualURL.equals(expectedURL) ? 
	                "Recruiter Logged In Successfully: Test case is passed" : 
	                "Recruiter Login failed: Test case is failed";
	        
	        System.out.println(actualResult);

	        Design_Excel_Data_UtilityClass.writeResult(actualResult);

	        if (!actualURL.equals(expectedURL)) 
	        {
	            Assert.fail("Recruiter Login failed: Test case is failed");
	        }
	}
}
