package day71_ExtentReportsTestNG;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportClassWithListeners implements ITestListener
{
	public ExtentSparkReporter SparkReporter; // UI of Report
	public ExtentReports extent; // common information
	public ExtentTest test; // test case 
	public void onStart(ITestContext context)
	{
//		Code for generate the report with date and time: Because of this existing reports are not removed
		String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss").format(new Date());
		String repName = "TestReport-" + timeStamp +".html";
		SparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);
		
//		Below code is the hard coded, when we generate new report then existing is removed 
//		SparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myreport.html");
		SparkReporter.config().setDocumentTitle("Automation Report");
		SparkReporter.config().setReportName("Functional Testing");
		SparkReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(SparkReporter);
		extent.setSystemInfo("Computer Name", "local host");
		extent.setSystemInfo("Environment", "QA-UAT");
		extent.setSystemInfo("Tester", "Shubham Pawar");
		extent.setSystemInfo("OS", "Windows11");
		extent.setSystemInfo("Browser", "Chrome");
	}
	public void onTestSuccess(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Pass"+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Fail"+result.getName());
		try
		{
			String imgPath = new BaseClassForTakeSS().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgPath);
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	public void onTestSkipped(ITestResult result)
	{
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Skipped"+result.getName());
	}
	public void onFinish(ITestContext context)
	{
		extent.flush();
	}
}
