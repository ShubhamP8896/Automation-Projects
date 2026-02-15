package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridPractice
{
	public static void main(String[] args) throws MalformedURLException {
		
//		The URL will be the IP address of the Hub machine + Hub port + /wd/hub
//		http://192.168.1.12:4444/wd/hub OR http://localhost:4444/wd/hub
		
		String hubURL = "http://localhost:4444/wd/hub";
		DesiredCapabilities cap = new DesiredCapabilities();
		
		// setPlatform and setBrowserName is the methods of the DesiredCapabilities class.
		
		cap.setPlatform(Platform.WIN10); // using the setPlatform method we need to set the environment like : win10, win11, android, Mac..etc. 
		cap.setBrowserName("chrome");  // setBrowserName used for set the browser name.
		
// create the Remotewebdriver instance. In the argument we need to pass the URL (it's class) object and add the URL string name of the URL
//		Also need to pass the DesiredCapabilities object ref. variable.
		WebDriver driver = new RemoteWebDriver(new URL (hubURL), cap);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.quit();		
		
	}

}
