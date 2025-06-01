package sauceDemo.TestClass_Copy;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.saucedemo.POMClasses_Copy.HomePage_Copy;
import com.saucedemo.POMClasses_Copy.LoginPage_Copy;
import com.saucedemo.POMClasses_Copy.ShoppingCartPage_Copy;

public class TC002AddToCartFunctionality_Copy extends BaseTestClass2_Copy_CrossBrowserTesting              // Session- 54
{
	@Test
	public void AddProductFunctionality()
	{
//		2) Home Page Obejct
		HomePage_Copy Homepage = new HomePage_Copy(driver);
//		1} For Select specific products
//		Homepage.AddtocartBag();
//		Homepage.AddtocartLight();
//		Homepage.ShoppingCart();
		
//		2} For Select All the Products at same time
		Homepage.AddToCartButton();
		
		System.out.println("Added all the products in the cart");
		
		Homepage.ShoppingCart();
		
//		3) Cart page Object
		ShoppingCartPage_Copy Cart = new ShoppingCartPage_Copy(driver);
		
//	 A}	Test Scenario for verify Specific added products are same in the cart
		
//		 // Identify the locators for the products in the cart
//		List<String> expectedProducts = Arrays.asList("Sauce Labs Backpack", "Sauce Labs Bike Light");
//        List<String> actualProducts = new ArrayList<>();
//		
//        // Retrieve product information from the cart
//        List<WebElement> productElements = driver.findElements(By.className("inventory_item_name"));
//        for (WebElement element : productElements) {
//            actualProducts.add(element.getText());
//        }
//        
//        // Compare the retrieved product information with expected products
//        if (actualProducts.containsAll(expectedProducts) && actualProducts.size() == expectedProducts.size()) {
//            System.out.println("Test Passed: All 2 same products are in the cart.");
//        } else {
//            System.out.println("Test Failed: Incorrect products in the cart.");
//        }

//		B} For Verifying all the products are added in the cart or not
		
		int ExpectedProductesCount = 3 ;
	
		int actualProductsCount = Cart.TotalAddedProducts();
		
		System.out.println(actualProductsCount);
		
		if 	(ExpectedProductesCount == actualProductsCount)
		{
			System.out.println("Add to cart Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
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
