package dev_preprod_CanMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Can_ApplicationsPage 
{
	// WebElements :: 1) JR Sorting, 2)JT Sorting, 3) JL Sorting, 4)Created On Sorting
	
//	WebDriver declared
	private WebDriver driver;
	
//	Find webelements from dashboard page
//	1) JR Sorting filter

	@FindBy (xpath = "//span [@title='Job Req Id Sorting']")
	private WebElement JobReqSorting;
	
//	2)JT Sorting, 

	@FindBy (xpath = "//span [@title='Job Title Sorting']")
	private WebElement JobTitleSorting;

//	3) JL Sorting, 

	@FindBy (xpath = "//span [@title='Job Location Sorting']")
	private WebElement JobLocationSorting;

//	4)Created On Sorting

	@FindBy (xpath = "//span [@title='Created On Sorting']")
	private WebElement CreatedOnSorting;
	
//	Constructor for performing actions
	
	public Can_ApplicationsPage (WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
//	1) JR Sorting filter
	public void JobReqSorting()
	{
		JobReqSorting.click();
	}
	
//	2)JT Sorting,
	public void JobTitleSorting()
	{
		JobTitleSorting.click();
	}
	
//	3) JL Sorting,
	public void JobLocationSorting()
	{
		JobLocationSorting.click();
	}
	
//	4)Created On Sorting
	public void CreatedOnSorting()
	{
		CreatedOnSorting.click();
	}
	
	
	
}
