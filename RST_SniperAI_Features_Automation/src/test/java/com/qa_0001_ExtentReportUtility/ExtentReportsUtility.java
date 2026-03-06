package com.qa_0001_ExtentReportUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReportsUtility
{
    private static ExtentReports extent;
    private static ExtentSparkReporter sparkReporter;

    public static ExtentReports getExtentReport()
    {
        if(extent == null)
        {
            String timeStamp = new SimpleDateFormat("yyyy_MM_dd_HH-mm-ss").format(new Date());
            String reportName = "Automation_TestReport-" + timeStamp + ".html";

            sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\reports\\" + reportName);
            sparkReporter.config().setDocumentTitle("Automation Testing Report");
            sparkReporter.config().setReportName("Funtionality Testing Execution Report");
            sparkReporter.config().setTheme(Theme.DARK);


            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Computer Name", "Localhost");
            extent.setSystemInfo("Environment", "QA-UAT");
            extent.setSystemInfo("Tester", "Shubham Pawar");
            extent.setSystemInfo("OS", "Windows 11");
            extent.setSystemInfo("Browser", "Chrome");
        }
        return extent;
    }
}
