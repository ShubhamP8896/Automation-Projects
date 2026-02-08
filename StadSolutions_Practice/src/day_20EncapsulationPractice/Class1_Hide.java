package day_20EncapsulationPractice;

public class Class1_Hide 
{
	public void browserLaunch(String browser)
	{
		browserOS();
		browserVersion();
		CheckRam();
		
		System.out.println(browser + " Browser is launched successfully");
	}
	
	private void browserOS()
	{
		System.out.println("OS is checked successfully");
	}
	
	private void browserVersion()
	{
		System.out.println("Version is checked successfully");
	}
	
	private void CheckRam()
	{
		System.out.println("Ram is checked succesfully");
	}

}
