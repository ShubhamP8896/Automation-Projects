package day70_ListenersTestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener
{

	/** Invoked each time before a test method will be invoked. */
	@Override
	  public void onTestStart(ITestResult result)
	  {
	    System.out.println("onTestStart");
	  }

	  /** Invoked each time a test method succeeds. */
	@Override
	public void onTestSuccess(ITestResult result) 
	  {
		    System.out.println("onTestSuccess");
	  }
	  /** Invoked each time a test method fails.*/
	@Override
	  public void onTestFailure(ITestResult result) 
	  {
		    System.out.println("onTestFailure");
		  }

	  /** Invoked each time a test method is skipped. */
	@Override
	  public void onTestSkipped(ITestResult result) 
	  {
		    System.out.println("onTestSkipped");
		  }
	  
	  /**Invoked before running all the test methods belonging to the classes : Means run once before the <test> tag */
	@Override
	  public void onStart(ITestContext context)
	  {
		    System.out.println("onStart");
		  }
	  
	  /** Invoked after all the test methods belonging to the classes  : Means run once After the <test> tag*/
	@Override
	  public void onFinish(ITestContext context) 
	  {
		    System.out.println("onFinish");
		  }
}
