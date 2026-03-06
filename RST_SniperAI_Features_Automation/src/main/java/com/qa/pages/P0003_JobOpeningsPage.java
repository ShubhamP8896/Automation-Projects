package com.qa.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.driverFactory.DriverFactory;
import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;

public class P0003_JobOpeningsPage 
{
	ElementsUtility eu = new ElementsUtility();
	BrowserUtility bu = new BrowserUtility();
	
	private By currentOpeningsText = By.xpath("//h1[text() = 'Current Openings ']");
	public String getCurrentOpeningsText()
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(currentOpeningsText));
		return eu.getElementText(currentOpeningsText);
	}
	
	private By currentOpeningsCount = By.xpath("//span[@id='job_opening_count']");
	public String getCurrentOpeningCount()
	{
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(currentOpeningsCount));
		return eu.getElementText(currentOpeningsCount);
	}

}
