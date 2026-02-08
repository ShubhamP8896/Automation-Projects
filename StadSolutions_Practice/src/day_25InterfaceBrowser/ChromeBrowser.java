package day_25InterfaceBrowser;

public class ChromeBrowser implements WebDriver
{

	@Override
	public void findElement()
	{
		System.out.println("Element found for Chrome");		
	}

	@Override
	public void findElements() 
	{
		System.out.println("Elements found for Chrome");		
		
	}

	@Override
	public void get(String URL)
	{
		System.out.println(URL + " for Chrome");				
	}

	@Override
	public void Click(String button)
	{
		System.out.println("Clicked on " + button + " for Chrome");		
		
	}

	@Override
	public void SendKeys(String userDetails) 
	{
		System.out.println(userDetails + " Send user details Chrome");		
		
	}

	@Override
	public void quite()
	{
		
		System.out.println("Chrome browser closed");		
	}

	@Override
	public boolean isDisplay() 
	{
		System.out.println(" Element display Chrome");		
		return true;
	}

	@Override
	public String getText(String element) 
	{
		System.out.println("Element Text for Chrome");		
		return "Hello";
	}

}
