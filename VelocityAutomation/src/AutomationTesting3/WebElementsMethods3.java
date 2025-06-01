package AutomationTesting3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods3                 //Session 40
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
//		Web Elements Methods:-----------------------
//		1) Method 1 ;-> sendkeys("value") :- For filling any field/type anything in empty field
		
		WebElement Username = driver.findElement(By.xpath("//input[contains(@id, 'user-name')]"));
		Username.sendKeys("visual_user");
		
//		4) GetAttribute():- To get the attribute value of that attribute
		
		String UNAValue = Username.getAttribute("id");
		System.out.println("Username Attribute Value:- " +UNAValue);
		
//		8) element.getsize() :- Size of that web element in width and height
		
		Dimension SizeUName = Username.getSize();
		System.out.println(SizeUName);             //For print width and Height 
		
//		TO Get Both with label
		System.out.println("Height" +SizeUName.getHeight() +"," +"Width" +SizeUName.getWidth());
		
//		TO Get Only Height:-------------	
		
		System.out.println("Height of Username:- " +SizeUName.getHeight());
		
//		To Get Width:-------------------
		
		System.out.println("Width of Username :- " +SizeUName.getWidth());
		
		
		
//		6) getTagname():- To get the tagName of Particular Web element.	
		String UTagName = Username.getTagName();
		System.out.println("TagName:- " +UTagName);
		
		WebElement Password = driver.findElement(By.xpath("//input[@id = 'password']"));
		Password.sendKeys("secret_sauce");
		
//		7) To get location :- For found location of that webElemnt x and y coordinates
//		We need to import from selenium for Point Interface.
		Point LocationPassword = Password.getLocation();
		System.out.println(LocationPassword);
		
//		For Location of only X Axis user below printing statement
		
		System.out.println("X coordinates :-" +LocationPassword.getX());
		
//		For Location of only Y Axis user below printing statement
		
		System.out.println("Y coordinates :-" +LocationPassword.getY());

//		OR
		
		System.out.println("Location of x :-" +LocationPassword.getX() +" , " + "Location of Y" +LocationPassword.getY());
				
		
//		2) Method 2:-> Click():-> For click on any button/link.
		
		WebElement Login = driver.findElement(By.xpath("//input[contains(@id, 'login-button')]"));
		Login.click();
		
//		3) Clear();- this method is used to clear any field which filled/filled already.
		
//		5) getText():- to get the text (HTML text) present in that web element. (For this website there is no element with HTML text)
		

		
		
		
		
	}

}
