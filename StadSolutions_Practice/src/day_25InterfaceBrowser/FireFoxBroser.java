package day_25InterfaceBrowser;

public class FireFoxBroser implements WebDriver
{
	@Override
	public void findElement()
	{
		System.out.println("Element found for Firefox");		
	}

	@Override
	public void findElements() 
	{
		System.out.println("Elements found for Firefox");		
		
	}

	@Override
	public void get(String URL)
	{
		System.out.println(URL + " for Firefox");				
	}

	@Override
	public void Click(String button)
	{
		System.out.println("Clicked on " + button + " for Firefox");		
		
	}

	@Override
	public void SendKeys(String userDetails) 
	{
		System.out.println(userDetails + " Send user details Firefox");		
		
	}

	@Override
	public void quite()
	{
		
		System.out.println("Firefox browser closed");		
	}

	@Override
	public boolean isDisplay() 
	{
		System.out.println(" Element display Firefox");		
		return true;
	}

	@Override
	public String getText(String element) 
	{
		System.out.println("Element Text for Firefox");		
		return "Hello";
	}

}
