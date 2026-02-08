package assignment_33_10_11_2025;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFrames 
{
	public static void main(String[] args) {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		ElementsUtility eu = new ElementsUtility(driver);

		By rform = By.cssSelector("div.details__form-iframe");
		eu.doClick(rform);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		By frmae1 = By.cssSelector("iframe[id*=frame-one]");
		WebElement frame = eu.getElement(frmae1);
		
		driver.switchTo().frame(frame);
		
		By proposalTitle = By.cssSelector("input#RESULT_TextField-1");
		eu.addInput(proposalTitle, "Two wheeler Vehicle");
		
		By location = By.cssSelector("input#RESULT_TextField-3");
		eu.addInput(location, "Ahmedabad, Gujarat, India");
		
		By calender = By.cssSelector("input#RESULT_TextField-4");
		eu.addInput(calender, "24112025");
		
		By description = By.cssSelector("#RESULT_TextArea-5");
		eu.addInput(description, "Honda Xblade - 160CC and 40+ mileage.");
		
		By chooseFile = By.cssSelector("#RESULT_FileUpload-6");
		eu.addInput(chooseFile, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		
		By firstName = By.cssSelector("#RESULT_TextField-8");
		eu.addInput(firstName, "Shubham");
		
		By lastName = By.cssSelector("#RESULT_TextField-9");
		eu.addInput(lastName, "Pawar");
		
		By streetAdd = By.cssSelector("#RESULT_TextField-10");
		eu.addInput(streetAdd, "dharnidhar road");
		
		By addressL2 = By.cssSelector("#RESULT_TextField-11");
		eu.addInput(addressL2, "senior citizen park");
		
		By city = By.cssSelector("#RESULT_TextField-12");
		eu.addInput(city, "Ahmedabad");
		
		By state = By.cssSelector("#RESULT_RadioButton-13");
		eu.selectByVisibleText(state, "Alabama");
		
		By zipCode = By.cssSelector("#RESULT_TextField-14");
		eu.addInput(zipCode, "568544");
		
		By phoneNumber = By.cssSelector("#RESULT_TextField-15");
		eu.addInput(phoneNumber, "9856523335");
		
		By emailAddress = By.cssSelector("#RESULT_TextField-16");
		eu.addInput(emailAddress, "shubham@testmail.com");
		
		By submit = By.cssSelector("#FSsubmit");
		eu.doClick(submit);
				
	}


}
