package bajajauto_CanMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Can_DashboardPage 
{
//	WebElements : 1)Sidebar -> a)Dashboard b)Profile c)jobs d)application e)Signout | 2)Jobs you have applied to
//	3)Terms 4)Contact
	
	
//	WebDriver declared
	private WebDriver driver;
	
//	Find webelements from dashboard page
//	1) Sidebar 	
	@FindBy (xpath = "//a [@class='menu-icn']")
	private WebElement Sidebar;
	
//	a)Dashboard 
	@FindBy (xpath = "//span [text() = 'Dashboard']")
	private WebElement Dashboard;
	
//	b)Profile 
	@FindBy (xpath = "//span [text() = 'My Profile']")
	private WebElement Profile;	
	
//	c)jobs 
	@FindBy (xpath = "//span [text() = 'Jobs']")
	private WebElement jobs;	
	
//	d)applications 
	@FindBy (xpath = "//span [text() = 'Applications']")
	private WebElement applications;	
	
//	e)Signout 
	@FindBy (xpath = "//span [text() = 'Sign out']")
	private WebElement Signout;	
	
//	2)Jobs you have applied to
	@FindBy (xpath = "(//a [@href='applied-jobs'])[2]")
	private WebElement AppliedJobs;	
	
//	3)Terms 
	@FindBy (xpath = "//a [text()='Terms']")
	private WebElement Terms;

//	4)Contact
	@FindBy (xpath = "//a [text()='Contact']")
	private WebElement Contact;

//	Constructor for performing actions
	public Can_DashboardPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
//	Actions on webelements
//	1) Sidebar 
	public void Sidebar()
	{
		Sidebar.click();
	}
	
//	2) Dashboard 
	public void Dashboard()
	{
		Dashboard.click();
	}
	
//	3) Profile 
	public void Profile()
	{
		Profile.click();
	}
	
//	4) jobs 
	public void jobs()
	{
		jobs.click();
	}
	
//	5) applications 
	public void applications()
	{
		applications.click();
	}
	
//	6) Signout 
	public void Signout()
	{
		Signout.click();
	}
	
//	1) AppliedJobs 
	public void AppliedJobs()
	{
		AppliedJobs.click();
	}
	
//	1) Terms 
	public void Terms()
	{
		AppliedJobs.click();
	}
	
//	1) Contact 
	public void Contact()
	{
		Contact.click();
	}
	

}
