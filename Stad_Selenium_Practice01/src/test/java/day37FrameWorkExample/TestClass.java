package day37FrameWorkExample;

public class TestClass 
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.google.com");
		String actualTitle = bu.getPageTitle();
		String exceptedTitle = "google";
		
		if(actualTitle.equalsIgnoreCase(exceptedTitle))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		bu.quitBrowser();
	}

}
