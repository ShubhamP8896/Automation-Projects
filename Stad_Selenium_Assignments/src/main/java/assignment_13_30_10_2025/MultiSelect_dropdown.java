package assignment_13_30_10_2025;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultiSelect_dropdown
{ 	
	static WebDriver driver;
	
//	Generic method for select the options from the drop down using the if else
	
	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void SelectOptions(By locator, String...value)
	{
		boolean flag = false;
		List<WebElement> optionslist = getElements(locator);
		for(WebElement op : optionslist)
		{
			String opntions = op.getText().trim();
			if(!opntions.equals(""))
			{
				for(int i = 0; i<value.length; i++)
				{
					String val = value[i];
					if(val.equalsIgnoreCase("all"))
					{
						op.click();
						flag = true;
					}
					if(opntions.equals(val))
					{
						op.click();
						flag = true;
					}
				}				
			}
		}
		if(flag == true)
		{
			System.out.println("Selected the given options");
		}
		else
		{
			throw new ExceptionsUtility("Not found the Given Opntions");
		}
	}
	
	public static void main(String[] args) 
	{
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		By dropdown = By.id("justAnInputBox");
		By options = By.cssSelector(".comboTreeItemTitle");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.doClick(dropdown);
//		If else
//		SelectOptions(options, "");
		
//		Switch case
		SelectOptionsSwitch(options, "All");
	}
//	Generic method for select the options from the drop down using the switch case
	
	public static void SelectOptionsSwitch(By locator, String... value) 
	{
	    boolean flag = false;
	    List<WebElement> optionsList = getElements(locator);
	    for (WebElement op : optionsList) 
	    {
	        String optionText = op.getText().trim();
	        if (!optionText.equals("")) 
	        {
	            for (int i = 0; i < value.length; i++) 
	            {
	                String val = value[i].trim();
	                switch (val.toLowerCase()) 
	                {
	                    case "all":
	                        op.click();
	                        flag = true;
	                        break;

	                    default:
	                        if (optionText.equalsIgnoreCase(val)) 
	                        {
	                            op.click();
	                            flag = true;
	                        }
	                        break;
	                }
	            }
	        }
	    }

	    if (flag) 
	    {
	        System.out.println("Selected the given options");
	    } 
	    else 
	    {
	        throw new ExceptionsUtility("Not found the given Options");
	    }
	}
	
	
}
