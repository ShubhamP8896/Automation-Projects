package day40POM_Example_sameLikeMyday40Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtility {
    
    WebDriver driver;
    
    public WebDriver launchBrowser(String browserName) {
        if (browserName == null) {
            throw new RuntimeException("Browser name is null!");
        }

        switch (browserName.toLowerCase().trim()) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser name: " + browserName);
        }

        driver.manage().window().maximize();
        return driver;
    }

    public void launchURL(String url) {
        if (url == null || !url.startsWith("http")) {
            throw new RuntimeException("Invalid URL: " + url);
        }
        driver.get(url);
    }

    public void quitBrowser() {
        if (driver != null) driver.quit();
    }
}