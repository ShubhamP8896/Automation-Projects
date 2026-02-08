package assignment_27_06_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToWindow2 
{
	 public static void main(String[] args) throws InterruptedException {

	        BrowserUtility bu = new BrowserUtility();
	        WebDriver driver = bu.launchBrowser("Chrome");
	        bu.launchURL("https://vinothqaacademy.com/multiple-windows/");
	        bu.MaximizeWindow();

	        By newWindow = By.xpath("(//button[@id='button1'])[1]");
	        By newTab = By.xpath("(//button[@id='button1'])[2]");
	        By newMsgWindow = By.xpath("(//button[@id='button1'])[3]");
	        By text = By.xpath("//body[text()='Welcome to Vinoth Q. A Academy. Happy Learning']");
	        
	        ElementsUtility eu = new ElementsUtility(driver);
	        WebElement nw = eu.getElement(newWindow);
	        WebElement nt = eu.getElement(newTab);
	        WebElement nwm = eu.getElement(newMsgWindow);
	        
	        eu.multipleWindow(nw);
	        eu.multipleWindow(nt);
//	        eu.multipleWindow(nwm);
	        
	 }

}
