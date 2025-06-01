package insightinc_CanMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Can_MyProfilePage
{
	// WebElements :: 1) Change Password 2) Download CV 3) Save 4) Cancel

//	WebDriver Declared
	private WebDriver driver;
	
//	Find webelements from Jobs page page
//	1) Change Password
	@FindBy (xpath = "//a [text() = 'Change Password']")
	private WebElement ChangePassword;
	
//	2) Download CV
	@FindBy (xpath = "//input [@title='Download CV']")
	private WebElement DownloadCV;
	
//	3) Save
	@FindBy (xpath = "//input [@id='Save']")
	private WebElement SaveButton;
	
//	4) Cancel
	@FindBy (xpath = "//input [@id='cancel']")
	private WebElement CancelButton;
	
//	Constructor for performing action
	public Can_MyProfilePage (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
//	1) Change Password
	public void ChangePassword()
	{
		ChangePassword.click();
	}
	
//	2) Download CV
	public void DownloadCV()
	{
		DownloadCV.click();
	}
	
//	3)Save Button
	public void SaveButton()
	{
		SaveButton.click();
	}
	
//	3)Cancel Button
	public void CancelButton()
	{
		CancelButton.click();
	}	
	
}
