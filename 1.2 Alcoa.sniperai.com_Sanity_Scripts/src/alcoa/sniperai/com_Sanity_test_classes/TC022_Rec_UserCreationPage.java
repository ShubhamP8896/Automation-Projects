package alcoa.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import alcoa.sniperai.com_utility_Classes.Alcoa_Excel_Data_UtilityClass;
import alcoa_RecMod_POM_classes.Rec_JobListPage_POM_Class;

public class TC022_Rec_UserCreationPage extends A003_BaseTestClass_Rec_Design 
{
	@Test
	public void OpenUserCreationPage() throws IOException, InterruptedException
	{
//		Object of Job List POM class for perform actions on web elements from Job List page
		Rec_JobListPage_POM_Class RecJobListPage = new Rec_JobListPage_POM_Class (driver);
		
		RecJobListPage.Sidebar();
		System.out.println("Clicked On sidebar");
		
		RecJobListPage.Admin();
		
		RecJobListPage.UserCreation();
		System.out.println("Opened User Creations page");
		
		Thread.sleep(5000);
//		for Scroll down on the job list page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		
//		Compare result with contact page URL for pass test case
	    String actualURL = "https://alcoa.sniperai.com/recruiter/user_creations.php";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "User Creations page opened Successfully: Test case is passed" : 
	            "User Creations page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Alcoa_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("User Creations page is not opened : Test case is failed");
	    } 
		
		
		
	}
	

}
