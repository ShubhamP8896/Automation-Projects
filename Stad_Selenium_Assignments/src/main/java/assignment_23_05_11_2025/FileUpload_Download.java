package assignment_23_05_11_2025;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload_Download
{
	public static void main(String[] args) throws InterruptedException {
		BrowserUtility bu = new BrowserUtility();
		WebDriver driver = bu.launchBrowser("Chrome");
		bu.MaximizeWindow();
		bu.launchURL("https://www.tutorialspoint.com/selenium/practice/upload-download.php");
		Thread.sleep(3000);
		
		ElementsUtility eu = new ElementsUtility(driver);
		
		By chooseFile = By.cssSelector("#uploadFile");
		By downloadFile = By.cssSelector("#downloadButton");
		
		eu.addInput(chooseFile, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		eu.doClick(downloadFile);
		
//		Generic Method
		eu.uploadFile(chooseFile, "C:\\Users\\ADMIN\\OneDrive\\Desktop\\TestFile.txt");
		
	}

}
