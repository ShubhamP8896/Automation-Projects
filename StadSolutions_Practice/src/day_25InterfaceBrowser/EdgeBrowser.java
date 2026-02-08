package day_25InterfaceBrowser;

public class EdgeBrowser implements WebDriver
{
	@Override
	public void findElement()
	{
		System.out.println("Element found for Edge");		
	}

	@Override
	public void findElements() 
	{
		System.out.println("Elements found for Edge");		
		
	}

	@Override
	public void get(String URL)
	{
		System.out.println(URL + " for Edge");				
	}

	@Override
	public void Click(String button)
	{
		System.out.println("Clicked on " + button + " for Edge");		
		
	}

	@Override
	public void SendKeys(String userDetails) 
	{
		System.out.println(userDetails + " Send user details Edge");		
		
	}

	@Override
	public void quite()
	{
		
		System.out.println("Chrome browser Edge");		
	}

	@Override
	public boolean isDisplay() 
	{
		System.out.println(" Element display Edge");		
		return true;
	}

	@Override
	public String getText(String element) 
	{
		System.out.println("Element Text for Edge");		
		return "Hello";
	}
}
