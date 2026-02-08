package day64;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VideoRecordingExecution 
{
	 public static void main(String[] args) throws Exception 
	 {

	      // start screen recording
	      ScreenRecorderUtil.startRecord("main");

	      // Initiate the Webdriver
	      WebDriver driver = new ChromeDriver();
	      
	      // adding implicit wait of 15 secs
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	      // Opening the webpage where we will identify checkbox
	      driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");

	      // Identify element then click
	      WebElement c = driver.findElement(By.xpath("//*[@id='c_bs_1']"));
	      c.click();
	      
	      Thread.sleep(2000);

	      // verify if checkbox is selected
	      Boolean result = c.isSelected();
	      System.out.println("Checkbox is selected: " + result);

	      //Closing browser
	      driver.quit();

	      // stop recording
	      ScreenRecorderUtil.stopRecord();
	   }
}
