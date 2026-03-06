package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;

public class P0008_RecJobList 
{
	BrowserUtility bu = new BrowserUtility();
	ElementsUtility eu = new ElementsUtility();
	
	private By logOutButton = By.xpath("//li[@class='logout']//span[@class='menu-icn']");
	public void clickLogout()
	{
		eu.doClick(logOutButton);
		System.out.println("Clicked on the logout button and Logged out successfully");
	}
	
	private By jobsText = By.xpath("//p[text()='Jobs']");
	public String getJobsText()
	{
		return eu.getElementText(jobsText);
	}

}
