package AutimationTesting4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardAction3Practice                                           // Session 45
{
	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.diffchecker.com/text-compare/");
		
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement TextBox1 = driver.findElement(By.xpath("(//div [@role='textbox'])[1]"));
		
		Actions action = new Actions(driver);
		
		action.sendKeys(TextBox1,"My Name is Shuabhm Pawar, I am Working as A QA in RST").perform();
		
		TextBox1.sendKeys(Keys.CONTROL+"A");
		
//		Use Any one of them (above or below) (With that webelement name no need to click in that field.)
		
//		action.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();
		
		TextBox1.sendKeys(Keys.CONTROL+"C");
		
		
		WebElement TextBox2 = driver.findElement(By.xpath("(//div [@role='textbox'])[2]"));
		
		TextBox2.sendKeys(Keys.CONTROL+"v");
		
//		If we want to paste any copy letter two times then use Capital "V".
		
		WebElement FindDifference = driver.findElement(By.xpath("//span[text() = 'Find difference']"));
		
		action.click(FindDifference).perform();
		
		WebElement Result = driver.findElement(By.xpath("//div [@class='message-box_children__Tt3Kg']"));
		
		String ExpectedResult = "There is no difference to show between these two files";
		
		String ActualResult = Result.getText();
		
		System.out.println("Actual Result is :- "+ActualResult);
		
		if(ActualResult.equals(ExpectedResult))
		{
			System.out.println("Test case is Passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.close();
		
		System.out.println("End Of Program");
		
		
		
	}

}
