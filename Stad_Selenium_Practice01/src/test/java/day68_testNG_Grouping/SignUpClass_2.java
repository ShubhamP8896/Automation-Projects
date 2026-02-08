package day68_testNG_Grouping;

import org.testng.annotations.Test;

public class SignUpClass_2 
{
	@Test(priority = 1, groups = {"regression"})
	public void signUpToDesignServer()
	{
		System.out.println("Sign up to design server");
	}
	
	@Test(priority = 2, groups = {"regression"})
	public void signUpToDemoServer()
	{
		System.out.println("Sign up in to demo server");
	}
	
	@Test(priority = 3, groups = {"regression"})
	public void signUpToSftesServer()
	{
		System.out.println("Sign up in to sftest server");
	}

}
