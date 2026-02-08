package day71_ExtentReportsTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestClass extends BaseClassForTakeSS
{
//	public WebDriver driver;
	/*
	 * 1. OpenWebPage
	 * 2. CheckPresenseOfLogo
	 * 3. Login
	 * 4. Logout
	 */
	 @Test(priority=1)
	  public void OpenWebPage() throws InterruptedException 
	  {
		  driver = new ChromeDriver();
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  Thread.sleep(2000);
		  System.out.println("Web Page Opened Successfully");
	  }
	  @Test(priority=2)
	  public void CheckPresenseOfLogo() 
	  {
		boolean status= driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		if(status)
		{
			System.out.println("logo found");
		}
		else
		{
			System.out.println("logo not found");
		}
	  }
	  @Test(priority=3, dependsOnMethods = {"CheckPresenseOfLogo"})
	  public void Login() throws InterruptedException
	  {
		  driver.findElement(By.name("username")).sendKeys("Admin");
		  driver.findElement(By.name("password")).sendKeys("admin123");
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(3000);
		  System.out.println("Logged In");
	  }
	  @Test(priority=4, dependsOnMethods = {"CheckPresenseOfLogo"})
	  public void Logout() 
	  {
		  driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']")).click();
		  driver.findElement(By.xpath("//div[@class='oxd-topbar-header-userarea']//li/a[text()='Logout']")).click();
		  System.out.println("Logged Out");
	  }
	  public void tearDown() {
		    if (driver != null) {
		        driver.quit();
		    }
		}
}
