package dev_prepod_Sanity_POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobOpeningsPage 
{
//	WebElements:- 1)Job Title sorting 2)Job title filter 3)Job Req ID sorting 4) Job req ID filter 5) Client sorting
//	6) Client Filter 7) project sorting 8) Project filter 9) Job location sorting 10) Job location filter 11) Created on sorting
//	12)Reset button 13) Pagination
	
//	1} Web Driver Declared
	private WebDriver driver;
	
//	Find Xpath to perform of all the web elements
	
//	1)Job Title sorting 
	@FindBy (xpath = "(//span [@title='Job Title Sorting'])")
	private WebElement JobTitleSorting;	
	
//	2)Job title filter 
	@FindBy (xpath = "(//i [@title='Job Title Filter'])")
	private WebElement JobtitleFilter;
	
//	3) Job Title Search Icon 
	@FindBy (xpath = "(//button [@fieldid='job_title'])")
	private WebElement JobtitleFilterSearch;
		
//	4)Job Req ID sorting 
	@FindBy (xpath = "(//span [@title='Job Req Id Sorting'])")
	private WebElement JobReqSorting;
	
//	5) Job req ID filter 
	@FindBy (xpath = "(//i [@title='Job Req Id Filter'])")
	private WebElement JobReqFilter;
	
//	6) Job Req ID search icon 
	@FindBy (xpath = "(//button [@fieldid='reference_no'])")
	private WebElement JobReqFilterSearch;
	
//	7) Client sorting
	@FindBy (xpath = "(//span [@title='Client Sorting'])")
	private WebElement ClientSorting;
	
//	8) Client Filter 
	@FindBy (xpath = "(//i [@title='Client Filter'])")
	private WebElement ClientFilter;
	
//	9) project sorting 
	@FindBy (xpath = "(//span [@title='Project Sorting'])")
	private WebElement ProjectSorting;
	
//	10) Project filter 
	@FindBy (xpath = "(//i [@title='Project Filter'])")
	private WebElement ProjectFilter;
	
//	11) Job location sorting 
	@FindBy (xpath = "(//span [@title= 'Job Location Sorting'])")
	private WebElement JobLocationSorting;
	
//	12) Job location filter 
	@FindBy (xpath = "(//i [@title='Job Location Filter'])")
	private WebElement jobLocationFilter;
	
//	13) Created on sorting
	@FindBy (xpath = "(//span [@title='Created On Sorting'])")
	private WebElement CreatedOnSorting;

//	14)Reset button
	@FindBy (xpath = "(//a [@id='resetFilter'])")
	private WebElement Reset;
	
//	15) Pagination
	
	
//	Constructor for perform actions
	public JobOpeningsPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
// To Perform Actions on all the web elements need to add methods for all the web elements
	
//	1)Job Title sorting 
	public void JobTitleSorting()
	{
		JobTitleSorting.click();
	}
	
//	2)Job title filter 
	public void JobtitleFilter()
	{
		JobtitleFilter.click();
	}
	
//	3) Job Title Search Icon 
	public void JobtitleFilterSearch()
	{
		JobtitleFilterSearch.click();
	}
		
//	4)Job Req ID sorting 
	public void JobReqSorting()
	{
		JobReqSorting.click();
	}
	
//	5) Job req ID filter 
	public void JobReqFilter()
	{
		JobReqFilter.click();
	}
	
//	6) Job Req ID search icon 
	public void JobReqFilterSearch()
	{
		JobReqFilterSearch.click();
	}
	
//	7) Client sorting
	public void ClientSorting()
	{
		ClientSorting.click();
	}
	
//	8) Client Filter 
	public void ClientFilter()
	{
		ClientFilter.click();
	}
	
//	9) project sorting 
	public void ProjectSorting()
	{
		ProjectSorting.click();
	}
	
//	10) Project filter 
	public void ProjectFilter()
	{
		ProjectFilter.click();
	}
	
//	11) Job location sorting 
	public void JobLocationSorting()
	{
		JobLocationSorting.click();
	}
	
//	12) Job location filter 
	public void jobLocationFilter()
	{
		jobLocationFilter.click();
	}
	
//	13) Created on sorting
	public void CreatedOnSorting()
	{
		CreatedOnSorting.click();
	}

//	14)Reset button
	public void Reset()
	{
		Reset.click();
	}

	
	
	
	
	
}
