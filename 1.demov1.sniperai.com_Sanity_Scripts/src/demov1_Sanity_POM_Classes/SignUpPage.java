package demov1_Sanity_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage 
{
//	WebElements on the Sign Up Page :- 1)Name 2)Email 3)Password 4)Confirm password 5)I am Not Robot
//	6)Agree Terms 7)Create Account 8)Already Signup 9)Activate Account 10) Activate Acc Email
//	11)Activate Account Button 12)Activate Acc window Close 13)Thank you Window 14) Thank You close
	
//	WebDriver Declared 
	private WebDriver driver;

//	Find All the Web Elements
//	1) Name Field
	@FindBy (xpath = "//input [@id='name']")
	private WebElement NameField;
	
//	2) Email Field
	@FindBy (xpath = "//input [@id='email']")
	private WebElement EmailField;
	
//	3) Password Field
	@FindBy (xpath = "//input [@id='pass']")
	private WebElement PasswordField;
	
//	4) Confirm password Field
	@FindBy (xpath = "//input [@id='cpass']")
	private WebElement ConfPasswordField;
	
//	5) I am not robot checkbox
	@FindBy (xpath = "(//label [@role='presentation']")
	private WebElement Captcha;
	
//	6) Agree Terms Checkbox
	@FindBy (xpath = "//div[@id='checkator_agree']")
	private WebElement AgreeTerms;
	
//	7) Create Account Button 
	@FindBy (xpath = "//input [@id='create_btn']")
	private WebElement CreateAccountButton;
	
//	8) Already Signup button
	@FindBy (xpath = "//a [text() = 'Already Signed Up?']")
	private WebElement AlreadySignUp;
	
//	9)Activate Account 
	@FindBy (xpath = "//a [text() = 'Activate Account ']")
	private WebElement ActivateAccountButton;
	
//	10) Activate Acc Email
//	7) Create Account Button 
	@FindBy (xpath = "//input [@id='activate-email']")
	private WebElement ActAccEmailField;	
	
//	11)Activate Account Button 
	@FindBy (xpath = "//input [@id='activate_account']")
	private WebElement ActButton;
	
//	12)Activate Acc window Close  
	@FindBy (xpath = "(//a [@class='popup_close'])[1]")
	private WebElement ActWindowClose;	
	
//	13)Activate Account Thank you Window 
	@FindBy (xpath = "(//div [@class='contentalrt'])")
	private WebElement ActivatAccSuccessWindow;	
	
// 14) Thank Popup You close
	@FindBy (xpath = "(//div [@class='contentalrt'])")
	private WebElement ActAccPopupClosed;
		
	
//	Sign Up page Constructor (No Need to use void for Constructor)
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);		
	}

//	Action on the web elements
	
	public void NameField()
	{
		NameField.sendKeys("Shubham Pawar");
	}
	
	public void EmailField()
	{
		EmailField.sendKeys("Shubham.Pawar@recruitmentsmart.com");
	}
	
	public void PasswordField()
	{
		PasswordField.sendKeys("Shub@123");
	}
	
	public void ConfirmPasswordField()
	{
		ConfPasswordField.sendKeys("Shub@123");
	}
	
	public void Captchacheckbox()
	{
		Captcha.click();
	}
	
	public void AgreeTermsCHeckbox()
	{
		AgreeTerms.click();
	}
	
	public void CreateAccountButton()
	{
		CreateAccountButton.click();
	}
	
	public void AlreadySignUp()
	{
		AlreadySignUp.click();
	}
	
	public void ActivateAccountButton()
	{
		ActivateAccountButton.click();
	}
	
	public void ActAccEmailField()
	{
		ActAccEmailField.sendKeys("Shubham.Pawar@recruitmentsmart.com");
	}
	
	public void ActAccButton()
	{
		ActButton.click();
	}
	
	public void ActAccWindowClose()    //this is for close window without click on activate account button
	{
		ActWindowClose.click();
	}
	
	public String ActivatAccSuccessWindow()
	{
		return ActivatAccSuccessWindow.getText();
	}
	
	public void ActAccSuccessPopupClosed()
	{
		ActAccPopupClosed.click();
	}
	
}
