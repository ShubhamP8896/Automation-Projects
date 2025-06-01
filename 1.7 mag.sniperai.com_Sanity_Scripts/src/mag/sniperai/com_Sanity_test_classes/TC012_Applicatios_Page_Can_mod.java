package mag.sniperai.com_Sanity_test_classes;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import mag.sniperai.com_utility_Classes.MAG_Excel_Data_UtilityClass;
import mag_CanMod_POM_classes.Can_DashboardPage;

public class TC012_Applicatios_Page_Can_mod extends A002_BaseTestClass_Can_Design
{
    @Test
    public void AppliedJobsFromDB() throws IOException {
    	
//    	Object of Dashboard POM class for perform actions on web elements from dashboard page
    	Can_DashboardPage Dashboard = new Can_DashboardPage (driver);
    	Dashboard.AppliedJobs();
    	    	
        String actualURL = "https://demov1.sniperai.com/candidate/applied-jobs";
        String expectedURL = driver.getCurrentUrl();
        String actualResult = actualURL.equals(expectedURL) ? 
                "Candidate clicked on Jobs you have applied to Successfully: Test case is passed" : 
                "Jobs you have applied to not able to click: Test case is failed";
        
        System.out.println(actualResult);

        MAG_Excel_Data_UtilityClass.writeResult(actualResult);

        if (!actualURL.equals(expectedURL)) 
        {
            Assert.fail("Candidate not able to click on Jobs you have applied to: Test case is failed");
        }
    }
}