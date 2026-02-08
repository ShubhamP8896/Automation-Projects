package AutomationTesting7;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFramess1 
{
	public static void main(String[] args)                       //Session 49
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		When there are multiple frames on the same page then we need to switch on that frame first'
//		1> Find WebElement of that Child frame
		
		WebElement Cframe2 = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		
//		2) Need to Swith that widow and pass webelement name in the argument 
		
		driver.switchTo().frame(Cframe2);                  //Always select webelemnt type
		
//		Now we are able to perform actions on that child frame
		
		WebElement DropDown = driver.findElement(By.xpath("//select[@id='animals']"));
		DropDown.click();
		
//		Create Ocject for select options from the dropdown
		
		Select S = new Select(DropDown);
		S.selectByVisibleText("Avatar");
		
		
		
//		For Selecting other IFrames or perform actions on them we need to switch default window
		driver.switchTo().defaultContent();
		
//		Then We need to switch on Frame 1 after that on Frame 3  for perform actions on 3rd frame
		WebElement Cframe1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(Cframe1);
		
//		Again We Switch on different Window Now we switch on 3d frame from 1st 
		WebElement Cframe3 = driver.findElement(By.xpath("//iframe[@id='frame3']"));
		driver.switchTo().frame(Cframe3);
		
		WebElement CheckBox = driver.findElement(By.xpath("//input [@id='a']"));
		CheckBox.click();
		
//		Now for perform action on the Frame2 we need to switch from frame 3 to frame 1
		
		driver.switchTo().parentFrame();
		
		WebElement InputField = driver.findElement(By.xpath("//input [@type='text']"));
		InputField.sendKeys("Shubz@8896");
		
		
//		SwithTo().frame("FrameElelmentName");---> Swith to frame
//		switchTo().ParentFrame();---> If we want to move from Frame 3 to Frame 2 (One Step Behind)
//		SwitchTo().defauldContent();---> If we want to move from Frame 3 to direct on main page or frame 1,
		
	}

}
