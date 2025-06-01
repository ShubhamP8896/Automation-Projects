package AutomationTesting7;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables1 
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List <WebElement> ColumnNames = driver.findElements(By.xpath("//table//tbody//tr//h3"));
		System.out.println(ColumnNames);         // It's print addresses of that column names
		System.out.println("Number Of Columns " + ColumnNames.size());   //columns number
		
//		For Print all the columns Names
		for (int i=0; i<ColumnNames.size(); i++ )
		{
			System.out.println(ColumnNames.get(i).getText());       // For Print That Column Names
		}
		
//		Table data Cell Wise :---------------
		
		List <WebElement> CellsData = driver.findElements(By.xpath("//table//tbody//tr//td"));
//		System.out.println(CellsData);         // It's print addresses of that Cells
		System.out.println("Number Of Cells " + CellsData.size());   //Cells number
		
		for (int i=0; i<CellsData.size(); i++ )
		{
			System.out.println(CellsData.get(i).getText());       // For Print That Cells data
		}
//		Now there are some checkboxes also there so not able to run all the script.
		
//		For selecting single column name or Cell data use findElement() method same like we use
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
