package com.saucedemo.POMClasses_Copy;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage_Copy
{
//	1) Web Driver declared
	private WebDriver driver;
	
//	2) Find web elements
	
//	A} For Single Specific Profucts
//	@FindBy (xpath = "(//div [text() ='Sauce Labs Backpack'])")
//	private WebElement SauceLabsBackpack;
//	
//	@FindBy (xpath = "(//div [text() ='Sauce Labs Bike Light'])")
//	private WebElement SauceLabsBikeLigh;
	
//	For ALL the products added in the cart
	
	@FindBy (xpath = "(//button[ text() = 'Remove'])")
	private List <WebElement> AddedProductsInCart;
	
//	3) Create Constructor
	
	public ShoppingCartPage_Copy (WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	4) Actions
	
//	A} For specific products
//	public void SauceLabsBackpack()
//	{
//		SauceLabsBackpack.getText();
//	}
//	
//	public void SauceLabsBikeLigh()
//	{
//		SauceLabsBikeLigh.getText();
//	}

//	Get Size of index of Remove Button
	
	public int TotalAddedProducts()
	{
		return AddedProductsInCart.size();
	}
	
	
	
	
	
	
}



