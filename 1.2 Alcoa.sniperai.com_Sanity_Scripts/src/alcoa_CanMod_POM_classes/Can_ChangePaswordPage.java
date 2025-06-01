package alcoa_CanMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Can_ChangePaswordPage 
{
//	WebElements :: 1) Current Password 2) New Password 3) Confirm Password 4) Submit 5) Cancel
	
//	WebDriver declared
	private WebDriver driver;
	
//	Find webelements from Jobs page page
//	1) Current Password
	@FindBy (xpath = "//input [@name='oldpwd']")
	private WebElement CurrentPassword;
	
//	2) New Password 
	@FindBy (xpath = "//input [@name='newpwd']")
	private WebElement NewPassword;
	
//	3) Confirm Password 
	@FindBy (xpath = "//input [@name='cnfrmpwd']")
	private WebElement ConfirmPassword;
	
//	4) Submit 
	@FindBy (xpath = "//input [@name='submit']")
	private WebElement SubmitButton;
	
//	5) Cancel
	@FindBy (xpath = "//input [@name='cancel']")
	private WebElement CancelButton;
	
//	Constructor for perform actions
	public Can_ChangePaswordPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
//	WebElemnts 
//	1) Current Password
	public void CurrentPassword()
	{
		CurrentPassword.click();
		CurrentPassword.sendKeys("shub@123");
	}
	
//	2) New Password 
	public void NewPassword()
	{
		NewPassword.click();
		NewPassword.sendKeys("shub@123");
	}
	
//	3) Confirm Password 
	public void ConfirmPassword()
	{
		ConfirmPassword.click();
		ConfirmPassword.sendKeys("shub@123");
	}
	
//	4) Submit 
	public void SubmitButton()
	{
		SubmitButton.click();
	}
	
//	5) Cancel
	public void CancelButton()
	{
		CancelButton.click();
	}
	
}
