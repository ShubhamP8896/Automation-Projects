package day67;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotaionsSequence
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("Before Suite Annotation");
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Before Test Annotation");
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Before Class Annotation");
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Before Method Annotation");
	}
	@Test(priority = 1, invocationCount = 2)
	public void search()
	{
		System.out.println("Search test case");
	}
	@Test(priority = 2, invocationCount = 2, dependsOnMethods = "search")
	public void Advancesearch()
	{
		System.out.println("Advance search case");
	}
	@AfterMethod
	public void am()
	{
		System.out.println("After Method Annotation");
	}
	@AfterClass
	public void ac()
	{
		System.out.println("After Class Annotation");
	}
	@AfterTest
	public void at()
	{
		System.out.println("After Test Annotation");
	}
	@AfterSuite
	public void as()
	{
		System.out.println("After Suite Annotation");
	}

}
