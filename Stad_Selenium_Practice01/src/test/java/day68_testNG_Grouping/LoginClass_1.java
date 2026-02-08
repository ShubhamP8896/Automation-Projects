package day68_testNG_Grouping;

import org.testng.annotations.Test;

public class LoginClass_1 
{
	@Test(priority = 1, groups = {"sanity"})
	public void loginToDesignServer()
	{
		System.out.println("Logged in to design server");
	}
	
	@Test(priority = 2, groups = {"sanity"})
	public void loginToDemoServer()
	{
		System.out.println("Logged in to demo server");
	}
	
	@Test(priority = 3, groups = {"sanity"})
	public void loginToSftesServer()
	{
		System.out.println("Logged in to sftest server");
	}
	

}
