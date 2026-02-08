package day40POM_Example_sameLikeMyday40Program;

import org.openqa.selenium.WebDriver;

public class LoginTestclass 
{
	public static void main(String[] args) {
        BrowserUtility butil = new BrowserUtility();
        WebDriver driver = butil.launchBrowser("chrome");
        butil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

        LoginPage_POM loginPage = new LoginPage_POM(driver);
        
        // Example test scenario:
        loginPage.doLogin("shubham@test.com", "Shubham@123");
        System.out.println("Login attempted successfully!");

//        butil.quitBrowser();
    }

}
