package day70_ListenersTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners_class_2 implements ITestListener
{
	/** Invoked each time before a test method will be invoked. */
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test started: " + result.getName());
    }
    /** Invoked each time a test method succeeds. */
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test passed: " + result.getName());
    }
    /** Invoked each time a test method fails.*/
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
    }
    /** Invoked each time a test method is skipped. */
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skipped: " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test failed but within success percentage: " + result.getName());
    }
    /**Invoked before running all the test methods belonging to the classes : Means run once before the <test> tag */
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test execution started: " + context.getName());
    }
    /** Invoked after all the test methods belonging to the classes  : Means run once After the <test> tag*/
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test execution finished: " + context.getName());
    }
}