package day48;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class newTab_getWindowHandles
{
	static WebDriver driver;
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		driver = bu.launchBrowser("chrome");
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		bu.MaximizeWindow();
		
		By newTab = By.xpath("//button[text()='New Tab']");
		
		ElementsUtility eu = new ElementsUtility(driver);
		eu.doClick(newTab);
		
		
//		in the set there is no Index concept so we are able to do upcasting with List option and use the Index for switch window
		
//		or use directly Iterator interface object reference and use Next() method. then switch to window
//		1) use Iterator
//		Set <String> handels = driver.getWindowHandles();
//		Iterator <String> it = handels.iterator();
//		System.out.println(handels);
////		it will print the both page id in the array
//		
//		String pw = it.next();
//		System.out.println(pw);
//		
//		String cw = it.next();
//		System.out.println(cw);
//		
//		driver.switchTo().window(cw);
//		
//		System.out.println(bu.getCurrentPageURL());
//		if(bu.getCurrentPageURL().contains("new-tab-sample"))
//		{
//			System.out.println("Test case is passed");
//		}
//		else
//		{
//			System.out.println("Test case is failed");
//		}
//		
//		driver.close();
//		
//		driver.switchTo().window(pw);
//		
//		System.out.println(bu.getCurrentPageURL());
		
//		2) Up casting of List interface object passing the driver.getWindowHandles in the argument
		List<String> list =  new ArrayList<String>(driver.getWindowHandles());     // pass the Set Array in the Argument
		
		System.out.println(list);
		
//		use switch to window and pass the index
		driver.switchTo().window(list.get(1));
		System.out.println(bu.getCurrentPageURL());
		
		if(bu.getCurrentPageURL().contains("new-tab-sample"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		driver.switchTo().window(list.get(0));
		System.out.println(bu.getCurrentPageURL());
		
	}

}
