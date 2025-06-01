package design.sniperai.com_Sanity_test_classes;

import java.io.IOException;
import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;
import org.testng.annotations.Test;

import design.sniperai.com_utility_Classes.Design_Excel_Data_UtilityClass;
import dev_prepod_Sanity_POM_Classes.JobOpeningsPage;
import dev_prepod_Sanity_POM_Classes.LoginPage;

public class TC005Verify_JobOpeningsPageActions extends A001_BaseTestClass_Design 
{
	@Test
	public void JobOpeningsPageActions() throws IOException, InterruptedException
	{
		try
		{
		// Object of Login Page class for performing action on those web elements.
				LoginPage LP = new LoginPage(driver);
		        LP.JobOpenings();
		        System.out.println("Clicked on Job Openings Page and Job Openings Page is Opened");
		        
		// Object of Job Openings Page POM class for performing action on those web elements.
				JobOpeningsPage JobOpenings = new JobOpeningsPage(driver);
//				1) Clicked on job title sorting
				JobOpenings.JobTitleSorting();
				System.out.println("Clicked on job sorting filter and sorting filter applied successfully");
				
				JobOpenings.JobTitleSorting();
				System.out.println("Clicked on job sorting filter and sorting filter applied successfully");
				
//				2)Clicked on job title filter
				JobOpenings.JobtitleFilter();
				System.out.println("Clicked job title filterd successfully");
				
//				2)Clicked on job title filter search
				JobOpenings.JobtitleFilterSearch();
				System.out.println("Clicked on job title filter search successfully");
				
//				2)Clicked on job Req sorting filter
				JobOpenings.JobReqSorting();
				System.out.println("Clicked on job Req sorting filter successfully");
				
//				2)Clicked on job Req sorting filter
				JobOpenings.JobReqSorting();
				System.out.println("Clicked on job Req sorting filter successfully");
				
//				2)Clicked on job Req filter
				JobOpenings.JobReqFilter();
				System.out.println("Clicked job Req filter successfully");
				
//				2)Clicked on job Req filter search
				JobOpenings.JobReqFilterSearch();
				System.out.println("Clicked on job Req filter search successfully");
				
//				2)Clicked on Client sorting filter			
				JobOpenings.ClientSorting();
				System.out.println("Clicked Client sorting filter successfully");
				
//				2)Clicked on Client sorting filter
				JobOpenings.ClientSorting();
				System.out.println("Clicked on Client sorting filter successfully");
				
//				2)Clicked on Client filter
				JobOpenings.ClientFilter();
				System.out.println("Clicked on Client filter successfully");
				
//				2)Clicked on Porject sorting filter
				JobOpenings.ProjectSorting();
				System.out.println("Clicked on Porject sorting filter successfully");
				
//				2)Clicked on Porject filter
				JobOpenings.ProjectFilter();
				System.out.println("Clicked on Porject filter successfully");
				
//				2)Clicked on job Location sorting filter
				JobOpenings.JobLocationSorting();
				System.out.println("Clicked on job Location sorting filter successfully");
				
//				2)Clicked on job Location filter
				JobOpenings.jobLocationFilter();
				System.out.println("Clicked on job Location filter successfully");
				
//				2)Clicked on Reset Buttom
				JobOpenings.Reset();
				System.out.println("Clicked reset button successfully");
				
		}
		
				catch (UnhandledAlertException e) 
		        {
		            handleAlert();

		        } catch (NoAlertPresentException e) {
		            System.out.println("No alert present on the page.");
//		            Excel_Data_UtilityClass.writeResult("No alert present on the page.");

		        } catch (NoSuchElementException e) {
		            System.out.println("No web element found on the page.");
		            Design_Excel_Data_UtilityClass.writeResult("No web element found on the page.");
		           
		        } catch (WebDriverException e) {
		            System.out.println("WebDriverException occurred: " + e.getMessage());
		            Design_Excel_Data_UtilityClass.writeResult("WebDriverException occurred: " + e.getMessage());
		          
		        } catch (Exception e) {
		            System.out.println("An exception occurred: " + e.getMessage());
		            Design_Excel_Data_UtilityClass.writeResult("An exception occurred: " + e.getMessage());
		           
		        }
				
				String JOActualURL = driver.getCurrentUrl();
				System.out.println(JOActualURL);
				
				Thread.sleep(5000);
//				for Scroll down on the job list page
		        JavascriptExecutor js = (JavascriptExecutor) driver;
		        js.executeScript("window.scrollBy(0,1000)");
				
				String JOExpectedURL = "https://design.sniperai.com/job-openings";
		        
				String ActualResult = JOActualURL.equals(JOExpectedURL) ?
						"Actions performed successfully on the Job Openings page, Test case is passed" :
							"Test case is Failed";
				
				Design_Excel_Data_UtilityClass.writeResult(ActualResult);

		        if (!JOActualURL.equals(JOExpectedURL)) 
		        {
		            Assert.fail("Job Openings page Actions : Test case is failed");
		        }

	}
}
