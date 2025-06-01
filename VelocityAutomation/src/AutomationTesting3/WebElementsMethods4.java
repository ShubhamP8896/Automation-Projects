package AutomationTesting3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods4                      //Session 41
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/selenium/practice.html");   //this website is not working now
		
		WebElement HideButton = driver.findElement(By.xpath("Xpath"));
		HideButton.click();       // we click on hide button then that box/field is hide
		
//		Method 7:- isDispalyed(); :- used for checking any field is hide or not/ Displayed or not
		
		WebElement TextBox = driver.findElement(By.xpath("Xpath"));
		TextBox.isDisplayed();                         //It's return boolean (true/false) 
//		SO now that box is hide then return false. 
		
		boolean result = TextBox.isDisplayed();
		System.out.println(result);                  //We will print that result. > False
		
		WebElement ShowButton = driver.findElement(By.xpath("Xpath"));
		ShowButton.click();            
		
		boolean Finalresult = TextBox.isDisplayed();
		System.out.println(Finalresult);                  //We will print that result. > True
		
//		Method 8:- isEnabled(); -> Used for checking that field is enabled or disabled (able to type in that field or not)
		
//		1) Open the Chrome 2) Open URL  3) Search for WebElement of that field 
//		4) User TextBox.isEnabled(); -> Its returns boolean (true/false) , if enabled -> True
//		if not then False 5) TextBox.sendKeys("Value"); (Pass the values in that field)
		
		
//		Method 9 :- isSelected(); Used to check the element is Selected or not (for check box, radio button)
		
//		This method is returns booleans (true/false) 
		
//		1) Open the Chrome 2) Open URL  3) Search for WebElement of that CheckBox/Radio Button 
//		4) CHeckBox.Cick()[We click on that checkbox] 5) CheckBox.isSelected(); [it returns booleans if
//		checkbox is selected then returns True and If not selected then False].
		
		WebElement CheckBox = driver.findElement(By.xpath("Xpath"));
		CheckBox.click();
		
		CheckBox.isSelected();
		boolean CheckBoxSelected = CheckBox.isSelected();
		
		if (CheckBoxSelected ==true)
		{
			System.out.println("Check Box is selected");
		}
		else
		{
			System.out.println("Check box is not selected, please select that checkbox");
		}
		
		
		
		
		
	}

}
