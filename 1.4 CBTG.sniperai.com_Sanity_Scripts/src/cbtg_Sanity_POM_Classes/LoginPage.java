package cbtg_Sanity_POM_Classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cbtg.sniperai.com_utility_Classes.Cbtg_Excel_Data_UtilityClass;

public class LoginPage
{
//	1} Web Driver Declared
	private WebDriver driver;
	private String Rusername;                    // We need declare those as global for using in the sendusername
	private String Rpassword;                    // and send password method
	private String Cusername;                   // Candidate User name
	private String Cpassword;                   // Candidate Password
//	WebElements on Login Page :- 1) User name 2)Password 3)UserType 4)RememberMe 5)LoginButton 6)ForgetPassword
//	7)RSTLogo 8)JobOpenings 9)SignUp 10)Terms
	
//	2} Find the webElements {@ >> Annotation) :: We are using @ with shortcut of find elements 
	
//	1)User name
	@FindBy (xpath = "(//input [@id='user_email'])")
	private WebElement UserName;
	
//	2)Password
	@FindBy (xpath = "(//input [@id='user_password'])")
	private WebElement Password;
	
//	3)User Type :- Recruiter
	@FindBy (xpath = "(//input [@value='0'])")
	private WebElement UserTypeRecruiter;
	
//	3)User Type :- Recruiter
	@FindBy (xpath = "(//input [@value='1'])")
	private WebElement UserTypeCandidate;
	
//	4)Remember Me
	@FindBy (xpath = "(//div [@id='checkator_rememberme'])")
	private WebElement RememberMe;
	
//	5)LoginButton 
	@FindBy (xpath = "(//input [@id='login'])")
	private WebElement LoginButton;
	
//	6)ForgetPassword
	@FindBy (xpath = "(//a  [text() = ' Forgot password?'])")
	private WebElement ForgotPassword;
	
//	7) Forgot Password Email Input
	@FindBy (xpath = "(//input [@id='fpemail'])")
	private WebElement EmailInput;
	
//	8) Forgot Password Window
	@FindBy (xpath = "(//input [@value='Reset password'])[1]")
	private WebElement ForgotPasswordButton;
	
//	9) Forgot Password success MSG
	@FindBy (xpath = "(//div [@class='contentalrt'])")
	private WebElement ForgotPasswordSuccess;	
	
//	10) Forgot Password success Popup Close
	@FindBy (xpath = "(//a [@class = 'popup_close'])[4]")
	private WebElement ForgotPasswordPopupClosed;	
	
//	10)RSTLogo
	@FindBy (xpath = "(//img [@class='header-image-config'])")
	private WebElement RSTLogo;
	
//	11)JobOpenings 
	@FindBy (xpath = "(//a [text() = 'Job Openings'])")
	private WebElement JobOpenings;
	
//	12)SignUp 
	@FindBy (xpath = "(//a [text() = 'Sign up'])")
	private WebElement SignUp;
	
//	13)Terms
	@FindBy (xpath = "(//a [text() = 'Terms'])")
	private WebElement Terms;
	
	
//	Constructor Of LoginPgae
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
//	For Fetch/import data from the excel File
	 // Method to fetch/import recruiter credentials from Excel
    public void fetchRecruiterCredentials(int rowIndex) throws IOException 
    {
    	Cbtg_Excel_Data_UtilityClass excelUtility = new Cbtg_Excel_Data_UtilityClass();
        String[] recruiterCredentials = excelUtility.readRecruiterCredentials(rowIndex);
        Rusername = recruiterCredentials[0];
        Rpassword = recruiterCredentials[1];
    }

    // Method to fetch/import candidate credentials from Excel
    public void fetchCandidateCredentials(int rowIndex) throws IOException 
    {
        Cbtg_Excel_Data_UtilityClass excelUtility = new Cbtg_Excel_Data_UtilityClass();
        String[] candidateCredentials = excelUtility.readCandidateCredentials(rowIndex);
        Cusername = candidateCredentials[0];
        Cpassword = candidateCredentials[1];
    }
    
//	Actions On all the WebElements --> Need to create methods for all the web elements
//	User name For Recruiter Module
	public void RCSendUsername()
	{
		UserName.sendKeys(Rusername);
	}
//	Password For Recruiter Module
	public void RCSendPassword()
	{
		Password.sendKeys(Rpassword);
	}
	
//	User name For Recruiter Module
	public void CMSendUsername()
	{
		UserName.sendKeys(Cusername);
	}
//	Password For Recruiter Module
	public void CMSendPassword()
	{
		Password.sendKeys(Cpassword);
	}
	
	public void UserTypeR()
	{
		UserTypeRecruiter.click();
	}
	
	public void UserTypeC()
	{
		UserTypeCandidate.click();
	}
	
	public void RememberMe()
	{
		RememberMe.click();
	}
	
	public void LoginButton()
	{
		LoginButton.click();
	}
	
	public void ForgotPassword()
	{
		ForgotPassword.click();
	}
	public void FEmailField() 
	{		
    	EmailInput.sendKeys("shubham.pawar@recruitmentsmart.com");
	}
	
	public void ForgotPasswordButton()
	{
		ForgotPasswordButton.click();
	}
	
	public String ForgotPasswordSuccess()
	{
		return ForgotPasswordSuccess.getText();      //Need to use rerun type as string if we want to get text
	}
	
	public void ForgotPasswordPopupClose()
	{
		ForgotPasswordPopupClosed.click();
	}
	
	public void RSTLogo()
	{
		RSTLogo.click();
	}
	
	public void JobOpenings()
	{
		JobOpenings.click();
	}
	
	public void SignUp()
	{
		SignUp.click();
	}
	
	public void Terms()
	{
		Terms.click();
	}
	
}
