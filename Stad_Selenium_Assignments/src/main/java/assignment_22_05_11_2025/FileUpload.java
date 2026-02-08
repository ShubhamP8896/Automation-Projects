package assignment_22_05_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://omayo.blogspot.com/");
		Thread.sleep(3000);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By chooseFile = By.cssSelector("#uploadfile");
		
//		eu.addInput(chooseFile, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		
//		Generic Method
		eu.uploadFile(chooseFile, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		
	}

}
