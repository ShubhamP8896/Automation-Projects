package com.qa.pages;

import org.openqa.selenium.By;

import com.qa.utilities.ElementsUtility;

public class P0004_CanDashboard 
{
	ElementsUtility eu = new ElementsUtility();
	
	private By logOutButton = By.xpath("//li[@class='logout']//span[@class='menu-icn']");
	public void clickLogout()
	{
		eu.doClick(logOutButton);
		System.out.println("Clicked on the logout button and Logged out successfully");
	}
	
	private By dahsboardText = By.xpath("//p[text()='Dashboard']");
	public String getDashboardText()
	{
		return eu.getElementText(dahsboardText);
	}
	

}
