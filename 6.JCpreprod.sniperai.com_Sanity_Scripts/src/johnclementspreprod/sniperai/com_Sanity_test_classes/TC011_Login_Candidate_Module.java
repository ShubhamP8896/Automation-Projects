package johnclementspreprod.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import jc_preprod.sniperai.com_utility_Classes.JCPreprod_Excel_Data_UtilityClass;

public class TC011_Login_Candidate_Module extends A002_BaseTestClass_Can_Design {
    @Test
    public void CandidateLogin() throws IOException {
        String actualURL = "https://johnclementspreprod.sniperai.com/candidate/index";
        String expectedURL = driver.getCurrentUrl();

        String actualResult = actualURL.equals(expectedURL) ? 
                "Candidate Logged In Successfully: Test case is passed" : 
                "Candidate Login failed: Test case is failed";
        
        System.out.println(actualResult);

        JCPreprod_Excel_Data_UtilityClass.writeResult(actualResult);

        if (!actualURL.equals(expectedURL)) {
            Assert.fail("Candidate Login failed: Test case is failed");
        }
    }
}