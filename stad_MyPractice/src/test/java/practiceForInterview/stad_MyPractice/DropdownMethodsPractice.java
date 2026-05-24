package practiceForInterview.stad_MyPractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownMethodsPractice 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/dropdown#google_vignette");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,500)");
		
		WebElement dropdown = driver.findElement(By.cssSelector("#country"));
		
		Select st = new Select(dropdown);
		
//		st.selectByIndex(1);
		
//		st.selectByValue("IN");
		
//		st.selectByVisibleText("India");
		
		System.out.println(st.isMultiple());
		
		List <WebElement> options = st.getOptions();
		
		System.out.println(options.size());
		
		for(WebElement e : options)
		{
			if(!e.getText().isEmpty())
			{
				System.out.println(e.getText());
			}
		}
		
		
		
		List <WebElement> list = driver.findElements(By.xpath("//select[@id='country']//option"));
		
//		for(WebElement e:list )
//		{
//			if(e.getText().equals("India"))
//			{
//				e.click();
//				break;
//			}
//		}
//		
		
	}

}
