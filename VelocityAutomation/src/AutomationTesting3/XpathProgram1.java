package AutomationTesting3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathProgram1                       //session 38 and 39
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
//		1 ) Xpath By Attribute (Tagname+Attribute+AttributeValue)
		
		WebElement UserName = driver.findElement(By.xpath("//input[@id='email']"));
		UserName.sendKeys("pawar.shubham8@gmail.com");
		
//		2) Xpath  bt text (Tagname + html text)
		
//		WebElement Password = driver.findElement(By.xpath("//span[text()='password']"));
//		Above mentioned is example of xpath by text, I didn't fount html text for that password
		
		WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
		Password.sendKeys("ShubzPawar@008");
		
//		3) Xpath by Contains :- a) Xpath by attribute-> tagname+contains+attribute+attribute value (partial or full)
		
		WebElement login = driver.findElement(By.xpath("//button[contains(@name, 'login')]"));
		login.click();
		
//		3) Xpath by contains :- a)Xpath by text -> tagname+contains+text()+html text (partial or full)
		
		WebElement ForgetPassword = driver.findElement(By.xpath("//a[contains(text(), 'Forgotten password?')]"));
		ForgetPassword.click();
		
//		Session 39--------------------------------------------
//		4) X path by Index:- We are able to use any of the syntax for this with index number
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("Abc");
		
		
	
		
		
		
		
	}
	

}
