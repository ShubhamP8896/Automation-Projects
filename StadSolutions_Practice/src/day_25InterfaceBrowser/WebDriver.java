package day_25InterfaceBrowser;

public interface WebDriver extends SearchContext
{
	@Override
	public void findElement();
	
	@Override
	public void findElements();
	
	public void get(String URL);
	
	void Click(String button);
	void SendKeys(String userDetails);
	void quite();
	
	boolean isDisplay();
	
	String getText(String element);
	
	
	
}


