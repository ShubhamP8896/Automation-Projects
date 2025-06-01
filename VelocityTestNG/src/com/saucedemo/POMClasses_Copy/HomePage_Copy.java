package com.saucedemo.POMClasses_Copy;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Copy
{
//	WebElements :- Cart for added products, Sorting filter, burger Menu, All items, about
//	Logout, reset app store, Details of product, add to cart
	
	
//	1) Web Driver declared
	private WebDriver driver;
	
//	2) Find web elements
	
//	1.}   This is for select some of products from the home page
//	@FindBy (xpath = "(//button [@id='add-to-cart-sauce-labs-backpack'])")
//	private WebElement AddtocartBag;
//	
//	@FindBy (xpath = "(//button [@id='add-to-cart-sauce-labs-bike-light'])")
//	private WebElement AddtocartLight;
//	
//	@FindBy (xpath = "(//div[@id='shopping_cart_container'])")
//	private WebElement ShoppingCart;
	
//	2.} This is for select all the products at same time from the home page
	
	@FindBy (xpath = "(//button[text() = 'Add to cart'])")
	private List <WebElement> AddToCart;
	
	@FindBy (xpath = "(//div[@id='shopping_cart_container'])")
	private WebElement ShoppingCart;
	
	@FindBy (xpath = "(//button [text () = 'Open Menu'])")
	private WebElement BurgerMenu; 
	
	@FindBy (xpath = "(//a[text () = 'Logout'])")
	private WebElement LogOut; 
	
	
		
	
//	3) Create Homepage constructor
	
	public HomePage_Copy (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
//	4) Actions perform on web elements
	
//	A} Select Single Products.
//	Click on add to cart buttons for adding product in the cart
//	public void AddtocartBag()
//	{
//		AddtocartBag.click();
//	}
//	
//	Click on add to cart buttons for adding product in the cart
//	public void AddtocartLight()
//	{
//		AddtocartLight.click();
//	}
	
//	CLick on the shopping cart icon
//	public void ShoppingCart()
//	{
//		ShoppingCart.click();
//	}
	
//	B} For Select All the Products at same time.
	
	public void AddToCartButton()
	{
		for (int i = 0 ; i< AddToCart.size(); i++)
		{
			AddToCart.get(i).click();
		}
	}
	
//	Click on the shopping cart icon
	
	public void ShoppingCart()
	{
		ShoppingCart.click();
	}
		
//	Click on the Burger menu
	public void BurgerMenu()
	{
		BurgerMenu.click();
	}
	
//	Click on the LogOut Button
	public void LogOut()
	{
		LogOut.click();
	}
	
	
	
}
