package sauceDemo.TestClass_Copy;

import org.testng.annotations.Test;
import com.saucedemo.POMClasses_Copy.HomePage_Copy;

public class TC003LogoutFunctionality_Copy extends BaseTestClass2_Copy_CrossBrowserTesting              // Session- 54
{
		@Test
		public void LogOutTestScenario()
		{
//			Create HomePage object : For calling Home page methods
			HomePage_Copy Home = new HomePage_Copy(driver);
			
//			Actions For HomePage
			Home.BurgerMenu();
			
			System.out.println("Click on BurgerMenu");
			
			Home.LogOut();
			System.out.println("Click on LogOut Button");
			
//			LogOut Test Scenario
			
			String ExpectedURL = "https://www.saucedemo.com/";
			String ActualURl = driver.getCurrentUrl();
			System.out.println("Actual URL = "+ ActualURl);
			
			if (ActualURl.equals(ExpectedURL))
			{
				System.out.println("Logout Successfully : Test case passed");
			}
			else
			{
				System.out.println("LogOut Failed : Test case failed");
			}
		}
			
}

