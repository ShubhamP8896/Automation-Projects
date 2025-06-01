package sauceDemo.TestClass_Copy;

import org.testng.annotations.Test;

import com.saucedemo.POMClasses_Copy.HomePage_Copy;

public class TC001LoginFunctionality_Copy extends BaseTestClass2_Copy_CrossBrowserTesting              // Session- 54
{
//	We no need to declare 	WebDriver driver; again in this class.	
	
	@Test	
	public void LoginFunctionality()
	{
		String AxtcualURLLogin = driver.getCurrentUrl();
		System.out.println("Actual URL After Login "+ AxtcualURLLogin);
		
		String ExpectedURLLogin = "https://www.saucedemo.com/inventory.html";
		
		if (AxtcualURLLogin.equals(ExpectedURLLogin))
		{
			System.out.println("Login Successfully: Test case Passed");
		}
		else
		{
			System.out.println("Login Test case failed");
		}
		
//		Create HomePage object : For calling Home page methods
		HomePage_Copy Home = new HomePage_Copy(driver);
		
//		Actions For HomePage
		Home.BurgerMenu();
		
		System.out.println("Click on BurgerMenu");
		
		Home.LogOut();
		System.out.println("Click on LogOut Button");
	}
}

