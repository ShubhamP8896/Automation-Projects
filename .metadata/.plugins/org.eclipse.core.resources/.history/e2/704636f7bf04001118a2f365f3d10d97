package AutimationTesting4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionMethods4 
{
	public static void main(String[] args) throws InterruptedException        //Session 45 - Drag and Drop
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement Washington = driver.findElement(By.xpath("(//div [text() = 'Washington'])[2]"));
		
		WebElement UnitedStates = driver.findElement(By.xpath("//div [contains (text(), 'United States')]"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(Washington, UnitedStates).perform();
		Thread.sleep(2000);
		
//		WebElement Capitals = driver.findElement(By.xpath("//div [@id='capitals']"));
		
//		act.dragAndDrop(UnitedStates, Capitals).perform();
		
        WebElement Oslo = driver.findElement(By.xpath("(//div [text() = 'Oslo'])[2]"));
		
		WebElement NorWay = driver.findElement(By.xpath("//div [contains (text(), 'Norway')]"));
		
		act.dragAndDrop(Oslo, NorWay).perform();
		Thread.sleep(2000);
		
	     WebElement Stockholm = driver.findElement(By.xpath("(//div [text() = 'Stockholm'])[2]"));
			
	     WebElement Sweden = driver.findElement(By.xpath("//div [contains (text(), 'Sweden')]"));
			
	     act.dragAndDrop(Stockholm, Sweden).perform();
	     Thread.sleep(2000);
	     
	     WebElement Copenhagen = driver.findElement(By.xpath("(//div [text() = 'Copenhagen'])[2]"));
			
	     WebElement Denmark = driver.findElement(By.xpath("//div [contains (text(), 'Denmark')]"));
			
	     act.dragAndDrop(Copenhagen, Denmark).perform();
	     Thread.sleep(2000);
	     
	     WebElement Seoul = driver.findElement(By.xpath("(//div [text() = 'Seoul'])[2]"));
			
	     WebElement SouthKorea = driver.findElement(By.xpath("//div [contains (text(), 'South Korea')]"));
			
	     act.dragAndDrop(Seoul, SouthKorea).perform();
	     Thread.sleep(2000);
	     
	     WebElement Rome = driver.findElement(By.xpath("(//div [text() = 'Rome'])[2]"));
			
	     WebElement Italy = driver.findElement(By.xpath("//div [contains (text(), 'Italy')]"));
			
	     act.dragAndDrop(Rome, Italy).perform();
	     Thread.sleep(2000);
	     
	     WebElement Madrid = driver.findElement(By.xpath("(//div [text() = 'Madrid'])[2]"));
			
	     WebElement Spain = driver.findElement(By.xpath("//div [contains (text(), 'Spain')]"));
			
	     act.dragAndDrop(Madrid, Spain).perform();
	     Thread.sleep(2000);
	     
	     driver.close();
	     
	     System.out.println("End Of Program");
		
		
	}

}
