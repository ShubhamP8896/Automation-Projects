package day53;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CssSelectors
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://design.sniperai.com/signup");
		
//		By id Css Selector with and without tag name
		By name = By.cssSelector("#name");    // OR    By.cssSelector(input"#name")
		
//		By class Css Selector with and without tag name
		By classname = By.cssSelector(".form-group");	 // OR	By.cssSelector("div.form-group")
		
//		By tagName		
		By tag = By.cssSelector("div");
		
//		By attributes with and without tag name
		By attribute = By.cssSelector("input[id='email']");     //OR  By.cssSelector("[id='email']")
		
//		By contains : *    with and without tag name
		By contains = By.cssSelector("div[id*=contact]");       //OR  By.cssSelector("[id*=contact]
		
//		By starts-with : ^   with and without tag name
		By startsWith = By.cssSelector("div[id^=contact]");         // OR   By.cssSelector("[id^=contact]");
		
//		By ends-with : $    with and without tag name
		By endsWith = By.cssSelector("div[id$=box]");               // OR    By.cssSelector("[id$=box]")
		
		
/// 	Combination of all the CSS selectors is possible:
//
//	    input[type='password']#cpass.form-control[placeholder*='Password'][class^='cpass'][placeholder$='Password']		
			
////   text() function is not working in the css selector
////   Parent to child is not supported in css. preceding-sibling is not supported here
////   and or operators are not used here separate square brackets are used.
		
//		We are able to find multiple elements with , (quama) 
		
		By allFiends = By.cssSelector("#name,#email,#pass,#cpass");     // >> Showing 4 Elements
		
//		following-sibling : +      with and without tag name
		By following_sibling = By.cssSelector(".form-group+div>#pass");
		
/// in css / and // is not use>> here we used > for direct and space ( ) is used for indirect.
//		Direct and Indirect towards child from parent   with and without tag name
		By direct = By.cssSelector(".form-group>input#name");
		
		By inDirect = By.cssSelector(".form-group input#name");
		
		
		/// Indexing in the Css	
		By indexing = By.cssSelector(".form-group:nth-of-type(3)>input");
		
		
		
	} 

}
