package assignment_13_30_10_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectDropdownMyPractice 
{
	static WebDriver driver = null;
	private static By dropdown = By.xpath("//input[@id='justAnInputBox']");
	private static By dpOptions = By.cssSelector(".comboTreeItemTitle");
	
	public static void setectOptions(String...values)
	{
		boolean flag = false;
		
		List<WebElement> opList = driver.findElements(dpOptions);
		for(WebElement op : opList)
		{
			String opText = op.getText().trim();
			if(!opText.isEmpty())
			{
				for(int i = 0; i < values.length; i++)
				{
					String dpValue = values[i];
					if(dpValue.equalsIgnoreCase("all"))
					{
						op.click();
						flag = true;
					}
					if(opText.equals(dpValue))
					{
						op.click();
						flag = true;
					}
				}
			}
		}
		if(flag == true)
		{
			System.out.println("Options are selected");
		}
		else
		{
			System.out.println("Options are not found and not selected");
		}
		
	}
	
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(dropdown).click();
		MultiSelectDropdownMyPractice.setectOptions();
		
	}

}
