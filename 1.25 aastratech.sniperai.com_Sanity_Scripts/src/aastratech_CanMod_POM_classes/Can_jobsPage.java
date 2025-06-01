package aastratech_CanMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Can_jobsPage 
{
//	WebElements:: 1) Reset 2) advanced filter : a) SKills b) apply filter c) cancel d) close 3) Job Req Id sorting, 4) Job Req Id column filter, 5) Job Title sorting filter, 
//	6)Job Title column filter 7) Recruiter Sorting filter 8) Job Location sorting filter, 9) Job Location column filter
//	10) Job type sorting 11) Job type column 10) Apply Now 11) Pagination 
	
	
//	WebDriver declared
	private WebDriver driver;
	
//	Find webelements from Jobs page page
//	1) Reset
	@FindBy (xpath = "//a[@id='resetFilter']")
	private WebElement resetButton;	
	
//	2) advanced filter
	@FindBy (xpath = "//a[@id='filteroptions']")
	private WebElement advancedFilter;	
	
//	2.a) Skills
	@FindBy (xpath = "//input[@id='skills']")
	private WebElement Skills;	
	
//	2.b) Apply_Filter
	@FindBy (xpath = "//input[@id='apply_filters']")
	private WebElement ApplyFilter;
	
//	2.c) Cancel Button
	@FindBy (xpath = "//button [text() = 'Cancel']")
	private WebElement Cancel;
	
//	2.d) Close window
	@FindBy (xpath = "//button [@aria-label='Close']")
	private WebElement CloseWindow;
	
//	3) Job Req Id sorting, 
	@FindBy (xpath = "//span [@title='Job Req Id Sorting']")
	private WebElement JobReqSorting;	
		
//	4) Job Req Id column filter, 
	@FindBy (xpath = "//i [@title='Job Req Id Filter']")
	private WebElement JobReqColFilter;	
	
//	4.a) Column filter search
	@FindBy (xpath = "(//button [@type='button'])[2]")
	private WebElement JRColFiltButton;	
	
//	5) Job Title sorting filter,
	@FindBy (xpath = "//span [@title='Job Title Sorting']")
	private WebElement JobTitleSorting;	
	
//	6)Job Title column filter 
	@FindBy (xpath = "//i [@title='Job Title Filter']")
	private WebElement JobTitleFilter;	
	
//	5.a) Column filter search
	@FindBy (xpath = "(//button [@type='button'])[3]")
	private WebElement JTColFiltButton;	
	
//	7) Recruiter Sorting filter 
	@FindBy (xpath = "//span [@title='Recruiter Sorting']")
	private WebElement RecruiterSorting;		
	
//	8) Job Location sorting filter, 
	@FindBy (xpath = "//span [@title='Job Location Sorting']")
	private WebElement JobLocationSorting;	
	
//	9) Job Location column filter
	@FindBy (xpath = "//i [@title='Job Location Filter']")
	private WebElement JobLocFilter;
	
//	9.a) Column filter search
	@FindBy (xpath = "(//button [@type='button'])[5]")
	private WebElement JLColFiltButton;	
	
//	10) Job type sorting
	@FindBy (xpath = "//span [@title='Job Location Sorting']")
	private WebElement JobTypeSorting;	
	
//	12) Apply Now 
	@FindBy (xpath = "//input [@id='3674']")
	private WebElement ApplyNow;		
	
//	13) Pagination 
	@FindBy (xpath = "//li [text() = '>>']")
	private WebElement PaginationLast;
	
	@FindBy (xpath = "//li [text() = '<<']")
	private WebElement PaginationFirst;
	
//	Constructor for performing actions
	public Can_jobsPage (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
//	1) Reset
	public void reset()
	{
		resetButton.click();
	}
	
//	2) advanced filter
	public void AdvancedFilter()
	{
		advancedFilter.click();
	}
	
//	2.a) Skills
	public void Skills()
	{
		Skills.click();
		Skills.sendKeys("Java");
	}	
	
//	2.b) Apply_Filter
	public void ApplyFilter()
	{
		ApplyFilter.click();
	}	
	
//	2.c) Cancel Button
	public void CancelButton()
	{
		Cancel.click();
	}	
	
//	2.d) Close window
	public void CloseWindow()
	{
		CloseWindow.click();
	}
	
//	3) Job Req Id sorting, 
	public void JobReqSorting()
	{
		JobReqSorting.click();
	}
		
//	4) Job Req Id column filter, 
	public void JobReqColFilter()
	{
		JobReqColFilter.click();
	}	
	
//	4.a) Column filter search
	public void JRColFiltButton()
	{
		JRColFiltButton.click();
	}	
	
//	5) Job Title sorting filter,
	public void JobTitleSorting()
	{
		JobTitleSorting.click();
	}	
	
//	6)Job Title column filter 
	public void JobTitleFilter()
	{
		JobTitleFilter.click();
	}	
	
//	5.a) Column filter search
	public void JTColFiltButton()
	{
		JTColFiltButton.click();
	}	
	
//	7) Recruiter Sorting filter 
	public void RecruiterSorting()
	{
		RecruiterSorting.click();
	}		
	
//	8) Job Location sorting filter, 
	public void JobLocationSorting()
	{
		JobLocationSorting.click();
	}	
	
//	9) Job Location column filter
	public void JobLocFilter()
	{
		JobLocFilter.click();
	}	
	
//	9.a) Column filter search
	public void JLColFiltButton()
	{
		JLColFiltButton.click();
	}
	
//	10) Job type sorting
	public void JobTypeSorting()
	{
		JobTypeSorting.click();
	}	
	
//	12) Apply Now 
	public void ApplyNow()
	{
		ApplyNow.click();
	}			
	
//	13) Pagination 
	public void PaginationLast()
	{
		PaginationLast.click();
	}	
	
	public void PaginationFirst()
	{
		PaginationFirst.click();
	}	

}
