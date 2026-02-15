package com.qa.factory;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.qa.util.ConfigReader;
import com.qa.util.ExceptionsUtility;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    // Initialize driver (Local or Grid)
    public static WebDriver launchBrowser_initDriver(String browserName) {

        String environment = ConfigReader.getProperty("environment"); // local or remote
        String gridURL = ConfigReader.getProperty("gridURL");
        String os = ConfigReader.getProperty("os");

        try {

            if (driver.get() == null) {

                if (browserName == null) {
                    throw new ExceptionsUtility("Browser Name is Null");
                }

                // ✅ REMOTE EXECUTION (SELENIUM GRID)
                if (environment.equalsIgnoreCase("remote")) {

                    URL url = new URL(gridURL);

                    switch (browserName.toLowerCase().trim()) {

                        case "chrome":

                            ChromeOptions chromeOptions = new ChromeOptions();
                            chromeOptions.setPlatformName(os);

                            driver.set(new RemoteWebDriver(url, chromeOptions));
                            break;


                        case "edge":

                            EdgeOptions edgeOptions = new EdgeOptions();
                            edgeOptions.setPlatformName(os);

                            driver.set(new RemoteWebDriver(url, edgeOptions));
                            break;


                        case "firefox":

                            FirefoxOptions firefoxOptions = new FirefoxOptions();
                            firefoxOptions.setPlatformName(os);

                            driver.set(new RemoteWebDriver(url, firefoxOptions));
                            break;


                        default:
                            throw new ExceptionsUtility("Invalid Browser for Grid");

                    }

                }

                // ✅ LOCAL EXECUTION
                else {

                    switch (browserName.toLowerCase().trim()) {

                        case "chrome":
                            driver.set(new ChromeDriver());
                            break;

                        case "edge":
                            driver.set(new EdgeDriver());
                            break;

                        case "firefox":
                            driver.set(new FirefoxDriver());
                            break;

                        case "safari":
                            driver.set(new SafariDriver());
                            break;

                        default:
                            throw new ExceptionsUtility("Invalid Browser");

                    }

                }

                System.out.println(browserName + " launched successfully");

            }

        }

        catch (Exception e) {
            e.printStackTrace();
        }

        return driver.get();
    }


    public static WebDriver getDriver() {
        return driver.get();
    }


    public static void quitDriver() {

        if (driver.get() != null) {

            driver.get().quit();

            driver.remove();   // very important for ThreadLocal cleanup

            System.out.println("Driver closed successfully");

        }

    }

}
