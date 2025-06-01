package wizzairpoc_RecMod_POM_classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rec_RawReport_POM_Class 
{
//	Find WebWelements :- 1) Start Date :: a) Next b)Previous c)Date d)Today e)Close
//	2) End Date :: a) Next b)Previous c)Date d)Today e)Close, 3) Download
	
// WebDriver Declared
	private WebDriver driver;
	
//	Find WebElements
//	1) StartDate:
	@FindBy (xpath ="//input [@id='startdate']" )
	private WebElement StartDate;
	
//	Start Date Other WebElements
//	a) Next Button
	@FindBy (xpath = "//span [text() = 'Next']")
	private WebElement startDateNext;
	
//	b) Previous Button
	@FindBy (xpath = "//span [text() = 'Prev']")
	private WebElement StartDatePrevious;
	
//	c) Date>> For now no need to select specific date, For that we need to select date by text
	
//	d) Today button
	@FindBy (xpath = "//button [text() = 'Today']")
	private WebElement StartDateToday;
	
//	e) Close Button
	@FindBy (xpath = "//button [text() = 'Close']")
	private WebElement StartDateClose;
	
//	1) End Date:
	@FindBy (xpath ="//input [@id='enddate']" )
	private WebElement EndDate;
	
//	Start Date Other WebElements
//	a) Next Button
	@FindBy (xpath = "//span [text() = 'Next']")
	private WebElement EndDateNext;
	
//	b) Previous Button
	@FindBy (xpath = "//span [text() = 'Prev']")
	private WebElement EndDatePrevious;
	
//	c) Date>> For now no need to select specific date, For that we need to select date by text
	
//	d) Today button
	@FindBy (xpath = "//button [text() = 'Today']")
	private WebElement EndDateToday;
	
//	e) Close Button
	@FindBy (xpath = "//button [text() = 'Close']")
	private WebElement EndDateClose;

//	3) Download
	@FindBy (xpath = "//input [@id='submit']")
	private WebElement DownloadButton;
	
	
//	Constructor for performing Actions on this webelements
	
	public Rec_RawReport_POM_Class(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
//	WebElements to perform actions
	
//	1) Start Date
	public void StartDate()
	{
		StartDate.click();
	}
	
//	a) Next Button
	public void startDateNext()
	{
		startDateNext.click();
	}
	
//	b) Previous Button
	public void StartDatePrevious()
	{
		StartDatePrevious.click();
	}
	
//	c) Date>> For now no need to select specific date, For that we need to select date by text
	
//	d) Today button
	public void StartDateToday()
	{
		StartDateToday.click();
	}
	
//	e) Close Button
	public void StartDateClose()
	{
		StartDateClose.click();
	}
	
//	1) End Date:
	public void EndDate()
	{
		EndDate.click();
	}
	
//	Start Date Other WebElements
//	a) Next Button
	public void EndDateNext()
	{
		EndDateNext.click();
	}
	
//	b) Previous Button
	public void EndDatePrevious()
	{
		EndDatePrevious.click();
	}
	
//	c) Date>> For now no need to select specific date, For that we need to select date by text
	
//	d) Today button 
	public void EndDateToday()
	{
		EndDateToday.click();
	}
	
//	e) Close Button
	public void EndDateClose()
	{
		EndDateClose.click();
	}

//	3) Download
	public void DownloadButton()
	{
		DownloadButton.click();
	}
	
	
}
