package assignment_40_13_11_2025;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
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
		bu.launchURL("https://www.hyrtutorials.com/p/css-selectors-practice.html?fname=&lname=#");
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By fName = By.cssSelector("#firstName");
		By lName = By.cssSelector("#lastName");
		By gender = By.cssSelector(".gender");
		By city = By.cssSelector(".city");
		By country = By.cssSelector("[placeholder='Country']");
		By sQues = By.cssSelector("[placeholder='Enter your security question']");
		By sAns = By.cssSelector("[placeholder='Enter your security answer']");
		By pDetails = By.cssSelector("[placeholder='Verify your personal details']");
		By cBox = By.cssSelector("[type='checkbox'][value='Confirm']");
		
		eu.addInput(fName, "Shubham");
		eu.addInput(lName, "Pawar");
		eu.addInput(gender, "Male");
		eu.addInput(city, "Ahmedabad");
		eu.addInput(country, "India");
		eu.addInput(sQues, "Which is fav sports?");
		eu.addInput(sAns, "Cricket");
		eu.addInput(pDetails, "Personal");
		eu.doClick(cBox);

		By dDown = By.xpath("(//select)[3]");
		
		eu.selectByValue(dDown, "apple");
		
		By dDown2 = By.xpath("(//select)[4]");
		
		eu.selectByValue(dDown2, "java");
	}
	
}

