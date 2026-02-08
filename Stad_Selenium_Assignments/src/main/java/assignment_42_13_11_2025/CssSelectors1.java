package assignment_42_13_11_2025;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssSelectors1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		bu.MaximizeWindow();
		bu.launchURL("https://proleed.academy/exercises/selenium/hotel-reservation-form-for-practice.php");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By FName = By.cssSelector("#firstname");
		By LName = By.cssSelector("#lastname");
		By Add1 = By.cssSelector("[name='address1']");
		By Add2 = By.cssSelector("[name='address2']");
		By city = By.cssSelector("#city");
		By state = By.cssSelector("#state");
		By ZipCode = By.cssSelector("#zipcode");
		By Phone = By.cssSelector("#phone");
		By emailAdd = By.cssSelector("#email");
		By checkInDate = By.cssSelector("#checkindate");
		By checkInTime = By.cssSelector("#checkintime");
		By CheckOutDate = By.cssSelector("#checkoutdate");
		By checkOutTime = By.cssSelector("#checkouttime");
		By RoomPre = By.cssSelector("#deluxe");
		By Adults = By.cssSelector("[name=\"adults\"]");
		By child = By.cssSelector("[name='children']");
		By uploadID = By.cssSelector("#idproof");
		By subMit = By.cssSelector("#add");
		
		
		eu.addInput(FName, "Shubham");	
		eu.addInput(LName, "Pawar");
		eu.addInput(Add1, "Ahmedabad");
		eu.addInput(Add2, "Ahmedabad");
		eu.addInput(city, "Ahmedabad");
		eu.addInput(state, "GJ");
		eu.addInput(ZipCode, "389001");
		eu.addInput(Phone, "123456789");
		eu.addInput(emailAdd, "shubham@test.com");
		Thread.sleep(2000);
		eu.addInput(checkInDate, "25-12-2025");
		eu.addInput(checkInTime, "12:00PM");
		eu.addInput(CheckOutDate, "28-12-2025");
		eu.addInput(checkOutTime, "11:00AM");
		eu.doClick(RoomPre);
		eu.selectByVisibleText(Adults, "2");
		eu.selectByVisibleText(child, "0");
		eu.addInput(uploadID, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		eu.doClick(subMit);
		
		
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		String expectedalertText = "Thanks! Your booking is confirmed.";
		System.out.println(alertText);

		if (expectedalertText.equals(alertText)) 
		{
			System.out.println("Alert message is correct");
		} 
		else 
		{
			System.out.println("Unexpected alert message: " + alertText);
		}
		alert.dismiss();
		
		
		
	}
	
}

