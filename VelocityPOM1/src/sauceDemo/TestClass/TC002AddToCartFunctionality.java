package sauceDemo.TestClass;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.saucedemo.POMClasses.HomePage;
import com.saucedemo.POMClasses.LoginPage;
import com.saucedemo.POMClasses.ShoppingCartPage;

public class TC002AddToCartFunctionality 
{
	public static void main(String[] args)                      // Session - 50
	{
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shubz008\\Downloads\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Chrome Browser Opened and Maximised");
		
		driver.get("https://www.saucedemo.com/");
		
		System.out.println("URL Opened Successfully");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//		Need to create of object of LoginPage, Home page and shopping cart class.
//	1) Login Page Object
		LoginPage Login = new LoginPage(driver);
		Login.SendUsername();
		Login.SendPassword();
		Login.LoginButtonClick();
		
		System.out.println("Logged in to system successfully");
		
//		2) Home Page Obejct
		HomePage Homepage = new HomePage(driver);
//		1} For Select specific products
//		Homepage.AddtocartBag();
//		Homepage.AddtocartLight();
//		Homepage.ShoppingCart();
		
//		2} For Select All the Products at same time
		Homepage.AddToCartButton();
		
		System.out.println("Added all the products in the cart");
		
		Homepage.ShoppingCart();
		
//		3) Cart page Object
		ShoppingCartPage Cart = new ShoppingCartPage(driver);
		
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
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		
		
        // Close the browser
//        driver.quit();		
		
		
	}

}
