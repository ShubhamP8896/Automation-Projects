package assignment_3_15_10_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VerifyRegistrationWithNaveen 
{
	public static void main(String[] args) 
	{
		BrowserUtility butil = new BrowserUtility();
		WebDriver driver = butil.launchBrowser("Chrome");
		butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		butil.MaximizeWindow();
		
		By regst = By.linkText("Register");
		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By Em = By.id("input-email");
		By cn = By.id("input-telephone");
		By ps = By.id("input-password");
		By cps = By.id("input-confirm");
		By chkbx = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
		By cont = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		By regtxt = By.xpath("//div//h1");
		
		ElementsUtility Eutil = new ElementsUtility(driver);
		Eutil.doClick(regst);
		Eutil.addInput(fn, "Shubham");
		Eutil.addInput(ln, "Pawar");
		Eutil.addInput(Em, "shubham5@test.com");
		Eutil.addInput(cn, "123456789");
		Eutil.addInput(ps, "Shubham@123");
		Eutil.addInput(cps, "Shubham@123");
		Eutil.doClick(chkbx);
		Eutil.doClick(cont);
		
		String actualText = Eutil.getElementText(regtxt);
		System.out.println("Actual text = " + actualText);
		String expectedText = "Your Account Has Been Created!";
		
		if(actualText.equals(expectedText))
		{
			System.out.println("Test case passed, User registered Successfully");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
//		butil.quitBrowser();
	}

}
