package clientpoc.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import clientpoc.sniperai.com_utility_Classes.Clientpoc_Excel_Data_UtilityClass;
import clientpoc_CanMod_POM_classes.Can_DashboardPage;

public class TC015_Open_contactsPage extends A002_BaseTestClass_Can_Design
{
	@Test
	public void OpenContactsPage() throws IOException
	{
//		Object of Dashboard POM class for perform actions on web elements from dashboard page
		Can_DashboardPage Dashboard = new Can_DashboardPage (driver);
		
		Dashboard.Contact();
		System.out.println("Contact page opened");
		
//		Compare result with contact page URL for pass test case
	    String actualURL = "https://demov1.sniperai.com/candidate/contact";
	    String expectedURL = driver.getCurrentUrl();
	    String actualResult = actualURL.equals(expectedURL) ? 
	            "Contact page opened Successfully: Test case is passed" : 
	            "Contact page is not opened : Test case is failed";
	    
	    System.out.println(actualResult);

	    Clientpoc_Excel_Data_UtilityClass.writeResult(actualResult);

	    if (!actualURL.equals(expectedURL)) 
	    {
	        Assert.fail("Contact page is not opened : Test case is failed");
	    } 
	}

}
