package AutomationTesting7;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pupups2 
{
	public static void main(String[] args) throws InterruptedException         //Session 49
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\Installation Files\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/popup.php");
		 driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
//		Click on button and open new child window
		WebElement Button = driver.findElement(By.xpath("//a [text()='Click Here']"));
		Button.click();
		
		
//		Need to Move selenium focus on the child page
//		1) Need to find address of that child page using getWindowHandle();
//		then pass that address
		
//		Dont Use this instead of this use below mentioned code after line 44
		String MainPageAddress = driver.getWindowHandle();  //this is for single page 
		System.out.println(MainPageAddress);
		
		Set <String> AllPageAddress = driver.getWindowHandles();
		System.out.println(AllPageAddress);          // It's print all the pages addresses
		
//		We need to use any one of them but in the Set their is no Index Concept
//		So we need to do Upcasting :: Convert Set into List
		
//		Use this code for this:-----------
		List <String> AllPagesAddresses = new ArrayList <String> (driver.getWindowHandles());
		System.out.println(AllPagesAddresses);  
		
		driver.switchTo().window(AllPagesAddresses.get(1));        //in this we need to pass index

		WebElement InputBox = driver.findElement(By.xpath("//input[@name='emailid']"));
		InputBox.sendKeys("shubham@test.com");
		
		WebElement Submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
		Submit.click();
		
//		Again if you want to go on first window again:
		
		driver.switchTo().window(AllPagesAddresses.get(0));
		
//		Then do any action on the main (Parent) page
		
		
		
		
		
		
	}

}
